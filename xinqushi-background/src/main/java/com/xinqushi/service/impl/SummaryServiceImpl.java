package com.xinqushi.service.impl;



import java.text.SimpleDateFormat;



import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xinqushi.common.pojo.CommentInfo;
import com.xinqushi.common.pojo.CommentUser;
import com.xinqushi.common.pojo.EUDataGridResult;
import com.xinqushi.common.pojo.SummaryComment;
import com.xinqushi.common.pojo.SummaryInfo;
import com.xinqushi.common.pojo.SummaryList;
import com.xinqushi.entity.Admin;
import com.xinqushi.entity.Clue;
import com.xinqushi.entity.Communication;
import com.xinqushi.entity.CommunicationExample;
import com.xinqushi.entity.CommunicationExample.Criteria;
import com.xinqushi.entity.Experience;
import com.xinqushi.entity.LoginUserInfo;
import com.xinqushi.entity.Member;
import com.xinqushi.entity.MemberExample;
import com.xinqushi.entity.Picture;
import com.xinqushi.entity.PictureExample;
import com.xinqushi.entity.Province;
import com.xinqushi.entity.Summary;
import com.xinqushi.entity.SummaryExample;
import com.xinqushi.entity.SummaryVisit;
import com.xinqushi.entity.SummaryVisitExample;
import com.xinqushi.mapper.AdminMapper;
import com.xinqushi.mapper.ClueMapper;
import com.xinqushi.mapper.CommunicationMapper;
import com.xinqushi.mapper.ExperienceMapper;
import com.xinqushi.mapper.MemberMapper;
import com.xinqushi.mapper.PictureMapper;
import com.xinqushi.mapper.ProvinceMapper;
import com.xinqushi.mapper.SummaryMapper;
import com.xinqushi.mapper.SummaryVisitMapper;
import com.xinqushi.mapper.UserMapper;
import com.xinqushi.pojo.User;
import com.xinqushi.service.SummaryService;
import com.xinqushi.tools.SummaryTitle;
import com.xinqushi.utils.CookieUtils;
import com.xinqushi.utils.JsonUtils;
import com.xinqushi.utils.MapStringUtils;
import com.xinqushi.utils.MemberResult;
import com.xinqushi.utils.UserType;
@Service
public class SummaryServiceImpl implements SummaryService {
    @Value("${COOKIE_TOKEN_KEY}")
    private String COOKIE_TOKEN_KEY;
    @Value("${SESSION_PRE}")
    private String SESSION_PRE;
    @Value("${SUMMARY_LIST}")
    private String SUMMARY_LIST;
    @Value("${MEMBER_GET}")
    private String MEMBER_GET;
    @Value("${SUMMARY_NOW}")
    private String SUMMARY_NOW;
    @Value("${SUMMARY_INFO}")
    private String SUMMARY_INFO;
    @Value("${COMMENT_GET}")
    private String COMMENT_GET;
    @Value("${SUMMARY_SESSION_TIME}")
    private long SUMMARY_SESSION_TIME;
    @Autowired
    private SummaryMapper summaryMapper;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private MemberMapper memberMapper;
    @Autowired
    private CommunicationMapper communicationMapper;
    @Autowired
    private AdminMapper adminMapper;
    @Autowired
    private ProvinceMapper provinceMapper;
    @Autowired
    private PictureMapper pictureMapper;
    @Autowired
    private SummaryVisitMapper summaryVisitMapper;
    @Autowired
    private ClueMapper clueMapper;
    @Autowired
    private ExperienceMapper experienceMapper;
    
    
    /*
     * (保存及修改周报，再次点击保存按钮即为修改！)
     * @see com.xinqushi.service.SummaryService#getCurrentSummary(java.lang.String)
     */
    @Override
    public MemberResult summarySave(String token, String contents) {
        if(getMemberByToken(token) == null) {
            return null;
        }
        Summary summary=getMemberByToken(token);
        summary.setPid(0);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        summary.setTime(format.format(new Date()));
        summary.setTitle(SummaryTitle.getTitle());
        summary.setContent(contents);
        summary.setIscheck(false);
        // 通过mid,aid,cid,eid,pid和title查询summary得到的size，来决定新增周报还是修改周报，size=0则新增，否则为修改
        SummaryExample summaryExample=new SummaryExample();
        com.xinqushi.entity.SummaryExample.Criteria summaryCriteria = summaryExample.createCriteria();
        summaryCriteria.andMidEqualTo(summary.getMid());
        summaryCriteria.andAidEqualTo(summary.getAid());
        summaryCriteria.andEidEqualTo(summary.getEid());
        summaryCriteria.andCidEqualTo(summary.getCid());
        summaryCriteria.andPidEqualTo(0);
        summaryCriteria.andTitleEqualTo(SummaryTitle.getTitle());
        List<Summary> summarys = summaryMapper.selectByExample(summaryExample);
        if(summarys.size() == 0) {
            summaryMapper.insert(summary);
            // 新增周报后删除周报列表redis
            stringRedisTemplate.delete(SUMMARY_LIST+":"+token);
            return MemberResult.build(200, "保存周报成功！");
        }else {
            summaryMapper.updateByExampleSelective(summary, summaryExample);
            // 修改周报后删除周报redis
            stringRedisTemplate.delete(SUMMARY_NOW+":"+token);
            return MemberResult.build(300, "修改周报成功！");
        }
    }
    /*
     * (获取已保存周报)
     * @see com.xinqushi.service.SummaryService#getCurrentSummary(java.lang.String)
     */
    @Override
    public MemberResult currentSummaryGet(String token) {
        if(getMemberByToken(token) == null) {
            return null;
        }
        Summary summary=getMemberByToken(token);
        // 从redis中获取当前周报
        String string = stringRedisTemplate.opsForValue().get(SUMMARY_NOW+":"+token);
        if(!StringUtils.isEmpty(string)) {
            Summary summaryRedis = JsonUtils.jsonToPojo(string, Summary.class);
            stringRedisTemplate.expire(SUMMARY_NOW+":"+token, SUMMARY_SESSION_TIME, TimeUnit.SECONDS);
            return MemberResult.ok(summaryRedis);
        }
        // 通过mid,aid,cid,eid,pid和title查询summary得到content
        SummaryExample summaryExample=new SummaryExample();
        com.xinqushi.entity.SummaryExample.Criteria summaryCriteria = summaryExample.createCriteria();
        summaryCriteria.andMidEqualTo(summary.getMid());
        summaryCriteria.andAidEqualTo(summary.getAid());
        summaryCriteria.andEidEqualTo(summary.getEid());
        summaryCriteria.andCidEqualTo(summary.getCid());
        summaryCriteria.andPidEqualTo(0);
        summaryCriteria.andTitleEqualTo(SummaryTitle.getTitle());
        //使用selectByExample会获取不到content
        List<Summary> summarys = summaryMapper.selectByExampleWithBLOBs(summaryExample);
        // 将周报存入redis
        if(summarys != null) {
            String json = JsonUtils.objectToJson(summarys.get(0));
            stringRedisTemplate.opsForValue().set(SUMMARY_NOW+":"+token, json, SUMMARY_SESSION_TIME, TimeUnit.SECONDS);
        }
        if(summarys.size()>0) {
            return MemberResult.ok(summarys.get(0));
        }
        return null;
    }
    
