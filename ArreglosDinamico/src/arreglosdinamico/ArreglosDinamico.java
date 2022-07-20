
package arreglosdinamico;

import java.util.ArrayList;
import java.util.List;


public class ArreglosDinamico {

    
    public static void main(String[] args) {
       List<String> animales = new ArrayList<>();
       
       
       animales.add("leon");
       animales.add("tigre");
       animales.add("gato");
       animales.add("perro");
      
        System.out.println("Primer array"+ animales);
       
        animales.add(2,"elefante");
        
        System.out.println("segundo array"+animales);
    }
    
}
