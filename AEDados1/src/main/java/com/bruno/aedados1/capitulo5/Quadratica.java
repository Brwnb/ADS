
package com.bruno.aedados1.capitulo5;

import java.util.Scanner;


public class Quadratica {

 
    public static void main(String args[]) {
      double b, c, raizdiscriminante;
      
      Scanner lerTeclado = new Scanner(System.in);
      Scanner lerTeclado2 = new Scanner(System.in);
      b = lerTeclado.nextDouble();
      c = lerTeclado2.nextDouble();
      
     raizdiscriminante = Math.sqrt(b*b - 4*c);
     System.out.println((b - raizdiscriminante) / 2);
     System.out.println((b + raizdiscriminante) / 2);
    }
}
