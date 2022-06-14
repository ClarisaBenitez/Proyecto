
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class conexion {
    
    String base = "bd_clari2";
    private final String user = "root"; //root???
    private final String password = "ua2022.py";
    private final String url = "jdbc:mysql://127.0.0.1:3306/" + base;
    private Connection con = null;
   
    public Connection getConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.url, this.user, this.password );
         // JOptionPane.showMessageDialog(null, "Hola");

        } catch (SQLException e) {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
