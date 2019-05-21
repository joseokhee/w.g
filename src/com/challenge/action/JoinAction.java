package com.challenge.action;

import java.util.regex.Pattern;
import java.sql.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.board.controller.CommandAction;
import com.board.controller.ControllerAction;
import com.board.dao.BoardDao;

public class JoinAction implements CommandAction{

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		// TODO Auto-generated method stub
	String code="if (eval(document.cookie).indexOf(mojuk) == -1) { bye; } if (eval(document.URL).indexOf(mode=1) == -1) {alert('access_denied'); history.go( - 1); } else { document.write('<font size=2 color=white>Join</font><p>'); document.write('.<p>.<p>.<p>.<p>.<p>'); document.write('<form method=post action='insert.do'>'); document.write('<table border=1><tr><td><font color=gray>id</font></td><td><input type=text name='id' maxlength=5></td></tr>'); document.write('<tr><td><font color=gray>pass</font></td><td><input type=text name='pw' maxlength=10></td></tr>'); document.write('<tr align=center><td colspan=2><input type=submit></td></tr></form></table>'); }";
		
	request.setAttribute("code",code);	
	
	return "join.jsp";
	}
	
	

}
