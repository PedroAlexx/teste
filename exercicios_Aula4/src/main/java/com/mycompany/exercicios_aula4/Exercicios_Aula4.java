/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicios_aula4;

import java.util.Scanner;

/**
 *
 * @author T-Gamer
 */
class Aluno
{
    public String FirstName;  
    public int Age; 
 };

public class Exercicios_Aula4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String[] nome = new String[5];
        int[] idade = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.println("olá! insira o nome e a idade dos alunos");
            Aluno estudante = new Aluno();
            int idade_str = teclado.nextInt();
            String nome_str = teclado.nextLine();
            nome[i] = nome_str;
            idade[i] = idade_str;            
        }

        System.out.println("Ordena por idade");
            int menor = idade[0];
           for(int i = 0; i < 5; i++)
           {
               
               
               if(idade[i] > idade[i+1]){
                   menor = idade[i+1];
                   idade[i] = menor;
                   idade[i+1] = idade[i];
               }
           }
            for(int i = 0; i < 5; i++)
           {
               System.out.println(idade[i]);
           }
           

        
    }
}
