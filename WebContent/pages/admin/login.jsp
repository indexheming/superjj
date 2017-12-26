<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort() +request.getContextPath()+"/";
%>
<!DOCTYPE html>
<html>
<head>
	<base href="<%=basePath %>">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>后台登录界面</title>
	<link rel="stylesheet" type="text/css" href="<%=basePath %>/resources/js/easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath %>/resources/js/easyui/themes/icon.css">
	<script type="text/javascript" src="<%=basePath %>/resources/js/easyui/jquery.min.js"></script>
	<script type="text/javascript" src="<%=basePath %>/resources/js/easyui/jquery.easyui.min.js"></script>
</head>
<body>
	<div id="login">
		<center  style="padding-top:35px;">
			<p>用户名：<input type="text" name="username"></p>
			<p>密&nbsp;码：<input type="password" name="password"></p>
			<p>
				<a id="submit" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-ok'">登录</a> 
				&nbsp;
				<a id="reset" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-cancel'">取消</a>  
			</p>
		</center>
	</div>
	<script type="text/javascript">
		$("#login").window({
			width:300,
			height:200,
			title:'登录',
			iconCls:'icon-360',
			collapsible:false,
			minimizable:false,
			maximizable:false
		});
	</script>
</body>
</html>