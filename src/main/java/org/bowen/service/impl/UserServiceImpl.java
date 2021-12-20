package org.bowen.service.impl;

import org.bowen.dao.UserDao;
import org.bowen.model.UserEntity;
import org.bowen.service.UserService;

/**
 * @author bowencoder
 * @date 2021/12/19 22:25
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public UserEntity getUser(int id) {
        UserEntity userEntity = userDao.getUser(id);
        return userEntity;
    }
}