    /*
     * (得到我的周报列表)
     * @see com.xinqushi.service.SummaryService#getSummaryList(int, int)
     */
    @Override
    public EUDataGridResult summaryListGet(int page, String token, String rows) {
        if(getMemberByToken(token) == null) {
            return null;
        }
        // 从redis中获取周报列表
        String string = stringRedisTemplate.opsForValue().get(SUMMARY_LIST+":"+page+token);
        if(!StringUtils.isEmpty(string)) {
            EUDataGridResult euDataGridResult = JsonUtils.jsonToPojo(string, EUDataGridResult.class);
            stringRedisTemplate.expire(SUMMARY_LIST+":"+page+token, SUMMARY_SESSION_TIME, TimeUnit.SECONDS);
            return euDataGridResult;
        }
        Summary summary=getMemberByToken(token);
        SummaryExample example=new SummaryExample();
        com.xinqushi.entity.SummaryExample.Criteria createCriteria = example.createCriteria();
        createCriteria.andMidEqualTo(summary.getMid());
        createCriteria.andAidEqualTo(summary.getAid());
        createCriteria.andCidEqualTo(summary.getCid());
        createCriteria.andEidEqualTo(summary.getEid());
        createCriteria.andPidEqualTo(0);
        int rowsInt = Integer.parseInt(rows);
        PageHelper.startPage(page, rowsInt, "id desc");
        List<Summary> list=summaryMapper.selectByExampleWithBLOBs(example);
        // 遍历summary，将包含用户姓名的周报列表存入新的list中
        List<SummaryList> list2=new ArrayList<>();
        for(Summary summary1:list) {
            SummaryList summaryList = new SummaryList();
            summaryList.setId(summary1.getId());
            summaryList.setTitle(summary1.getTitle());
            summaryList.setTime(summary1.getTime());
            summaryList.setRecommend(summary1.getRecommend());
            // 根据summary得到当前用户的姓名
            if(summary1.getMid() !=0 && summary1.getMid() != null) {
                Member member = memberMapper.selectByPrimaryKey(summary1.getMid());
                summaryList.setName(member.getName());
            }else if (summary1.getEid() != 0 && summary1.getEid() != null) {
                Experience experience = experienceMapper.selectByPrimaryKey(summary1.getEid());
                summaryList.setName(experience.getName());
            }else if(summary1.getCid() !=0 && summary1.getCid() != null) {
                Clue clue = clueMapper.selectByPrimaryKey(summary1.getCid());
                summaryList.setName(clue.getRealname());
            }else {
                Admin admin = adminMapper.selectByPrimaryKey(summary.getAid());
                summaryList.setName(admin.getName());
            }
            list2.add(summaryList);
        }
        EUDataGridResult result=new EUDataGridResult();
        result.setRows(list2);
        PageInfo<Summary> pageInfo=new PageInfo<>(list);
        result.setTotal(pageInfo.getTotal());
        // 将周报列表存入redis
        if(result != null) {
            String json = JsonUtils.objectToJson(result);
            stringRedisTemplate.opsForValue().set(SUMMARY_LIST+":"+page+token, json, SUMMARY_SESSION_TIME, TimeUnit.SECONDS);
        }
        return result;
    }
    
