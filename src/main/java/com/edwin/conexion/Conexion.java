package com.edwin.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String JDBC_URL = "jdbc:mysql://localhost:33306/edwinagenda?useSSL=false&useTimezone=true";
    private static final String USER = "root";
    private static final String PASSWORD = "mysql";

    public static Connection getConexion() throws SQLException
    {
        return DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
    }
}
