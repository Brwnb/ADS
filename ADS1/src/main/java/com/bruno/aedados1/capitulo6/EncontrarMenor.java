package com.bruno.aedados1.capitulo6;

import javax.swing.JOptionPane;

public class EncontrarMenor {

    public static void main(String args[]) {
        short n, menor;
        n = Short.parseShort(JOptionPane.showInputDialog("Digite um numero: "));
        if (n != 0) {
            menor = n;
            n = Short.parseShort(JOptionPane.showInputDialog("Digite um numero: "));
            while (n != 0) {

                if (n < menor) {
                    menor = n;
                }
                n = Short.parseShort(JOptionPane.showInputDialog("Digite um numero: "));
            }
            JOptionPane.showMessageDialog(null, "O menor numero é " + menor);

        }
    }
}
