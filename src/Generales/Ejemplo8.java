/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Generales;

import java.util.Scanner;

/**
 *
 * Un ejemplo de números amigos son los números 220 y 284.
    Los divisores propios de 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110.
    La suma de los divisores propios de 220 da como resultado 284
    Los divisores propios de 284 son 1, 2, 4, 71 y 142.
    La suma de los divisores propios de 284 da como resultado 220.
    Por lo tanto 220 y 284 son amigos.
 */
public class Ejemplo8 {
    private void amigos(int a, int b) {
        int sum_a=sumaDiv_a(a);
        int sum_b=sumaDev_b(b);
        if (sum_a==b&&sum_b==a) {
            System.out.println("Son amigos");
        }else System.out.println("No son amigos");
    }

    private int sumaDev_b(int b) {
        int suma=0;
        for (int i = 1; i < b; i++) {
            if (b%i==0) {
                suma=suma+i;
            }
        }
        return suma;
    }

    private int sumaDiv_a(int a) {
        int suma=0;
        for (int i = 1; i < a; i++) {
            if (a%i==0) {
                suma=suma+i;
            }
        }
        return suma;
    }
    public static void main(String []args){
        System.out.println("Introduce dos numero para saber si son amigos");
        System.out.println("posibles:"
        + "1184,1210\n" +
        " 2620,   2924\n" +
        " 5020,   5564");
        System.out.println("****************");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        System.out.println("Introduce el segundo número");
        int b=scanner.nextInt();
        Ejemplo8 e8=new Ejemplo8();
        e8.amigos(a, b);
    }
}
