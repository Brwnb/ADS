package com.bruno.aedados1.capitulo5.Exercicio3;

import javax.swing.JOptionPane;

public class Exercicio3A {

  
    public static void main(String args[]) {
        float w,a,b,c, result;
        
        w = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor: "));
        a = Float.parseFloat(JOptionPane.showInputDialog("Digite um Valor: "));
        b = Float.parseFloat(JOptionPane.showInputDialog("Digite um Valor: "));
        c = Float.parseFloat(JOptionPane.showInputDialog("Digite um Valor: "));
        
        result = ((w*w) / ((a*a) + b + c));
        JOptionPane.showMessageDialog(null, result);
        
    }
}
