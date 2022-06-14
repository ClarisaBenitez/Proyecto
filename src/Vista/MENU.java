package Vista;


import bd.conexion;
//EMPLEADO
import consulta.Empleado_consulta;
import controlador.Empleado_controlador;
import java.sql.Connection;
import Modelo.Empleado_modelo;
//CLIENTE
import consulta.Cliente_consulta;
import controlador.Cliente_controlador;
import Modelo.Cliente_modelo;
//CREDITO
import Modelo.Credito_modelo;
import Modelo.Facturacion_modelo;
import Modelo.Sueldo_modelo;
//FACTURACION
import consulta.Credito_consulta;
import consulta.Facturacion_consulta;
import consulta.Sueldo_consulta;
//SUELDO
import controlador.Credito_controlador;
import controlador.Facturacion_controlador;
import controlador.Sueldo_controlador;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MENU extends javax.swing.JFrame {

    conexion c= new conexion();
    Connection con = c.getConexion();
    
     @Override
    public void setTitle(String string) {
        super.setTitle(string); //To change body of generated methods, choose Tools | Templates.
    }
    
    public MENU() {
        initComponents();
        this.setTitle("BANCO FAMILIAR");
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        barraMenus = new javax.swing.JMenuBar();
        MENU = new javax.swing.JMenu();
        Separador7 = new javax.swing.JPopupMenu.Separator();
        Menu_Clientes = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Menu_Empleados = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        Menu_Salarios = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        Menu_Creditos = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        Menu_facturacion = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        Menu_salir = new javax.swing.JMenuItem();
        CLIENTES = new javax.swing.JMenu();
        AgregarClientes = new javax.swing.JMenuItem();
        Separdor1 = new javax.swing.JPopupMenu.Separator();
        Visualiar_Clientes = new javax.swing.JMenuItem();
        EMPLEADOS = new javax.swing.JMenu();
        AgregarEmpleados = new javax.swing.JMenuItem();
        Separador9 = new javax.swing.JPopupMenu.Separator();
        VisualizarEmpleados = new javax.swing.JMenuItem();
        SALARIOS = new javax.swing.JMenu();
        Agregar_salario = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        Visualizar_salario = new javax.swing.JMenuItem();
        CREDITO = new javax.swing.JMenu();
        Agregar = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        visualizar_credito = new javax.swing.JMenuItem();
        FACTURACION = new javax.swing.JMenu();
        Cobrar = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        Visualizar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageness/blanco_familiar.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(500, 351));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        MENU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MENU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageness/principal_menu.png"))); // NOI18N
        MENU.setText("Menu  ");
        MENU.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        MENU.add(Separador7);

        Menu_Clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageness/cliente_menu.png"))); // NOI18N
        Menu_Clientes.setText("Clientes");
        Menu_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_ClientesActionPerformed(evt);
            }
        });
        MENU.add(Menu_Clientes);
        MENU.add(jSeparator1);

        Menu_Empleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageness/empleado_menu.png"))); // NOI18N
        Menu_Empleados.setText("Empleados");
        Menu_Empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_EmpleadosActionPerformed(evt);
            }
        });
        MENU.add(Menu_Empleados);
        MENU.add(jSeparator2);

        Menu_Salarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageness/salario_menu.png"))); // NOI18N
        Menu_Salarios.setText("Salarios");
        Menu_Salarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_SalariosActionPerformed(evt);
            }
        });
        MENU.add(Menu_Salarios);
        MENU.add(jSeparator6);

        Menu_Creditos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageness/moneda_vuelto.png"))); // NOI18N
        Menu_Creditos.setText("Creditos");
        Menu_Creditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_CreditosActionPerformed(evt);
            }
        });
        MENU.add(Menu_Creditos);
        MENU.add(jSeparator7);

        Menu_facturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageness/facturacion_menu.png"))); // NOI18N
        Menu_facturacion.setText("Facturacion");
        Menu_facturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_facturacionActionPerformed(evt);
            }
        });
        MENU.add(Menu_facturacion);
        MENU.add(jSeparator8);

        Menu_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageness/x_menu.png"))); // NOI18N
        Menu_salir.setText("Salir");
        MENU.add(Menu_salir);

        barraMenus.add(MENU);

        CLIENTES.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CLIENTES.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageness/cliente_menu.png"))); // NOI18N
        CLIENTES.setText("Clientes  ");
        CLIENTES.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        CLIENTES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLIENTESActionPerformed(evt);
            }
        });

        AgregarClientes.setText("Agregar");
        AgregarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarClientesActionPerformed(evt);
            }
        });
        CLIENTES.add(AgregarClientes);
        CLIENTES.add(Separdor1);

        Visualiar_Clientes.setText("Visualizar");
        Visualiar_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Visualiar_ClientesActionPerformed(evt);
            }
        });
        CLIENTES.add(Visualiar_Clientes);

        barraMenus.add(CLIENTES);

        EMPLEADOS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EMPLEADOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageness/empleado_menu.png"))); // NOI18N
        EMPLEADOS.setText("Empleados  ");
        EMPLEADOS.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N

        AgregarEmpleados.setText("Agregar");
        AgregarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarEmpleadosActionPerformed(evt);
            }
        });
        EMPLEADOS.add(AgregarEmpleados);
        EMPLEADOS.add(Separador9);

        VisualizarEmpleados.setText("Visualizar");
        VisualizarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualizarEmpleadosActionPerformed(evt);
            }
        });
        EMPLEADOS.add(VisualizarEmpleados);

        barraMenus.add(EMPLEADOS);

        SALARIOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageness/salario_menu.png"))); // NOI18N
        SALARIOS.setText("Salarios");

        Agregar_salario.setText("Agregar Salario");
        Agregar_salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar_salarioActionPerformed(evt);
            }
        });
        SALARIOS.add(Agregar_salario);
        SALARIOS.add(jSeparator3);

        Visualizar_salario.setText("Visualizar");
        Visualizar_salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Visualizar_salarioActionPerformed(evt);
            }
        });
        SALARIOS.add(Visualizar_salario);

        barraMenus.add(SALARIOS);

        CREDITO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageness/moneda_vuelto.png"))); // NOI18N
        CREDITO.setText("Creditos");

        Agregar.setText("Registrar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        CREDITO.add(Agregar);
        CREDITO.add(jSeparator4);

        visualizar_credito.setText("Visualizar");
        visualizar_credito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizar_creditoActionPerformed(evt);
            }
        });
        CREDITO.add(visualizar_credito);

        barraMenus.add(CREDITO);

        FACTURACION.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageness/facturacion_menu.png"))); // NOI18N
        FACTURACION.setText("Facturacion");

        Cobrar.setText("Cobrar");
        Cobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CobrarActionPerformed(evt);
            }
        });
        FACTURACION.add(Cobrar);
        FACTURACION.add(jSeparator5);

        Visualizar.setText("Visualizar");
        Visualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualizarActionPerformed(evt);
            }
        });
        FACTURACION.add(Visualizar);

        barraMenus.add(FACTURACION);

        setJMenuBar(barraMenus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarClientesActionPerformed
        // Con esto llamamos a la tabla
        
//        RegistroClientes reg_cliente= new RegistroClientes();
//        reg_cliente.setVisible(true);
//        this.dispose();
        
        Cliente_modelo tCliente = new Cliente_modelo();
        Cliente_consulta cCliente= new Cliente_consulta();
        RegistroClientes rCliente = new RegistroClientes();
        Cliente_controlador ctl = new Cliente_controlador(tCliente, cCliente, rCliente);
        ctl.iniciar();
        rCliente.setVisible(true);
        
    }//GEN-LAST:event_AgregarClientesActionPerformed

    private void Menu_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_ClientesActionPerformed
           //Aca llamamos a la tabla Cliente
        CLIENTES c_cliente= new CLIENTES();
        c_cliente.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_Menu_ClientesActionPerformed

    private void Visualiar_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Visualiar_ClientesActionPerformed
      ListaClientesReg lcliente= new ListaClientesReg();
        lcliente.setVisible(true);
        this.dispose();      
    }//GEN-LAST:event_Visualiar_ClientesActionPerformed

    private void CLIENTESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLIENTESActionPerformed
       
    }//GEN-LAST:event_CLIENTESActionPerformed

    private void Menu_EmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_EmpleadosActionPerformed
         //Aca llamamos a la tabla Empleados
        EMPLEADOS empleado= new EMPLEADOS();
        empleado.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Menu_EmpleadosActionPerformed

    private void AgregarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarEmpleadosActionPerformed
        // TODO add your handling code here:
        Empleado_modelo tEmpleado = new Empleado_modelo();
        Empleado_consulta cEmpleado= new Empleado_consulta();
        RegistroEmpleados rEmpleado = new RegistroEmpleados();
        Empleado_controlador ctl = new Empleado_controlador(tEmpleado, cEmpleado, rEmpleado);
        ctl.iniciar();
        rEmpleado.setVisible(true);
        
        
    }//GEN-LAST:event_AgregarEmpleadosActionPerformed

    private void VisualizarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisualizarEmpleadosActionPerformed
        try {
            ListaEmpleadosReg lempleado= new ListaEmpleadosReg();
            lempleado.setVisible(true); 
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(MENU.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_VisualizarEmpleadosActionPerformed

    private void Menu_SalariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_SalariosActionPerformed
       Salario_empleado vempleado= new Salario_empleado();
        vempleado.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_Menu_SalariosActionPerformed

    private void Visualizar_salarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Visualizar_salarioActionPerformed
        ListaSueldo lsueldo= new ListaSueldo();
        lsueldo.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_Visualizar_salarioActionPerformed

    private void Menu_CreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_CreditosActionPerformed
       Registrar_Visualizar_Cred credito= new Registrar_Visualizar_Cred();
       credito.setVisible(true);
        this.dispose(); 
        
        
    }//GEN-LAST:event_Menu_CreditosActionPerformed

    private void visualizar_creditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizar_creditoActionPerformed
       ListaPrestamo lprestamos= new ListaPrestamo();
        lprestamos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_visualizar_creditoActionPerformed

    private void VisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisualizarActionPerformed
       ListaFacturacion lfacturacion= new ListaFacturacion();
        lfacturacion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VisualizarActionPerformed

    private void CobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CobrarActionPerformed
//        FACTURACION facturacion= new FACTURACION();
//        facturacion.setVisible(true);
//        this.dispose();
        Facturacion_modelo tFac = new Facturacion_modelo();
        Facturacion_consulta cFac= new Facturacion_consulta();
        FACTURACION rFac = new FACTURACION();
        Facturacion_controlador ctl = new Facturacion_controlador(tFac, cFac, rFac);
        ctl.iniciar();
        rFac.setVisible(true);
    }//GEN-LAST:event_CobrarActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
