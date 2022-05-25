/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.contapalavras_conjuntos;
import java.util.*;
/**
 *
 * @author T-Gamer
 */
public class ContaPalavras_Conjuntos {

    public static void main(String[] args) {  //psvm
        String frase;
        Scanner teclado = new Scanner(System.in);
        Set<String> palavras = new HashSet<>();
        
        System.out.println("Digite uma frase:");
        frase = teclado.nextLine();
        
        // percorre pela frase e adiciona no conjunto de palavras
        for(String palavra : frase.trim().split(" ")){
            palavras.add(palavra);
        }
        
        System.out.println("A frase contem " + palavras.size() + " palavras");
        
        for(String palavra : palavras) {
            System.out.println(palavra);
        }
    }
}
