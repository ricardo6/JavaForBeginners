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
public class Ejemplo5 {
    public static void main(String[]args) throws IOException{
        System.out.println("Introduce el primer caracter");
        char char1=(char)System.in.read();
        System.in.read();//out of fufffer
        System.out.println("Introduce el segundo caracter");
        char char2=(char)System.in.read();
        if(Character.isLowerCase(char1)&&Character.isLowerCase(char2))
            System.out.println("son minúsculas:"+char1+","+char2);
        else System.out.println("No son minúsculas, ya q uno de ellos es Mayúscula:"+char1+","+char2);
    }
}
