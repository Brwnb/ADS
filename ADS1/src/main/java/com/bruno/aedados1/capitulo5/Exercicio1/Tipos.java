package com.bruno.aedados1.capitulo5.Exercicio1;

public class Tipos {

    public static void main(String args[]) {

        
        short A;
        float B, C, D, E;

        A = 1 + 2 * 3;
        B = 1 + 2 * 3f / 7.0f;
        C = 1 + 2 * 3 / 4;
        D = 3f / 3f * 4f;
        E = (float)A + B * C - D;

        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
        System.out.println("E: " + E);

        /*
        short num = 1;
        byte num2 = 10;
        int num3 = 100;
        long num4 = 10000L; // o L pode ser minusculo
        float num5 = 3.5f;
        double num6 = 3.5555;
        boolean flag = true; // or false
        char a = 'a'; // Pode ser um numero que vai representar uma letra na tabela ANSII
         */
    }
}
