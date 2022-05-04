/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atribuicoes;

/**
 *
 * @author ice
 */
import java.util.Scanner;
import javax.swing.JOptionPane;


class Atribuicoes {
        public static void main(String[] args) {
    //    float x = 1.0f;
    //    float y = 2.0f;
    //    float z = 3.0f;
    //
    //    x = -x;
    //    y = y - 1;
    //    z = z + x;
    //    z = z + x - y;
    //    System.out.println("x = "+x+", y = "+y+", z = "+z);

//    Scanner teclado = new Scanner(System.in);    
//    int valor;
//    System.out.println("DIgite a quantidade em centavos:");
//    valor = teclado.nextInt();
//    System.out.println("Moeadas de 1 = "+valor/100+"");
//    valor = valor % 100;
//    System.out.println("Moeadas de 50 centavos = "+valor/50+"");
//    valor = valor % 50;
//    System.out.println("Moeadas de 25 centavos = "+valor/25+"");
//    valor = valor % 25;
//    System.out.println("Moeadas de 10 centavos = "+valor/10+"");
//    valor = valor % 10;
//    System.out.println("Moeadas de 5 = "+valor/5+"");
//    valor = valor % 5;    
//    System.out.println("Moeadas de 1 = "+valor+"");

//    System.out.println("Olá, insira o seu nome: ");
//    String nome;
//    Scanner teclado = new Scanner(System.in);
//    nome = teclado.next();
//    System.out.println("Olá, "+nome+"");

//System.out.println("Olá, a calculadora será inicializada");
//
//int encerrar = 0;
//while(encerrar != 1){
//    Scanner teclado = new Scanner(System.in);    
//    System.out.println("Digite n1:");
//    float n1 = teclado.nextFloat();    
//    System.out.println("Digite n2:");
//    float n2 = teclado.nextFloat();
//    String operacao = teclado.nextLine();
//    if(operacao.equals("+"))
//    {
//        System.out.println("Soma: "+(n1+n2)+"");       
//    }
//    if(operacao.equals("-"))
//    {
//        System.out.println("Subtração: "+(n1-n2)+"");       
//    }
//    if(operacao.equals("*"))
//    {
//        System.out.println("Multiplicação: "+(n1*n2)+"");       
//    }
//    if(operacao.equals("/"))
//    {
//        System.out.println("Divisão: "+(n1/n2)+"");       
//    }
//    System.out.println("Deseja sair? Se sim, digite 1.");
//    String sair = teclado.next();
//    if(sair == "1")
//    {
//        break;
//    }
//}
//    System.out.println("Olá, calculadora encerrada");
//}
String x1, x2;
String y1, y2;
double doublex1, doublex2, doubley1, doubley2;
double distancia;
x1 = JOptionPane.showInputDialog("Insira x1:");
x2 = JOptionPane.showInputDialog("Insira x2:");
y1 = JOptionPane.showInputDialog("Insira y1:");
y2 = JOptionPane.showInputDialog("Insira y2:");

doublex1 = Double.parseDouble(x1);
doublex2 = Double.parseDouble(x2);
doubley1 = Double.parseDouble(y1);
doubley2 = Double.parseDouble(y2);

distancia = Math.sqrt(Math.pow(doublex1 - doublex2, 2) + Math.pow(doubley1 - doubley2, 2));

JOptionPane.showMessageDialog("A distancia entre os pontos ("+x1+
        ","+y1+") e os pontos ("+x2+", "+y2+") é: "+distancia+);
}
}

