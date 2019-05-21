<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table style="margin-left: auto; margin-right: auto; margin-top:100px;">
			<form action="login_action.do" method="post">
		<tr>
			<td><input type="text" name="id" /></td>
		</tr>
		<tr>
			<td><input type="text" name="passwd" /></td>
		</tr>
		<tr>
			<td><input type="submit" value="login"/></td>
		</tr>
			</form>
	</table>
</body>
</html>