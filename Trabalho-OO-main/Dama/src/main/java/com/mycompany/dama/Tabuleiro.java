/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dama;

/**
 *
 * @author ice
 */
public class Tabuleiro 
{
    Jogador A = new Jogador();
    int dimensao = 8;
    Peca pecas;
    
    private static final String Alfabeto = "0ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // util para as coordenadas
    
    
    Peca tabuleiro[][] = new Peca [dimensao][dimensao];
    
    public Tabuleiro() {          

            // espaços vazios no inicio
            this.tabuleiro[0][0] = " ";

            for(int j = 0; j < this.dimensao; j++) {
                this.tabuleiro[0][j] = String.valueOf(Alfabeto.charAt(j));
            }

            for(int i = 0; i < this.dimensao; i++) {
                String numeroDaLinha = "";

                // evita os espaços grudados
                numeroDaLinha += String.valueOf(i) + " ";

                this.tabuleiro[i][0] = numeroDaLinha;
            }         
            

            // Todas as posições inicialmente começam com "-"
            for (int i = 1; i < this.dimensao; i++) {
                for (int j = 1; j < this.dimensao; j++) {
                   this.tabuleiro[i][j] = "-";
                }
            }
       
        }
    public void Tabuleiro(int d){
        this.dimensao = d - 1;
        // inicializa posições
        for(int i = 1; i < d; i++){
            for(int j = 1; j < d; j++){
                if(i == 4 || i == 5){
                    
                }
            }
        }
    }
   
    
    public void MostraTabuleiro(){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("******************FIM DO TABULEIRO******************");
    }
    public boolean conferePosicao(int DL, int DC){
        if(DL < 0 || DL > this.dimensao || DC < 0 || DC > this.dimensao){
            System.out.println("Erro, destino inválido! Posicao fora do tabuleiro.");
            return false;
        }
    }
    
    
    public void MovePeca(int OrigemLinha, int OrigemColuna, int DestinoLinha, int DestinoColuna){
        tabuleiro[DestinoLinha][DestinoColuna] = tabuleiro[OrigemLinha][OrigemColuna];
        tabuleiro[OrigemLinha][OrigemColuna] = null;        
    }
}
