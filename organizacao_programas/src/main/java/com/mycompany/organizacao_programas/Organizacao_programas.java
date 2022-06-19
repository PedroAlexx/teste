/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.organizacao_programas;
import java.util.Scanner;  // entrada de dados
/**
 *
 * @author usuario
 */
public class Organizacao_programas {    
    
    public static void main(String[] args) {
        //System.out.println("Hello World!");  // saída de dados
        //System.out.print("Hello World!"); // imprime sem quebrar linha no final
        
        /*
        Scanner teclado = new Scanner(System.in);
        int nota = teclado.nextInt(); // exemplo que le os dados e guarda na variavel nota
        System.out.println("A nota digitada foi de " + nota +" pontos.");*/
        Scanner teclado = new Scanner(System.in);
        int centavos = teclado.nextInt();

       
        System.out.println("Moedas de 1 real: "+ centavos / 100);
        centavos = centavos % 100;
        System.out.println("Moedas de 50 centavos: "+ centavos / 50);
        centavos = centavos % 50;
        System.out.println("Moedas de 25 centavos: "+ centavos / 25);
        centavos = centavos % 25;
        System.out.println("Moedas de 10 centavos: "+ centavos / 10);
        centavos = centavos % 10;
        System.out.println("Moedas de 5 centavos: "+ centavos / 5);
        centavos = centavos % 5;
        System.out.println("Moedas de 1 centavo: "+ centavos / 1);
        

    }
}
