
package Modelo;

public class Empleado_modelo {
    private int idEmpleado;
    private String nombre;
    private String apellido;
    private String cedula;
    private String telefono; 
    private String sueldo_idSueldo;

    public String getSueldo_idSueldo() {
        return sueldo_idSueldo;
    }

    public void setSueldo_idSueldo(String sueldo_idSueldo) {
        this.sueldo_idSueldo = sueldo_idSueldo;
    }

    
    

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }


    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

   
}
