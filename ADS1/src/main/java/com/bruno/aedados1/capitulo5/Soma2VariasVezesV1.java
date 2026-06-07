package com.bruno.aedados1.capitulo5;

import java.util.Scanner;

public class Soma2VariasVezesV1 {

    public static void main(String args[]) {
        int a, b, cont;
        cont = 1;
        Scanner lerTeclado1 = new Scanner(System.in);
        while (cont <= 5) {

            System.out.print("Digita um numero: ");
            a = lerTeclado1.nextInt();
            System.out.print("Digita outro numero: ");
            b = lerTeclado1.nextInt();

            System.out.println("O resultado de " + a + " + " + b + " = " + (a + b));
            cont++;
        }
    }
}
