/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Generales;

/**
 *
 * @author drupal
 */
public class Ejemplo1 {
    public static void main(String []args){
        int a=10;int b=20;
        System.out.println("a="+a+" y b="+b);
        a=b;b=a;
        System.out.println("despus de intercambiar");
        System.out.println("a="+a+" y b="+b);
    }
}
