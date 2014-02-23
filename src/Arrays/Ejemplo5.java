/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Arrays;

/**
 * Contar el número de elementos positivos, 
 * negativos y ceros en un array de 10 enteros.
 * {3,8,6,-2,5-2,-1,5,1,0,0}
 * positivos=6
 * negativos=3
 * ceros=2
 * 
 */
public class Ejemplo5 {
    public static void main(String[]args){
        int positivos=0;
        int negativos=0;
        int ceros=0;
        int []array={3,0,6,-2,5,-9,-1,5,0,-8};
        for (int i = 0; i <array.length; i++) {
            if (array[i]>0) {
                positivos++;
            }
            else if(array[i]<0){
                negativos++;
            }
            else if(array[i]==0){
                ceros++;
            }
        }
        System.out.println("Positivos="+positivos);
        System.out.println("Negativos="+negativos);
        System.out.println("Ceros="+ceros);
    }
}
