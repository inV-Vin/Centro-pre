package bdConexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
     public static Connection GetConexion() throws ClassNotFoundException, SQLException{
    Connection conex=null;
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost/Centro-pre3;
        String usuario="root";
        String pass ="root";
        conex =(Connection) DriverManager.getConnection(url,usuario,pass);
    
    return conex;
    }
}
