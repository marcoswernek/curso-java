
package exerc.java;

public class cicloswicht2 {
    public static void main(String[] args) {
        String corluz = "verde";
        
        switch(corluz){
            case "verde" -> System.out.println("prossiga");
            case "amarelo" -> System.out.println("atençao");
            case "vermelho" -> System.out.println("pare");
            default -> System.out.println("cor invalido");
        }
    }
}
