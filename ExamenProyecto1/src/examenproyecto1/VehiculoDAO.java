/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenproyecto1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.sql.*;

/**
 *
 * @author fbabu
 */
public class VehiculoDAO {
    
    //info todos los vehiculos
        public static void printVehiculoDetails(){
        String query = "SELECT * FROM vehiculo";
        try(Connection conn = DatabaseConnection.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query)){
            
                while(rs.next()){
                    int id = rs.getInt("id");
                    String tipo = rs.getString("tipo");
                    String marca = rs.getString("marca");
                    int potencia = rs.getInt("potencia");
                    int fechaDeCompra = rs.getInt("fechaDeCompra");
                    System.out.println(" Id: " + id + " , tipo de vehículo: " + tipo + " de la marca: " + marca + " tiene una potencia de: " + potencia + ". Ha sido adquirido en: " + fechaDeCompra);
                }
        
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
        //Info vehiculo por id
        public static void printVehiculoDetailsById(int id){
        String query = "SELECT * FROM vehiculo where id = ?";
        try(Connection conn = DatabaseConnection.getConnection();
               PreparedStatement pstmt = conn.prepareStatement(query)) {
                System.out.println("Conexión establecida correctamente");
        
        pstmt.setInt(1, id);
        
        try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {    
                    String tipo = rs.getString("tipo");
                    String marca = rs.getString("marca");
                    int potencia = rs.getInt("potencia");
                    int fechaDeCompra = rs.getInt("fechaDeCompra");
                    System.out.println(" Id: " + id + " , tipo de vehículo: " + tipo + " de la marca: " + marca + " tiene una potencia de: " + potencia + ". Ha sido adquirido en: " + fechaDeCompra);
                    
                }else {
                    System.out.println("No se encontró un vehículo con el ID: " + id);
                }
                }
        
        }catch(SQLException e){
            e.printStackTrace();
        }    
        
    }
    
    //Insert
    public static void insertVehiculo(String tipo, String marca, int potencia, int fechaDeCompra) {
        String query = "insert into vehiculo (tipo, marca, potencia, fechaDeCompra) values (?, ?, ?, ?)";
         
        try(Connection conn = DatabaseConnection.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(query)){
        
            pstmt.setString(1, tipo);
            pstmt.setString(2, marca);
            pstmt.setInt(3, potencia);
            pstmt.setInt(4, fechaDeCompra);
            pstmt.executeUpdate();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    //delete
    public static void deleteVehiculo(int id){
        String query = "delete from vehiculo where id= ?";
        try(Connection conn = DatabaseConnection.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(query)){
        
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    
    //Updates
    public static void updateTipo(int id, String newTipo){
        String query = "update vehiculo set tipo = ? where id = ?";
        try(Connection conn = DatabaseConnection.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(query)){
        
            pstmt.setString(1, newTipo);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public static void updateMarca(int id, String newMarca){
        String query = "update vehiculo set marca = ? where id = ?";
        try(Connection conn = DatabaseConnection.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(query)){
        
            pstmt.setString(1, newMarca);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public static void updatePotencia(int id, int newPotencia){
        String query = "update vehiculo set potencia = ? where id = ?";
        try(Connection conn = DatabaseConnection.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(query)){
        
            pstmt.setInt(1, newPotencia);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public static void updateFechaDeCompra(int id, int newFecha){
        String query = "update vehiculo set fechaDeCompra = ? where id = ?";
        try(Connection conn = DatabaseConnection.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(query)){
        
            pstmt.setInt(1, newFecha);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    
    //Gets
    public static String getTipoVehiculo(int id){
        String tipo = "";
        String query = "select tipo from vehiculo where id = ?";
        try(Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query)){
        
            pstmt.setInt(1, id);
            
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()){
            
                tipo = rs.getString("tipo");
                System.out.println("Tipo de Vehículo: " + tipo);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return tipo;
    }
    
     public static String getMarcaVehiculo(int id){
        String marca = "";
        String query = "select marca from vehiculo where id = ?";
        try(Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query)){
        
            pstmt.setInt(1, id);
            
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()){
            
                marca = rs.getString("marca");
                System.out.println("Marca del Vehículo: " + marca);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return marca;
    }
     
     public static int getPotenciaVehiculo(int id){
        int potencia = 0;
        String query = "select potencia from vehiculo where id = ?";
        try(Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query)){
        
            pstmt.setInt(1, id);
            
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()){
            
                potencia = rs.getInt("potencia");
                System.out.println("Potencia del Vehículo: " + potencia);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return potencia;
    }
    
     
     public static int getFechaDeCompraVehiculo(int id){
        int fechaDeCompra = 0;
        String query = "select fechaDeCompra from vehiculo where id = ?";
        try(Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query)){
        
            pstmt.setInt(1, id);
            
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()){
            
                fechaDeCompra = rs.getInt("fechaDeCompra");
                System.out.println("Fecha de  del Vehículo: " + fechaDeCompra);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return fechaDeCompra;
    }
     
     
     //Media potencia
     public static double getMediaPotenciaByTipo(String tipo) {
        String query = "select AVG(potencia) as media_potencia from vehiculo where tipo = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, tipo);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    double media_potencia = rs.getDouble("media_potencia");
                    System.out.println("Esta es la potencia media del tipo: " + tipo + " --> " + media_potencia);
                    return media_potencia;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0.0;
    }
     
     //maxima potencia
      public static int getMaxPotenciaByTipo(String tipo) {
        String query = "select max(potencia) as max_potencia from vehiculo where tipo = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, tipo);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    int max_potencia = rs.getInt("max_potencia");
                    System.out.println("Esta es la potencia máxima del tipo: " + tipo + " --> " + max_potencia);
                    return max_potencia;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
     
     
}
