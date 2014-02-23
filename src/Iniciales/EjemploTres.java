/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Iniciales;

import javax.swing.JOptionPane;

/**
 *
 * @author ric.rs6@gmail.com
 */
public class EjemploTres {
   public static void main(String []args){
       String numero=JOptionPane.showInputDialog("Intro un numero");
       int n=Integer.parseInt(numero);
       System.out.println("Tu numero es:"+n);
       System.out.println("------------------------");
       System.out.println("Incremento en 77:=>"+(n+77));
       System.out.println("Decrementoen 3:=>"+(n-3));
       System.out.println("Duplicar:=>"+(2*n));
   }
}
