/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * Guardar en un array los 20 primeros números pares cantidad=20 condicion=pares
 */
public class Ejemplo4 {

    public static void main(String[] args) {
        int[] arrayPares = new int[20];
        int index = 0;
        int i = 1;
        do {
            if (i % 2 == 0) {
                arrayPares[index] = i;
                index++;
                i++;
            }else{
                i++;
            }
        } while (index<20);
        for (int j = 0; j < arrayPares.length; j++) {
            System.out.print(arrayPares[j]+",");
        }
    }
}
