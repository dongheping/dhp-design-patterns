package com.dhp.design.patterns.structure.template.jdbcTemplate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlJdbcQueryTemplate extends JdbcQueryTemplate{
    private String url;
    private String userName;
    private String password;

    public MysqlJdbcQueryTemplate(String url,String userName,String password){
        this.url = url;
        this.userName = userName;
        this.password = password;
    }
    @Override
    protected void loadDriver() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
    }

    @Override
    protected Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,userName,password);
    }
}
