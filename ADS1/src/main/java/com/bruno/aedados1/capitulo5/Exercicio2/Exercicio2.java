package com.bruno.aedados1.capitulo5.Exercicio2;

import java.util.Scanner;


public class Exercicio2 {


    public static void main(String args[]) {
        
        float a,b,c,d,e,f;
        float x;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digita um número: ");
        a = input.nextShort();
        b = input.nextShort();
        c = input.nextShort();
        d = input.nextShort();
        e = input.nextShort();
        f = input.nextShort();
        
        x = (((a+b) / (c - d)) * e) / (f/(a*b) + e);
        
        System.out.printf("%e", x);
    }
}
