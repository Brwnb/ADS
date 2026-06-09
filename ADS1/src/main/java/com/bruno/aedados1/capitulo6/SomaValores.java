package com.bruno.aedados1.capitulo6;

import javax.swing.JOptionPane;


public class SomaValores {

  
    public static void main(String args[]) {
        short numero, soma = 0;
     
        numero = Short.parseShort(JOptionPane.showInputDialog("Digite um numero: "));
        
        while(numero != 0){
            soma += numero;
            numero = Short.parseShort(JOptionPane.showInputDialog("Digite um numero: "));
            
        }
        JOptionPane.showMessageDialog(null, (soma));
        
    }
}
