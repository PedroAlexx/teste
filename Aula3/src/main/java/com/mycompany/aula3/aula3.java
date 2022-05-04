/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula3;
import javax.swing.JOptionPane;


/**
 *
 * @author ice
 */
public class aula3 {
    public static void main(String[] args)
    {
        String x1, x2, x3;
        String y1, y2, y3;
        float l1, l2, l3;
        x1 = JOptionPane.showInputDialog("Insira o X1: ");
        y1 = JOptionPane.showInputDialog("Insira o Y1: ");
        x2 = JOptionPane.showInputDialog("Insira o X2: ");
        y2 = JOptionPane.showInputDialog("Insira o Y2: ");
        x3 = JOptionPane.showInputDialog("Insira o X3: ");
        y3 = JOptionPane.showInputDialog("Insira o Y3: ");

        l1 = Float.parseFloat(x1);
        l2 = Float.parseFloat(x2);
        l3 = Float.parseFloat(x3); 
        
        if(l1 == l2 & l1 == l3 & l2 == l3){
            JOptionPane.showMessageDialog(null, "É equilátero");
        } else if( (l1 == l2 && l1 == l3) || (l2 == l1 && l2 == l3) || (l3 == l1 && l3 == l2) ){
            JOptionPane.showMessageDialog(null, "É isósceles");
        } else {
            JOptionPane.showMessageDialog(null, "É escaleno");
        }
    }

    
        
}
