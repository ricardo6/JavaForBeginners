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
public class Ejemplo4 {
    public static void main(String []args) throws IOException{
        System.out.println("Introduce primer carácter");
        char char1=(char)System.in.read();
        System.in.read();//no return nothing, we will to next input 
        System.out.println("Introduce segundo carácter");
        char char2=(char)System.in.read();
        if(char1==char2) System.out.println("son inguales:"+char1+","+char2);
        else System.out.println("No son inguales:"+char1+","+char2);
    }
}
