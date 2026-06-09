package com.bruno.aedados1.capitulo5.Exercicio4;

import javax.swing.JOptionPane;

public class Exercicio4 {

    public static void main(String args[]) {
        
        short a,b,c,d;
        a = Short.parseShort(JOptionPane.showInputDialog("Digita a hora: "));
        b = Short.parseShort(JOptionPane.showInputDialog("Digite os minutos: "));
        c = Short.parseShort(JOptionPane.showInputDialog("Digita a hora: "));
        d = Short.parseShort(JOptionPane.showInputDialog("Digite os minutos: "));
        
        JOptionPane.showMessageDialog(null, "A soma das horas e: " + (a + c)+ ":" + (b + d));
    }
}
