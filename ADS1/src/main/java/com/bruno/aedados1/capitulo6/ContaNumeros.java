package com.bruno.aedados1.capitulo6;

import javax.swing.JOptionPane;

public class ContaNumeros {

    public static void main(String args[]) {
        short count, n;
        count = 1;
        n = Short.parseShort(JOptionPane.showInputDialog("Digite um numero: "));
        
        while(n != 0){
            n = Short.parseShort(JOptionPane.showInputDialog("Digite um numero: "));
            count++;
        }
        JOptionPane.showMessageDialog(null, (count -1));
    }
}
