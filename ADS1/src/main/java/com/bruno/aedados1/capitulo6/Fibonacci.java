package com.bruno.aedados1.capitulo6;

import javax.swing.JOptionPane;

public class Fibonacci {

    public static void main(String args[]) {
        int ultimo, penultimo, atual, cont, n;

        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        ultimo = 1;
        penultimo = 1;
        JOptionPane.showMessageDialog(null, "ultimo " + ultimo + " penultimo " + penultimo);
        


        cont = 3;
        while (cont < n) {
            atual = (ultimo + penultimo);
            JOptionPane.showMessageDialog(null, "contador " + cont + " Atual " + atual);
            penultimo = ultimo;
            ultimo = atual;
            cont ++;
        }
    }
}
