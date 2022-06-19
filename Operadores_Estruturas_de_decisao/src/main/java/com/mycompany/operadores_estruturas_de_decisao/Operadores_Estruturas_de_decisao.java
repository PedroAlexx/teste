/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.operadores_estruturas_de_decisao;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Operadores_Estruturas_de_decisao {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x1, y1, x2, y2, x3, y3;
        String x1_str, y1_str, x2_str, y2_str, x3_str, y3_str;
        System.out.println("Olá, insira as duas primeiras coordenadas: ");
        x1_str = teclado.nextLine();
        x1 = Integer.parseInt(x1_str);
        y1_str = teclado.nextLine();
        y1 = Integer.parseInt(y1_str);
        
        System.out.println("Insira as duas coordenadas do segundo ponto: ");
        x2_str = teclado.nextLine();
        x2 = Integer.parseInt(x2_str);
        y2_str = teclado.nextLine();
        y2 = Integer.parseInt(y2_str);
        
        System.out.println("Insira as coordenadas do terceiro ponto: ");
        x3_str = teclado.nextLine();
        x3 = Integer.parseInt(x3_str);
        y3_str = teclado.nextLine();
        y3 = Integer.parseInt(y3_str);
        
        double dist1, dist2, dist3;
        dist1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        dist2 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        dist3 = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
        
        if((dist1 == dist2) && (dist1 == dist3) && (dist2 == dist3)){
            System.out.println("O triangulo é equilátero.");
        }else if((dist1 != dist2) && (dist1 != dist3) && (dist2 != dist3)){
            System.out.println("O triangulo é escaleno.");
        } 
        else if((dist1 != dist2) || (dist1 != dist3) || (dist2 != dist3)){
            System.out.println("O triangulo é isósceles.");
        }
    }
}
