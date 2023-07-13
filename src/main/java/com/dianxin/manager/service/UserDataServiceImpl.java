package com.dianxin.manager.service;

import com.dianxin.manager.dao.UserDao;
import com.dianxin.manager.dao.UserDaoImpl;
import com.dianxin.manager.entity.UserData;

import java.util.List;

public class UserDataServiceImpl implements UserDataService {
    @Override
    public UserData findUser(String number) {
//        System.out.println("1");
        UserDao ud = new UserDaoImpl();
//        System.out.println("2");
        UserData userData = ud.selectUser(number);
        return userData;
    }
}
