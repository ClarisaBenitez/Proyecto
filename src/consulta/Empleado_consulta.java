package consulta;

import Modelo.Empleado_modelo;
import Vista.ListaEmpleadosReg;
import Vista.RegistroEmpleados;
import bd.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.scene.Cursor.cursor;

public class Empleado_consulta extends conexion {

      javax.swing.table.DefaultTableModel cursor;
      
    public boolean registrar(Empleado_modelo tEmpleado) throws SQLException {

        PreparedStatement ps = null;
        Connection con = getConexion();
         
           ListaEmpleadosReg  ListaEmpleados = new ListaEmpleadosReg();
        cursor = (javax.swing.table.DefaultTableModel) ListaEmpleados.grilla.getModel();

        String sql = "INSERT INTO empleados (cedula, nombre, apellido, telefono) VALUES (?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, tEmpleado.getCedula());
            ps.setString(2, tEmpleado.getNombre());
            ps.setString(3, tEmpleado.getApellido());
            ps.setString(4, tEmpleado.getTelefono());
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

    public boolean modificar(Empleado_modelo tEmpleado) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE empleados SET cedula=?, nombre=?, apellido=?, telefono=? WHERE idEmpleado=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, tEmpleado.getCedula());
            ps.setString(2, tEmpleado.getNombre());
            ps.setString(3, tEmpleado.getApellido());
            ps.setString(4, tEmpleado.getTelefono());
            ps.setInt(5, tEmpleado.getIdEmpleado());

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

    public boolean eliminar(Empleado_modelo tEmpleado) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "DELETE FROM empleados WHERE idEmpleado=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, tEmpleado.getIdEmpleado());
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

    public boolean buscar(Empleado_modelo tEmpleado) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM empleados WHERE cedula=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, tEmpleado.getCedula());
            rs = ps.executeQuery();

            if (rs.next()) {
                tEmpleado.setIdEmpleado(Integer.parseInt(rs.getString("idEmpleado")));
                tEmpleado.setCedula(rs.getString("cedula"));
                tEmpleado.setNombre(rs.getString("nombre"));
                tEmpleado.setApellido(rs.getString("apellido"));
                tEmpleado.setTelefono(rs.getString("telefono"));
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

    public void grilla() throws SQLException {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        String sql = "SELECT * FROM empleados";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
             while (rs.next()) {
                Object[] datos = {
                    rs.getString("cedula"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getString("cedula")};

                cursor.addRow(datos);
            }

        } 
        
        
        catch (SQLException ex) {
            Logger.getLogger(Cliente_consulta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
