
package modificadordeacceso;

public class ModificadordeAcceso {

   
    public static void main(String[] args) {
        Usuario codi = new Usuario("Codi", "Pass");
        
        
        System.out.println(codi.username);
        System.out.println(codi.getPassword());
        
       
        
    }
    
}
