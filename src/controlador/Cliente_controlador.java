
package controlador;

import Modelo.Cliente_modelo;
import Vista.RegistroClientes;
import consulta.Cliente_consulta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class Cliente_controlador implements ActionListener {
    
    private Cliente_modelo tCliente;
    private Cliente_consulta cCliente;
    private RegistroClientes rCliente;
    
    public Cliente_controlador (Cliente_modelo tCliente, Cliente_consulta cCliente, RegistroClientes rCliente) {
        
        this.tCliente = tCliente;
        this.cCliente = cCliente;
        this.rCliente = rCliente;
        this.rCliente.btnInsertar.addActionListener(this);
        this.rCliente.btnModificar.addActionListener(this);
        this.rCliente.btnEliminar.addActionListener(this);
        this.rCliente.btnBuscar.addActionListener(this);
    }
    
    public void iniciar() {
        rCliente.setTitle("Formulario de Registro Clientes");
        rCliente.setLocationRelativeTo(null);
        rCliente.txtId.setVisible(false);
        
    }
    
    
    public void limpiar() {
        rCliente.txtId.setText("");
        rCliente.txt_CI_cliente.setText("");
        rCliente.txt_Nombre.setText("");
        rCliente.txt_Apellido.setText("");
        rCliente.txt_telefonoCliente.setText("");
     
    }
    
    
     @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == rCliente.btnInsertar) {
           tCliente.setCedula(rCliente.txt_CI_cliente.getText());
           tCliente.setNombre(rCliente.txt_Nombre.getText()); 
           tCliente.setApellido(rCliente.txt_Apellido.getText()); 
           tCliente.setTelefono(rCliente.txt_telefonoCliente.getText()); 

           if (cCliente.registrar(tCliente) ) {
               JOptionPane.showMessageDialog(null,"Registro Guardado");
               limpiar();
           } else {
               JOptionPane.showMessageDialog(null,"Error al Guardar");
               limpiar();
           }
        }
         if (e.getSource() == rCliente.btnModificar) {
             
           tCliente.setIdCliente(Integer.parseInt(rCliente.txtId.getText())); 
           tCliente.setCedula(rCliente.txt_CI_cliente.getText());
           tCliente.setNombre(rCliente.txt_Nombre.getText()); 
           tCliente.setApellido(rCliente.txt_Apellido.getText());  
           tCliente.setTelefono(rCliente.txt_telefonoCliente.getText()); 

           
           if (cCliente.modificar(tCliente) ) {
               JOptionPane.showMessageDialog(null,"Registro Modificado");
               limpiar();
           } else {
               JOptionPane.showMessageDialog(null,"Error al Modificar");
               limpiar();
           }
        }
         if (e.getSource() == rCliente.btnEliminar) {
           tCliente.setIdCliente(Integer.parseInt(rCliente.txtId.getText())); 
           
           if (cCliente.eliminar(tCliente) ) {
               JOptionPane.showMessageDialog(null,"Registro Eliminado");
               limpiar();
           } else {
               JOptionPane.showMessageDialog(null,"Error al Eliminar");
               limpiar();
           }
        }
         
         if (e.getSource() == rCliente.btnBuscar) {
           tCliente.setCedula(rCliente.txt_CI_cliente.getText()); 
           
           if (cCliente.buscar(tCliente) ) {
                
               rCliente.txtId.setText(String.valueOf(tCliente.getIdCliente()));
               rCliente.txt_CI_cliente.setText(tCliente.getCedula());
               rCliente.txt_Nombre.setText(tCliente.getNombre());
               rCliente.txt_Apellido.setText(tCliente.getApellido());
               rCliente.txt_telefonoCliente.setText(tCliente.getTelefono());
           
           } else {
               JOptionPane.showMessageDialog(null,"No se enccontró resultado");
               limpiar();
           }
        }
        
//         if (e.getSource() == rCliente.btnLimpiar) {
//             limpiar();
//         }
         
    }
    
    
}
