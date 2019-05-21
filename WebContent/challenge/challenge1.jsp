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
		<tr>
			<td><input type="button" value="login" onclick=move('login');>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	<input type="button" value="join" onclick=no()></td>
		</tr>
	</table>
</body>
<script>
function no()
{
alert('Access_Denied');
}

function move(page)
{
if(page=='login') { location.href='mem/login.jsp'; }

}
</script>
</html>