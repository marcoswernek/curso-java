package exemplos.aula.java;

public class ciclofor2 {

    public static void main(String[] args) {
        for (int numero = 5, x = 1; x < 11;) {

            int resultado = numero * x;
            String mensage = numero + "*" + x + "=" + resultado;

            System.out.println(mensage);
            x++;
        }
    }
}
