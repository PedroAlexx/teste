/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio_1;

import javax.swing.JOptionPane;

/**
 *
 * @author T-Gamer
 */
public class Exercicio_1 {

    public static void main(String[] args) {
        System.out.println("Olá, insira três coordenadas:");
        String x_1, x_2, x_3, y_1, y_2, y_3;
        int x1, x2, x3, y1, y2, y3;
        x_1 = JOptionPane.showInputDialog("Digite o valor de X da primeira coordenada: ");
        y_1 = JOptionPane.showInputDialog("Digite o valor de Y da primeira coordenada: ");
        x_2 = JOptionPane.showInputDialog("Digite o valor de X da segunda coordenada: ");
        y_2 = JOptionPane.showInputDialog("Digite o valor de X da segunda coordenada: ");
        x_3 = JOptionPane.showInputDialog("Digite o valor de X da terceira coordenada: ");
        y_3 = JOptionPane.showInputDialog("Digite o valor de X da terceira coordenada: ");
        
        x1 = Integer.parseInt(x_1);
        x2 = Integer.parseInt(x_2);
        x3 = Integer.parseInt(x_3);
        y1 = Integer.parseInt(y_1);
        y2 = Integer.parseInt(y_2);
        y3 = Integer.parseInt(y_3);
        
        double l1, l2, l3;
        l1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        l2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        l3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        
        if(l1 == l2 && l1 == l3 && l2 == l3){
            //JOptionPane.showMessageDialog("É equilátero");        }
        } else if( l1 == l2 | l1 == l3 | l2 == l3){
            //JOptionPane.showMessageDialog("É Isósceles");
        } else {
            //JOptionPane.showMessageDialog("É escaleno");

        }
}
