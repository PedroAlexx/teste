/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.triangulooo;

import java.util.Scanner;
/**
 *
 * @author ice
 */
public class Ponto {
    int x;
    int y;
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double distancia(Ponto p){
        double d;
        
        d = Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
        
        return d;
    }
    public static Ponto lePonto(){
        Scanner teclado = new Scanner(System.in);
        int x, y;
        
        System.out.println("Digite os valores x e y do ponto: ");
        x = teclado.nextInt();
        y = teclado.nextInt();
        
        return new Ponto(x, y);
    }
    
}
