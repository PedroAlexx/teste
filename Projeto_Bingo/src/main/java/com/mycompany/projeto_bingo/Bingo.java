/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_bingo;

import javax.swing.JOptionPane;

import java.util.Random;

/**
 *
 * @author ice
 */
public class Bingo {
    public void cartela(){
        int cartela[][] = new int[4][4];
        int cont = 0;
        Random aleatorio = new Random();
        int numero;
        while(cont < 24){
            for(int i = 0; i < 4; i++){
                for(int j = 0; j < 4; j++){
                    numero = aleatorio.nextInt(15 + j*cont);

                    cont++;
                }
            }            
        }
        
        
    }
    public static void main(String[] args) {
        String n_str;
        int n;
        n_str = JOptionPane.showInputDialog("Olá! Insira a quantidade de jogadores");
        n = Integer.parseInt(n_str);        
        
    }
    
    
    
}
