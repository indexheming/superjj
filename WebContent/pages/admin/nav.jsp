<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort() +request.getContextPath()+"/";
%>
<!DOCTYPE html>
<html>
<head>
	<base href="<%=basePath %>">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>后台导航栏管理</title>
</head>
<body>
	<table id="dg"></table> 
	<script type="text/javascript">
		$('#dg').datagrid({  //表格控件  
		    url:'<%=basePath %>/admin/getNavsAdmin.shtml',    
		    columns:[[    
		        {field:'id',title:'主键',width:100},    
		        {field:'text',title:'导航栏名',width:100},    
		        {field:'state',title:'状态',width:100,align:'right'},   
		        {field:'href',title:'跳转地址',width:100,align:'right'},   
		        {field:'iconCls',title:'图标',width:100,align:'right'},   
		        {field:'pid',title:'父节点',width:100,align:'right'},   
		    ]],
		    pagination:true,
		    fit:true,
		    pageList:[5,10,15,20]
		});
	</script>
</body>
</html>