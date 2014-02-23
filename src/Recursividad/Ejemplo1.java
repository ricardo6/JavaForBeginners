/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Recursividad;

import java.util.Scanner;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * 1. Calcular el cociente de dos números enteros de forma recursiva.
 * 
 */
public class Ejemplo1{
    private int res;
    private int calcularResto(int a, int b) {
        if(a<b)
            return res=0;
        else return res=1+calcularResto(a-b, b);
    }
    public void mostrar(){
        System.out.println("Resto="+res);
    }
    public static void main(String []args){
        Ejemplo1 e1=new Ejemplo1();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce dos numeros dividendo/divisor");
        int dividendo=scanner.nextInt();
        int divisor;
        do {          
            System.out.println("intro divisor >0");
            divisor=scanner.nextInt();
        } while (divisor<=0);
        e1.calcularResto(dividendo, divisor);
        e1.mostrar();
    }
}