    /*
     * 根据token设置summary的mid,cid,eid
     */
    public Summary getMemberByToken(String token) {
        // 根据token从redis获取信息
        String json = stringRedisTemplate.opsForValue().get(SESSION_PRE+":"+token);
        // 把json转换成loginuserinfo
        if (null == json || json.isEmpty()) {
            return null;
        }
        LoginUserInfo loginUser = JsonUtils.jsonToPojo(json, LoginUserInfo.class);
        Summary summary =new Summary();
        // 判断用户类型，分别存入mid，eid，aid
        if(loginUser.getUserType().getValue() == 0 || loginUser.getUserType().getValue() == 1) {
            summary.setAid(loginUser.getId());
            summary.setMid(0);
            summary.setCid(0);
            summary.setEid(0);
        }else if(loginUser.getUserType().getValue() == 2){
            MemberExample memberExample = new MemberExample();
            memberExample.createCriteria().andUidEqualTo(loginUser.getId());
            List<Member> members = memberMapper.selectByExample(memberExample);
            summary.setMid(members.get(0).getId());
            summary.setAid(0);
            summary.setCid(0);
            summary.setEid(0);
        }else if(loginUser.getUserType().getValue() == 3){
            summary.setEid(loginUser.getId());
            summary.setAid(0);
            summary.setCid(0);
            summary.setMid(0);
        }else {
            summary.setCid(loginUser.getId());
            summary.setAid(0);
            summary.setEid(0);
            summary.setMid(0);
        }
        return summary;
    }
    
