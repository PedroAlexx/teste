/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.contaquantidadepalavras_dictionary;
import java.util.*;
 /*
 * @author T-Gamer
 */
public class ContaQuantidadePalavras_Dictionary {

    public static void main(String[] args) {
        String frase;
        Scanner teclado = new Scanner(System.in);
        Map<String, Integer> dicionario = new HashMap<>();
        
        System.out.println("Digite uma frase:");
        frase = teclado.nextLine();
        
        // Percorre por cada uma das posições
        for (String palavra : frase.trim().split(" ")) {
            dicionario.put(palavra, dicionario.getOrDefault(palavra, 0) + 1);
        }
        
        System.out.println("Quantidade de palavras:");
        
        for(String chave : dicionario.keySet()){
            System.out.println("A palavra \'" + chave + "\' possui " + dicionario.get(chave) + " ocorrências.");
        }
    }
}
