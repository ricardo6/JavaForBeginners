/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Condicionales;

/**
 *
 * @author drupal
 */
public class Ejemplo8 {
    public static void main(String []args){
        int a=45;int b=60;int c=90;int mayor;
        if(a>b&&b>c)
            System.out.println("Mayor es:"+a);
        else if(c>b)
            System.out.println("mayor es:"+c);
        else
            System.out.println("Mayor es:"+b);
    }
}
