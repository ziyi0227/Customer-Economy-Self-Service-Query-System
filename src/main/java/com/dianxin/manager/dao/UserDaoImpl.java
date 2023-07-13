package com.dianxin.manager.dao;

import com.dianxin.manager.entity.UserData;
import com.dianxin.manager.utils.DruidUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao{
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(DruidUtils.getDataSource());

    @Override
    public UserData selectUser(String number) {
//        System.out.println(number);
//        String sqlText = "SELECT * FROM userdata WHERE number = ?";
//        //控制台输出所有数据
//        List<UserData> list = jdbcTemplate.query(sqlText, new BeanPropertyRowMapper<>(UserData.class), number);
//        for (UserData userData : list) {
//            System.out.println(userData);
//        }

        String sql = "SELECT * FROM userdata WHERE number = ?";
        try {
            UserData userData = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(UserData.class), number);
//            System.out.println(userData);
            return userData;
        } catch (Exception e) {
            throw new RuntimeException("查询用户信息失败", e);
        }
    }
}
