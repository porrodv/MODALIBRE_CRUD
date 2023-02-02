package Vista;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Controlador.ConexionSQL;
import Modelo.Datos;
import java.sql.ResultSet;

public class Registro extends javax.swing.JFrame {

    int xMouse, yMouse;
    PreparedStatement ps = null;
    ConexionSQL mysql = new ConexionSQL();
    ResultSet rs;
    int idc; // guardar datos de las filas

    public Registro() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg2 = new javax.swing.JPanel();
        btnExit4 = new javax.swing.JPanel();
        txtExit4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuarioRegistro = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtCorreoRegistro = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        btnRegistrate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lbIniciaSesion = new javax.swing.JLabel();
        txtContraRegistro2 = new javax.swing.JPasswordField();
        txtContraRegistro = new javax.swing.JPasswordField();
        headerRegistro = new javax.swing.JPanel();
        btnExit1 = new javax.swing.JPanel();
        txtExit1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg2.setBackground(new java.awt.Color(204, 255, 204));
        bg2.setMinimumSize(new java.awt.Dimension(766, 0));
        bg2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit4.setBackground(new java.awt.Color(139, 115, 91));

        txtExit4.setBackground(new java.awt.Color(139, 115, 255));
        txtExit4.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        txtExit4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtExit4.setText("X");
        txtExit4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtExit4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtExit4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtExit4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtExit4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnExit4Layout = new javax.swing.GroupLayout(btnExit4);
        btnExit4.setLayout(btnExit4Layout);
        btnExit4Layout.setHorizontalGroup(
            btnExit4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtExit4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        btnExit4Layout.setVerticalGroup(
            btnExit4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnExit4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtExit4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg2.add(btnExit4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 60, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(153, 0, 51)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel3.setText("¡REGÍSTRATE!");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Nombre de Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        txtUsuarioRegistro.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtUsuarioRegistro.setBorder(null);
        jPanel1.add(txtUsuarioRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 151, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 151, 10));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Correo electrónico");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        txtCorreoRegistro.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtCorreoRegistro.setBorder(null);
        jPanel1.add(txtCorreoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 151, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 151, 10));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Contraseña");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 151, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Confirme su contraseña");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 151, 10));

        btnRegistrate.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistrate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrate.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrate.setText("REGÍSTRATE");
        btnRegistrate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrateMouseClicked(evt);
            }
        });
        jPanel1.add(btnRegistrate, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 150, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("¿Ya tienes una cuenta?");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        lbIniciaSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbIniciaSesion.setText("Inicia tu sesión");
        lbIniciaSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbIniciaSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbIniciaSesionMouseClicked(evt);
            }
        });
        jPanel1.add(lbIniciaSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, -1, -1));

        txtContraRegistro2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtContraRegistro2.setBorder(null);
        jPanel1.add(txtContraRegistro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 150, 20));

        txtContraRegistro.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtContraRegistro.setBorder(null);
        jPanel1.add(txtContraRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 150, 20));

        bg2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 310, 540));

        headerRegistro.setBackground(new java.awt.Color(255, 255, 255));
        headerRegistro.setOpaque(false);
        headerRegistro.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerRegistroMouseDragged(evt);
            }
        });
        headerRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerRegistroMousePressed(evt);
            }
        });

        txtExit1.setBackground(new java.awt.Color(255, 255, 255));
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

        javax.swing.GroupLayout headerRegistroLayout = new javax.swing.GroupLayout(headerRegistro);
        headerRegistro.setLayout(headerRegistroLayout);
        headerRegistroLayout.setHorizontalGroup(
            headerRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerRegistroLayout.createSequentialGroup()
                .addGap(0, 714, Short.MAX_VALUE)
                .addComponent(btnExit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerRegistroLayout.setVerticalGroup(
            headerRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerRegistroLayout.createSequentialGroup()
                .addComponent(btnExit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg2.add(headerRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/portada.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        bg2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg2, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtExit4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExit4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_txtExit4MouseClicked

    private void txtExit4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExit4MouseEntered
        btnExit4.setBackground(Color.red);
        txtExit4.setForeground(Color.white);
    }//GEN-LAST:event_txtExit4MouseEntered

    private void txtExit4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExit4MouseExited
        btnExit4.setBackground(new Color(204, 255, 204));
        txtExit4.setForeground(Color.black);
    }//GEN-LAST:event_txtExit4MouseExited

    private void txtExit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExit1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_txtExit1MouseClicked

    private void txtExit1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExit1MouseEntered
        btnExit1.setBackground(Color.red);
        txtExit1.setForeground(Color.white);
    }//GEN-LAST:event_txtExit1MouseEntered

    private void txtExit1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExit1MouseExited
        btnExit1.setBackground(Color.white);
        txtExit1.setForeground(Color.black);
    }//GEN-LAST:event_txtExit1MouseExited

    private void headerRegistroMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerRegistroMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerRegistroMouseDragged

    private void headerRegistroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerRegistroMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerRegistroMousePressed

    private void btnRegistrateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrateMouseClicked
        String a = String.valueOf(txtContraRegistro.getPassword());
        String b = String.valueOf(txtContraRegistro2.getPassword());
        boolean con = false, usu = false, co = false;

        if (!"".equals(txtUsuarioRegistro.getText())) {
            usu = true;
        }
        if (!"".equals(txtCorreoRegistro.getText())) {
            co = true;
        }
        if (!"".equals(a) && !"".equals(b)) {
            if (a.equals(b)) {
                con = true;
            }
        }
        if (usu == true && co == true && con == true) {
            /////////////////////////////////////////////////////////////////////////////////////////////////////
            PreparedStatement ps = null;
            ConexionSQL mysql = new ConexionSQL();

            String usuario, correo, contra;
            usuario = txtUsuarioRegistro.getText();
            correo = txtCorreoRegistro.getText();
            contra = String.valueOf(txtContraRegistro.getPassword());
            String sSQL = "INSERT INTO cuenta_cliente(Nick, Correo, Contraseña)"
                    + "VALUES(?,?,?)";

            try {
                ps = (mysql.conectarSQL()).prepareStatement(sSQL);
                ps.setString(1, usuario);
                ps.setString(2, correo);
                ps.setString(3, contra);
                int n = ps.executeUpdate();
                if (n > 0) {
                    JOptionPane.showMessageDialog(null, "¡Cuenta registrada correctamente!");

                    String sSQL2 = "SELECT idCuenta_Cliente FROM cuenta_cliente WHERE Nick = '" + usuario + "'";
                    String idCuentaCliente = null;
                    try {
                        ps = (mysql.conectarSQL()).prepareStatement(sSQL2);
                        rs = ps.executeQuery();

                        while (rs.next()) {
                            idCuentaCliente = rs.getString("idCuenta_Cliente");
                            System.out.println("idCuenta_Cliente encontrada");
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error sSQL2: " + e.toString());
                    }

                    
                    String sSQL3 = "INSERT INTO detalles_cliente(idDetalles_Cliente) "
                            + "VALUES ('" + idCuentaCliente + "') ";
                    try {
                        ps = (mysql.conectarSQL()).prepareStatement(sSQL3);
                        int n2 = ps.executeUpdate();
                        if (n2 > 0) {
                            System.out.println("Tabla detalles_cliente actualizada");
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error sSQL3: " + e.toString());
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "No se registro la cuenta, ERROR AL CONECTAR CON LA BD: " + e.toString());
            }

            Ingreso ir = new Ingreso();
            ir.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Error en los datos, pruebe de nuevo");
        }
    }//GEN-LAST:event_btnRegistrateMouseClicked

    private void lbIniciaSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbIniciaSesionMouseClicked
        Ingreso ir = new Ingreso();
        ir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbIniciaSesionMouseClicked

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg2;
    private javax.swing.JPanel btnExit1;
    private javax.swing.JPanel btnExit4;
    private javax.swing.JButton btnRegistrate;
    private javax.swing.JPanel headerRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lbIniciaSesion;
    private javax.swing.JPasswordField txtContraRegistro;
    private javax.swing.JPasswordField txtContraRegistro2;
    private javax.swing.JTextField txtCorreoRegistro;
    private javax.swing.JLabel txtExit1;
    private javax.swing.JLabel txtExit4;
    private javax.swing.JTextField txtUsuarioRegistro;
    // End of variables declaration//GEN-END:variables
}
