
package exerc.java;

public class condicoesif {
    public static void main(String[] args) {
        String corluz = "amarelo";
        
        if(corluz.equals("verde")){
            System.out.println("prosiga");
            
        }else if(corluz.equals("amarelo")){
            
             System.out.println("atencao");
             
        }else if(corluz.equals("vermelho")){
            
            System.out.println("paree");
        }else{
            System.out.println("cor invalida *tente de novo*");
        }
    }
}
