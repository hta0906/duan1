/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class JDBCHelper {
     private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String dburl = "jdbc:sqlserver://localhost:1433;databaseName=DUAN4";
    private static String user = "sa";
    private static String pass = "123456";

    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static PreparedStatement getStm(String sql, Object... args) throws SQLException {
        Connection connection = DriverManager.getConnection(dburl, user, pass);
        PreparedStatement pstm = null;
        if (sql.trim().startsWith("{")) {
            pstm = connection.prepareCall(sql);
        } else {
            pstm = connection.prepareStatement(sql);
        }
        for (int i = 0; i < args.length; i++) {
            pstm.setObject(i + 1, args[i]);

        }
        return pstm;
    }

    public static int update(String sql, Object... args) {
        try {
            PreparedStatement stmt = getStm(sql, args);
            try {
                return stmt.executeUpdate();
            } finally {
                stmt.getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }

    public static ResultSet query(String sql, Object... args) {
        try {
            PreparedStatement stmt = getStm(sql, args);
            return stmt.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException();
        }

    }

    public static Object value(String sql, Object... args) {
        try {
            ResultSet rs = query(sql, args);
            if (rs.next()) {
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {

            throw new RuntimeException();
        }
        return null;
    }
}

    
