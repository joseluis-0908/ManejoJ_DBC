
package domain;

/**
 *
 * @author SISTEMAS
 */
public class Usuario {
    private int idUsuario;
    private String userName;
    private String password;
    
    public Usuario(){
        
    }
    
    public Usuario(int idUsuario){
        this.idUsuario=idUsuario;
    }

    public Usuario(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Usuario(int idUsuario, String userName, String password) {
        this.idUsuario = idUsuario;
        this.userName = userName;
        this.password = password;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "usuario{" + "idUsuario=" + idUsuario + ", userName=" + userName + ", password=" + password + '}';
    }    
    
}
