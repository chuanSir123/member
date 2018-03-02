package com.xinqushi.service.impl;

import java.util.concurrent.TimeUnit;


import org.junit.rules.Timeout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import com.xinqushi.entity.LoginUserInfo;
import com.xinqushi.service.LoginUserService;
import com.xinqushi.utils.JsonUtils;
import com.xinqushi.utils.MemberResult;

@Service
public class LoginUserServiceImpl implements LoginUserService {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	
	@Value("${SESSION_PRE}")
	private String SESSION_PRE;
	@Value("${SESSION_EXPIRE}")
    private long SESSION_EXPIRE;
	
	@Override
	public LoginUserInfo getLoginUserByToken(String token) {
		// TODO Auto-generated method stub
		
		try {
			//根据token从redis获取信息
			String json = stringRedisTemplate.opsForValue().get(SESSION_PRE+":"+token);
			//把json转换成loginuserinfo
			if (null == json) {
				return null;
			}
			LoginUserInfo loginUser = JsonUtils.jsonToPojo(json, LoginUserInfo.class);
			if (loginUser != null) {
			    stringRedisTemplate.expire(SESSION_PRE+":"+token, SESSION_EXPIRE,TimeUnit.SECONDS);
				return loginUser;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
