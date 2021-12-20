package org.bowen.persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author bowencoder
 * @date 2021/12/18 15:20
 */
public class HibernateUtil {
    private static SessionFactory sf = null;
    private static SessionFactory getSessionFactory(){
        if (sf == null){
            sf = new Configuration().configure().buildSessionFactory();

        }
        return sf;
    }
    public static Session getSession(){
        return getSessionFactory().openSession();
    }
}
