package com.challenge.action;

import java.util.regex.Pattern;
import java.sql.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.board.controller.CommandAction;
import com.board.dao.BoardDao;

public class insertAction implements CommandAction{

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		// TODO Auto-generated method stub
		
		String id=request.getParameter("id");
		String passwd=request.getParameter("pw");
		
		int count=0;
	
		if(id==""||id==null) {
			count++;
		}
		else if(!Pattern.matches("^[0-9]*$", passwd)) {
			count++;
		}
		
		if(count==0) {
			String shift="<script> window.location.href='login.jsp';</script>";
			BoardDao.getInstance().setAdmin(id, passwd);
			request.setAttribute("pass", shift);
		}
		else if(count!=0)
		{
			String alert="<script> alert('입력 값을 확인 해 주세요.'); history.go(-1);</script>";
			request.setAttribute("pass",alert);
		}
		return "insert.jsp";
	}
	

}
