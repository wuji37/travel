package com.chinasofti.travel;

import java.sql.*;

public class testConnection {

}


class Main {
    public static void main(String[] args) throws SQLException {
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conn = null;
        try {
            //加载驱动和地址，及地址连接
            Class.forName("oracle.jdbc.OracleDriver");   //oracle.jdbc.driver.OracleDriver
            String dbURL = "jdbc:oracle:thin:@localhost:1521:orcl";
            //我使用的是oracle12c，这里是没有scott用户的，我自己新建的用户c##scott
            conn = DriverManager.getConnection(dbURL, "hhr", "hhr");
            System.out.println("数据库连接成功！");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("数据库连接失败！");
        } finally {
            String sql="select * from place";
            Statement statement=conn.createStatement();
            rs = statement.executeQuery(sql.toString());

            while (rs.next()) {

                System.out.println("id:"+rs.getLong(1));
                System.out.println("locate:"+rs.getString(2));

            }
        }
    }
}