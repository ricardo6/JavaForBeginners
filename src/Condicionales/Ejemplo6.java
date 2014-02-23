/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Condicionales;

import java.io.IOException;

/**
 *
 * @author drupal
 */
public class Ejemplo6 {
    //bueno aqui el enunciado no esta muy bien 
    //que pasa si meto un número negativo -1; aqui veo dos caracteresss
    //pero es facil solucionarlo veanlo ustedes...
   public static void main(String []args) throws IOException{
       System.out.println("Introduce un carácter");
       char c=(char)System.in.read();
       if (Character.isDigit(c)) {
           if (c>='0' && c<='9') {
               System.out.println("Es un numero:"+c);
           }
       }else{System.out.println("No es un numero:"+c);}
   }
}
