package com.dianxin.manager.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestJDBC {
    public static void main(String[] args) {
        String driverClass = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1:3306/dianxin";
        String username = "root";
        String password = "root";

        try {
            // 加载MySQL驱动程序
            Class.forName(driverClass);

            // 获取数据库连接
            Connection conn = DriverManager.getConnection(url, username, password);

            // 查询数据库中的所有表
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SHOW TABLES");
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

            // 关闭资源
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
