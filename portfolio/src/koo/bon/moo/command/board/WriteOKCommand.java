package koo.bon.moo.command.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koo.bon.moo.command.Command;
import koo.bon.moo.dao.BoardDAO;
import koo.bon.moo.dto.BoardDTO;
import koo.bon.moo.dto.MemberDTO;

public class WriteOKCommand implements Command {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDAO dao = BoardDAO.getBoardDAO();
		BoardDTO dto = new BoardDTO();
		dto.setId( ((MemberDTO)request.getSession().getAttribute("userInfo")).getId() );
		dto.setTitle(request.getParameter("title"));
		dto.setContents(request.getParameter("contents"));
		dao.writeOKDAO(dto);		
	}

}
