/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Arrays;

import java.util.Scanner;
public class Ejemplo8 {
    public static void main(String[]args){
        System.out.println("Introduce nombre y sueldo del empleado");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Numero de employees");
        int n=scanner.nextInt();
        
        String []arrayNombres=new String[n];
        double []arraySalarios=new double[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("arrayNombres["+i+"]=");
            arrayNombres[i]=scanner.next();
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.print("arraySalarios["+i+"]=");
            arraySalarios[i]=scanner.nextInt();
        }
        System.out.println("**************************************");
        for (int i = 0; i < n; i++) {
            System.out.println("Nombre:"+arrayNombres[i]+" salario="+arraySalarios[i]);
        }
        //ordemanos menor a mayor
        for (int i = 0; i < n-1; i++) {
            double aux;
            String aux2;
            for (int j = i+1; j <n; j++) {
                 if (arraySalarios[i]>arraySalarios[j]) {
                    aux=arraySalarios[i];
                    arraySalarios[i]=arraySalarios[j];
                    arraySalarios[j]=aux;
                    
                    aux2=arrayNombres[i];
                    arrayNombres[i]=arrayNombres[j];
                    arrayNombres[j]=aux2;
                }
            }
        }
        System.out.println("**************************************");
        System.out.println("Mayor salrio: Nombre "+arrayNombres[n-1]+" Salario="+arraySalarios[n-1]);
    }
}
