package students_mark_sheet.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import students_mark_sheet.dto.Kseeb_signup_Details;
import students_mark_sheet.dto.kseeb_data_insert_dto;

public class Kseeb_SignUp_Details_dao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public void insert(Kseeb_signup_Details dto) {
		et.begin();
		em.persist(dto);
		et.commit();
	}

	public Kseeb_signup_Details login_kseeb(String id) {
		Kseeb_signup_Details dto = em.find(Kseeb_signup_Details.class, id);
		return dto;
	}

}
