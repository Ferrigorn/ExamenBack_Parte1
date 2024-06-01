/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenproyecto1;

import java.util.*;

/**
 *
 * @author fbabu
 */
public class Vehiculo {
    private int id;
    private String tipo;
    private String marca;
    private int potencia;
    private int fechaDeCompra;
    
    public Vehiculo(String tipo, String marca, int potencia, int fechaDeCompra){
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
        this.fechaDeCompra = fechaDeCompra;
        VehiculoDAO.insertVehiculo(tipo, marca, potencia, fechaDeCompra);
    }
    
    /* Getters y Setters*/
    
    public  int getId(){
       return this.id; 
    }
    
    public void setId(int newId){
       
    }
    
    public static String getTipoById(int id){
        return VehiculoDAO.getTipoVehiculo(id);
    }
    
    public static void setTipo(int id, String newTipo){
        VehiculoDAO.updateTipo(id, newTipo);
    }
    
    public static String getMarcaById(int id){
        return VehiculoDAO.getMarcaVehiculo(id);
    }
    
    public void setMarca(int id, String newMarca){
        VehiculoDAO.updateMarca(id, newMarca);
    }
    
    public static int getPotenciaById(int id){
        return VehiculoDAO.getPotenciaVehiculo(id);
    }
    
    public void setPotencia(int id, int newPotencia){
        VehiculoDAO.updatePotencia(id, newPotencia);
    }
    
    public static int getFechaDeCompra(int id){
        return VehiculoDAO.getFechaDeCompraVehiculo(id);
    }
    
    public void setFechaDeCompra(int id, int newFechaDeCompra){
        VehiculoDAO.updateFechaDeCompra(id, newFechaDeCompra);
    }
    
    public static void getInfoVehiculoById(int id){
        VehiculoDAO.printVehiculoDetailsById(id);
    }
    
    public static double getMediaPotenciaByTipo(String tipo) {
        return VehiculoDAO.getMediaPotenciaByTipo(tipo);
    }
    
    public static int getMaxPotenciaByTipo(String tipo) {
        return VehiculoDAO.getMaxPotenciaByTipo(tipo);
    }
}
