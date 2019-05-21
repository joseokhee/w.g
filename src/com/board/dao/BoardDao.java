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
        //���� ������ ���� ���� �� ����� ��Ʈ�� �޾ƿ��� ���
        String sql = "select * from BOARD where idx between "+current+" and "+(current+3000)+" order by idx";
 
        rs = openConnection().executeQuery(sql); // sql�� �����ϱ����� ������ ���� ������ �����ϰ�
 
                            // rs�� ��ȯ�մϴ�.
        
        
        
        ArrayList<Board> articleList = new ArrayList<Board>();//  Board�� �迭��ü�� ����              
 
        while (rs.next()) {
 
            Board article = new Board();// �����͵��� ������� Board��ü�� �޸𸮸� �Ҵ�
 
            article.setIdx(rs.getInt("idx"));          
 
            article.setWriter(rs.getString("writer"));
 
            article.setDifficulty(rs.getString("difficulty"));           
 
            articleList.add(article);// ���õ� ���� ����Ʈ�� �߰��մϴ�.
 
        }
 
        closeConnection(); // ������ �� �ݾ��ݽô�.
        
        return articleList;
 
    }

    public ArrayList<Board> getArticleContent(String idx) throws SQLException {
        
    	
    	ResultSet rs = null;
 
        String sql = "select * from board where idx= "+idx;
 
        rs = openConnection().executeQuery(sql); // sql�� �����ϱ����� ������ ���� ������ �����ϰ�
 
                            // rs�� ��ȯ�մϴ�.
 
 
 
        ArrayList<Board> articleContent=new ArrayList<Board>();
	    
	    
	    while(rs.next()){
	    	Board article=new Board();
	    	article.setContent(rs.getString("content"));
	    	articleContent.add(article);
	    }

        closeConnection(); // ������ �� �ݾ��ݽô�.
 
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


    
