
package controlador;

import Modelo.Empleado_modelo;
import Vista.RegistroEmpleados;
import consulta.Empleado_consulta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Empleado_controlador implements ActionListener{
    private Empleado_modelo tEmpleado;
    private Empleado_consulta cEmpleado;
    private RegistroEmpleados rEmpleado;
    
    public Empleado_controlador (Empleado_modelo tEmpleado, Empleado_consulta cEmpleado, RegistroEmpleados rEmpleado) {
        
        this.tEmpleado = tEmpleado;
        this.cEmpleado = cEmpleado;
        this.rEmpleado = rEmpleado;
        this.rEmpleado.btnInsertar.addActionListener(this);
        this.rEmpleado.btnModificar.addActionListener(this);
        this.rEmpleado.btnEliminar.addActionListener(this);
        this.rEmpleado.btnBuscar.addActionListener(this);
    }
    public void iniciar() {
        rEmpleado.setTitle("Formulario de Registro");
        rEmpleado.setLocationRelativeTo(null);
        rEmpleado.txtId.setVisible(false);
        
        
    }
    
    public void limpiar() {
        rEmpleado.txtId.setText(null);
        rEmpleado.txt_CI_empleado.setText(null);
        rEmpleado.txt_Nombre.setText(null);
        rEmpleado.txt_Apellido.setText(null);
        rEmpleado.txt_Telefono_empleado.setText(null);
        

    }

     @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == rEmpleado.btnInsertar) {
           tEmpleado.setCedula(rEmpleado.txt_CI_empleado.getText());
           tEmpleado.setNombre(rEmpleado.txt_Nombre.getText()); 
           tEmpleado.setApellido(rEmpleado.txt_Apellido.getText()); 
           tEmpleado.setTelefono(rEmpleado.txt_Telefono_empleado.getText()); 
           tEmpleado.setSueldo_idSueldo((rEmpleado.txtIdSueldo.getText())); 
           
           
          
                if (cEmpleado.registrar(tEmpleado) ) {
                    JOptionPane.showMessageDialog(null,"Registro Guardado");
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null,"Error al Guardar");
                    limpiar();

            }
        }
     
    
     if (e.getSource() == rEmpleado.btnModificar) {
           tEmpleado.setIdEmpleado(Integer.parseInt(rEmpleado.txtId.getText())); 
           tEmpleado.setCedula(rEmpleado.txt_CI_empleado.getText());
           tEmpleado.setNombre(rEmpleado.txt_Nombre.getText()); 
           tEmpleado.setApellido(rEmpleado.txt_Apellido.getText()); 
           tEmpleado.setTelefono(rEmpleado.txt_Telefono_empleado.getText()); 
           tEmpleado.setSueldo_idSueldo(rEmpleado.txtIdSueldo.getText()); 
           

           if (cEmpleado.modificar(tEmpleado) ) {
               JOptionPane.showMessageDialog(null,"Registro Modificado");
               limpiar();
           } else {
               JOptionPane.showMessageDialog(null,"Error al Modificar");
               limpiar();
           }
        }
     
      if (e.getSource() == rEmpleado.btnEliminar) {
           tEmpleado.setIdEmpleado(Integer.parseInt(rEmpleado.txtId.getText())); 
           
           if (cEmpleado.eliminar(tEmpleado) ) {
               JOptionPane.showMessageDialog(null,"Registro Eliminado");
               limpiar();
           } else {
               JOptionPane.showMessageDialog(null,"Error al Eliminar");
               limpiar();
           }
        }
      
       if (e.getSource() == rEmpleado.btnBuscar) {
           tEmpleado.setCedula(rEmpleado.txt_CI_empleado.getText()); 
           
           if (cEmpleado.buscar(tEmpleado) ) {
                
               rEmpleado.txtId.setText(String.valueOf(tEmpleado.getIdEmpleado()));
               rEmpleado.txt_CI_empleado.setText(tEmpleado.getCedula());
               rEmpleado.txt_Nombre.setText(tEmpleado.getNombre());
               rEmpleado.txt_Apellido.setText(tEmpleado.getApellido());
               rEmpleado.txt_Telefono_empleado.setText(tEmpleado.getTelefono());
               rEmpleado.txtIdSueldo.setText(tEmpleado.getSueldo_idSueldo());
           
           } else {
               JOptionPane.showMessageDialog(null,"No se enccontró resultado");
               limpiar();
           }
        }
        
//         if (e.getSource() == rEmpleado.btnLimpiar) {
//             limpiar();
//             
//         }
         
    }
    
    
    
}




