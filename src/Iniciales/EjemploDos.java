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
public class EjemploDos {
   private final int x=200;
   private final int y=100;
   private final double n=10.2;
   private final double m=10.5;
   public EjemploDos(){
       int sum=sumar(x,y);
       double rest=restar(n,m);
       double mult=multiplicar(x,n);
       double div=dividir(x,m);
       int mod=modulo(x,y);
       
       System.out.println("Suma:"+sum);
       System.out.println("Resta:"+rest);
       System.out.println("Multiplicar:"+mult);
       System.out.println("Dividir:"+div);
       System.out.println("Modulo:"+mod);
   }

    private int sumar(int x, int y) {
        return (x+y);
    }
    private double restar(double n, double m) {
        return (m-n);
    }
    private double multiplicar(int x, double n) {
        return (x*n);
    }
    private double dividir(int x, double m) {
        return (x/m);
    }
    private int modulo(int x, int y) {
        return (x%y);
    }
    public static void main(String []args){
        EjemploDos e2 =new EjemploDos();
    }
}
