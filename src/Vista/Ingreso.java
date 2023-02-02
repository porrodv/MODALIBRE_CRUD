package Vista;

import java.awt.Color;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import Controlador.ConexionSQL;
import Modelo.Datos;

public class Ingreso extends javax.swing.JFrame {

    int xMouse, yMouse;
    PreparedStatement ps = null;
    ConexionSQL mysql = new ConexionSQL();
    ResultSet rs;

    public Ingreso() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public void obtenerDatosCliente() {
        String sSQL3 = "SELECT idCuenta_Cliente, Correo FROM cuenta_cliente WHERE Nick = '" + Datos.getUsuario() + "'";

        try {
            ps = (mysql.conectarSQL()).prepareStatement(sSQL3);
            rs = ps.executeQuery();

            while (rs.next()) { 
                Datos.setIdCuentaCliente(rs.getInt("idCuenta_Cliente"));
                Datos.setCorreo(rs.getString("Correo"));
                System.out.println("idCuenta_Cliente encontrada: "+Datos.getIdCuentaCliente());
                System.out.println("Correo enctrado: "+Datos.getCorreo());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error sSQL3: " + e.toString());
        }
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        headerIngreso = new javax.swing.JPanel();
        btnExit1 = new javax.swing.JPanel();
        txtExit1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtUsuarioIngreso = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        btnTrabajadorIngreso = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        txtContraIngreso = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        lbRegistrate = new javax.swing.JLabel();
        btnIngresarIngreso = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 293, 350, 0));

