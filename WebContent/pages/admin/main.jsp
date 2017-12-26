<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort() +request.getContextPath()+"/";
%>
<!DOCTYPE html>
<html>
<head>
	<base href="<%=basePath %>">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>娃娃管理系统</title>
	<link rel="stylesheet" type="text/css" href="<%=basePath %>/resources/js/easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath %>/resources/js/easyui/themes/icon.css">
	<script type="text/javascript" src="<%=basePath %>/resources/js/easyui/jquery.min.js"></script>
	<script type="text/javascript" src="<%=basePath %>/resources/js/easyui/jquery.easyui.min.js"></script>
	<!-- 引入easyui的汉化插件 -->
	<script type="text/javascript" src="<%=basePath %>/resources/js/easyui/locale/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript">
		function aaa(){
			var spanNode = document.getElementById("dong");
			//通过js获取系统时间
			var d = new Date();
			var time = d.toLocaleTimeString(); 
			spanNode.innerHTML=time;
		}
		//定时函数，每隔1s中写入一次
		setInterval('aaa()',1000);
	</script>
</head>
<body class="easyui-layout">   
    <div data-options="region:'north',title:'North Title',split:true" style="height:100px;">
    	系统当前时间为：<span id="dong" style="font-size:20px"><!-- <input type="button" onclick="aaa()"> --></span>
    </div>   
    <div data-options="region:'south',title:'South Title',split:true" style="height:100px;"></div>   
    <div data-options="region:'west',title:'导航栏',split:true,iconCls:'icon-world'" style="width:150px;">
    	<ul id="tt">
    	</ul>  
    </div>   
    <div data-options="region:'center',title:'center title',noheader:true" style="padding:5px;background:#eee;">
    	<div id="tab" class="easyui-tabs" style="width:500px;height:250px;" data-options="fit:true">   
		    <div title="首页" style="padding:20px;" data-options="iconCls:'icon-house'">   
		        <center style="font-size:48px;color:blue;font-weight:bold;line-height:250px;text-shadow:10px 10px 10px gray;">
		        	欢迎使用娃娃管理系统
		        </center>   
		    </div>   
		</div>  
    </div>  
    <script type="text/javascript">
    	//动态从数据库中获取导航栏菜单
	    $('#tt').tree({    
	        url:'<%=basePath %>/admin/getAdminNav.shtml',
	        onClick: function(node){
	        	//1、首先获取点击节点的标题
	        	var title=node.text;
	        	// 2、添加一个未选中状态的选项卡面板
	        	if(node.href!=null){
	        		//3、当href==null时，还需要判断某一个选项卡是否存在
	        		var flag = $('#tab').tabs('exists',title);
					if(flag){//代表此选项卡存在，则选中当前节点选项卡
						$('#tab').tabs('select',title);
					}else{//代表当前点击节点的选项卡不存在
			        	$('#tab').tabs('add',{
			        		title: node.text,
			        		iconCls:node.iconCls,
			        		closable:true,
			        		selected: true,
			        		href:'<%=basePath %>/'+node.href
			        	});
					}	        		
	        	}
	    	},
	    	lines:true
	    }); 
    </script> 
</body>  
</html>