package com.dhp.design.patterns.structure.template.jdbcTemplate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.xml.transform.Result;

public abstract class JdbcQueryTemplate {

    public final ResultSet query(String sql) throws SQLException, ClassNotFoundException { //使用JDBC连接数据库查询数据
        ResultSet result;
        //第一步：加载驱动
        loadDriver();
        try (//第二步：获取数据库连接
             Connection connection = getConnection();
             //第三部：获取PreparedStatement
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            //第四步：执行SQL语句并返回执行结果
            result = preparedStatement.executeQuery();
        }
        return result;
    }

    protected abstract void loadDriver() throws ClassNotFoundException;

    protected abstract Connection getConnection() throws SQLException;

}
