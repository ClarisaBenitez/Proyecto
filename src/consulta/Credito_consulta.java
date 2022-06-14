
package consulta;

import Modelo.Credito_modelo;
import bd.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Vista.Prestamos;

public class Credito_consulta extends conexion {
      
    public boolean registrar (Credito_modelo tCredito) {
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        Prestamos prestamos = new Prestamos();
       
        
        String sql = "INSERT INTO credito (cedula, nombre, apellido, monto, cantcuota, cumensual) VALUES (?,?,?,?,?,?)";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,tCredito.getCedula());
            ps.setString(2,tCredito.getNombre());
            ps.setString(3,tCredito.getApellido());
            ps.setString(4,tCredito.getMonto());
            ps.setString(5,tCredito.getCant_cuota());
            ps.setString(6,tCredito.getCuotamensual());
  
           
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
    

    public boolean modificar (Credito_modelo tCredito) {
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "UPDATE credito SET cedula=?, nombre=?, apellido=?, monto=?, cantidad cuota=?, cuota mensual=? WHERE idCredito=?";
        
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,tCredito.getCedula());
            ps.setString(2,tCredito.getNombre());
            ps.setString(3,tCredito.getApellido());
            ps.setString(4,tCredito.getMonto());
            ps.setString(5,tCredito.getCant_cuota());
            ps.setString(6,tCredito.getCuotamensual());         
            ps.setInt(7,tCredito.getIdCredito());
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
    
    public boolean eliminar (Credito_modelo tCredito) {
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "DELETE FROM credito WHERE idCredito=?";
        
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,tCredito.getIdCredito());
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
    
    public boolean buscar (Credito_modelo tCredito) {
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        String sql = "SELECT * FROM credito WHERE cedula=?";
        
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,tCredito.getCedula());
            rs = ps.executeQuery();
            
            if (rs.next()) {
                tCredito.setIdCredito(Integer.parseInt(rs.getString("idCredito")));
                tCredito.setCedula(rs.getString("cedula"));
                tCredito.setNombre(rs.getString("nombre"));
                tCredito.setApellido(rs.getString("apellido"));
                tCredito.setApellido(rs.getString("monto"));
                tCredito.setApellido(rs.getString("cantidad cuota"));
                tCredito.setApellido(rs.getString("cuota mensual"));
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
