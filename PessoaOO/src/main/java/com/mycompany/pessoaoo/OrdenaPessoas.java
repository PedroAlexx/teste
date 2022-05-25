/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoaoo;

/**
 *
 * @author T-Gamer
 */
public class OrdenaPessoas { // faz a recepção de elementos que vão ser lidos
    
    Pessoa[] pessoas;

    public OrdenaPessoas(Pessoa[] pessoas) {
        this.pessoas = pessoas;
    }
    
    public OrdenaPessoas() {
        this.pessoas = new Pessoa[5];
    }
    
    public void imprimeNome(){
        int cont; 
        int[] ordem = new int[pessoas.length];
        for (int i = 0; i < pessoas.length; i++) {  // comparação com os demais nomes
            cont = 0; //
            for (int j = 0; j < pessoas.length; j++){
                if( i != j && pessoas[i].nome.compareTo(pessoas[j].nome) > 0){
                    cont++;
            } else if (i > j && pessoas[i].nome.compareTo(pessoas[j].nome) == 0){
                    cont++;
            }
        }
         ordem[cont] = i;
    }
    System.out.println("Imprimindo pessoas por nome:");
    for(int i = 0; i < ordem.length; i++) {
        System.out.println(pessoas[ordem[i]]);
    } 
    }
    
    public void imprimeIdade(){
        int cont; 
        int[] ordem = new int[pessoas.length];
        for (int i = 0; i < pessoas.length; i++) {  // comparação com os demais nomes
            cont = 0; //
            for (int j = 0; j < pessoas.length; j++){
                if( i != j && pessoas[i].idade > pessoas[j].idade){
                    cont++;
            } else if(i > j && pessoas[i].idade == pessoas[j].idade){
                    cont++;
            }
        }
         ordem[cont] = i;
    }
    System.out.println("Imprimindo pessoas por idade:");
    for(int i = 0; i < ordem.length; i++) {
        System.out.println(pessoas[ordem[i]]);
    } 
    }
    
    public static void main(String[] args) {
        OrdenaPessoas ordena = new OrdenaPessoas();
        
        for ( int i = 0; i < ordena.pessoas.length; i++) {
            System.out.println("Pessoa " + (i+1));
            ordena.pessoas[i] = Pessoa.lePessoa();
        }
        
        ordena.imprimeNome();
        System.out.println("");
        ordena.imprimeIdade();
    }
    

    
}
