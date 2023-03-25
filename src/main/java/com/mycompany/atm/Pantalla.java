/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atm;

/**
 *
 * @author jackiesanchez
 */
public class Pantalla {
    
  
    public void mostrarMensaje(String mensaje) {
        System.out.print(mensaje);
        
    }
    
    public void mostrarMenu(){
        
        
        System.out.println("Menu Principal");
        System.out.println("1. Ver saldo");
        System.out.println("2. Retirar Efectivo");
        System.out.println("3. Depositar Fondos");
        System.out.println("4. Salir");
        System.out.println("Escriba una opción uwu");
    }
    
    
     public void retiroMenu(){
        
        
        System.out.println("Seleccione un monto a retirar");
        System.out.println("1. 20.00");
        System.out.println("2. 40.00");
        System.out.println("3. 60.00");
        System.out.println("4. 100.00");
        System.out.println("5. 200.00");
        System.out.println("6. Cancelar transacción");
    }
}
        
        
  



    
