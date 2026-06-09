package com.bruno.aedados1.capitulo5.Exercicio2;

import javax.swing.JOptionPane;


public class Exercicio2V3 {

    public static void main(String args[]) {

        Double a, b, c, d, e, f; 
        Double x;
        
        a = Double.valueOf(JOptionPane.showInputDialog("Digita um número: "));
        b = Double.valueOf(JOptionPane.showInputDialog("Digita um número: "));
        c = Double.valueOf(JOptionPane.showInputDialog("Digita um número: "));
        d = Double.valueOf(JOptionPane.showInputDialog("Digita um número: "));
        e = Double.valueOf(JOptionPane.showInputDialog("Digita um número: "));
        f = Double.valueOf(JOptionPane.showInputDialog("Digita um número: "));

        x = (((a + b) / (c - d)) * e) / (f / (a * b) + e);

        JOptionPane.showMessageDialog(null, x);
    }
}

