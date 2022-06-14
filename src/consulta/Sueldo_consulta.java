
package consulta;


import Modelo.Sueldo_modelo;
import bd.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Sueldo_consulta extends conexion {
      public boolean registrar (Sueldo_modelo tSueldo) {
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "INSERT INTO sueldo (cedula, nombre, apellido, sueldo) VALUES (?,?,?,?)";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,tSueldo.getCedula());
            ps.setString(2,tSueldo.getNombre());
            ps.setString(3,tSueldo.getApellido());
            ps.setString(4,tSueldo.getSueldo());
            

            ps.execute();
            return true;
            
        } catch (SQLException e) {
            
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);            }
        }
        
    }
    

    
    public boolean modificar (Sueldo_modelo tSueldo) {
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "UPDATE sueldo SET cedula=?, nombre=?, apellido=?, sueldo=? WHERE idSueldo=?";
        
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,tSueldo.getCedula());
            ps.setString(2,tSueldo.getNombre());
            ps.setString(3,tSueldo.getApellido());
            ps.setString(4,tSueldo.getSueldo());
            ps.setInt(5,tSueldo.getIdSueldo());
            ps.execute();
            return true;
            
        } catch (SQLException e) {
            
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);            }
        }
        
    }
    
    public boolean eliminar (Sueldo_modelo tSueldo) {
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "DELETE FROM sueldo WHERE idSueldo=?";
        
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,tSueldo.getIdSueldo());
            ps.execute();
            return true;
            
        } catch (SQLException e) {
            
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
        
    }
    
    public boolean buscar (Sueldo_modelo tSueldo) {
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        String sql = "SELECT * FROM sueldo WHERE cedula=?";
        
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,tSueldo.getCedula());
            rs = ps.executeQuery();
            
            if (rs.next()) {
                tSueldo.setIdSueldo(Integer.parseInt(rs.getString("idSueldo")));
                tSueldo.setCedula(rs.getString("cedula"));
                tSueldo.setNombre(rs.getString("nombre"));
                tSueldo.setApellido(rs.getString("apellido"));
                tSueldo.setSueldo(rs.getString("sueldo"));

                return true;
            }      
            return false;  
        } catch (SQLException e) {
            
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
        
    }

    
}
    

