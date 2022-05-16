/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerencia_banco;

/**
 *
 * @author ice
 */
public class ContaBancaria {
    private String agencia;
    private String numero;
    private String cliente;
    private float saldo;
    public void getDados(){
        System.out.println("Agencia: " + agencia + ", Número: " + numero + ", Cliente: " + cliente + ", Saldo: " + saldo);
    }
    public void sacar(int valor){
        if(this.saldo >= valor)
            this.saldo -= valor;
            getDados();
    }
    public void depositar(int valor){
        if(valor > 0){
           this.saldo += valor;
           getDados();
        }
    }
    
}
