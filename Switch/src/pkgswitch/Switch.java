
package pkgswitch;


public class Switch {

    
    public static void main(String[] args) {
       char vocal = 'U';
       
       switch (vocal){
           case 'A':
               System.out.println("Vocal A");
               break;
           case 'E':
               System.out.println("Vocal E");
               break;
            case 'I':
               System.out.println("Vocal I");
               break;
            case 'O':
               System.out.println("Vocal o");
               break;
            case 'U':
               System.out.println("Vocal U");
               break;
            default :
                System.out.println("No se reconoce la Vocal");
                break;
       }
    }
    
}
