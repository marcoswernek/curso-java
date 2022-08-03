
package modificadordeacceso;

public class Usuario {
    public String username;
    private String password;
    
    //Construdor
    public Usuario(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public void saludo(){
        System.out.println("Hola, mi username es"+ this.username);
    }
    //Getter
    public String getPassword() {
        return this.password;
    }
    //Setter
    public void setPassword(String password){
        this.password = password;
    }
}
