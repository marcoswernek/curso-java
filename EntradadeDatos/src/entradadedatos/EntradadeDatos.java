package entradadedatos;

import java.util.Scanner;

public class EntradadeDatos {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Cual es tu nombre?");
            String nombre = sc.nextLine();

            System.out.println("Cual es tu edad?");
            int edad = sc.nextInt();//Interger.parseInt(sc.nextline());

            System.out.println("Cual es tu altura?");
            float altura = sc.nextFloat();

            sc.nextLine();//captura el salto de nextfloat

            System.out.println("El curso es de tu agrado? (si/no)");
            boolean valor = sc.nextLine().equals("si");

            System.out.println(" Hola " + nombre + "" + edad + " " + altura + " " + valor);
        }
    }

}
