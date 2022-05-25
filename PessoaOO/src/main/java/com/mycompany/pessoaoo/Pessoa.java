/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pessoaoo;

import java.util.Scanner;
/**
 *
 * @author T-Gamer
 */
public class Pessoa {
    String nome;
    int idade;
    // Cria o construtor
    public Pessoa(){
        nome = "Joao";
        idade = 20;
    }
    // Cria um segundo construtor para receber parametros
    public Pessoa(String nome, int idade){
        this.nome = nome;  // nesse objeto sendo construído, muda o nome dele
        this.idade = idade;        
    }
    public static Pessoa lePessoa(){
        Scanner teclado = new Scanner(System.in);
        String nome;
        int idade;
        
        System.out.println("Digite o nome da pessoa:");
        nome = teclado.next();
        
        System.out.println("Digite a idade de " + nome + ":");
        idade = teclado.nextInt();
        
        return new Pessoa(nome, idade);
      
    }
    
    @Override
    public String toString(){  // Impressão
        return this.nome + " - " + this.idade;  // como que será a impressão do objeto
    }
    
} 
