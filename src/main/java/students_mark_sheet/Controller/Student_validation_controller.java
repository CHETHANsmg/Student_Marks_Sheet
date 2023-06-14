package students_mark_sheet.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import students_mark_sheet.dao.kseeb_dao;
import students_mark_sheet.dto.kseeb_data_insert_dto;

@WebServlet("/validation")
public class Student_validation_controller extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);

		String usn = req.getParameter("University_Seat_Number");
		String dob = req.getParameter("dob");

		kseeb_dao dao = new kseeb_dao();
		kseeb_data_insert_dto dto = dao.student(usn);

		if (dto != null) {
			if (dob.equals(dto.getDob())) {
//				resp.getWriter().print("<h1>Welcome to the home page</h1>");
				req.setAttribute("dto", dto);
				req.getRequestDispatcher("student_marks_card.jsp").forward(req, resp);
			} else {
				resp.getWriter().print("<h1 style='color:red'>Enter the proper date of birth</h1>");
				RequestDispatcher dispatcher = req.getRequestDispatcher("student_page.html");
				dispatcher.include(req, resp);
			}
		} else {
			resp.getWriter().print("<h1 style='color:red'>Enter correct Regiter number</h1>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("student_page.html");
			dispatcher.include(req, resp);
		}

	}
}
