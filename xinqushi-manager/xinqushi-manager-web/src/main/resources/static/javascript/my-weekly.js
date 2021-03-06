
//获取主机地址，如： http://localhost:8081  
var curWwwPath=window.document.location.href;  
var pathName=window.document.location.pathname;  
var pos=curWwwPath.indexOf(pathName);  
var localhostPath=curWwwPath.substring(0,pos);


window.onload = function () {
	show(1);
	
};

// 提取我的周报列表及导航键
function show(page){
	$.post(localhostPath + "/summary/getSummaryList",{"page":page},function(data){
		if(data == 0){
			layer.open({
				  type: 2,
				  title: '登录',
				  area: ['80%', '80%'],
				  closeBtn: 1, //显示关闭按钮
				  shift: 1,
				  shade: 0.5, //开启遮罩关闭
				  content: localhostPath + '/login.html',
				});
		}
		var summarys = eval("("+data+")");// 将json转换为对象 json 格式{status:'1',data:'2'}
		
		$("#TOTALCOUNT").html(summarys.total);
		var data = summarys.rows;
		var line="";
		var recom="";
		line=line + "<thead>";
		line=line + "<tr class='info text-center'>";
		line=line + "<th ><input type='checkbox' name='' value=''></th>";
		line=line + "<th class='info text-center'>序号</th>";
		line=line + "<th class='info text-center'>会员姓名</th>";
		line=line + "<th class='info text-center'>周报标题</th>";	
		line=line + "<th class='info text-center'>提交时间</th>";
		line=line + "<th class='info text-center'>状态</th>";
		line=line + "<th class='info text-center'>操作</th>";
		line=line + "</tr>";
		line=line + "</thead>";
		line=line + "<tbody>";
		for(i=0;i<data.length;i++){
			line=line + "<tr class='text-c tr' lang='"+data[i].id+"'>";
			line=line + "<td class='noclick'>" + "<input type='checkbox' name='' value=''>" + "</td>";
			if(data[i].recommend == '1')
			{
				recom="<span class='layui-badge layui-bg-orange' style='text-align: right;'>荐</span>";
			}
			else
			{
				recom="&nbsp;&nbsp;&nbsp;&nbsp;";
			}
			line=line + "<td class='text-center'>" + (i+1) + "</td>";
			line=line + "<td class='text-center'>" + data[i].name + "</td>";
			line=line + "<td class='text-center'>" + data[i].title + "</td>";
			line=line + "<td class='text-center'>" + data[i].time.toString() +"&nbsp;&nbsp;"+recom + "</td>";
			line=line +"<td class='td-status text-center'>";
			if(data[i].ischeck == '0')
			{
				line=line+"<span class='label label-danger radius text-center'>未审核</span>";
			}else{
				line=line+"<span class='label label-success radius text-center'>已审核</span>";
			}
			line=line +"</td>";	
			line=line + "<td class='noclick text-center'><a href='javascript:void(0)' onclick='look("+data[i].id+")'>查看</a></td>";
			line=line + "</tr>";
		}
		line=line + "</tbody>";
		$("#period").html(line);
		$.post(localhostPath + "/summary/getNavigation",{"page":page},function(data){
			$(".page-nav").html(data);
		});
	});
	var myDate = new Date();

}
// 查看周报
function look(id){
		layer.open({
			  type: 2,
			  title: '查看周报',
			  area: ['80%', '500px'],
			 // closeBtn: 0, //不显示关闭按钮
			  shift: 1,
			  shade: 0.5, //开启遮罩关闭
			  content: localhostPath+'/summary/look-summary-layer.html?id='+id,
	});
}

function showTime(){
    nowtime=new Date();
    year=nowtime.getFullYear();
    month=nowtime.getMonth()+1;
    date=nowtime.getDate();
    document.getElementById("mytime").innerText=year+"年"+month+"月"+date+" "+nowtime.toLocaleTimeString();
}

setInterval("showTime()",1000);