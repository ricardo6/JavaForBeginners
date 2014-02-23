/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

import java.util.Scanner;

/**
 *
 * Calcular 2 elevado a n de forma recursiva
 */
public class Ejemplo3 {

    private  int nn;
    private int res;

    public Ejemplo3(int nn) {
        this.nn=nn;
        //si es negativo multiplicamos por (-1)
        if (nn<0) {
            int aux = -1 * nn;
            potencia(aux);
        }else {
            potencia(nn);
        }
        mostrar();
    }
    //recursivo
    public int potencia(int n) {
        if (n == 0) {
            return res = 1;
        } else {
            return res = 2 * potencia(n - 1);
        }
    }

    public void mostrar() {
        if (nn < 0) {
            System.out.println("2^" + nn + "=1/" + res);
        } else {
            System.out.println("2^" + nn + "=" + res);
        }
    }

    public static void main(String[] args) {
        System.out.println("#####calculo de potencias");
        for (int i = 0; i < 10; i++) {
            Ejemplo3 e3=new Ejemplo3(i);
        }
        System.out.println("#####si la potencia es negativa");
        for (int i = -9; i <=0; i++) {
            Ejemplo3 e3=new Ejemplo3(i);
        }
    }
}
