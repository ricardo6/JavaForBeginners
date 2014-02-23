/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Generales;

import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * °K = °C + 273
 */
public class Ejemplo3 {
    public static void main(String[]args) throws IOException{
        char continuar;
        int c;
        System.out.println("Introduce Cº");
        Scanner scanner=new Scanner(System.in);
        do {
           c=scanner.nextInt();
           System.out.println((c+273)+" Grados kelvin");
           System.out.println("contiguar? s/n ");
           continuar=(char)System.in.read();
        } while (continuar=='s'||continuar=='S');
    }
}