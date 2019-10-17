package com.deals.dao;

import com.deals.entities.User;
import com.deals.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UserDao {

    public void create(User user) {
        Transaction transaction = null;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(user);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public User get(long id) {
        Transaction transaction = null;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            User user = session.get(User.class, id);
            // commit transaction
            transaction.commit();

            return user;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            return null;
        }
    }

    public boolean existsByUsername(String username) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {

            String sql = "SELECT * FROM users AS u WHERE u.username = :username";

            /**
             * How to have optional conditions in the query:
             * if (password != null) sql += " AND u.password = '" + password + "'";
             * if (phoneNumber != null) sql += " AND u.phone_number = '" + phoneNumber + "'";
             * if (address != null) sql += " AND u.address = '" + address + "'";
             * ...
             * ...
             */

            List users = session.createNativeQuery(sql)
                    .setParameter("username", username)
                    .getResultList();

            return !users.isEmpty();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
