/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pilha_generics;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author T-Gamer
 */
public class Pilha_Generics <T>{
    
    private List<T> pilha;
    
    public Pilha_Generics(){  
        this.pilha = new ArrayList<>();  // inicializa a pilha        
    }
    public void empilhar(T elemento){
        this.pilha.add(elemento);        
    }
    public T desempilhar(){
        if(pilha.isEmpty()){
            return null;
        } else {
            return pilha.remove(pilha.size() - 1);
        }
    }
    public boolean ehVazia(){
        return pilha.isEmpty();
    }

}
