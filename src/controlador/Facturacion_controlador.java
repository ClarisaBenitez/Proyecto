
package controlador;

import Modelo.Facturacion_modelo;
import Vista.FACTURACION;
import consulta.Facturacion_consulta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Facturacion_controlador  implements ActionListener {
    private Facturacion_modelo tFac;
    private Facturacion_consulta cFac;
    private FACTURACION rFac;
    
    public Facturacion_controlador (Facturacion_modelo tFac, Facturacion_consulta cFac, FACTURACION rFac) {
        
        this.tFac = tFac;
        this.cFac = cFac;
        this.rFac = rFac;
        this.rFac.btnRegistrar.addActionListener(this);
        this.rFac.btnModificar.addActionListener(this);
        this.rFac.btnEliminar.addActionListener(this);
        this.rFac.btnBuscar.addActionListener(this);
    }
    
    public void iniciar() {
        rFac.setTitle("Facturacion");
        rFac.setLocationRelativeTo(null);
        rFac.txtId.setVisible(false);
    }
        public void limpiar() {
        rFac.txtId.setText(null);
        rFac.txtCedula.setText(null);
        rFac.txtNombre.setText(null);
        rFac.txtApellido.setText(null);
        rFac.txtCobrar.setText(null);

    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == rFac.btnRegistrar) {
           tFac.setCedula(rFac.txtCedula.getText());
           tFac.setNombre(rFac.txtNombre.getText()); 
           tFac.setApellido(rFac.txtApellido.getText()); 
           tFac.setCobrar(rFac.txtCobrar.getText()); 
         

           
           if (cFac.registrar(tFac) ) {
               JOptionPane.showMessageDialog(null,"Registro Guardado");
               limpiar();
           } else {
               JOptionPane.showMessageDialog(null,"Error al Guardar");
               limpiar();
           }
        }
        

        
        if (e.getSource() == rFac.btnModificar) {
           tFac.setIdCobro(Integer.parseInt(rFac.txtId.getText())); 
           tFac.setCedula(rFac.txtCedula.getText());
           tFac.setNombre(rFac.txtNombre.getText()); 
           tFac.setApellido(rFac.txtApellido.getText()); 
           tFac.setCobrar(rFac.txtCobrar.getText());


           
           if (cFac.modificar(tFac) ) {
               JOptionPane.showMessageDialog(null,"Registro Modificado");
               limpiar();
           } else {
               JOptionPane.showMessageDialog(null,"Error al Modificar");
               limpiar();
           }
        }
        
         if (e.getSource() == rFac.btnEliminar) {
           tFac.setIdCobro(Integer.parseInt(rFac.txtId.getText())); 
           
           if (cFac.eliminar(tFac) ) {
               JOptionPane.showMessageDialog(null,"Registro Eliminado");
               limpiar();
           } else {
               JOptionPane.showMessageDialog(null,"Error al Eliminar");
               limpiar();
           }
        }
         
         if (e.getSource() == rFac.btnBuscar) {
           tFac.setCedula(rFac.txtCedula.getText()); 
           
           if (cFac.buscar(tFac) ) {
                
               rFac.txtId.setText(String.valueOf(tFac.getIdCobro()));
               rFac.txtCedula.setText(tFac.getCedula());
               rFac.txtNombre.setText(tFac.getNombre());
               rFac.txtApellido.setText(tFac.getApellido());
               rFac.txtCobrar.setText(tFac.getCobrar());
              

           } else {
               JOptionPane.showMessageDialog(null,"No se enccontró resultado");
               limpiar();
           }
        }
        
//         if (e.getSource() == rFac.btnLimpiar) {
//             limpiar();
//         }
       }
     
    
    
}

