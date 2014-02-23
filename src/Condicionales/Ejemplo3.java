/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Condicionales;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author drupal
 */
public class Ejemplo3 {
    public static void main(String []args) throws IOException{
        System.out.println("Introdusc a un character");
        char caracter=(char)System.in.read();
        if(Character.isUpperCase(caracter)) {
            System.out.println("Es mayúscula:"+caracter);
        }else{
            System.out.println("No es mayúscula:"+caracter);
        }
    }
}
