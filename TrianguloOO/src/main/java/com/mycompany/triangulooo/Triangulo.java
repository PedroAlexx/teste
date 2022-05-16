/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.triangulooo;

/**
 *
 * @author ice
 */
public class Triangulo {
    Ponto p1;
    Ponto p2;
    Ponto p3;
    
    public Triangulo(Ponto p1, Ponto p2, Ponto p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public String classifica(){
        double lado1, lado2, lado3;
        
        lado1 = p1.distancia(p2);
        lado2 = p2.distancia(p3);
        lado3 = p3.distancia(p1);
        
        if(lado1 == lado2 && lado2 == lado3){
            return "Equilátero";
        } else if( lado1 == lado2 || lado2 == lado3){
            return "Isósceles";
        } else
            return "Escaleno";
    }
    public static Triangulo leTriangulo(){
        Ponto p1, p2, p3;
        
        System.out.println("Ponto 1:");
        p1 = Ponto.lePonto();
        
        System.out.println("Ponto 2:");
        p2 = Ponto.lePonto();
        
        System.out.println("Ponto 3:");
        p3 = Ponto.lePonto();
        
        
        return new Triangulo(p1, p2, p3);       
        
    }
    public static void main(String[] args) {
        System.out.println("Digite os dados do triangulo: ");
        Triangulo triangulo = leTriangulo();
        
        String classificacao = triangulo.classifica();
        
        System.out.println("O triangulo é " + classificacao);
    }
}
