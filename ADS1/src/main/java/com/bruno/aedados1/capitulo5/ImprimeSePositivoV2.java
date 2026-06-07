package com.bruno.aedados1.capitulo5;

import java.util.Scanner;

public class ImprimeSePositivoV2 {

    public static void main(String args[]) {
        int a;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um numero Positivo: ");
        a = teclado.nextInt();
        
        if(a > 0){
            System.out.print("Valor Digitado: " + a);
        }
        else{
            System.out.print("Valor Digitado não é positivo ");
            
        }

    }
}
