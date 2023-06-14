package students_mark_sheet.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import students_mark_sheet.dto.kseeb_data_insert_dto;

public class kseeb_dao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public String insert(kseeb_data_insert_dto dto) {
		et.begin();
		em.persist(dto);
		et.commit();
		return "data is inserted";
	}

	public List<kseeb_data_insert_dto> kseebf1() {
		Query q = em.createQuery("select data from kseeb_data_insert_dto data", kseeb_data_insert_dto.class);
		List<kseeb_data_insert_dto> d1 = q.getResultList();
		return d1;
	}

	public void update(kseeb_data_insert_dto dto) {
		et.begin();
		em.merge(dto);
		et.commit();
	}

	public String remove(String usn) {
		kseeb_data_insert_dto usn1 = em.find(kseeb_data_insert_dto.class, usn);
		if (usn1 != null) {
			et.begin();
			em.remove(usn1);
			et.commit();
			return "data is deleted";
		} else {
			return "Data is not-Found";
		}
	}

//	public List<kseeb_data_insert_dto> kseebf2()
//	{
//		Query q1=em.createQuery("select data from kseeb_data_insert_dto data",kseeb_data_insert_dto.class);
//		List<kseeb_data_insert_dto> d1=q1.getResultList();
//		return d1;
//	}
//	
	public kseeb_data_insert_dto student(String usn) {
		kseeb_data_insert_dto dto = em.find(kseeb_data_insert_dto.class, usn);
		return dto;
	}

}
