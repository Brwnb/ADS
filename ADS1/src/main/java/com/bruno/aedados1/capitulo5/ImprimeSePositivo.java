package com.bruno.aedados1.capitulo5;

import java.util.Scanner;

public class ImprimeSePositivo {

    public static void main(String args[]) {
        int a;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um nnmero Positivo: ");
        a = teclado.nextInt();
        
        if(a > 0){
            System.out.print("Valor Digitado: " + a);
        }

    }
}
