/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Recursividad;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author drupal
 */
public final class Ejemplo2 {
    private int numero;
    public Ejemplo2() throws IOException{
        System.out.println("%%%%%%%%%%%%");
        int n=leerNumeros();
        decimalBinario(n);
    }
    public void decimalBinario(int n) {
        if(n<2)
            System.out.print(n);
        else {
            decimalBinario(n/2);
            System.out.print(n%2);
        }
    }
    public int leerNumeros(){
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("inter a positive number");
            numero=scanner.nextInt();
        } while (numero<0);
        return numero;
    }
    public static void main(String[]args) throws IOException{
        Ejemplo2 e2=new Ejemplo2();
    } 
}
