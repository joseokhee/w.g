package com.board.action;


import java.util.regex.Pattern;
import java.sql.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.board.controller.CommandAction;
import com.board.dao.BoardDao;

public class InsertAction implements CommandAction{

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("euc-kr");
		String writer=request.getParameter("writer");
		String difficulty=request.getParameter("difficulty");
		String content=request.getParameter("content");
		int count=0;
		if(writer == "" ||writer == null){
		    count++;
		}
		/*else if(!Pattern.matches("^[_0-9a-zA-Z-]+@[0-9a-zA-Z-]+(.[_0-9a-zA-Z-]+)*$", writer))
		    out.println("�̸��� ������ �ƴմϴ�.");*/
		if(difficulty==""||difficulty==null){
			count++;
		}
		else if(!Pattern.matches("^[0-9]*$", difficulty))
		    count++;
		if(content == "" ||content == null)
			count++;
			
		if (count==0)
		{
			String shift="<script> window.location.href='list.do'; </script>";
			BoardDao.getInstance().setRelation(writer,difficulty,content);
			request.setAttribute("pass",shift);
		}
		else if(count!=0)
		{
			String alert="<script> alert('�Է� ���� Ȯ�� �� �ּ���.'); window.location.href='write.jsp';</script>";
			request.setAttribute("pass",alert);
		}
		return "insert.jsp";
	}

}
