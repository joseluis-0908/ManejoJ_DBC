package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.*;

/**
 *
 * @author SISTEMAS
 */
public class TestManejoPersonas {

    public static void main(String[] args) {
        PersonaDAO personaDAO = new PersonaDAO();
        //Hago la prueba de cada uno de los metodos construidos.
        
        //-------insertamos un objeto tipo persona--------
       // Persona persona1 = new Persona("Carlos", "Esparza", "esparza@gmail.com", "5683456");// con ello lleno el objeto de tipo persona
        //personaDAO.insertartar(persona1);
        
        //-----Actualizamos un registro con el metodo de modificar uno objeto de persona existente-------
        //Persona personaModificaficar = new Persona(13, "Juan Carlos", "Esparza","jcesparza@gmail.com","5683456");
       // personaDAO.actualizar(personaModificaficar);
       
       // ------Eliminamos un registro con el metodo de eliminar objeto persona existente --------
       Persona personaeliminar = new Persona(11);
       personaDAO.eliminar(personaeliminar);
       
       
        
        //Listado de Personas         
        List<Persona> personas = personaDAO.seleccionar();

        /* for (Persona persona : personas) {
            System.out.println(" Persona: " + persona);*/ /* for (Persona persona : personas) {
        System.out.println(" Persona: " + persona);*/ //podemos utilizar esta sintaxis de for o forEeach

        //Estas es la funcion landa
        personas.forEach((persona) -> {
            System.out.println(" Persona: " + persona);
        });
        
    }

}
