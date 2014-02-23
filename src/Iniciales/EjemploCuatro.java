/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Iniciales;

/**
 *
 * @author drupal
 */
public class EjemploCuatro {
    private final int a=100;
    private final int b=200;
    private final int c=300;
    private final int d=400;
    public EjemploCuatro(){
        asignaciones(a, b, c, d);
    }
    private void asignaciones(int a, int b, int c, int d) {
        System.out.println("Antes:"+"a="+a+",b="+b+",c="+c+",d="+d);
        System.out.println("--------------------------------");
        b=c;c=a;a=d;d=b;
        System.out.println("Despues:"+"a="+a+",b="+b+",c="+c+",d="+d);
    }
    public static void main(String []args){
         EjemploCuatro e4=new EjemploCuatro();
    }
}
