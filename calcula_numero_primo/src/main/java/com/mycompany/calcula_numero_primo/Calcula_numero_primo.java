/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calcula_numero_primo;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Calcula_numero_primo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n, cont = 0;
        String n_str = " ";


        while(n_str != "S"){
            System.out.println("Olá, insira um número: ");
            System.out.println("Caso queira sair, aperte S.");
            n_str = teclado.nextLine();
            n = Integer.parseInt(n_str);
                for(int i = 3; i <= n; i++){
                    if(n == 1 || n == 2){
                        System.out.println("O número digitado é um número primmo.");
            }
                    if(n % i == 0){
                        System.out.println("O número " + i + " é divisor de " + n + ".");
                        cont++;
            }
        }
        if(cont != 0){
            System.out.println("O número " +n+ " é primo.");
        }
        }

        
        
        
        
    }
}
