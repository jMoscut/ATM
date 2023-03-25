/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.atm;

import java.util.Locale;

/**
 *
 * @author jackiesanchez
 */
public class ATM {

     
    private Dispensador dispensadorObj;
    private Pantalla pantallaObj;
    private RanuraDeDeposito ranuraDeDepositoObj;
    private Teclado tecladoObj;
    private Transaccion depositoObj;
    private Transaccion retiroObj; 
    private Cuenta objCuenta;
    private int saldoATM;
    
    public ATM() {
        this.dispensadorObj = new Dispensador();
        this.pantallaObj = new Pantalla();
        this.ranuraDeDepositoObj = new RanuraDeDeposito();
        this.tecladoObj = new Teclado();
        this.depositoObj = new Deposito();
        this.objCuenta = new Cuenta();
        this.saldoATM = 15000;
        
        this.inicializar();
    }
    
    private void inicializar() {
        int numeroDeCuenta;
        int nip;
        int op;
        op = 0;
        this.objCuenta.setSaldo(15000);
        pantallaObj.mostrarMensaje("Bienvenido!\n");
        pantallaObj.mostrarMensaje("Ingrese su número de cuenta: \n ");
        pantallaObj.mostrarMensaje("Ingrese su número de Idenficación Personal: \n");
        numeroDeCuenta = tecladoObj.recibirEntrada();
        
        nip = tecladoObj.recibirEntrada();
        System.out.println("El numero de cuenta ingresado es: \n" + numeroDeCuenta);
        System.out.println("El NIP que fue ingresado es: " + nip);
       
        
        this.autenticar(nip, numeroDeCuenta);
        this.pantallaObj.mostrarMenu();
        op = this.tecladoObj.recibirEntrada();
        
        
        this.ejecutar( op,numeroDeCuenta);
        
       while (op !=4) {
           
           this.pantallaObj.mostrarMenu();
           op = this.tecladoObj.recibirEntrada();
           this.ejecutar(op, numeroDeCuenta);
       }
    }
    
    
    
    
    public void depositar(int monto) {
        
    this.depositoObj.ejecutar();
    
    }
    
    public void acreditar(int monto) { }
    
    public void mostrarSaldo(int numeroDeCuenta) { 
    
        float saldo = 0;
        float saldoFlotante = 0;
        float saldoTotal = saldo + saldoFlotante;
        saldo = objCuenta.consultar(numeroDeCuenta);
        saldoFlotante = objCuenta.getSaldoflotante();
        this.pantallaObj.mostrarMensaje(String.format("El saldo de su cuenta es %s \n" , saldo));
        this.pantallaObj.mostrarMensaje(String.format("El saldo flotante es %s \n" , saldoFlotante));
        this.pantallaObj.mostrarMensaje(String.format("Saldo total: %s \n" , saldoTotal));
        
    }
    public void retirar(int monto) {
    
        this.pantallaObj.retiroMenu();
        int ret = this.tecladoObj.recibirEntrada(); 
        
        switch (ret) {
                case 1:
                    monto = 20;
                    break;
                case 2:
                     monto = 40;
                    break;
                case 3:    
                     monto = 60;
                    break;
                case 4:    
                     monto = 100;
                    break;
                    case 5:    
                     monto = 200;
                    break;          
                case 6:
                    this.pantallaObj.mostrarMensaje("La transacción se cancelo");
                    break;
                default:
                    this.pantallaObj.mostrarMensaje("Ingrese una Opcion Valida");
        
    
    }
        
        
        float saldo = 0;
        saldo = objCuenta.getSaldo();
        int saldoATM;
        
        
    }
    public void debitar(int monto) { }
    public boolean autenticar(int nip, int numeroDeCuenta) {  
    
    this.pantallaObj.mostrarMensaje(String.format("El numero de cuenta que ingresaste fue: %s \nTu NIP Es: %s\n", numeroDeCuenta , nip));
    return true;
}
 
    public void ejecutar(int opcion, int cuenta) {
    int monto; 
            switch (opcion) {
                case 1:
                    this.mostrarSaldo(cuenta);
                    break;
                case 2:
                    this.pantallaObj.mostrarMensaje("Ingrese un monto a Retirar");
                    monto = this.tecladoObj.recibirEntrada();
                    this.retirar(monto);
                    break;
                case 3:
                    this.pantallaObj.mostrarMensaje("Ingrese un monto a depositar");
                    monto = this.tecladoObj.recibirEntrada();
                    //System.out.println("monto: " + monto);
                    this.depositar(monto);
                    break;
                case 4:
                    this.pantallaObj.mostrarMensaje("Ha salido del programa");
                    break;
                default:
                    this.pantallaObj.mostrarMensaje("Ingrese una Opcion Valida");
                    throw new AssertionError();
                    
                    
               
            
            }
    
 }
    
           

}
