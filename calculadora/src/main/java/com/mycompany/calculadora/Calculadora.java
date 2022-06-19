/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculadora;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        float x = 0, y;
        String x_str, y_str, operacao = " ";
        while(operacao != "close"){
            System.out.println("Valor em memória: " + x);
            System.out.println("Para sair, insira 0. Para continuar, insira a operação desejada: " );
            operacao = teclado.nextLine();
            if(operacao == "0"){
                System.out.println("Saindo da operacao. ");
                break;
            }
            System.out.println("Insira o numero para ser operacionalizado com a memória: ");
            y_str = teclado.nextLine();
            y = Float.parseFloat(y_str);
            switch(operacao){
                
                case "+":                    
                    x = x + y;
                    break;
                case "-":
                    x = x - y;
                    break;
                case "*":
                    x = x * y;
                    break;
                case "/":
                    x = x / y;
                    break;
                
                default:
                     System.out.println("Operação inválida. Insira uma nova operação válida.");  
                    break;
            }
            
        }
        
        
        
        
        
    }
}
