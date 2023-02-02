package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexionSQL {

    Connection conectar = null;
    String usuario = "root";
    String contrasena = ""; // contraseña de MySQL  
    String bd = "modalibre";
    String ip = "localhost";
    String puerto = "3306";

    String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;

    public Connection conectarSQL() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            conectar = DriverManager.getConnection(cadena, usuario, contrasena);
            // JOptionPane.showMessageDialog(null, "Se conecto correctamente a la base de datos");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos: " + e.toString());
        }
        return conectar;
    }
    
    // prueba conexión --> JOPTION HABILITADO:
    
    public static void main(String[] args) {
        ConexionSQL ob = new ConexionSQL();
        ob.conectarSQL();
    }
}
