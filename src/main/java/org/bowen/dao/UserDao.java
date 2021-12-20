package org.bowen.dao;

import org.bowen.model.UserEntity;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * @author bowencoder
 * @date 2021/12/19 22:20
 */
public class UserDao extends HibernateDaoSupport {
    public UserEntity getUser(int id){
        return this.getHibernateTemplate().get(UserEntity.class,id);
    }
}
