/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenproyecto1;
import java.sql.*;
/**
 *
 * @author fbabu
 */
public class DatabaseConnection {
    
    private static final String URL = "jdbc:mysql://localhost:3306/vehiculo";
    private static final String USER = "root";
    private static final String PASSWORD ="Independencia1987!";
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
}
