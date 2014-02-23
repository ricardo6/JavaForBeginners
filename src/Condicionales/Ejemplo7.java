/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Condicionales;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author drupal
 */
public class Ejemplo7 {
   public static void main(String []args){
       System.out.println("Introduce dividendo");
       Scanner scanner=new Scanner(System.in);
       double div=scanner.nextDouble();
       System.out.println("Introduce divisor");
       Scanner scanner1=new Scanner(System.in);
       double divisor=scanner1.nextDouble();
       if (divisor!=0) System.out.println(div/divisor);
       else System.out.println("No es posible dividir entre cero, por intente nuevamente");
   }
}
