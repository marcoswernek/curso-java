
package condicionalessimples;


public class CondicionalesSimples {

    
    public static void main(String[] args) {
        int edad = 20;
        
        System.out.println("condicion 1");
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }else {
            System.out.println("Eres menor de edad");
        }
        
        System.out.println("condicion 2");
        
        if (edad >= 5 && edad <= 10) {
            System.out.println("Tu salon es el 1A");
        } else {
            System.out.println("Tu salon es el 1B");
        }
    }
    
}
