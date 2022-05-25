/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_sudoku;
import java.util.Scanner;
/**
 *
 * @author ice
 */
public class Sudoku {
        private int linha, coluna, valor;
        private int tabela[][] = new int[8][8];
        private int tabela_menor[][] = new int[2][2];
        
    public Sudoku() {
        this.linha = 0;
        this.coluna = 0;
        this.valor = 0;
    }
    
    
    
    public static void main(String[] args) {
        System.out.println("Olá, pretende jogar um Jogo Aleatório ou Definir seu próprio jogo: ");
        
    }
    public void JogoAleatorio(){
        System.out.println("Quantos números você deseja criar?: ");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();       
         
    }
    public void DefinirJogo(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Olá, insira a linha: ");        
        int line = teclado.nextInt();
        System.out.println("Insira a coluna: ");        
        int coluna = teclado.nextInt();
        System.out.println("Olá, insira o valor:");        
        int value = teclado.nextInt();
        if(line == -1 && coluna == -1 && value == -1){
            System.out.println("Encerrando...");
            return;
        } else {
            this.tabela[line][coluna] = valor;
        }
        
    }
    
    
    
}
    

