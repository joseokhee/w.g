<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<style>
	div.head{

		color:white;
		padding-top:20px;
		width:700px;
		height:50px;
		text-align:center;
		margin:auto;
	
	}
	div.menu{

		color:white;
		padding-top:30px;
		width:700px;
		height:50px;
		margin:auto;
		text-align:center;
	}
	div.content{

		color:white;
		padding-top:20px;
		width:700px;
		height:500px;
		margin:auto;
		text-align:center;
	}
	div.challenge{
		display: inline-block;
		border:3px solid gray;
		text-align:center;
 	 	width: 200px;
  		height: 100px;
  		margin: 1em;
	}
	a:link {text-decoration: none; color: white;}
	a:visited {text-decoration: none; color: white;}
	a:active {text-decoration: none; color: white;}
	a:hover {text-decoration: underline; color: white;}
</style>
<body bgcolor=black>
<div class="head"><h1>application hacking</h1></div>
<br>
<div class="menu"><a href="/w.g/main.jsp" style="color:white;">main</a>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
<a href="/w.g/challenge/main.jsp" style="color:white;">challenge</a>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
<a href="/w.g/board/list.do" style="color:white;">board</a></div>
<br>
<div class="content">
	<div class="challenge"><br><a href="challenge1.jsp">1</a><br>난이도:300</div>
	<div class="challenge"><br>2<br>난이도:200</div>
</div>
</body>
</html>