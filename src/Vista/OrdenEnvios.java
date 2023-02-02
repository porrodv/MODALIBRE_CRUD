package Vista;

import java.awt.Color;
import Controlador.ConexionSQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class OrdenEnvios extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    PreparedStatement ps = null;
    ConexionSQL mysql = new ConexionSQL();
    ResultSet rs;
    int idc; // guardar datos de las filas
    
    String[] titulos = {"Código", "idDetalles", "idCuenta", "Estado"};

    public OrdenEnvios() {
        initComponents();
        setLocationRelativeTo(null);
        cargarProductos();
    }

    void cargarProductos() {
        
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        String[] registros = new String[4];

        String sSQL = "SELECT * FROM solicitud_compra";
        try {
            ps = (mysql.conectarSQL()).prepareStatement(sSQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                registros[0] = rs.getString("idSolicitud_Compra");
                registros[1] = rs.getString("idDetalles_Compra");
                registros[2] = rs.getString("idCuenta_Cliente");
                registros[3] = rs.getString("Estado");

                modelo.addRow(registros);
            }
            tabla.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar los productos de la BD: " + e.toString());
        }
    }
    
    void actualizarEstado(String estado, String mensaje){
        if (tabla.getSelectedRow() != -1) {
            
            String sSQL = "UPDATE solicitud_compra SET Estado = '" + estado + "' WHERE idSolicitud_Compra = " + idc;
            try {
                ps = (mysql.conectarSQL()).prepareStatement(sSQL);
                int n = ps.executeUpdate();
                
                if (n > 0) {
                    JOptionPane.showMessageDialog(null, "¡Registro "+mensaje+"!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al actualizar el registro de la BD: " + e.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se seleciono una fila");
        }
    }
    
    void limpiarCasillas() {
        txtCodigoSolicitud.setText("");
        tabla.clearSelection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoSolicitud = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        headerOrden = new javax.swing.JPanel();
        btnExit1 = new javax.swing.JPanel();
        txtExit1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAprobar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalirOrden = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnMostrarTodo = new javax.swing.JButton();
        btnRechazar = new javax.swing.JButton();
        btnPendiente = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 146, 96));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("ENVIOS");

        txtCodigoSolicitud.setBackground(new java.awt.Color(204, 204, 204));
        txtCodigoSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoSolicitudActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("CODIGO SOLICITUD COMPRA:");

        btnBuscar.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(102, 102, 102));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        headerOrden.setBackground(new java.awt.Color(255, 255, 255));
        headerOrden.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerOrdenMouseDragged(evt);
            }
        });
        headerOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerOrdenMousePressed(evt);
            }
        });

        btnExit1.setBackground(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout headerOrdenLayout = new javax.swing.GroupLayout(headerOrden);
        headerOrden.setLayout(headerOrdenLayout);
        headerOrdenLayout.setHorizontalGroup(
            headerOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerOrdenLayout.createSequentialGroup()
                .addGap(0, 714, Short.MAX_VALUE)
                .addComponent(btnExit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerOrdenLayout.setVerticalGroup(
            headerOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerOrdenLayout.createSequentialGroup()
                .addComponent(btnExit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo2.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigoSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(headerOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(headerOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtCodigoSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 130));

        btnAprobar.setBackground(new java.awt.Color(204, 204, 204));
        btnAprobar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAprobar.setForeground(new java.awt.Color(102, 102, 102));
        btnAprobar.setText("APROBAR");
        btnAprobar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAprobarMouseClicked(evt);
            }
        });
        jPanel1.add(btnAprobar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 125, 37));

        btnLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(102, 102, 102));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, 125, 37));

        btnSalirOrden.setBackground(new java.awt.Color(153, 255, 153));
        btnSalirOrden.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalirOrden.setOpaque(false);
        btnSalirOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirOrdenMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Salir");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salida1.png"))); // NOI18N

        javax.swing.GroupLayout btnSalirOrdenLayout = new javax.swing.GroupLayout(btnSalirOrden);
        btnSalirOrden.setLayout(btnSalirOrdenLayout);
        btnSalirOrdenLayout.setHorizontalGroup(
            btnSalirOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSalirOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        btnSalirOrdenLayout.setVerticalGroup(
            btnSalirOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSalirOrdenLayout.createSequentialGroup()
                .addGroup(btnSalirOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(btnSalirOrdenLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(btnSalirOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, -1));

        tabla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabla);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 480, 280));

        btnMostrarTodo.setBackground(new java.awt.Color(204, 204, 204));
        btnMostrarTodo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMostrarTodo.setForeground(new java.awt.Color(102, 102, 102));
        btnMostrarTodo.setText("MOSTRAR TODO");
        btnMostrarTodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMostrarTodoMouseClicked(evt);
            }
        });
        jPanel1.add(btnMostrarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, -1, 37));

        btnRechazar.setBackground(new java.awt.Color(204, 204, 204));
        btnRechazar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRechazar.setForeground(new java.awt.Color(102, 102, 102));
        btnRechazar.setText("RECHAZAR");
        btnRechazar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRechazarMouseClicked(evt);
            }
        });
        jPanel1.add(btnRechazar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 125, 37));

        btnPendiente.setBackground(new java.awt.Color(204, 204, 204));
        btnPendiente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPendiente.setForeground(new java.awt.Color(102, 102, 102));
        btnPendiente.setText("PENDIENTE");
        btnPendiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPendienteMouseClicked(evt);
            }
        });
        jPanel1.add(btnPendiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 125, 37));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoSolicitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoSolicitudActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSalirOrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirOrdenMouseClicked
        PrincipalEmpleado salir = new PrincipalEmpleado();
        salir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirOrdenMouseClicked

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int fila = tabla.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se selecciono ninguna fila");
        } else {
            idc = Integer.parseInt((String) tabla.getValueAt(fila, 0).toString());
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void btnMostrarTodoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarTodoMouseClicked
        cargarProductos();
        JOptionPane.showMessageDialog(null, "Se han cargado todos los registros");
    }//GEN-LAST:event_btnMostrarTodoMouseClicked

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

    private void headerOrdenMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerOrdenMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerOrdenMouseDragged

    private void headerOrdenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerOrdenMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerOrdenMousePressed

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        String codigo = txtCodigoSolicitud.getText();
        if (!"".equals(codigo)) {
            DefaultTableModel modelo = new DefaultTableModel(null, titulos);
            String[] registros = new String[4];
            
            String sSQL = "SELECT * FROM solicitud_compra WHERE idSolicitud_Compra = " + codigo;

            try {
                ps = (mysql.conectarSQL()).prepareStatement(sSQL);
                rs = ps.executeQuery();

                while (rs.next()) {
                    registros[0] = rs.getString("idSolicitud_Compra");
                    registros[1] = rs.getString("idDetalles_Compra");
                    registros[2] = rs.getString("idCuenta_Cliente");
                    registros[3] = rs.getString("Estado");

                    modelo.addRow(registros);
                }
                JOptionPane.showMessageDialog(null, "Registros filtrados!");
                tabla.setModel(modelo);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al filtrar los productos de la BD: " + e.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se inserto un ID");
        }
        limpiarCasillas();
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        limpiarCasillas();
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnAprobarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAprobarMouseClicked
        actualizarEstado("Aprobado", "aprobado");
        cargarProductos();
        limpiarCasillas();
    }//GEN-LAST:event_btnAprobarMouseClicked

    private void btnRechazarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRechazarMouseClicked
        actualizarEstado("Rechazado", "rechazado");
        cargarProductos();
        limpiarCasillas();
    }//GEN-LAST:event_btnRechazarMouseClicked

    private void btnPendienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPendienteMouseClicked
        actualizarEstado("Pendiente", "omitido");
        cargarProductos();
        limpiarCasillas();
    }//GEN-LAST:event_btnPendienteMouseClicked

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
            java.util.logging.Logger.getLogger(OrdenEnvios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrdenEnvios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrdenEnvios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrdenEnvios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrdenEnvios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAprobar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JPanel btnExit1;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMostrarTodo;
    private javax.swing.JButton btnPendiente;
    private javax.swing.JButton btnRechazar;
    private javax.swing.JPanel btnSalirOrden;
    private javax.swing.JPanel headerOrden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtCodigoSolicitud;
    private javax.swing.JLabel txtExit1;
    // End of variables declaration//GEN-END:variables
}
