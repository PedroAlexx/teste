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


public class Exercicios_Aula4 {
        public static void ordenaPessoasNome(String[] nomes, int[] idades, int quantidades){
        int menorIndice;
        for(int i = 0; i < quantidades; i++) {
            
            menorIndice = i;
            for(int j = i + 1; j < quantidades; j++) {
                if(nomes[menorIndice].compareTo(nomes[j]) > 0) {
                    menorIndice = j;
                }
            }
            
            trocaPessoas(nomes, idades, quantidades, menorIndice, i);
            
        }
        
    }
    public static void trocaPessoas(String[] nomes, int[] idades, int quantidades, int origem, int destino){
        
        String stringAux = nomes[origem];
        nomes[origem] = nomes[destino];
        nomes[destino] = stringAux;
        
        int intAux = idades[origem];
        idades[origem] = idades[destino];
        idades[destino] = intAux;
        
    }
    public static void ImprimePessoas(String[] nomes, int[] idades, int quantidades){
        Scanner teclado = new Scanner(System.in);
        
        for(int i = 0; i < quantidades; i++) {
            System.out.println(nomes[i] + " == " + idades[i]);
        }
        
        teclado.close();
    }
    public static void lePessoas(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        for(int i = 0; i < )
    }
    
    public static void ordenaPessoasIdade(String[] nomes, int[] idades, int quantidades){
        int menorIndice;
        
        for(int i = 0; i < quantidades; i++) {
            
            menorIndice = i;
            for(int j = i + 1; j < quantidades; j++){
                if(idades[menorIndice] > idades[j]){
                    menorIndice = j;
                }
            } 
        trocaPessoas(nomes, idades, quantidades, menorIndice, i);                            
        }        
    }
    

    public static void main(String[] args) {

        final int QUANTIDADE = 5;
        String[] nomes = new String[QUANTIDADE];
        int[] idades = new int[QUANTIDADE];
        
        lePessoas(nomes, idades, QUANTIDADE);
        
        System.out.println("Ordenação por nome:");
        ordenaPessoasNome(nomes, idades, QUANTIDADE);
        ImprimePessoas(nomes, idades, QUANTIDADE);

        System.out.println("Ordenação por idade:");
        ordenaPessoasNome(nomes, idades, QUANTIDADE);
        ImprimePessoas(nomes, idades, QUANTIDADE);

        
    }

}
