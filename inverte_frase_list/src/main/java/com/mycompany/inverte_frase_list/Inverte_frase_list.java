/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.inverte_frase_list;
import java.util.*;

/**
 *
 * @author T-Gamer
 */
public class Inverte_frase_list {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String frase;
        Scanner teclado = new Scanner(System.in);
        List<String> palavras = new ArrayList<>();
        
        System.out.println("Digite uma frase: ");
        frase = teclado.nextLine();  // le uma linha inteira
        String[] split = frase.split(" ");  // quebra a frase pelos espaços, retorna um vetor de palavras
        
        // pega a frase, tira espaços no inicio e no fim, e quebra por espaço
        for (String palavra : frase.trim().split(" ")){
            palavras.add(palavra);
        }
        
        System.out.println("Frase invertida:");
        
        for(int i = palavras.size() - 1; i >= 0; i--){
            System.out.print(palavras.get(i) + " ");
        }
        
        
    }
}
