
package controlador;




import Modelo.Sueldo_modelo;
import Vista.Sueldo_empleado;
import consulta.Sueldo_consulta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Sueldo_controlador implements ActionListener {
    private Sueldo_modelo tSueldo;
    private Sueldo_consulta cSueldo;
    private  Sueldo_empleado rSueldo;
    
    public Sueldo_controlador (Sueldo_modelo tSueldo, Sueldo_consulta cSueldo, Sueldo_empleado rSueldo) {
        
        this.tSueldo = tSueldo;
        this.cSueldo = cSueldo;
        this.rSueldo = rSueldo;
        this.rSueldo.btnRegistrar.addActionListener(this);
        this.rSueldo.btnModificar.addActionListener(this);
        this.rSueldo.btnEliminar.addActionListener(this);
        this.rSueldo.btnBuscar.addActionListener(this);
    }
    
    public void iniciar() {
        rSueldo.setTitle("Formulario de Registro Salario");
        rSueldo.setLocationRelativeTo(null);
        rSueldo.txtId.setVisible(false);
        
    }
        public void limpiar() {
        rSueldo.txtId.setText(null);
        rSueldo.txtCedula.setText(null);
        rSueldo.txtNombre.setText(null);
        rSueldo.txtApellido.setText(null);
        rSueldo.txtSueldo.setText(null);

    } 
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == rSueldo.btnRegistrar) {
           tSueldo.setCedula(rSueldo.txtCedula.getText());
           tSueldo.setNombre(rSueldo.txtNombre.getText()); 
           tSueldo.setApellido(rSueldo.txtApellido.getText()); 
           tSueldo.setSueldo(rSueldo.txtSueldo.getText());
 

           
           if (cSueldo.registrar(tSueldo) ) {
               JOptionPane.showMessageDialog(null,"Registro Guardado");
               limpiar();
           } else {
               JOptionPane.showMessageDialog(null,"Error al Guardar");
               limpiar();
           }
        }
        

        
        if (e.getSource() == rSueldo.btnModificar) {
           tSueldo.setIdSueldo(Integer.parseInt(rSueldo.txtId.getText())); 
           tSueldo.setCedula(rSueldo.txtCedula.getText());
           tSueldo.setNombre(rSueldo.txtNombre.getText()); 
           tSueldo.setApellido(rSueldo.txtApellido.getText()); 
           tSueldo.setSueldo(rSueldo.txtSueldo.getText()); 

           
           if (cSueldo.modificar(tSueldo) ) {
               JOptionPane.showMessageDialog(null,"Registro Modificado");
               limpiar();
           } else {
               JOptionPane.showMessageDialog(null,"Error al Modificar");
               limpiar();
           }
        }
        
         if (e.getSource() == rSueldo.btnEliminar) {
           tSueldo.setIdSueldo(Integer.parseInt(rSueldo.txtId.getText())); 
           
           if (cSueldo.eliminar(tSueldo) ) {
               JOptionPane.showMessageDialog(null,"Registro Eliminado");
               limpiar();
           } else {
               JOptionPane.showMessageDialog(null,"Error al Eliminar");
               limpiar();
           }
        }
         
         if (e.getSource() == rSueldo.btnBuscar) {
           tSueldo.setCedula(rSueldo.txtCedula.getText()); 
           
           if (cSueldo.buscar(tSueldo) ) {
                
               rSueldo.txtId.setText(String.valueOf(tSueldo.getIdSueldo()));
               rSueldo.txtCedula.setText(tSueldo.getCedula());
               rSueldo.txtNombre.setText(tSueldo.getNombre());
               rSueldo.txtApellido.setText(tSueldo.getApellido());
               rSueldo.txtSueldo.setText(tSueldo.getSueldo());

           } else {
               JOptionPane.showMessageDialog(null,"No se enccontró resultado");
               limpiar();
           }
        }
        
//         if (e.getSource() == rSueldo.btnLimpiar) {
//             limpiar();
//         }
       }
     
    
    
}
