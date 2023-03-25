/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atm;

/**
 *
 * @author jackiesanchez
 */
public class Deposito extends Transaccion {
   
   private int monto;

    public Deposito() {
        
        super();
        
    }
    
   @Override
    public void ejecutar() {
        System.out.println("Se deposita el dinero");
    }

    
   
}