//        Prestamos prestamos= new Prestamos();
//        prestamos.setVisible(true);
//        this.dispose(); 

        Credito_modelo tCredito = new Credito_modelo();
        Credito_consulta cCredito= new Credito_consulta();
        Prestamos rCredito = new Prestamos();
        Credito_controlador ctl = new Credito_controlador(tCredito, cCredito, rCredito);
        ctl.iniciar();
        rCredito.setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_AgregarActionPerformed

    private void Agregar_salarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agregar_salarioActionPerformed
//        Sueldo_empleado sueldo= new Sueldo_empleado();
//        sueldo.setVisible(true);
//        this.dispose(); 

        Sueldo_modelo tSueldo = new Sueldo_modelo();
        Sueldo_consulta cSueldo= new Sueldo_consulta();
        Sueldo_empleado rSueldo = new Sueldo_empleado();
        Sueldo_controlador ctl = new Sueldo_controlador(tSueldo, cSueldo, rSueldo);
        ctl.iniciar();
        rSueldo.setVisible(true);
        dispose();
    }//GEN-LAST:event_Agregar_salarioActionPerformed

    private void Menu_facturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_facturacionActionPerformed
        Cobrar_Visualizar_Fact facturacion= new Cobrar_Visualizar_Fact();
        facturacion.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_Menu_facturacionActionPerformed

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
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Agregar;
    private javax.swing.JMenuItem AgregarClientes;
    private javax.swing.JMenuItem AgregarEmpleados;
    private javax.swing.JMenuItem Agregar_salario;
    private javax.swing.JMenu CLIENTES;
    private javax.swing.JMenu CREDITO;
    private javax.swing.JMenuItem Cobrar;
    private javax.swing.JMenu EMPLEADOS;
    private javax.swing.JMenu FACTURACION;
    private javax.swing.JMenu MENU;
    private javax.swing.JMenuItem Menu_Clientes;
    private javax.swing.JMenuItem Menu_Creditos;
    private javax.swing.JMenuItem Menu_Empleados;
    private javax.swing.JMenuItem Menu_Salarios;
    private javax.swing.JMenuItem Menu_facturacion;
    private javax.swing.JMenuItem Menu_salir;
    private javax.swing.JMenu SALARIOS;
    private javax.swing.JPopupMenu.Separator Separador7;
    private javax.swing.JPopupMenu.Separator Separador9;
    private javax.swing.JPopupMenu.Separator Separdor1;
    private javax.swing.JMenuItem Visualiar_Clientes;
    private javax.swing.JMenuItem Visualizar;
    private javax.swing.JMenuItem VisualizarEmpleados;
    private javax.swing.JMenuItem Visualizar_salario;
    private javax.swing.JMenuBar barraMenus;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JMenuItem visualizar_credito;
    // End of variables declaration//GEN-END:variables
}
