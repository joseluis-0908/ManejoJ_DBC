package test;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SISTEMAS
 */
public class testMysqlJDBC {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test?useSSL = false&useTimezone = true&serverTimezone = UTC&allowPublicKeyRetrieval=true";
        try {
            // Class.forName("com.mysql.cj.jdbc.Driver");se puede utilizar para aplicaciones web
            Connection conexion = DriverManager.getConnection(url, "root", "admin");
            Statement instruccion = conexion.createStatement();
            String sql = "SELECT id_persona,nombre,apelllido,email,telefono from persona";
            ResultSet resultado = instruccion.executeQuery(sql);
            while (resultado.next()) {
                System.out.print(" Id persona: " + resultado.getInt("id_persona"));
                System.out.print(" nombre: " + resultado.getString("nombre"));
                System.out.print(" apelllido: " + resultado.getString("apelllido"));
                System.out.print(" email: " + resultado.getString("email"));
                System.out.println(" telefono: " + resultado.getString("telefono"));
                System.out.println();
            }
            resultado.close();
            instruccion.close();
            conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

}
