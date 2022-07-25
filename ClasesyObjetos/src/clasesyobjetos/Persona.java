
package clasesyobjetos;

public class Persona {
    //Atributos
    String nombre;
    double estatura;
    int edad;
    
    //Metodo constructor
    public Persona(String _nombre, double _estatura,int _edad) {
        this.nombre = _nombre;
        this.estatura = _estatura;
        this.edad = _edad;
    }
    
    public void imprimirDatos(){
            System.out.println("El nombre es" + nombre);
            System.out.println("La estatura es" + estatura);
            System.out.println("La edad es" + edad);
    }
}