    // 获取查看周报页面数据
    @Override
    public SummaryInfo summaryByIdGet(int id, String token) {
        // 根据token从redis获取信息
        String json = stringRedisTemplate.opsForValue().get(SESSION_PRE+":"+token);
        // 把json转换成loginuserinfo
        if (null == json || json.isEmpty()) {
            return null;
        }
        SummaryInfo summaryInfo=new SummaryInfo();
        Member member = new Member();
        // 从redis中获取周报页面数据
        String str = stringRedisTemplate.opsForValue().get(SUMMARY_INFO+":"+id);
        if(!StringUtils.isEmpty(str)) {
            summaryInfo = JsonUtils.jsonToPojo(str, SummaryInfo.class);
            stringRedisTemplate.expire(SUMMARY_INFO+":"+id, SUMMARY_SESSION_TIME, TimeUnit.SECONDS);
        }else {
            byte[] picture = new byte[0];
            Admin admin = new Admin();
            Province province = new Province();
            province.setName("");
            Summary summary = summaryMapper.selectByPrimaryKey(id);
            if(summary.getMid() !=0 && summary.getMid() != null) {
                member = memberMapper.selectByPrimaryKey(summary.getMid());
                admin = adminMapper.selectByPrimaryKey(member.getAid());
                province = provinceMapper.selectByPrimaryKey(member.getSeatProvid());
                PictureExample example=new PictureExample();
                com.xinqushi.entity.PictureExample.Criteria createCriteria = example.createCriteria();
                createCriteria.andUidEqualTo(member.getUid());
                createCriteria.andCoverEqualTo(true);
                picture = pictureMapper.selectByExampleWithBLOBs(example).get(0).getPhoto();
                summaryInfo.setName(member.getName());
            }else if (summary.getEid() != 0 && summary.getEid() != null) {
                Experience experience = experienceMapper.selectByPrimaryKey(summary.getEid());
                admin = adminMapper.selectByPrimaryKey(experience.getAid());
                province =  provinceMapper.selectByPrimaryKey(experience.getSeatProvid());
                summaryInfo.setName(experience.getName());
            }else if(summary.getCid() !=0 && summary.getAid() !=null){
                Clue clue = clueMapper.selectByPrimaryKey(summary.getCid());
                admin = adminMapper.selectByPrimaryKey(clue.getAid());
                summaryInfo.setName(clue.getRealname());
            }else {
                admin= adminMapper.selectByPrimaryKey(summary.getAid());
                summaryInfo.setName(admin.getRealname());
                admin.setRealname("");
            }
            summaryInfo.setMid(summary.getMid());
            summaryInfo.setContent(summary.getContent());
            summaryInfo.setTime(summary.getTime());
            summaryInfo.setAdminName(admin.getRealname());
            summaryInfo.setProvince(province.getName());
            summaryInfo.setPicture(picture);
            summaryInfo.setRecommend(summary.getRecommend());
            // 将周报页面数据存入redis
            if(summaryInfo != null) {
                String string = JsonUtils.objectToJson(summaryInfo);
                stringRedisTemplate.opsForValue().set(SUMMARY_INFO+":"+id, string, SUMMARY_SESSION_TIME, TimeUnit.SECONDS);
            }
        }
        // 取访问记录(由于在一个方法中对访问记录进行了存入读取，所以不存入redis)
        SummaryVisitExample example2=new SummaryVisitExample();
        com.xinqushi.entity.SummaryVisitExample.Criteria createCriteria2 = example2.createCriteria();
        createCriteria2.andSidEqualTo(id);
        List<SummaryVisit> visitors = summaryVisitMapper.selectByExample(example2);
        summaryInfo.setVisit(visitors);
        // 将浏览记录存入数据库
        if(visitors.size() == 0) {
            SummaryVisit summaryVisit=new SummaryVisit();
            summaryVisit.setName(summaryInfo.getName());
            summaryVisit.setFlag(2);
            summaryVisit.setSid(id);
            summaryVisitMapper.insertSelective(summaryVisit);
            visitors.add(summaryVisit);
            summaryInfo.setVisit(visitors);
        }
        return summaryInfo;
    }
    
