package com.bruno.aedados1.capitulo5;

import java.util.Scanner;

public class Soma2Numeros {

    public static void main(String args[]) {
        int a, b;
        Scanner lerTeclado1 = new Scanner(System.in);
        
        System.out.print("Digita um numero: ");
        a = lerTeclado1.nextInt();
        System.out.print("Digita outro numero: ");
        b = lerTeclado1.nextInt();

        System.out.println("O resultado de " + a + " + " + b + " = " + (a + b));
    }
}
