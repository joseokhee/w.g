<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@page import="java.util.regex.Pattern"%>
    <%@page import="java.sql.*" %>
    <%@page import="com.board.beans.Board" %>
    <%@ page import="java.util.ArrayList" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�Խ��� ���� §��!!</title>
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
<div class="menu"><a href="/w.g/main.jsp">main</a>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
<a href="/w.g/challenge/main.jsp">challenge</a>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
<a href="/w.g/board/list.do">board</a></div>
<br>
<div class="content">
	<table style="margin-left: auto; margin-right: auto;text-align:center;"width=500px>
		<tr width>
			<td>��ȣ</td>
			<td>�ۼ���</td>
			<td>���̵�</td>
		</tr>
		<c:forEach items="${articleList}" var="article">

			<tr>

				<td><a href='content.do?idx=${article.idx}'>${article.idx}</a></td><!-- jstl�� ǥ������ ��ũ��Ʈ���� �Ӽ��� ���Ƽ� ��𿡾��� �켱�� -->

				<td>${article.writer}</td>

				<td>${article.difficulty}</td>

			</tr>

		</c:forEach>
	</table>
	<br><br><br>
	<a href="write.jsp">�۾���</a>
</div>
</body>
</html>