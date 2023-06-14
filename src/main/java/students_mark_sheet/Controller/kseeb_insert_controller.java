package students_mark_sheet.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import students_mark_sheet.dao.kseeb_dao;
import students_mark_sheet.dto.kseeb_data_insert_dto;

@WebServlet("/insert")
public class kseeb_insert_controller extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doPost(req, resp);

		String usn = req.getParameter("University_Seat_Number");
		String name = req.getParameter("name");
		String dob = req.getParameter("dob");
		String fn = req.getParameter("f_name");
		String mn = req.getParameter("m_name");
//		String kannada=req.getParameter("kannada");
//		int k=Integer.parseInt(kannada);
		String inkan = req.getParameter("in_kannada");
		int ikan = Integer.parseInt(inkan);
		String exkan = req.getParameter("ex_kannada");
		int ekan = Integer.parseInt(exkan);
//		String english=req.getParameter("english");
//		int e=Integer.parseInt(english);
		String ineng = req.getParameter("in_english");
		int ieng = Integer.parseInt(ineng);
		String exeng = req.getParameter("ex_english");
		int eeng = Integer.parseInt(exeng);
//		String hindi=req.getParameter("hindi");
//		int h=Integer.parseInt(hindi);
		String inhin = req.getParameter("in_hindi");
		int ihin = Integer.parseInt(inhin);
		String exhin = req.getParameter("ex_hindi");
		int ehin = Integer.parseInt(exhin);
//		String maths=req.getParameter("maths");
//		int m=Integer.parseInt(maths);
		String inmat = req.getParameter("in_maths");
		int imat = Integer.parseInt(inmat);
		String exmat = req.getParameter("ex_maths");
		int emat = Integer.parseInt(exmat);
//		String science=req.getParameter("science");
//		int s=Integer.parseInt(science);
		String insci = req.getParameter("in_science");
		int isci = Integer.parseInt(insci);
		String exsci = req.getParameter("ex_science");
		int esci = Integer.parseInt(exsci);
//		String Social_s=req.getParameter("social_science");
//		int ss=Integer.parseInt(Social_s);
		String insoc = req.getParameter("in_social_science");
		int isoc = Integer.parseInt(insoc);
		String exsoc = req.getParameter("ex_social_science");
		int esoc = Integer.parseInt(exsoc);

		kseeb_data_insert_dto dto = new kseeb_data_insert_dto();
		dto.setUniversity_Seat_Number(usn);
		dto.setName(name);
		dto.setDob(dob);
		dto.setF_name(fn);
		dto.setM_name(mn);
		dto.setIn_kannada(ikan);
		dto.setEx_kannada(ekan);
		dto.setIn_english(ieng);
		dto.setEx_english(eeng);
		dto.setIn_hindi(ihin);
		dto.setEx_hindi(ehin);
		dto.setIn_maths(imat);
		dto.setEx_maths(emat);
		dto.setIn_science(isci);
		dto.setEx_science(esci);
		dto.setIn_social_science(isoc);
		dto.setEx_social_science(esoc);
		dto.setKannada(ikan + ekan);
		dto.setEnglish(ieng + eeng);
		dto.setHindi(ihin + ehin);
		dto.setMaths(imat + emat);
		dto.setScience(isci + esci);
		dto.setSocial_science(isoc + esoc);
		dto.setTotal_marks(ikan + ekan + ieng + eeng + ihin + ehin + imat + emat + isci + esci + isoc + esoc);
		dto.setPercentage((ikan + ekan + ieng + eeng + ihin + ehin + imat + emat + isci + esci + isoc + esoc) / 6);

		kseeb_dao dao = new kseeb_dao();
		dao.insert(dto);
		resp.getWriter().print("<h1 style='color: blue'>Data Inserted...</h1>");
		req.getRequestDispatcher("kseeb_page.html").include(req, resp);

	}

}
