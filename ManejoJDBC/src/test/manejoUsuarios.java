
package test;

import datos.usuarioJDBC;
import domain.Usuario;
import java.util.List;

/**
 *
 * @author SISTEMAS
 */
public class manejoUsuarios {
    public static void main(String[] args) {
        usuarioJDBC usuarioJdbc = new usuarioJDBC();
        
        // ejecutamos estado de usuarios
        
        List<Usuario>usuarios = usuarioJdbc.seleccionar();
        for (Usuario usuario:usuarios) {
            System.out.println("Usuario " + usuario);
        }
        //para insertar un nuevo usuario
//        Usuario usuario = new Usuario("Carlos.Juarez","123");
//        usuarioJdbc.insertar(usuario);
         
            //modificar un id de usuario
            
//            Usuario usuario = new Usuario(3,"Carlos.Juarez","456");
//            usuarioJdbc.actualizar(usuario);

        //Elimnar un usuario
        usuarioJdbc.eliminar(new Usuario(3));


    }
    
}
