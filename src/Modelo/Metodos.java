package Modelo;

import Controlador.ConexionSQL;
import java.awt.Color;
import javax.swing.JPasswordField;

public class Metodos {
    
    public static void main(String[] args) {
        ConexionSQL ob = new ConexionSQL();
        ob.conectarSQL();
    }
    
    public static void relleno(JPasswordField variableNombre, String obtencionTxt){
        String inicial = obtencionTxt;
        if (obtencionTxt.equals(inicial)) {
            variableNombre.setText("");
            variableNombre.setForeground(Color.black);
        }
    }
    
}
