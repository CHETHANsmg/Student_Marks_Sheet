package students_mark_sheet.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import students_mark_sheet.dao.kseeb_dao;
import students_mark_sheet.dto.kseeb_data_insert_dto;

@WebServlet("/remove")
public class Kseeb_remove_controller extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);

		String usn = req.getParameter("usn");

		kseeb_dao dao = new kseeb_dao();
		dao.remove(usn);
//		
//		List<kseeb_data_insert_dto> l1=dao.kseebf2();
		resp.getWriter().print("<h1 style='color:blue'>REMOVED SUCCESSFULLY......</h1>");
		req.getRequestDispatcher("kseeb_page.html").include(req, resp);

	}
}
