package consulta;

import Modelo.Cliente_modelo;
//import Vista.ListaEmpleadosReg;
//import Vista.RegistroClientes;
import bd.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Cliente_consulta extends conexion {


    public boolean registrar(Cliente_modelo tCliente) {

        PreparedStatement ps = null;
        Connection con = getConexion();
        
        
        //RegistroClientes registroClientes = new RegistroClientes();

        String sql = "INSERT INTO clientes (cedula, nombre, apellido, telefono) VALUES (?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, tCliente.getCedula());
            ps.setString(2, tCliente.getNombre());
            ps.setString(3, tCliente.getApellido());
            ps.setString(4, tCliente.getTelefono());
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

    public boolean modificar(Cliente_modelo tCliente) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE clientes SET cedula=?, nombre=?, apellido=?, telefono=? WHERE idCliente=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, tCliente.getCedula());
            ps.setString(2, tCliente.getNombre());
            ps.setString(3, tCliente.getApellido());
            ps.setString(4, tCliente.getTelefono());
            ps.setInt(5, tCliente.getIdCliente());
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

    public boolean eliminar(Cliente_modelo tCliente) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "DELETE FROM clientes WHERE idCliente=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, tCliente.getIdCliente());
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

    public boolean buscar(Cliente_modelo tCliente) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT * FROM clientes WHERE cedula=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, tCliente.getCedula());
            rs = ps.executeQuery();

            if (rs.next()) {
                tCliente.setIdCliente(Integer.parseInt(rs.getString("idCliente")));
                tCliente.setCedula(rs.getString("cedula"));
                tCliente.setNombre(rs.getString("nombre"));
                tCliente.setApellido(rs.getString("apellido"));
                tCliente.setTelefono(rs.getString("telefono"));
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
