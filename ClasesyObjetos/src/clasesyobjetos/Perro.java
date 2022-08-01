
package classesyobjetos;

public class Perro {
    String nombre;
    String raza;
    int edad;
    
    //Parametros
    void estabelecerAtributos(String nombrePerro, String razaPerro, int edadPerro){
        nombre = nombrePerro;
        raza = razaPerro;
        edad = edadPerro;
    }
    
    //Metodos
    void comer(){
        System.out.println("El perro se encuentra comiendo!");
    }
    
    void dormi(){
        System.out.println("El perro se encuentra dormido!");
    }
    
    void ladrar(){
        System.out.println("El perro se encuentra ladrando!");
    }
}
