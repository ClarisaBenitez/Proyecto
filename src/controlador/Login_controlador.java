
package controlador;

import Modelo.Login_modelo;
import Vista.Login;
import consulta.Login_consulta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Login_controlador implements ActionListener{
    private Login_modelo tLogin;
    private Login_consulta cLogin;
    private Login rLogin; 
    
     public Login_controlador(Login_modelo tLogin, Login_consulta cLogin, Login rLogin){
        this.tLogin = tLogin;
        this.cLogin = cLogin;
        this.rLogin = rLogin;
        this.rLogin.btnAceptar.addActionListener(this);
    }
    
   public void validarcampoUsuario() {
        if ("".equals(rLogin.txtuser.getText())) {

            JOptionPane.showMessageDialog(null, "El campo no puede estar vacio");
            rLogin.txtuser.requestFocus();
        } else {
            rLogin.txtpasword.requestFocus();
        }
    }
   @Override
    public void actionPerformed(ActionEvent ae) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
