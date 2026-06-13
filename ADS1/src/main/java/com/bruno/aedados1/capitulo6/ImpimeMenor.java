package com.bruno.aedados1.capitulo6;

import javax.swing.JOptionPane;

public class ImpimeMenor {

    public static void main(String args[]) {
        short a, b, c;
        a = Short.parseShort(JOptionPane.showInputDialog("Digita um numero: "));
        b = Short.parseShort(JOptionPane.showInputDialog("Digita um numero: "));
        c = Short.parseShort(JOptionPane.showInputDialog("Digita um numero: "));

        if (a < b) {
            if (a < c) {
                JOptionPane.showMessageDialog(null, "o menor numero e: " + a);
            } else {
                JOptionPane.showMessageDialog(null, "o menor numero e: " + c);
            }

        }else{
            if(b < c){
                JOptionPane.showMessageDialog(null, "o menor numero e: " + b);
            }
            else {
                JOptionPane.showMessageDialog(null, "o menor numero e: " + c);
            }
        }

    }
}
