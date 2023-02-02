package Vista;

import Controlador.ConexionSQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

public class Control_Inventario extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    PreparedStatement ps = null;
    ConexionSQL mysql = new ConexionSQL();
    ResultSet rs;
    int idc; // guardar datos de las filas

    String[] titulos = {"Código", "Tipo", "Marca", "Talla", "Precio", "Stock"};

    public Control_Inventario() {
        initComponents();
        setLocationRelativeTo(null);
        cargarProductos();
        txtTipoFinal.setEditable(false);
        txtIDFinal.setEditable(false);

        JSpinner spinner = new JSpinner();
        spinCantidadProducto.setModel(new SpinnerNumberModel(0, 0, 100, 1));
    }

    void cargarProductos() {
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        String[] registros = new String[6];

        String sSQL = "SELECT * FROM productos";
        try {
            ps = (mysql.conectarSQL()).prepareStatement(sSQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                registros[0] = rs.getString("idProductos");
                registros[1] = rs.getString("Tipo");
                registros[2] = rs.getString("Marca");
                registros[3] = rs.getString("Talla");
                registros[4] = rs.getString("Precio");
                registros[5] = rs.getString("Stock");

                modelo.addRow(registros);
            }
            tabla.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar los productos de la BD: " + e.toString());
        }
    }

    void limpiarCasillas() {
        txtTipoFinal.setText("");
        txtIDFinal.setText("");
        spinCantidadProducto.setValue(0);
        txtCodigoProducto.setText("");
        tabla.clearSelection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnRestablecer = new javax.swing.JButton();
        headerControl = new javax.swing.JPanel();
        btnExit1 = new javax.swing.JPanel();
        txtExit1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        spinCantidadProducto = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        txtTipoFinal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIDFinal = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnSalirOrden1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 146, 96));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("CONTROL STOCK");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Código Producto:");

        txtCodigoProducto.setBackground(new java.awt.Color(204, 204, 204));
        txtCodigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProductoActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(102, 102, 102));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        btnRestablecer.setBackground(new java.awt.Color(204, 204, 204));
        btnRestablecer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRestablecer.setForeground(new java.awt.Color(102, 102, 102));
        btnRestablecer.setText("RESTABLECER");
        btnRestablecer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRestablecerMouseClicked(evt);
            }
        });

        headerControl.setBackground(new java.awt.Color(255, 146, 96));
        headerControl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerControlMouseDragged(evt);
            }
        });
        headerControl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerControlMousePressed(evt);
            }
        });

        btnExit1.setBackground(new java.awt.Color(255, 146, 96));

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

        javax.swing.GroupLayout headerControlLayout = new javax.swing.GroupLayout(headerControl);
        headerControl.setLayout(headerControlLayout);
        headerControlLayout.setHorizontalGroup(
            headerControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerControlLayout.createSequentialGroup()
                .addGap(0, 714, Short.MAX_VALUE)
                .addComponent(btnExit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerControlLayout.setVerticalGroup(
            headerControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerControlLayout.createSequentialGroup()
                .addComponent(btnExit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo3.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRestablecer, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(headerControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(headerControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar)
                            .addComponent(jLabel3)
                            .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRestablecer)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Actualizar Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Tipo:");

        txtTipoFinal.setBackground(new java.awt.Color(231, 236, 217));
        txtTipoFinal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTipoFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoFinalActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Cantidad:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("ID:");

        txtIDFinal.setBackground(new java.awt.Color(231, 236, 217));
        txtIDFinal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtIDFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDFinalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTipoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIDFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spinCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtIDFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTipoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnActualizar.setBackground(new java.awt.Color(204, 204, 204));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(102, 102, 102));
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
        });

        btnSalirOrden1.setBackground(new java.awt.Color(255, 255, 255));
        btnSalirOrden1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalirOrden1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirOrden1MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setText("Salir");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salida1.png"))); // NOI18N

        javax.swing.GroupLayout btnSalirOrden1Layout = new javax.swing.GroupLayout(btnSalirOrden1);
        btnSalirOrden1.setLayout(btnSalirOrden1Layout);
        btnSalirOrden1Layout.setHorizontalGroup(
            btnSalirOrden1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSalirOrden1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        btnSalirOrden1Layout.setVerticalGroup(
            btnSalirOrden1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSalirOrden1Layout.createSequentialGroup()
                .addGroup(btnSalirOrden1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(btnSalirOrden1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
        tabla.setRowHeight(25);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabla);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSalirOrden1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizar))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(btnActualizar)
                                .addGap(52, 52, 52))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalirOrden1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProductoActionPerformed

    private void txtTipoFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoFinalActionPerformed

    private void btnSalirOrden1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirOrden1MouseClicked
        PrincipalEmpleado salir = new PrincipalEmpleado();
        salir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirOrden1MouseClicked

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int fila = tabla.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se selecciono ninguna fila");
        } else {
            idc = Integer.parseInt((String) tabla.getValueAt(fila, 0).toString());
            String tipo = (String) tabla.getValueAt(fila, 1);
            int stock = Integer.parseInt((String) tabla.getValueAt(fila, 5).toString());

            txtIDFinal.setText("" + idc);
            txtTipoFinal.setText(tipo);
            spinCantidadProducto.setValue(stock);
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void txtIDFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDFinalActionPerformed

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        String tipo = txtTipoFinal.getText();
        String id = txtIDFinal.getText();
        String stock = String.valueOf(spinCantidadProducto.getValue());

        if (!"".equals(tipo) && !"".equals(id)) {

            String sSQL = "UPDATE productos SET Stock = '" + stock + "' WHERE idProductos = " + idc;

            try {
                ps = (mysql.conectarSQL()).prepareStatement(sSQL);
                int n = ps.executeUpdate();

                if (n > 0) {
                    JOptionPane.showMessageDialog(null, "¡Stock actualizado!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al actualizar el stock de la BD: " + e.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se seleciono una fila");
        }
        cargarProductos();
        limpiarCasillas();
    }//GEN-LAST:event_btnActualizarMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        String codigo = txtCodigoProducto.getText();
        if (!"".equals(codigo)) {
            DefaultTableModel modelo = new DefaultTableModel(null, titulos);
            String[] registros = new String[6];
            
            String sSQL = "SELECT * FROM productos WHERE idProductos = " + codigo;

            try {
                ps = (mysql.conectarSQL()).prepareStatement(sSQL);
                rs = ps.executeQuery();

                while (rs.next()) {
                    registros[0] = rs.getString("idProductos");
                    registros[1] = rs.getString("Tipo");
                    registros[2] = rs.getString("Marca");
                    registros[3] = rs.getString("Talla");
                    registros[4] = rs.getString("Precio");
                    registros[5] = rs.getString("Stock");

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

    private void btnRestablecerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestablecerMouseClicked
        cargarProductos();
    }//GEN-LAST:event_btnRestablecerMouseClicked

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

    private void headerControlMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerControlMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerControlMouseDragged

    private void headerControlMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerControlMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerControlMousePressed

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
            java.util.logging.Logger.getLogger(Control_Inventario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Control_Inventario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Control_Inventario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Control_Inventario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Control_Inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JPanel btnExit1;
    private javax.swing.JButton btnRestablecer;
    private javax.swing.JPanel btnSalirOrden1;
    private javax.swing.JPanel headerControl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner spinCantidadProducto;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JLabel txtExit1;
    private javax.swing.JTextField txtIDFinal;
    private javax.swing.JTextField txtTipoFinal;
    // End of variables declaration//GEN-END:variables
}
