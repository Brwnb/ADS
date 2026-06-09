package com.bruno.aedados1.capitulo6;

import javax.swing.JOptionPane;


public class SomaValoresV2 {

  
    public static void main(String args[]) {
        short n, i, numero, soma = 0;
     
        n = Short.parseShort(JOptionPane.showInputDialog("Digite um numero: "));
        i = 1;
        while(i <= n){
            
            numero = Short.parseShort(JOptionPane.showInputDialog("Digite um numero: "));
            soma += numero;
            i++;
        }
        JOptionPane.showMessageDialog(null, soma);
        
    }
}
