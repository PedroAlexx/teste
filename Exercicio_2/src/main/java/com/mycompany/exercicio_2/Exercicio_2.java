/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio_2;
import javax.swing.JOptionPane;

/**
 *
 * @author T-Gamer
 */
public class Exercicio_2 {

    public static void main(String[] args) {
        System.out.println("Olá! Insira um número para ser analisado:");

        String numero;
        int x;
        
        numero = JOptionPane.showInputDialog("Insira o número aqui: ");
        x = Integer.parseInt(numero);
        
        int i = 1;
        while( i < x){
            if(x % i == 0)
            {
                System.out.println(""+i+" eh um divisor de "+x+".");
            }
            i = i + 1;        
        }
        
    }
}
