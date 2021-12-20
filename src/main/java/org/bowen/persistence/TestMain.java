package org.bowen.persistence;


import org.bowen.model.UserEntity;
import org.hibernate.Session;

import java.sql.PreparedStatement;

/**
 * @author bowencoder
 * @date 2021/12/18 15:20
 */
public class TestMain {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        for (int i = 0; i <10 ; i++) {
            UserEntity userEntity = new UserEntity();
            userEntity.setName("iphone"+i);
            userEntity.setPassword("zzz"+i);
            session.save(userEntity);
        }




        session.getTransaction().commit();
        session.close();
    }
}
