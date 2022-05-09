/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio_2;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author T-Gamer
 */
public class Exercicio_2 {

    public static void main(String[] args) {
        System.out.println("Olá! Insira um número para ser analisado:");
        int numero;
        Scanner teclado = new Scanner(System.in);
        String stringDivisores = "";
        int x, divisores = 0;
        numero = teclado.nextInt();
//        numero = JOptionPane.showInputDialog("Insira o número aqui: ");
//        x = Integer.parseInt(numero);
        
//        int i = 1;
//        while( i < x){
//            if(x % i == 0)
//            {
//                System.out.println(""+i+" eh um divisor de "+x+".");
//            }
//            i = i + 1;        
//        }
        for(int i = 1; i <= numero; i++){
            if(numero % i == 0) {
                divisores++;
                stringDivisores += ", " + i;
            }
        }
        if(divisores > 2 || divisores == 1){
            System.out.println("Os divisores sao " + stringDivisores);
        }
        else{
            System.out.println("O valor eh primo");
        }
        
    }
}
