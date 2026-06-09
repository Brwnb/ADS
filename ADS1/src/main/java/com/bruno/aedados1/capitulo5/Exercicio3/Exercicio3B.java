package com.bruno.aedados1.capitulo5.Exercicio3;

import javax.swing.JOptionPane;


public class Exercicio3B {

   
    public static void main(String args[]) {
        float p1,p2,r,y,z,w,a,b, result;
        
        p1 = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor: "));
        p2 = Float.parseFloat(JOptionPane.showInputDialog("Digite um Valor: "));
        r = Float.parseFloat(JOptionPane.showInputDialog("Digite um Valor: "));
        y = Float.parseFloat(JOptionPane.showInputDialog("Digite um Valor: "));
        z = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor: "));
        w = Float.parseFloat(JOptionPane.showInputDialog("Digite um Valor: "));
        a = Float.parseFloat(JOptionPane.showInputDialog("Digite um Valor: "));
        b = Float.parseFloat(JOptionPane.showInputDialog("Digite um Valor: "));
        
        result = (((p1 + p2) / y - z) * r) / ((w / (a * b)) + r);
        JOptionPane.showMessageDialog(null, result);
        
    }
}
