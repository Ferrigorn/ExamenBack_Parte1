/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenproyecto1;

/**
 *
 * @author fbabu
 */
public class ExamenProyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VehiculoDAO.insertVehiculo("coche", "Ford", 100, 2024);
       // Vehiculo vehiculo1 = new Vehiculo("moto", "Kawasaki", 200, 2020);
        Vehiculo.getInfoVehiculoById(2);
        //VehiculoDAO.printVehiculoDetails();
        System.out.println("-------------");
        System.out.println("---Set Tipo-----");
        Vehiculo.getTipoById(7);
        Vehiculo.setTipo(7, "coche");
        Vehiculo.getTipoById(7);
        System.out.println("-------------");
        System.out.println("---Get info by id-----");
        Vehiculo.getInfoVehiculoById(5);
        System.out.println("-------------");
        Vehiculo.getFechaDeCompra(2);
        System.out.println("-------------");
        VehiculoDAO.printVehiculoDetails();
        System.out.println("-------------");
        System.out.println("---get media potencia-----");
        Vehiculo.getMediaPotenciaByTipo("coche");
        System.out.println("-------------");
        System.out.println("---Get maxima potencia-----");
        Vehiculo.getMaxPotenciaByTipo("avion");
        
    }
    
}
