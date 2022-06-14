package Vista;

import Modelo.Empleado_modelo;
import consulta.Empleado_consulta;
import controlador.Empleado_controlador;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class EMPLEADOS extends javax.swing.JFrame {
  ListaEmpleadosReg EmpleadosReg;
    /**
     * Creates new form EMPLEADOS
     */
    public EMPLEADOS() {
        try {
            this.EmpleadosReg = new ListaEmpleadosReg();
            initComponents();
            this.setLocationRelativeTo(null);
            
            //  EmpleadosReg.grilla();
        } catch (SQLException ex) {
            Logger.getLogger(EMPLEADOS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_empleado = new javax.swing.JPanel();
        btn_AgregarEmpleado = new javax.swing.JButton();
        btn_visualizarEmpleado = new javax.swing.JButton();
        eti_atrasEmpleado = new javax.swing.JLabel();
        eti_agregar_empleado = new javax.swing.JLabel();
        eti_visual_reg_empleado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_empleado.setBackground(new java.awt.Color(255, 255, 255));

        btn_AgregarEmpleado.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btn_AgregarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageness/agregar_cliente_lindo.png"))); // NOI18N
        btn_AgregarEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn_AgregarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarEmpleadoActionPerformed(evt);
            }
        });

        btn_visualizarEmpleado.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btn_visualizarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageness/listass.png"))); // NOI18N
        btn_visualizarEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn_visualizarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_visualizarEmpleadoActionPerformed(evt);
            }
        });

        eti_atrasEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageness/atras_lindo...png"))); // NOI18N
        eti_atrasEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        eti_atrasEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eti_atrasEmpleadoMouseClicked(evt);
            }
        });

        eti_agregar_empleado.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        eti_agregar_empleado.setText("Agregar Empleado");

        eti_visual_reg_empleado.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        eti_visual_reg_empleado.setText("Visualizar registros");

        javax.swing.GroupLayout jPanel_empleadoLayout = new javax.swing.GroupLayout(jPanel_empleado);
        jPanel_empleado.setLayout(jPanel_empleadoLayout);
        jPanel_empleadoLayout.setHorizontalGroup(
            jPanel_empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_empleadoLayout.createSequentialGroup()
                .addGroup(jPanel_empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_empleadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(eti_atrasEmpleado))
                    .addGroup(jPanel_empleadoLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(jPanel_empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_AgregarEmpleado)
                            .addComponent(eti_agregar_empleado))
                        .addGap(180, 180, 180)
                        .addGroup(jPanel_empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(eti_visual_reg_empleado)
                            .addComponent(btn_visualizarEmpleado))))
                .addContainerGap(223, Short.MAX_VALUE))
        );
        jPanel_empleadoLayout.setVerticalGroup(
            jPanel_empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_empleadoLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(jPanel_empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_empleadoLayout.createSequentialGroup()
                        .addComponent(eti_visual_reg_empleado)
                        .addGap(27, 27, 27)
                        .addComponent(btn_visualizarEmpleado))
                    .addGroup(jPanel_empleadoLayout.createSequentialGroup()
                        .addComponent(eti_agregar_empleado)
                        .addGap(18, 18, 18)
                        .addComponent(btn_AgregarEmpleado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(eti_atrasEmpleado)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_empleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_empleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AgregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarEmpleadoActionPerformed
        // TODO add your handling code here:
        
        Empleado_modelo tEmpleado = new Empleado_modelo();
        Empleado_consulta cEmpleado= new Empleado_consulta();
        RegistroEmpleados rEmpleado = new RegistroEmpleados();
        Empleado_controlador ctl = new Empleado_controlador(tEmpleado, cEmpleado, rEmpleado);
        ctl.iniciar();
        rEmpleado.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_AgregarEmpleadoActionPerformed

    private void btn_visualizarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_visualizarEmpleadoActionPerformed
        try {
            // TODO add your handling code here:
            ListaEmpleadosReg lista_empleados= new ListaEmpleadosReg();
            lista_empleados.setVisible(true);
         //   EmpleadosReg.grilla();
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(EMPLEADOS.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btn_visualizarEmpleadoActionPerformed

    private void eti_atrasEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eti_atrasEmpleadoMouseClicked
        // TODO add your handling code here:
       new MENU().setVisible(true);  
       dispose();
    }//GEN-LAST:event_eti_atrasEmpleadoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EMPLEADOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EMPLEADOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EMPLEADOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EMPLEADOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EMPLEADOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AgregarEmpleado;
    private javax.swing.JButton btn_visualizarEmpleado;
    private javax.swing.JLabel eti_agregar_empleado;
    private javax.swing.JLabel eti_atrasEmpleado;
    private javax.swing.JLabel eti_visual_reg_empleado;
    private javax.swing.JPanel jPanel_empleado;
    // End of variables declaration//GEN-END:variables
}
