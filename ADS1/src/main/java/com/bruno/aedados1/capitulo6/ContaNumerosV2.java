package com.bruno.aedados1.capitulo6;

import javax.swing.JOptionPane;

public class ContaNumerosV2 {

    public static void main(String args[]) {
        short count, n;
        count = 0;
        n = Short.parseShort(JOptionPane.showInputDialog("Digite um numero: "));
        
        while(n != 0){
            count++;
            n = Short.parseShort(JOptionPane.showInputDialog("Digite um numero: "));
            
        }
        JOptionPane.showMessageDialog(null, (count));
    }
}
