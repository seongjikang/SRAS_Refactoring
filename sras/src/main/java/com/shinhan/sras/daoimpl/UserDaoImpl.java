package com.shinhan.sras.daoimpl;

import com.shinhan.sras.dao.UserDao;
import com.shinhan.sras.domain.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public Map<String, Object> confirmUserId(String userId) {
        Map<String, Object> res = new HashMap<>();

        res.put("success", true);
        res.put("msg", "");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("srasproject");
        EntityManager em = emf.createEntityManager();

        EntityTransaction et = em.getTransaction();
        et.begin();

        try {
            User findUser = em.find(User.class, userId);
            res.put("data", findUser);

            et.commit();
        } catch (Exception e) {

        } finally {
            em.close();
        }

        emf.close();
        return res;
    }

    @Override
    public Map<String, Object> selectUserName(String userId) {
        Map<String, Object> res = new HashMap<>();

        res.put("success", true);
        res.put("msg", "");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("srasproject");
        EntityManager em = emf.createEntityManager();

        EntityTransaction et = em.getTransaction();
        et.begin();

        try {
            User findUser = em.find(User.class, userId);
            res.put("data", findUser.getUserName());

            et.commit();
        } catch (Exception e) {

        } finally {
            em.close();
        }

        emf.close();
        return res;
    }

    @Override
    public boolean login(String id, String password) {

        boolean resLogin = false;

        Map<String, Object> res = new HashMap<>();

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("srasproject");
        EntityManager em = emf.createEntityManager();

        EntityTransaction et = em.getTransaction();
        et.begin();

        try {
            User findUser = em.find(User.class, id);

            if(findUser != null ) {
                if(findUser.getPassword().equals(password)) {
                    resLogin = true;
                } else {
                    resLogin = false;
                }
            } else {
                resLogin = false;
            }
            et.commit();
        } catch (Exception e) {

        } finally {
            em.close();
        }

        emf.close();

        return resLogin;
    }
}
