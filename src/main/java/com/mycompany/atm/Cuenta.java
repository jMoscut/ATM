/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atm;

/**
 *
 * @author jackiesanchez
 */
public class Cuenta {
    
   private float saldo;
    private int numeroDeCuenta;
    private int nip;
    Cliente clienteObj;
    private float saldoflotante;
    private Cuenta objCuenta;
    private int saldoATM;
    //Constructor: inicializa el estado del objeto
    public Cuenta() { 
        System.out.println("Se crea nueva cuenta.");
    } 
    
    public Cliente getCliente() { 
        return this.clienteObj;
    }
    public void setCliente(Cliente cliente) {
        this.clienteObj = cliente;
    }
    
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        if (numeroDeCuenta > 9999 && numeroDeCuenta < 1000000) {
            this.numeroDeCuenta = numeroDeCuenta;
        } 
        else {
            System.out.println("Ingrese un numero de cuenta válido.");
        }
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public void acreditar(int monto) { }
    public void debitar(int monto) { }
    public float consultar(int numeroDeCuenta) {
        float consulta = 1000000;
        return consulta;
    }
    
    //Sobrecarga de métodos:
    //Métodos con el mismo nombre pero diferente firma dentro de la misma clase
    //No depende de relaciones de herencia
    
    public void consultar() {
        System.out.println("Se invoca a consultar()");
    }

    public void consultar(String nombre, int monto) {
        System.out.println("Se invoca a consultar(String, int)");
    }
    
    public void consultar(Transaccion transaccionObj) {
        transaccionObj.ejecutar();
    }

    public float getSaldoflotante() {
        return saldoflotante;
    }

    public void setSaldoflotante(float saldoflotante) {
        this.saldoflotante = saldoflotante;
    }

    public int getSaldoATM() {
        return saldoATM;
    }

    public void setSaldoATM(int saldoATM) {
        this.saldoATM = saldoATM;
    }
    
    
   
}
