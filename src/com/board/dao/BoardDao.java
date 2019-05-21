package com.board.dao;

import javax.servlet.http.HttpServletRequest;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.board.beans.Board;

public class BoardDao extends CommonDao {
	 
    public static BoardDao getInstance() {
 
        BoardDao _instance = new BoardDao();
 
        return _instance;
 
    }
    public ArrayList<Board> getArticleList() throws SQLException {
    	
    	String current="1";
        ResultSet rs = null;
        //질문 쿼리를 실행 했을 때 결과를 인트로 받아오는 방법
        String sql = "select * from BOARD where idx between "+current+" and "+(current+3000)+" order by idx";
 
        rs = openConnection().executeQuery(sql); // sql을 실행하기위해 연결을 열어 쿼리를 실행하고
 
                            // rs에 반환합니다.
        
        
        
        ArrayList<Board> articleList = new ArrayList<Board>();//  Board형 배열객체를 선언              
 
        while (rs.next()) {
 
            Board article = new Board();// 데이터들을 담기위해 Board객체에 메모리를 할당
 
            article.setIdx(rs.getInt("idx"));          
 
            article.setWriter(rs.getString("writer"));
 
            article.setDifficulty(rs.getString("difficulty"));           
 
            articleList.add(article);// 셋팅된 빈을 리스트에 추가합니다.
 
        }
 
        closeConnection(); // 연결을 꼭 닫아줍시다.
        
        return articleList;
 
    }

    public ArrayList<Board> getArticleContent(String idx) throws SQLException {
        
    	
    	ResultSet rs = null;
 
        String sql = "select * from board where idx= "+idx;
 
        rs = openConnection().executeQuery(sql); // sql을 실행하기위해 연결을 열어 쿼리를 실행하고
 
                            // rs에 반환합니다.
 
 
 
        ArrayList<Board> articleContent=new ArrayList<Board>();
	    
	    
	    while(rs.next()){
	    	Board article=new Board();
	    	article.setContent(rs.getString("content"));
	    	articleContent.add(article);
	    }

        closeConnection(); // 연결을 꼭 닫아줍시다.
 
        return articleContent;
 
    }
    public void setRelation(String writer,String difficulty,String content) throws SQLException {
    	
    	String sql = "INSERT INTO BOARD "+
   		     
		                    "(IDX, WRITER, DIFFICULTY, CONTENT) "+
		     
		                    "VALUES (board_seq.nextval,'"+writer+"', '"+difficulty+"', '"+content+"')";
    	
        openConnection().executeQuery(sql);
        
        closeConnection();
    }
    
    public void setAdmin(String id,String passwd) throws SQLException{
    	
    	String sql="INSERT INTO CHALLENGE1 (ID,PASSWD) VALUES ('"+id+"','"+passwd+"')";
    	
    	openConnection().executeQuery(sql);
    	
    	closeConnection();
    	
    }
    public String searchID(String id,String passwd) throws SQLException {
    	
    	ResultSet rs=null;
    	
    	
    	String sql="select id from CHALLENGE1 where ID= '"+id+"' and PASSWD= '"+passwd+"'";
    	
    	rs = openConnection().executeQuery(sql);
    	
    	String login=null;
    	
    	while(rs.next()) {
    		login=rs.getString("id");
    	}
    	closeConnection();
    	
    	if("admin".equals(login)) {
    		return "y";
    	}
    	else if(login==null) {
    		return "n";
    	}
    	else
    	{
    		return "a";
    	}
    	
    	/*
    	if(login==null) {
    		return "n";
    	}
    	else if(login=="admin") {
    		return "y";
    	}
    	else
    	{
    		return login;
    	}*/
    	
    }
    
}


    
