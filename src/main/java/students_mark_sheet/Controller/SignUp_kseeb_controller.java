package students_mark_sheet.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import students_mark_sheet.dao.Kseeb_SignUp_Details_dao;
import students_mark_sheet.dto.Kseeb_signup_Details;

@WebServlet("/kseeb_signup")
public class SignUp_kseeb_controller extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		String id=req.getParameter("school_id");
		String name=req.getParameter("school_name");
		String email=req.getParameter("school_email");
		String pswd=req.getParameter("school_pswd");
		
		Kseeb_signup_Details dto=new Kseeb_signup_Details();
		dto.setSchool_id(id);
		dto.setSchool_name(name);
		dto.setSchool_email(email);
		dto.setSchool_pswd(pswd);
		
		Kseeb_SignUp_Details_dao dao=new Kseeb_SignUp_Details_dao();
		dao.insert(dto);
		
		resp.getWriter().print("<h1 style='color:blue'>ACCOUNT IS CREATED SUCCESSFULLY......</h1>");
		req.getRequestDispatcher("login_kseeb.html").include(req, resp);

		
	}
	

}
