package com.bruno.aedados1.capitulo5.Exercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author NB28940
 */
public class Exercicio2V2 {

    public static void main(String args[]) {

        float a, b, c, d, e, f; 
        float x;
        
        a = Float.parseFloat(JOptionPane.showInputDialog("Digita um número: "));
        b = Float.parseFloat(JOptionPane.showInputDialog("Digita um número: "));
        c = Float.parseFloat(JOptionPane.showInputDialog("Digita um número: "));
        d = Float.parseFloat(JOptionPane.showInputDialog("Digita um número: "));
        e = Float.parseFloat(JOptionPane.showInputDialog("Digita um número: "));
        f = Float.parseFloat(JOptionPane.showInputDialog("Digita um número: "));

        x = (((a + b) / (c - d)) * e) / (f / (a * b) + e);

        JOptionPane.showMessageDialog(null, x);
    }
}

