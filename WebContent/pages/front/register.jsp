<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort() +request.getContextPath()+"/";
%>
<!DOCTYPE html>
<html>
<head>
	<base href="<%=basePath %>">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>QQ注册页面</title>
	<script type="text/javascript" src="<%=basePath %>/resources/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	<center>
		<form action="<%=basePath %>/receiveJson.shtml" method="post" onsubmit="return false" id="form1">
			<table>
				<tr>
					<td>昵称</td>
					<td><input type="text" name="nick" placeholder="请输入4-10位纯字母"></td>
				</tr>
				<tr>
					<td>密码</td>
					<td><input type="password" name="password" placeholder="请输入6-16位纯数字"></td>
				</tr>
				<tr>
					<td>手机号码</td>
					<td><input type="text" name="phone" placeholder="请输入11位手机号码格式"></td>
				</tr>
				<tr>
					<td>邮箱：</td>
					<td><input type="text" placeholder="请输入正确的邮箱格式" name="email"></td>
				</tr>
				<tr>
					<td>年龄</td>
					<td><input type="text" placeholder="请输入正确的年龄" name="age"></td>
				</tr>
				<tr>
					<td><input type="submit" value="注册"></td>
					<td><input type="reset" value="重置"></td>
				</tr>
			</table>
		</form>
	</center>
	<script type="text/javascript">
		$.fn.serializeObject = function()    
		{    
		   var o = {};    
		   var a = this.serializeArray();    
		   $.each(a, function() {    
		       if (o[this.name]) {    
		           if (!o[this.name].push) {    
		               o[this.name] = [o[this.name]];    
		           }    
		           o[this.name].push(this.value || '');    
		       } else {    
		           o[this.name] = this.value || '';    
		       }    
		   });    
		   return o;    
		};
	
		$("input[type=submit]").click(function(){
			var jsonObject = $("#form1").serializeObject();
			var jsonStr = JSON.stringify(jsonObject);
			//alert(jsonObject);
			$.ajax({
				url:'<%=basePath %>/receiveJson.shtml',
				type:'post',
				dataType:'json',
				data:jsonStr,
				contentType:'application/json',
				success:function(flag){
					if(flag){
						window.location.href="<%=basePath %>/pages/front/reg_success.jsp";
					}else{
						alert("亲，您逗我玩么");
					}
				}
			});
		});
	</script>
</body>
</html>