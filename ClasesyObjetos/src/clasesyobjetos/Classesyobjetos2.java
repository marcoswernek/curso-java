package classesyobjetos;

public class Classesyobjetos {

    public static void main(String[] args) {
        Perro lassie = new Perro(); //Instancia
        
        lassie.estabelecerAtributos("Lassie", "Collie", 4); //Argumentos

        /*lassie.nombre = "Lassie";
        lassie.raza = "Collie";
        lassie.edad = 4;*/

        System.out.println("El nombre es: " + lassie.nombre);
        System.out.println("El nombre es: " + lassie.raza);
        System.out.println("El nombre es: " + lassie.edad);

        lassie.comer();
        
    }

}
