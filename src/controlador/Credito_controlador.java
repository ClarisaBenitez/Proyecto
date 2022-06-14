
package controlador;

import Modelo.Credito_modelo;
import Vista.Prestamos;
import consulta.Credito_consulta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Credito_controlador implements ActionListener {
    private Credito_modelo tCredito;
    private Credito_consulta cCredito;
    private Prestamos rPrestamo;
    
    public Credito_controlador (Credito_modelo tCredito, Credito_consulta cCredito, Prestamos rPrestamo) {
        
        this.tCredito = tCredito;
        this.cCredito = cCredito;
        this.rPrestamo = rPrestamo;
        this.rPrestamo.btnInsertar.addActionListener(this);
        this.rPrestamo.btnModificar.addActionListener(this);
        this.rPrestamo.btnEliminar.addActionListener(this);
        this.rPrestamo.btnBuscar.addActionListener(this);
    }
    
    public void iniciar() {
        rPrestamo.setTitle("Formulario de Registro de Creditos");
        rPrestamo.setLocationRelativeTo(null);
        rPrestamo.txtId.setVisible(false);
    }
    
    public void limpiar() {
        rPrestamo.txtId.setText(null);
        rPrestamo.txtCedula.setText(null);
        rPrestamo.txt_Nombre.setText(null);
        rPrestamo.txt_Apellido.setText(null);
        rPrestamo.txt_Monto.setText(null);
        rPrestamo.txtCant.setText(null);
        rPrestamo.txtMensual.setText(null);

    }
    
      @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == rPrestamo.btnInsertar) {
           tCredito.setCedula(rPrestamo.txtCedula.getText());
           tCredito.setNombre(rPrestamo.txt_Nombre.getText()); 
           tCredito.setApellido(rPrestamo.txt_Apellido.getText()); 
           tCredito.setMonto(rPrestamo.txt_Monto.getText());
           tCredito.setCant_cuota(rPrestamo.txtCant.getText());
           tCredito.setCuotamensual(rPrestamo.txtMensual.getText());
           
           if (cCredito.registrar(tCredito) ) {
               JOptionPane.showMessageDialog(null," Credito Registrado");
               limpiar();
           } else {
               JOptionPane.showMessageDialog(null,"Error al Guardar");
               limpiar();
           }
        }

        
        if (e.getSource() == rPrestamo.btnModificar) {
            
           tCredito.setIdCredito(Integer.parseInt(rPrestamo.txtId.getText())); 
           tCredito.setCedula(rPrestamo.txtCedula.getText());
           tCredito.setNombre(rPrestamo.txt_Nombre.getText()); 
           tCredito.setApellido(rPrestamo.txt_Apellido.getText()); 
           tCredito.setMonto(rPrestamo.txt_Apellido.getText());
           tCredito.setCant_cuota(rPrestamo.txt_Apellido.getText());
           tCredito.setCuotamensual(rPrestamo.txt_Apellido.getText());
           
           
           if (cCredito.modificar(tCredito) ) {
               JOptionPane.showMessageDialog(null,"Credito Modificado");
               limpiar();
           } else {
               JOptionPane.showMessageDialog(null,"Error al Modificar");
               limpiar();
           }
        }
        
         if (e.getSource() == rPrestamo.btnEliminar) {
           tCredito.setIdCredito(Integer.parseInt(rPrestamo.txtId.getText())); 
           
           if (cCredito.eliminar(tCredito) ) {
               JOptionPane.showMessageDialog(null,"Credito Eliminado");
               limpiar();
           } else {
               JOptionPane.showMessageDialog(null,"Error al Eliminar");
               limpiar();
           }
        }
         
         if (e.getSource() == rPrestamo.btnBuscar) {
           tCredito.setCedula(rPrestamo.txtCedula.getText()); 
           
           if (cCredito.buscar(tCredito) ) {
                
               rPrestamo.txtId.setText(String.valueOf(tCredito.getIdCredito()));
               rPrestamo.txtCedula.setText(tCredito.getCedula());
               rPrestamo.txt_Nombre.setText(tCredito.getNombre());
               rPrestamo.txt_Apellido.setText(tCredito.getApellido());
               rPrestamo.txt_Monto.setText(tCredito.getMonto());
               rPrestamo.txtCant.setText(tCredito.getCant_cuota());
               rPrestamo.txt_Apellido.setText(tCredito.getCuotamensual());
           
           } else {
               JOptionPane.showMessageDialog(null,"No se enccontró resultado");
               limpiar();
           }
        }
        
//         if (e.getSource() == rPrestamo.btnLimpiar) {
//             limpiar();
//         }
         
    }
    
   

}
