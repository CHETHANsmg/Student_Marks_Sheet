package students_mark_sheet.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import students_mark_sheet.dao.Kseeb_SignUp_Details_dao;
import students_mark_sheet.dto.Kseeb_signup_Details;

@WebServlet("/kseeb_login")
public class Kseeb_Login_controller extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);
		String id = req.getParameter("school_id");
		String pswd = req.getParameter("school_pswd");

		Kseeb_SignUp_Details_dao dao = new Kseeb_SignUp_Details_dao();
		Kseeb_signup_Details dto = dao.login_kseeb(id);
		if (dto != null) {
			if (pswd.equals(dto.getSchool_pswd())) {
				req.setAttribute("dto", dto);
				req.getRequestDispatcher("kseeb_page.html").forward(req, resp);
			} else {
				resp.getWriter().print("<h1 style='color:red'>Enter the proper Password</h1>");
				RequestDispatcher dispatcher = req.getRequestDispatcher("login_kseeb.html");
				dispatcher.include(req, resp);
			}

		} else {
			resp.getWriter().print(
					"<h1 style='color:red'>Account not found, Please SignUp</h1><a href='sign_kseeb.html'>Click here to SignUp</a>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("login_kseeb.html");
			dispatcher.include(req, resp);
		}
	}

}