        headerIngreso.setBackground(new java.awt.Color(255, 146, 96));
        headerIngreso.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerIngresoMouseDragged(evt);
            }
        });
        headerIngreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerIngresoMousePressed(evt);
            }
        });

        btnExit1.setBackground(new java.awt.Color(255, 146, 96));

        txtExit1.setBackground(new java.awt.Color(255, 146, 96));
        txtExit1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        txtExit1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtExit1.setText("X");
        txtExit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtExit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtExit1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtExit1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtExit1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnExit1Layout = new javax.swing.GroupLayout(btnExit1);
        btnExit1.setLayout(btnExit1Layout);
        btnExit1Layout.setHorizontalGroup(
            btnExit1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnExit1Layout.createSequentialGroup()
                .addComponent(txtExit1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnExit1Layout.setVerticalGroup(
            btnExit1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnExit1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtExit1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel6.setFont(new java.awt.Font("Bauhaus 93", 1, 36)); // NOI18N
        jLabel6.setText("   MODA LIBRE");

        javax.swing.GroupLayout headerIngresoLayout = new javax.swing.GroupLayout(headerIngreso);
        headerIngreso.setLayout(headerIngresoLayout);
        headerIngresoLayout.setHorizontalGroup(
            headerIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerIngresoLayout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                .addComponent(btnExit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerIngresoLayout.setVerticalGroup(
            headerIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerIngresoLayout.createSequentialGroup()
                .addComponent(btnExit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(headerIngresoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg.add(headerIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 50));

        jPanel1.setBackground(new java.awt.Color(255, 190, 153));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setText("USUARIO");

        txtUsuarioIngreso.setBackground(new java.awt.Color(255, 190, 153));
        txtUsuarioIngreso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsuarioIngreso.setForeground(new java.awt.Color(102, 102, 102));
        txtUsuarioIngreso.setText("Ingrese su usuario");
        txtUsuarioIngreso.setBorder(null);
        txtUsuarioIngreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioIngresoMousePressed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        btnTrabajadorIngreso.setText("Soy trabajador");
        btnTrabajadorIngreso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTrabajadorIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrabajadorIngresoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setText("CONTRASEÑA");

        txtContraIngreso.setBackground(new java.awt.Color(255, 190, 153));
        txtContraIngreso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtContraIngreso.setForeground(new java.awt.Color(102, 102, 102));
        txtContraIngreso.setText("********");
        txtContraIngreso.setToolTipText("");
        txtContraIngreso.setBorder(null);
        txtContraIngreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraIngresoMousePressed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("¿Aún no tienes cuenta?");

        lbRegistrate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbRegistrate.setForeground(new java.awt.Color(153, 0, 0));
        lbRegistrate.setText("Regístrate");
        lbRegistrate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbRegistrate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbRegistrateMouseClicked(evt);
            }
        });

        btnIngresarIngreso.setBackground(new java.awt.Color(153, 0, 0));
        btnIngresarIngreso.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnIngresarIngreso.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresarIngreso.setText("INGRESAR");
        btnIngresarIngreso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresarIngreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarIngresoMouseClicked(evt);
            }
        });
        btnIngresarIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarIngresoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N
        jLabel3.setText("INICIAR SESIÓN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lbRegistrate)))
                        .addGap(38, 38, 38)
                        .addComponent(btnIngresarIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(116, 116, 116)
                                .addComponent(btnTrabajadorIngreso))
                            .addComponent(txtUsuarioIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtContraIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnTrabajadorIngreso)))
                .addGap(20, 20, 20)
                .addComponent(txtUsuarioIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(13, 13, 13)
                .addComponent(txtContraIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7)
                        .addComponent(lbRegistrate))
                    .addComponent(btnIngresarIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 350, 400));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/portada.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 770, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 766, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerIngresoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerIngresoMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerIngresoMousePressed

    private void headerIngresoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerIngresoMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerIngresoMouseDragged

    private void txtExit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExit1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_txtExit1MouseClicked

    private void txtExit1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExit1MouseEntered
        btnExit1.setBackground(Color.red);
        txtExit1.setForeground(Color.white);
    }//GEN-LAST:event_txtExit1MouseEntered

    private void txtExit1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExit1MouseExited
        btnExit1.setBackground(new Color(255,146,96));
        txtExit1.setForeground(Color.black);
    }//GEN-LAST:event_txtExit1MouseExited

    private void txtUsuarioIngresoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioIngresoMousePressed
        if (txtUsuarioIngreso.getText().equals("Ingrese su usuario")) {
            txtUsuarioIngreso.setText("");
            txtUsuarioIngreso.setForeground(Color.black);
        }
        if (String.valueOf(txtContraIngreso.getPassword()).isEmpty()) {
            txtContraIngreso.setText("********"); // 8
            txtContraIngreso.setForeground(new Color(204, 204, 204)); // gris usado
        }
    }//GEN-LAST:event_txtUsuarioIngresoMousePressed

    private void txtContraIngresoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraIngresoMousePressed
        //con metodo:  Metodos.relleno(txtContraIngreso, String.valueOf(txtContraIngreso.getPassword()));

        if (String.valueOf(txtContraIngreso.getPassword()).equals("********")) {
            txtContraIngreso.setText("");
            txtContraIngreso.setForeground(Color.black);
        }

        if (txtUsuarioIngreso.getText().isEmpty()) {
            txtUsuarioIngreso.setText("Ingrese su usuario o correo electrónico");
            txtUsuarioIngreso.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtContraIngresoMousePressed

    private void btnIngresarIngresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarIngresoMouseClicked

        String usuario, contra;
        usuario = txtUsuarioIngreso.getText();
        contra = String.copyValueOf(txtContraIngreso.getPassword());
        String sSQL = "";
        int cambio = 0;

        if (!"".equals(usuario) && !"".equals(contra)) {

            if (btnTrabajadorIngreso.isSelected()) {
                sSQL = "SELECT * FROM cuenta_trabajadores WHERE Nick = '" + usuario + "' AND Contraseña = '" + contra + "'";
                cambio = 1;
            } else {
                sSQL = "SELECT * FROM cuenta_cliente WHERE Nick = '" + usuario + "' AND Contraseña = '" + contra + "'";
                cambio = 2;
            }

            try {
                ps = (mysql.conectarSQL()).prepareStatement(sSQL);
                rs = ps.executeQuery();
                if (rs.next()) {

                    Datos.setUsuario(txtUsuarioIngreso.getText()); // guardar los datos globales (solo usuario)
                    JOptionPane.showMessageDialog(null, "¡Bienvenido!");

                    if (cambio == 1) {
                        // cambia a la pestaña de trabajador
                        PrincipalEmpleado ir = new PrincipalEmpleado();
                        ir.setVisible(true);
                        this.dispose();
                        // cambia a la pestaña de cliente
                    } else {
                        obtenerDatosCliente();
                        PrincipalCliente ir = new PrincipalCliente();
                        ir.setVisible(true);
                        this.dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o conrasena incorrectos, vuleva a intentar");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al inciar sesión " + e.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe completar los datos");
        }
    }//GEN-LAST:event_btnIngresarIngresoMouseClicked

    private void btnTrabajadorIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrabajadorIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTrabajadorIngresoActionPerformed

    private void btnIngresarIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresarIngresoActionPerformed

    private void lbRegistrateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRegistrateMouseClicked
        Registro ir = new Registro();
        ir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbRegistrateMouseClicked

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
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnExit1;
    private javax.swing.JButton btnIngresarIngreso;
    private javax.swing.JCheckBox btnTrabajadorIngreso;
    private javax.swing.JPanel headerIngreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbRegistrate;
    private javax.swing.JPasswordField txtContraIngreso;
    private javax.swing.JLabel txtExit1;
    private javax.swing.JTextField txtUsuarioIngreso;
    // End of variables declaration//GEN-END:variables
}
