/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Iniciales;

/**
 *
 * @author ric.rs6@gmail.com
 */
public class EjemploUno {
    private int n;
    private double a;
    private char c;
    public EjemploUno(int n, double a, char c){
        this.n=n;
        this.a=a;
        this.c=c;
    }
    public void mostrarVaribles(){
        System.out.println(n);
        System.out.println(a);
        System.out.println(c);
        System.out.println("La suma de n+a es="+(n+a));
        System.out.println("La Diferecia es de a-n es="+(a-n));
        String cc=Integer.toString(c);
        int ccc=Integer.parseInt(cc);
        System.out.println(ccc);
       
    }
    public static void main(String []args){
       EjemploUno e1= new EjemploUno(100, 100.5, 'x');
       e1.mostrarVaribles();
    }
}
