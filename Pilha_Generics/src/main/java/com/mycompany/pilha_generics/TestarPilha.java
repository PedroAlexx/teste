/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilha_generics;

/**
 *
 * @author T-Gamer
 */
public class TestarPilha {
    public static void main(String[] args){
        Pilha_Generics<Double> pilha = new Pilha_Generics<>();
        
        pilha.empilhar(2.4);
        pilha.empilhar(2.6);
        pilha.empilhar(2.8);
        System.out.println("Pilha eh vazia: " + pilha.ehVazia());
        
        pilha.desempilhar();
        pilha.desempilhar();
        pilha.desempilhar();
        System.out.println("Pilha eh vazia: " + pilha.ehVazia());
               
        
    }
    
    
}
