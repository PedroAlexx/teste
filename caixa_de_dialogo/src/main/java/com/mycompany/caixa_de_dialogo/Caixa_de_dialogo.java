/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.caixa_de_dialogo;
import javax.swing.JOptionPane;  // As caixas de diálogo estão no pacote JOptionPane do Swing

/**
 *
 * @author usuario
 */
public class Caixa_de_dialogo {

    public static void main(String[] args) {
        //JOptionPane.showConfirmDialog( null, "Sou showConfirmDialog", "Título", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null);
        /*
        showConfirmDialog(Component parentComponent, Object message, String title, int optionType, int messageType, Icon icon)
        
        Component parentComponent: Define o componente que é o pai da caixa de dialogo( Jframe (vamos ver no futuro); null, forma que vamos utilizar por padrão agora
        Object message: Mensagem para ser exibida para o usuário
        String title: Título da caixa de diálogo
        int optionType: Define o conjunto de botões que aparecem na caixa de diálogo: DEFAULT_OPTION / YES_NO_OPTION / YES_NO_CANCEL_OPTION / OK_CANCEL_OPTION
        */
        //JOptionPane.showInputDialog("insira uma frase");
        /*
        String opcoes[] = {"Opção 1", "Opção 2"};
        Object showInputDialog = JOptionPane.showInputDialog(null, opcoes, "Título", JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
        System.out.print(showInputDialog);*/
        
        // Mostra uma mensagem
        //JOptionPane.showMessageDialog(null, "Mensagem para o usuário!", "Título...", JOptionPane.INFORMATION_MESSAGE, null);
        
        //
        /*
        String[] options = {"Opção 1", "Opção 2", "Opção 3"};
        int option = JOptionPane.showOptionDialog(null, "Mensagem para o
        usuário!!", "Título da janela", JOptionPane.OK_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        */
        // Type casting: 
        // Passar inteiro para real
//        int b = 5; int c = 2;
//        float y = (float)b/c;
//        System.out.print(y);
        // Transformar String para número
//        String x_str = JOptionPane.showInputDialog("Insira um numero");
//        int x = Integer.parseInt(x_str);
//        System.out.println(x);
        
//        Integer.parseInt(String s);
//        Double.parseDouble(String s);
//        Float.parseFloat(String s);
          // exercicio 1
          /*
          int x1, y1, x2, y2;
          String x1_str, y1_str, x2_str, y2_str;
          x1_str = JOptionPane.showInputDialog("Insira o valor de x1: ");
          x1 = Integer.parseInt(x1_str);
          y1_str = JOptionPane.showInputDialog("Insira o valor de y1: ");
          y1 = Integer.parseInt(y1_str);
          x2_str = JOptionPane.showInputDialog("Insira o valor de x2: ");
          x2 = Integer.parseInt(x2_str);
          y2_str = JOptionPane.showInputDialog("Insira o valor de y2: ");
          y2 = Integer.parseInt(y2_str);
          float distancia = (float)Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
          System.out.println(distancia);*/
          // exercicio 2
          float x1, x2, memory;
          String str_x1, str_x2, str_memory;
          str_x1 = JOptionPane.showInputDialog("Insira o primeiro numero: ");
          str_x2 = JOptionPane.showInputDialog("Insira o segundo numero: ");
          x1 = Float.parseFloat(str_x1);
          x2 = Float.parseFloat(str_x2);
          
          
          
    }
}
