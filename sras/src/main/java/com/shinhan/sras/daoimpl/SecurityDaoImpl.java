package com.shinhan.sras.daoimpl;

import com.shinhan.sras.dao.SecurityDao;
import com.shinhan.sras.domain.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.lang.reflect.Member;

@Repository
public class SecurityDaoImpl implements SecurityDao {
	@Override
	public User getUser(String id) {
		User findUser = null;

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("srasproject");
		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();
		et.begin();

		try {
			 findUser = em.find(User.class, id);
			et.commit();
		} catch (Exception e) {

		} finally {
			em.close();
		}

		emf.close();
		return findUser;
	}
}
