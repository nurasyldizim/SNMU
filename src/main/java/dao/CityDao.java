/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import controller.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import model.City;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Nurasy Dizim
 */
public class CityDao {
    /* Method to  READ all the cities */
    /**
     *
     * @return
     */
    public List<City> listCitis() {
        List<City> cityData = new ArrayList<City>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            cityData = session.createQuery("FROM City").list();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return cityData;
    }

}
