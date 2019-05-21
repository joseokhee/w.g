package com.challenge.action;

import java.util.regex.Pattern;
import java.sql.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.board.controller.CommandAction;
import com.board.controller.ControllerAction;
import com.board.dao.BoardDao;

public class LoginAction implements CommandAction{

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		// TODO Auto-generated method stub
		String id=request.getParameter("id");
		String passwd=request.getParameter("passwd");
		String login=BoardDao.getInstance().searchID(id, passwd);
		
		if(login=="n") {
			String alert="<script>alert('존재하지 않는 아이디 입니다.');</script>";
			String shift="<script>window.location.href='login.jsp'</script>";
			request.setAttribute("go",alert);
			request.setAttribute("shift",shift);
		}
		else if(login=="y") {
			String cong="<script>alert('성공 하셨습니다 축하 드립니다.');</script>";
			String shift="<script>window.location.href='/w.g/challenge/main.jsp'</script>";
			request.setAttribute("go",cong);
			request.setAttribute("shift",shift);
		}
		else if(login==login) {
			String alert="<script>alert('"+login+"'); alert(typeof(login));</script>";
			String shift="<script>window.location.href='login.jsp'</script>";
			request.setAttribute("go",alert);
			request.setAttribute("shift",shift);
		}
		return "login_action.jsp";
	}
	
}