    // 保存评论
    @Override
    public MemberResult commentAdd(String comment, int sumid, String token) {
        if(getMemberByToken(token) == null) {
            return null;
        }
        Summary summary = new Summary();
        // 格式化时间为字符串类型
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
        Date date = new Date();
        summary.setTime(format.format(date));
        summary.setPid(sumid);
        summary.setContent(comment);
        summary.setAid(0);
        summary.setTitle(SummaryTitle.getTitle());
        // 根据token从redis获取信息
        String json = stringRedisTemplate.opsForValue().get(SESSION_PRE+":"+token);
        // 把json转换成loginuserinfo
        if (null == json || json.isEmpty()) {
            return null;
        }
        LoginUserInfo loginUser = JsonUtils.jsonToPojo(json, LoginUserInfo.class);
        // 判断用户类型，分别存入mid，eid，aid
        if(loginUser.getUserType().getValue() == 0 || loginUser.getUserType().getValue() == 1) {
            summary.setAid(loginUser.getId());
        }else if(loginUser.getUserType().getValue() == 2){
            summary.setMid(loginUser.getId());
        }else if(loginUser.getUserType().getValue() == 3){
            summary.setEid(loginUser.getId());
        }else {
            summary.setCid(loginUser.getId());
        }
        summaryMapper.insertSelective(summary);
        // 若评论者为管理员，则已审核
        Summary summary2 = new Summary();
        if(getMemberByToken(token).getAid() != 0 && getMemberByToken(token).getAid() != null) {
            summary2.setIscheck(true);
            summary2.setId(sumid);
            summaryMapper.updateByPrimaryKeySelective(summary2);
        }
        // 删除redis中评论信息
        stringRedisTemplate.delete(COMMENT_GET+":"+sumid);
        return MemberResult.ok();
    }
    
    // 获取评论
    @Override
    public List<CommentInfo> commentGet(int sumid) {
        // 从redis中获取评论信息
        String str = stringRedisTemplate.opsForValue().get(COMMENT_GET+":"+sumid);
        if(!StringUtils.isEmpty(str)) {
            List<CommentInfo> listRedis = JsonUtils.jsonToList(str, CommentInfo.class);
            stringRedisTemplate.expire(COMMENT_GET+":"+sumid, SUMMARY_SESSION_TIME, TimeUnit.SECONDS);
            return listRedis;
        }
        SummaryExample example = new SummaryExample();
        com.xinqushi.entity.SummaryExample.Criteria createCriteria = example.createCriteria();
        createCriteria.andPidEqualTo(sumid);
        List<Summary> summaries = summaryMapper.selectByExampleWithBLOBs(example);
        List<CommentInfo> list = new ArrayList<>();
        for(Summary summary:summaries) {
            CommentInfo commentInfo = new CommentInfo();
            commentInfo.setTime(summary.getTime());
            commentInfo.setContent(summary.getContent());
            if(summary.getAid() != null && summary.getAid() != 0) {
                Admin admin = adminMapper.selectByPrimaryKey(summary.getAid());
                commentInfo.setAdmin(admin);
                list.add(commentInfo);
            }else if(summary.getCid() != null && summary.getCid() != 0) {
                Clue clue = clueMapper.selectByPrimaryKey(summary.getCid());
                commentInfo.setClue(clue);
                list.add(commentInfo);
            }else if(summary.getEid() != null && summary.getEid() != 0) {
                Experience experience = experienceMapper.selectByPrimaryKey(summary.getEid());
                commentInfo.setExperience(experience);
                list.add(commentInfo);
            }else {
                MemberExample example2 = new MemberExample();
                example2.createCriteria().andUidEqualTo(summary.getMid());
                List<Member> members = memberMapper.selectByExample(example2);
                commentInfo.setMember(members.get(0));
                list.add(commentInfo);
            }
        }
        if(list == null || list.size() == 0) {
            return null;
        }
        // 将评论存入redis
        if(list != null) {
            String string = JsonUtils.objectToJson(list);
            stringRedisTemplate.opsForValue().set(COMMENT_GET+":"+sumid, string, SUMMARY_SESSION_TIME, TimeUnit.SECONDS);
        }
        return list;
    }
    
