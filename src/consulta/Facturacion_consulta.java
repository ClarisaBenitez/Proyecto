
package consulta;

import Modelo.Facturacion_modelo;
import bd.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Facturacion_consulta extends conexion {
    
    public boolean registrar (Facturacion_modelo tFac) {
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "INSERT INTO facturacion (cedula, nombre, apellido, cobrar) VALUES (?,?,?,?)";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,tFac.getCedula());
            ps.setString(2,tFac.getNombre());
            ps.setString(3,tFac.getApellido());
            ps.setString(4,tFac.getCobrar());
          

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

    public boolean modificar (Facturacion_modelo tFac) {
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "UPDATE facturacion SET cedula=?, nombre=?, apellido=?, cobrar=? WHERE idCobro=?";
        
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,tFac.getCedula());
            ps.setString(2,tFac.getNombre());
            ps.setString(3,tFac.getApellido());
            ps.setString(4,tFac.getCobrar());
            ps.setInt(5,tFac.getIdCobro());
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
    
    public boolean eliminar (Facturacion_modelo tFac) {
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "DELETE FROM facturacion WHERE idCobro=?";
        
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,tFac.getIdCobro());
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
    
    public boolean buscar (Facturacion_modelo tFac) {
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        String sql = "SELECT * FROM facturacion WHERE cedula=?";
        
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,tFac.getCedula());
            rs = ps.executeQuery();
            
            if (rs.next()) {
                tFac.setIdCobro(Integer.parseInt(rs.getString("idCobro")));
                tFac.setCedula(rs.getString("cedula"));
                tFac.setNombre(rs.getString("nombre"));
                tFac.setApellido(rs.getString("apellido"));
                tFac.setCobrar(rs.getString("cobrar"));


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
