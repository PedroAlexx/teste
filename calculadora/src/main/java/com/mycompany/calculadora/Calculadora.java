/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculadora;

import java.util.Scanner;

/**
 *
 * @author T-Gamer
 */
public class Calculadora {
    
    int memoria;
    
    public Calculadora() {
        this.memoria = 0;
    }
    
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner teclado = new Scanner(System.in);
        
        int opcao = 0;
        
        while(opcao != 6){
            calculadora.imprimeMenu();
            opcao = teclado.nextInt();
            
            if(opcao == 1)
                calculadora.soma();
            else if(opcao == 2)
                calculadora.subtracao();
            else if(opcao == 3)
                calculadora.multiplicacao();
            else if(opcao == 4)
                calculadora.divisao();
            else if(opcao == 5)
                calculadora.limparMemoria();
        }
    }
    
    public void soma(){
        
        int valor;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor a ser somado: ");
        valor = teclado.nextInt();
        
        this.memoria += valor;
    }

    public void subtracao(){
        int valor;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor a ser subtraído: ");
        valor = teclado.nextInt();
        
        this.memoria -= valor;
    }
    public void multiplicacao() {
        int valor;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor a ser multiplicado: ");
        valor = teclado.nextInt();
        
        this.memoria *= valor;
    }
    public void divisao() {
        int valor;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor a ser dividido: ");
        valor = teclado.nextInt();
        
        this.memoria /= valor;
    }
    
    public void limparMemoria(){
        System.out.println("Limpando a memória....");
        this.memoria = 0;
    }
    
    public void imprimeMenu() {
        System.out.println("Estado da memória: " + this.memoria);
        System.out.println("Opções\n");
        
        System.out.println("(1) Somar");
        System.out.println("(2) Subtrair");
        System.out.println("(3) Multiplicar");
        System.out.println("(4) Dividir");
        System.out.println("(5) Limpar memória");
        System.out.println("(6) Sair do programa\n");
        
        System.out.println("Qual opção você deseja? ");
    }
    

        
        
    }
}