    // 获取当前用户下一篇周报
    @Override
    public String getNextSummaryIdByUserId(String token, int sumid) {
        Summary sum = getMemberByToken(token);
        SummaryExample example = new SummaryExample();
        com.xinqushi.entity.SummaryExample.Criteria createCriteria = example.createCriteria();
        createCriteria.andMidEqualTo(sum.getMid());
        createCriteria.andPidEqualTo(0);
        createCriteria.andAidEqualTo(sum.getAid());
        createCriteria.andCidEqualTo(sum.getCid());
        createCriteria.andEidEqualTo(sum.getEid());
        List<Summary> list = summaryMapper.selectByExampleWithBLOBs(example);
        Iterator<Summary> it= list.iterator();
        while(it.hasNext()) {
            Summary summary = it.next();
            if(summary.getId() == sumid) {
                if(it.hasNext()) {
                    return it.next().getId()+"";
                } 
            }
        }
        return "0";
    }
    
    // 获取当前用户上一篇周报
    @Override
    public String getPreSummaryIdByUserId(String token, int sumid) {
        Summary sum = getMemberByToken(token);
        SummaryExample example = new SummaryExample();
        com.xinqushi.entity.SummaryExample.Criteria createCriteria = example.createCriteria();
        createCriteria.andMidEqualTo(sum.getMid());
        createCriteria.andPidEqualTo(0);
        createCriteria.andAidEqualTo(sum.getAid());
        createCriteria.andCidEqualTo(sum.getCid());
        createCriteria.andEidEqualTo(sum.getEid());
        List<Summary> list = summaryMapper.selectByExampleWithBLOBs(example);
        int i;
        if(list.get(0).getId() == sumid) {
            return "0";
        }else {
            for(i=0;i<list.size();i++) {
                if(list.get(i).getId() == sumid) {
                    String string = list.get(i-1).getId()+"";
                    return string;
                }
            }
        }
        return "0";
    }
    
    //获取当前用户最新周报
    @Override
    public String getCurrentSummaryIdByUserId(String token) {
        Summary sum = getMemberByToken(token);
        SummaryExample example = new SummaryExample();
        com.xinqushi.entity.SummaryExample.Criteria createCriteria = example.createCriteria();
        createCriteria.andMidEqualTo(sum.getMid());
        createCriteria.andPidEqualTo(0);
        createCriteria.andAidEqualTo(sum.getAid());
        createCriteria.andCidEqualTo(sum.getCid());
        createCriteria.andEidEqualTo(sum.getEid());
        List<Summary> list = summaryMapper.selectByExampleWithBLOBs(example);
        String string =list.get(list.size()-1).getId()+"";
        return string;
    }
    
    //获取当前用户第一篇周报
    @Override
    public String getFirstSummaryIdByUserId(String token) {
        Summary sum = getMemberByToken(token);
        SummaryExample example = new SummaryExample();
        com.xinqushi.entity.SummaryExample.Criteria createCriteria = example.createCriteria();
        createCriteria.andMidEqualTo(sum.getMid());
        createCriteria.andPidEqualTo(0);
        createCriteria.andAidEqualTo(sum.getAid());
        createCriteria.andCidEqualTo(sum.getCid());
        createCriteria.andEidEqualTo(sum.getEid());
        List<Summary> list = summaryMapper.selectByExampleWithBLOBs(example);
        String string = list.get(0).getId()+"";
        return string;
    }
    
    
}
