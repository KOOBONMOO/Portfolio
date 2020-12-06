package koo.bon.moo.command.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;
import koo.bon.moo.command.Command;
import koo.bon.moo.dao.BoardDAO;
import koo.bon.moo.dto.BoardDTO;
import koo.bon.moo.dto.MemberDTO;

public class ViewCommand implements Command {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDAO dao = BoardDAO.getBoardDAO();
		BoardDTO dto = new BoardDTO();
		dto.setNo(Integer.parseInt(request.getParameter("no")));
		dto.setId(request.getParameter("id"));
		dao.viewDAO(dto);
		request.setAttribute("dto", dto);
	}
}