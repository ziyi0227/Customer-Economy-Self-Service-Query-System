package com.dianxin.manager.dao;

import com.dianxin.manager.entity.UserData;

public interface UserDao {
    UserData selectUser(String number);
}
