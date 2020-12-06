package koo.bon.moo.command.board;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koo.bon.moo.command.Command;
import koo.bon.moo.dao.BoardDAO;
import koo.bon.moo.dto.BoardDTO;

public class ListCommand implements Command {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDAO dao = BoardDAO.getBoardDAO();
		int curPage = 0;
		if(request.getParameter("curPage") != null)
			curPage = Integer.parseInt(request.getParameter("curPage"));
		ArrayList<BoardDTO> list = dao.listDAO(curPage);
		int totalPage = dao.calTotalPage();
		request.setAttribute("list", list);
		request.setAttribute("totalPage", totalPage);
	}
}