
/*
 ArrayList<String> nombreArrayList = new ArrayList<String>();
 nombreArrayList.add("Elemento");   // Añade el elemento al ArrayList
 nombreArrayList.add(n, "Elemento 2");   // Añade el elemento al ArrayList en la posición 'n'
 nombreArrayList.size();   // Devuelve el numero de elementos del ArrayList
 nombreArrayList.get(2);   // Devuelve el elemento que esta en la posición '2' del ArrayList
 nombreArrayList.contains("Elemento");   // Comprueba se existe del elemento ('Elemento') que se le pasa como parametro
 nombreArrayList.indexOf("Elemento");   // Devuelve la posición de la primera ocurrencia ('Elemento') en el ArrayList 
 nombreArrayList.lastIndexOf("Elemento");   // Devuelve la posición de la última ocurrencia ('Elemento') en el ArrayList
 nombreArrayList.remove(5);   // Borra el elemento de la posición '5' del ArrayList
 nombreArrayList.remove("Elemento");   // Borra la primera ocurrencia del 'Elemento' que se le pasa como parametro.
 nombreArrayList.clear();   //Borra todos los elementos de ArrayList
 nombreArrayList.isEmpty();   // Devuelve True si el ArrayList esta vacio. Sino Devuelve False
 ArrayList arrayListCopia = (ArrayList) nombreArrayList.clone();   // Copiar un ArrayList
 Object[] array = nombreArrayList.toArray();   // Pasa el ArrayList a un Array

 */
package Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejemplo9 {

    private static final String fichero = "recursos/partidos.txt";

    public static void main(String[] args) {
        //creamos ArrayList de partidos
        ArrayList<Partidos> partidosFecha = new ArrayList<Partidos>();
        //leemos el File
        File file = new File(fichero);

        //intentamos leer el file
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();//primera linea del partido
                
                //Brazil::Argentina::1::0; formateamos la cadena split con ::Partidos
                String[]cadenitas=line.split("::");
                Partidos partido=new Partidos();
                
                //añadimos datos al Pardito 
                partido.setEquipoLocal(cadenitas[0]);
                partido.setEquipoVisitante(cadenitas[1]);
                partido.setGolesLocal(Integer.parseInt(cadenitas[2]));
                partido.setGolesVisitante(Integer.parseInt(cadenitas[3]));
                
                // finalmente añadimos al primer pardito a partidosFecha
                partidosFecha.add(partido);
            }//end while
        } catch (FileNotFoundException e) {
        } catch (NumberFormatException e) {
        }finally{
            try {
                if (scanner==null) 
                    scanner.close();
            } catch (Exception e2) {
            }
        }
        //mostramos los resultados de la fecha
        System.out.println("Resultados de partidos de la fecha");
        for (Partidos partidos : partidosFecha) {
            System.out.println(partidos.getEquipoLocal()+" : "+partidos.getEquipoVisitante()+" : "+partidos.getGolesLocal()+" : "+partidos.getEquipoVisitante());
        }
    }
}
