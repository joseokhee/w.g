package com.board.action;

import java.sql.*;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.board.beans.Board;
import com.board.controller.CommandAction;
import com.board.dao.BoardDao;

public class ContentAction implements CommandAction{

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		// TODO Auto-generated method stub
		
		ArrayList<Board> articleList = BoardDao.getInstance().getArticleContent(request.getParameter("idx"));  		 
        request.setAttribute("articleContent", articleList);   // ���õ� ����Ʈ�� �信 �������մϴ�.

    return "content.jsp";
	}

}
