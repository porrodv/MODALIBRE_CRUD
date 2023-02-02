package Vista;

import Controlador.ConexionSQL;
import java.awt.*;
import javax.swing.JPanel;
import Modelo.Datos;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class page1 extends javax.swing.JFrame {

    PreparedStatement ps = null;
    ConexionSQL mysql = new ConexionSQL();
    ResultSet rs;
    int idc;

    public page1() {
        initComponents();
        txtUsuarioP1.setText(Datos.getUsuario());
        bloquearEntrega();
        bloquearCompra();

        txtUsuarioP1.setEditable(false);
        txtCostoP1.setEditable(false);
        txtPrendaP1.setEditable(false);
        txtTotalP1.setEditable(false);
    }

    public void obtenerDatos() {
        Datos.setNombre(txtNombreP1.getText());
        Datos.setApellido(txtApellidoP1.getText());
        Datos.setDocumento(txtDocumentoP1.getText());
        Datos.setTelefono(Integer.parseInt(txtTelefonoP1.getText()));

        Datos.setDistrito(String.valueOf(cboDistritoP1.getSelectedItem()));
        String depar = txtDptoP1.getText();
        if ("Ej. 24".equals(txtDptoP1.getText())) {
            depar = "";
        }
        Datos.setDireccion(txtDirecP1.getText() + " " + txtNumP1.getText() + " " + depar);

        Datos.setTipo(txtPrendaP1.getText());
        Datos.setMarca(txtMarca.getText());
        Datos.setPrecio(Double.parseDouble(txtCostoP1.getText()));
        Datos.setTalla(String.valueOf(cbotallasP1.getSelectedItem()));
        Datos.setCantidad((int) cboCantidadP1.getValue());
        Datos.setTotalPagar(Double.parseDouble(txtTotalP1.getText()));
    }

    public void dptoReinicio() {
        if (txtDptoP1.getText().isEmpty()) {
            txtDptoP1.setText("Ej. 24");
            txtDptoP1.setForeground(new Color(204, 204, 204));
        }
    }

    public void numReinicio() {
        if (txtNumP1.getText().isEmpty()) {
            txtNumP1.setText("Ej. 152");
            txtNumP1.setForeground(new Color(204, 204, 204));
        }
    }

    public void correoReinicio() {
        if (txtUsuarioP1.getText().isEmpty()) {
            txtUsuarioP1.setText("correo del ingreso");
            txtUsuarioP1.setForeground(new Color(204, 204, 204));
        }
    }

    public void bloquearIndent() {
        for (Component a : pnlIdentScroll.getComponents()) {
            a.setEnabled(false);
        }
    }

    public void desbloquearIdent() {
        for (Component a : pnlIdentScroll.getComponents()) {
            a.setEnabled(true);
        }
    }

    public void bloquearEntrega() {
        for (Component a : pnlEntregaScroll.getComponents()) {
            a.setEnabled(false);
        }
    }

    public void desbloquearEntrega() {
        for (Component a : pnlEntregaScroll.getComponents()) {
            a.setEnabled(true);
        }
    }

    public void bloquearCompra() {
        for (Component a : pnlCompraScroll.getComponents()) {
            a.setEnabled(false);
        }
    }

    public void desbloquearCompra() {
        for (Component a : pnlCompraScroll.getComponents()) {
            a.setEnabled(true);
        }
    }

    public JPanel getFondo1() {
        return bgRealizar;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgRealizar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        scroll = new javax.swing.JPanel();
        pnlEntregaScroll = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtDptoP1 = new javax.swing.JTextField();
        txtDirecP1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboDistritoP1 = new javax.swing.JComboBox<>();
        txtNumP1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnSiguiente2rP1 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        pnlIdentScroll = new javax.swing.JPanel();
        txtUsuarioP1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSiguienteP1 = new javax.swing.JButton();
        txtDocumentoP1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTelefonoP1 = new javax.swing.JTextField();
        cboDocumentoP1 = new javax.swing.JComboBox<>();
        Usuario = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreP1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellidoP1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        pnlCompraScroll = new javax.swing.JPanel();
        btnReiniciarP1 = new javax.swing.JButton();
        btnFinalizarP1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtPrendaP1 = new javax.swing.JTextField();
        txtCostoP1 = new javax.swing.JTextField();
        cboCantidadP1 = new javax.swing.JSpinner();
        btnGenerarP1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cbotallasP1 = new javax.swing.JComboBox<>();
        txtCodeProductoP1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtTotalP1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtMarca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bgRealizar.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(null);

        scroll.setBackground(new java.awt.Color(255, 255, 255));
        scroll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scrollMouseClicked(evt);
            }
        });

        pnlEntregaScroll.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setBackground(new java.awt.Color(204, 255, 204));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mapaEntrega.png"))); // NOI18N
        jLabel13.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel13.setOpaque(true);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Número:");

        txtDptoP1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDptoP1.setForeground(new java.awt.Color(204, 204, 204));
        txtDptoP1.setText("Ej. 24");
        txtDptoP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDptoP1MousePressed(evt);
            }
        });
        txtDptoP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDptoP1ActionPerformed(evt);
            }
        });

        txtDirecP1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDirecP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDirecP1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Distrito:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Dirección:");

        cboDistritoP1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cboDistritoP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un distrito", "ANCON", "ATE", "BARRANCO", "BRENA", "CARABAYLLO", "CHACLACAYO CHOSICA", "CHORRILLOS", "CIENEGUILLA", "COMAS", "EL AGUSTINO", "INDEPENDENCIA", "JESUS MARIA", "LA MOLINA ", "LA VICTORIA", "LIMA ", "LINCE", "LOS OLIVOS", "LURIGANCHO", "LURIN", "MAGDALENA DEL MAR", "MIRAFLORES", "PACHACAMAC", "PUCUSANA", "PUEBLO LIBRE", "PUENTE PIEDRA", "PUNTA HERMOSA", "PUNTA NEGRA", "RIMAC", "SAN BARTOLO", "SAN BORJA", "SAN ISIDRO", "SAN JUAN DE LURIGANCHO", "SAN JUAN DE MIRAFLORES", "SAN LUIS", "SAN MARTIN DE PORRES", "SAN MIGUEL", "SANTA ANITA", "SANTA MARIA DEL MAR", "SANTA ROSA", "SANTIAGO DE SURCO", "SURQUILLO", "VILLA EL SALVADOR", "VILLA MARIA DEL TRIUNFO", "SAN JUAN", "SAN JUAN" }));
        cboDistritoP1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtNumP1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNumP1.setForeground(new java.awt.Color(204, 204, 204));
        txtNumP1.setText("Ej. 152");
        txtNumP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtNumP1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNumP1MousePressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Dpto (opcional)");

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel9.setText("ENTREGA:");

        btnSiguiente2rP1.setBackground(new java.awt.Color(255, 51, 102));
        btnSiguiente2rP1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnSiguiente2rP1.setForeground(new java.awt.Color(255, 255, 255));
        btnSiguiente2rP1.setText("SIGUIENTE");
        btnSiguiente2rP1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSiguiente2rP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSiguiente2rP1MouseClicked(evt);
            }
        });
        btnSiguiente2rP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguiente2rP1ActionPerformed(evt);
            }
        });

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/entrega2.png"))); // NOI18N

        javax.swing.GroupLayout pnlEntregaScrollLayout = new javax.swing.GroupLayout(pnlEntregaScroll);
        pnlEntregaScroll.setLayout(pnlEntregaScrollLayout);
        pnlEntregaScrollLayout.setHorizontalGroup(
            pnlEntregaScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEntregaScrollLayout.createSequentialGroup()
                .addGroup(pnlEntregaScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlEntregaScrollLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSiguiente2rP1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlEntregaScrollLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtNumP1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlEntregaScrollLayout.createSequentialGroup()
                        .addGroup(pnlEntregaScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlEntregaScrollLayout.createSequentialGroup()
                                .addContainerGap(20, Short.MAX_VALUE)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addGap(147, 147, 147))
                            .addGroup(pnlEntregaScrollLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(pnlEntregaScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addGroup(pnlEntregaScrollLayout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(pnlEntregaScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtDptoP1)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jLabel10)
                                    .addComponent(cboDistritoP1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDirecP1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)))
                .addGap(24, 24, 24))
        );
        pnlEntregaScrollLayout.setVerticalGroup(
            pnlEntregaScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEntregaScrollLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEntregaScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEntregaScrollLayout.createSequentialGroup()
                        .addGroup(pnlEntregaScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlEntregaScrollLayout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(jLabel10))
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboDistritoP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDirecP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(pnlEntregaScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlEntregaScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDptoP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnSiguiente2rP1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlIdentScroll.setBackground(new java.awt.Color(255, 255, 255));

        txtUsuarioP1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsuarioP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioP1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtUsuarioP1MouseReleased(evt);
            }
        });
        txtUsuarioP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioP1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Apellido");

        btnSiguienteP1.setBackground(new java.awt.Color(255, 51, 102));
        btnSiguienteP1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnSiguienteP1.setForeground(new java.awt.Color(255, 255, 255));
        btnSiguienteP1.setText("SIGUIENTE");
        btnSiguienteP1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSiguienteP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSiguienteP1MouseClicked(evt);
            }
        });

        txtDocumentoP1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDocumentoP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoP1ActionPerformed(evt);
            }
        });
        txtDocumentoP1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDocumentoP1KeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Documento de identidad");

        txtTelefonoP1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTelefonoP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoP1ActionPerformed(evt);
            }
        });
        txtTelefonoP1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoP1KeyTyped(evt);
            }
        });

        cboDocumentoP1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cboDocumentoP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "Carné de Extranjería", "Pasaporte" }));
        cboDocumentoP1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Usuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Usuario.setText("Usuario");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("TIpo de documento");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Teléfono");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Nombre");

        txtNombreP1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombreP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreP1ActionPerformed(evt);
            }
        });
        txtNombreP1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreP1KeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel3.setText("IDENTIFICACIÓN:");

        txtApellidoP1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtApellidoP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoP1ActionPerformed(evt);
            }
        });
        txtApellidoP1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoP1KeyTyped(evt);
            }
        });

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/id2.png"))); // NOI18N

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout pnlIdentScrollLayout = new javax.swing.GroupLayout(pnlIdentScroll);
        pnlIdentScroll.setLayout(pnlIdentScrollLayout);
        pnlIdentScrollLayout.setHorizontalGroup(
            pnlIdentScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIdentScrollLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlIdentScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(txtUsuarioP1)
                    .addComponent(Usuario)
                    .addComponent(jLabel4)
                    .addComponent(txtNombreP1)
                    .addComponent(txtApellidoP1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlIdentScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboDocumentoP1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addGroup(pnlIdentScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtTelefonoP1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtDocumentoP1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addGap(63, 63, 63))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlIdentScrollLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSiguienteP1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(pnlIdentScrollLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlIdentScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlIdentScrollLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnlIdentScrollLayout.setVerticalGroup(
            pnlIdentScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIdentScrollLayout.createSequentialGroup()
                .addGroup(pnlIdentScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlIdentScrollLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(pnlIdentScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usuario)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlIdentScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuarioP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboDocumentoP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(pnlIdentScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlIdentScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDocumentoP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(pnlIdentScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlIdentScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidoP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefonoP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(btnSiguienteP1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnlIdentScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlIdentScrollLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pnlCompraScroll.setBackground(new java.awt.Color(255, 255, 255));

        btnReiniciarP1.setBackground(new java.awt.Color(255, 255, 102));
        btnReiniciarP1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnReiniciarP1.setText("Reiniciar");
        btnReiniciarP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarP1ActionPerformed(evt);
            }
        });

        btnFinalizarP1.setBackground(new java.awt.Color(255, 51, 50));
        btnFinalizarP1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnFinalizarP1.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizarP1.setText("FINALIZAR");
        btnFinalizarP1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalizarP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFinalizarP1MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel14.setText("COMPRA:");

        txtPrendaP1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtCostoP1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnGenerarP1.setBackground(new java.awt.Color(153, 255, 153));
        btnGenerarP1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnGenerarP1.setText("Generar compra");
        btnGenerarP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenerarP1MouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Talla");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Ingresa el código del producto:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Prenda");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Costo xU");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Total a pagar");

        cbotallasP1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbotallasP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "S", "M", "L" }));
        cbotallasP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbotallasP1ActionPerformed(evt);
            }
        });

        txtCodeProductoP1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCodeProductoP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeProductoP1ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Cantidad");

        txtTotalP1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carrito2.png"))); // NOI18N

        btnBuscar.setBackground(new java.awt.Color(255, 204, 255));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBuscar.setText("Buscar");
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

        txtMarca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout pnlCompraScrollLayout = new javax.swing.GroupLayout(pnlCompraScroll);
        pnlCompraScroll.setLayout(pnlCompraScrollLayout);
        pnlCompraScrollLayout.setHorizontalGroup(
            pnlCompraScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCompraScrollLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCompraScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCompraScrollLayout.createSequentialGroup()
                        .addGroup(pnlCompraScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCompraScrollLayout.createSequentialGroup()
                                .addGroup(pnlCompraScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel16))
                                .addGap(18, 18, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCompraScrollLayout.createSequentialGroup()
                                .addGroup(pnlCompraScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCostoP1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlCompraScrollLayout.createSequentialGroup()
                                        .addComponent(txtPrendaP1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(32, 32, 32)))
                        .addGroup(pnlCompraScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCompraScrollLayout.createSequentialGroup()
                                .addGap(0, 35, Short.MAX_VALUE)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotalP1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnFinalizarP1))
                            .addGroup(pnlCompraScrollLayout.createSequentialGroup()
                                .addGroup(pnlCompraScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlCompraScrollLayout.createSequentialGroup()
                                        .addComponent(txtCodeProductoP1)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCompraScrollLayout.createSequentialGroup()
                                        .addGroup(pnlCompraScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlCompraScrollLayout.createSequentialGroup()
                                                .addComponent(cboCantidadP1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(49, 49, 49))
                                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                            .addGroup(pnlCompraScrollLayout.createSequentialGroup()
                                                .addComponent(cbotallasP1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(pnlCompraScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnReiniciarP1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnGenerarP1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(27, 27, 27))
                    .addGroup(pnlCompraScrollLayout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlCompraScrollLayout.setVerticalGroup(
            pnlCompraScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCompraScrollLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCompraScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCompraScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlCompraScrollLayout.createSequentialGroup()
                        .addGroup(pnlCompraScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtCodeProductoP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                        .addGap(34, 34, 34)
                        .addGroup(pnlCompraScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlCompraScrollLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlCompraScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPrendaP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCostoP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCompraScrollLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(71, 71, 71)
                                .addComponent(jLabel19)
                                .addGap(32, 32, 32))
                            .addGroup(pnlCompraScrollLayout.createSequentialGroup()
                                .addComponent(cbotallasP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90))
                            .addComponent(cboCantidadP1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlCompraScrollLayout.createSequentialGroup()
                        .addComponent(btnReiniciarP1)
                        .addGap(18, 18, 18)
                        .addComponent(btnGenerarP1)
                        .addGap(41, 41, 41)))
                .addGap(38, 38, 38)
                .addGroup(pnlCompraScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFinalizarP1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout scrollLayout = new javax.swing.GroupLayout(scroll);
        scroll.setLayout(scrollLayout);
        scrollLayout.setHorizontalGroup(
            scrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scrollLayout.createSequentialGroup()
                .addGroup(scrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(scrollLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(scrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlIdentScroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlEntregaScroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scrollLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlCompraScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addContainerGap())
        );
        scrollLayout.setVerticalGroup(
            scrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scrollLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(pnlIdentScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(pnlEntregaScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlCompraScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(scroll);

        javax.swing.GroupLayout bgRealizarLayout = new javax.swing.GroupLayout(bgRealizar);
        bgRealizar.setLayout(bgRealizarLayout);
        bgRealizarLayout.setHorizontalGroup(
            bgRealizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        bgRealizarLayout.setVerticalGroup(
            bgRealizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1296, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgRealizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgRealizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void scrollMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scrollMouseClicked
        numReinicio();
        correoReinicio();
        dptoReinicio();
    }//GEN-LAST:event_scrollMouseClicked

    private void btnGenerarP1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarP1MouseClicked
        if (!"".equals(txtPrendaP1.getText()) && !"".equals(txtCostoP1.getText()) && cbotallasP1.getSelectedIndex() != 0
                && (int) cboCantidadP1.getValue() != 0) {

            double costo = Double.parseDouble(txtCostoP1.getText());
            double cantidad = Double.parseDouble((String.valueOf(cboCantidadP1.getValue())));
            // se fuerza el OBJETO de cantidad a un STRING // luego este STRING se convierte en DECIMAL para operar

            double total = costo * cantidad;
            txtTotalP1.setText(String.valueOf(total));
        }
    }//GEN-LAST:event_btnGenerarP1MouseClicked

    private void btnFinalizarP1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinalizarP1MouseClicked
        if (!"".equals(txtPrendaP1.getText()) && !"".equals(txtCostoP1.getText()) && cbotallasP1.getSelectedIndex() != 0
                && (int) cboCantidadP1.getValue() != 0 && !"".equals(txtTotalP1.getText())) {
            bloquearCompra();
            obtenerDatos();

            JOptionPane.showMessageDialog(null, "Solicitud de compra generada!\n\nPrenda: " + Datos.getTipo()
                    + "\nTalla: " + Datos.getTalla() + "\nCosto: " + Datos.getPrecio()
                    + "\nCantidad: " + Datos.getCantidad() + "\n\nTotal a pagar: " + Datos.getTotalPagar());

            //////////////////////////////////////////////////////////////////////////////////////////////////////////////
            //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            String sSQL1 = "INSERT INTO detalles_compra(Tipo, Marca, Talla, Precio, Cantidad) "
                    + "VALUES ('" + Datos.getTipo() + "', '" + Datos.getMarca() + "', '" + Datos.getTalla()
                    + "', '" + String.valueOf(Datos.getPrecio()) + "', '" + String.valueOf(Datos.getCantidad()) + "')";

            String idDetallesCompra = null;
            try {
                ps = (mysql.conectarSQL()).prepareStatement(sSQL1);
                int n = ps.executeUpdate();
                if (n > 0) {
                    System.out.println("Tabla detalles_compra actualizada");
                    // para no usar un registro no creado
                    String sSQL2 = "SELECT idDetalles_Compra FROM detalles_compra ORDER by idDetalles_Compra DESC LIMIT 1";

                    try {
                        ps = (mysql.conectarSQL()).prepareStatement(sSQL2);
                        rs = ps.executeQuery();

                        while (rs.next()) {
                            idDetallesCompra = rs.getString("idDetalles_Compra");
                        }
                        System.out.println("idDetalles_Compra encontrada");

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error sSQL2: " + e.toString());
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error sSQL1: " + e.toString());
            }
            //////////////////////////////////////////////////////////////////////////////////////////////////////////////
            //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            String sSQL4 = "UPDATE detalles_cliente SET idDetalles_cliente = '" + Datos.getIdCuentaCliente()
                    + "', Nombres = '" + Datos.getNombre() + "', Apellidos = '" + Datos.getApellido()
                    + "', Documento = '" + Datos.getDocumento() + "', Telefono = '"
                    + String.valueOf(Datos.getTelefono()) + "', Direccion = '" + Datos.getDireccion()
                    + "' WHERE idDetalles_cliente = " + Datos.getIdCuentaCliente();

            try {
                ps = (mysql.conectarSQL()).prepareStatement(sSQL4);
                int n = ps.executeUpdate();
                if (n > 0) {
                    System.out.println("detalles_cliente ACTUALIZADA");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error sSQL4: " + e.toString());
            }

            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            String sSQL5 = "INSERT INTO solicitud_compra(idDetalles_Compra, idCuenta_Cliente, Total, Estado) "
                    + "VALUES ('" + idDetallesCompra + "', '" + Datos.getIdCuentaCliente() + "', '" + String.valueOf(Datos.getTotalPagar())
                    + "', 'Pendiente')";

            try {
                ps = (mysql.conectarSQL()).prepareStatement(sSQL5);
                int n = ps.executeUpdate();
                if (n > 0) {
                    JOptionPane.showMessageDialog(null, "¡Datos actualizados en la BD!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error sSQL5: " + e.toString());
            }

            PrincipalCliente salir = new PrincipalCliente();
            salir.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnFinalizarP1MouseClicked

    private void btnReiniciarP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarP1ActionPerformed
        this.cbotallasP1.setSelectedIndex(0);
        this.txtPrendaP1.setText("");
        this.txtCostoP1.setText("");
        this.cboCantidadP1.setToolTipText("0");
        this.txtTotalP1.setText("");
        this.txtCodeProductoP1.setText("");
    }//GEN-LAST:event_btnReiniciarP1ActionPerformed

    private void txtApellidoP1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoP1KeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' && c < 'A') || (c > 'z' && c > 'Z')) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtApellidoP1KeyTyped

    private void txtApellidoP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoP1ActionPerformed

    private void txtNombreP1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreP1KeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' && c < 'A') || (c > 'z' && c > 'Z')) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtNombreP1KeyTyped

    private void txtNombreP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreP1ActionPerformed

    private void txtTelefonoP1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoP1KeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }

        if (txtTelefonoP1.getText().length() >= 9) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtTelefonoP1KeyTyped

    private void txtTelefonoP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoP1ActionPerformed

    private void txtDocumentoP1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDocumentoP1KeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }

        int limite = 8; // limites para DNI, PASAPORTE Y CARNE EXTRANJERO
        switch (cboDocumentoP1.getSelectedIndex()) {
            case 0 ->
                limite = 8;
            case 1 ->
                limite = 12;
            case 2 ->
                limite = 12;
        }
        if (txtDocumentoP1.getText().length() >= limite) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtDocumentoP1KeyTyped

    private void txtDocumentoP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoP1ActionPerformed

    private void btnSiguienteP1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguienteP1MouseClicked
        //para que el usuario no deje en blanco
        boolean nombre = false, apellido = false, doc = false, tel = false;

        if (!"".equals(txtNombreP1.getText())) {
            nombre = true;
        }
        if (!"".equals(txtApellidoP1.getText())) {
            apellido = true;
        }
        if (txtDocumentoP1.getText().length() >= 8) {
            doc = true;
        }
        if (txtTelefonoP1.getText().length() == 9) {
            tel = true;
        }
        if (nombre == true && apellido == true && doc == true && tel == true) {
            desbloquearEntrega();
            bloquearIndent();
        }
    }//GEN-LAST:event_btnSiguienteP1MouseClicked

    private void txtUsuarioP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioP1ActionPerformed

    private void txtUsuarioP1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioP1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioP1MouseReleased

    private void txtUsuarioP1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioP1MousePressed
        numReinicio();
        dptoReinicio();
    }//GEN-LAST:event_txtUsuarioP1MousePressed

    private void btnSiguiente2rP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguiente2rP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSiguiente2rP1ActionPerformed

    private void btnSiguiente2rP1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguiente2rP1MouseClicked
        if (cboDistritoP1.getSelectedIndex() != 0 && !"".equals(txtDirecP1.getText())
                && !"".equals(txtNumP1.getText()) && !"Ej. 152".equals(txtNumP1.getText())) {
            bloquearEntrega();
            desbloquearCompra();
        }
    }//GEN-LAST:event_btnSiguiente2rP1MouseClicked

    private void txtNumP1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNumP1MousePressed
        if (txtNumP1.getText().equals("Ej. 152")) {
            txtNumP1.setText("");
            txtNumP1.setForeground(Color.black);
        }
        correoReinicio();
        dptoReinicio();
    }//GEN-LAST:event_txtNumP1MousePressed

    private void txtNumP1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNumP1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumP1MouseExited

    private void txtDirecP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDirecP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDirecP1ActionPerformed

    private void txtDptoP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDptoP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDptoP1ActionPerformed

    private void txtDptoP1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDptoP1MousePressed
        if (txtDptoP1.getText().equals("Ej. 24")) {
            txtDptoP1.setText("");
            txtDptoP1.setForeground(Color.black);
        }
        correoReinicio();
        numReinicio();
    }//GEN-LAST:event_txtDptoP1MousePressed

    private void cbotallasP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotallasP1ActionPerformed

    }//GEN-LAST:event_cbotallasP1ActionPerformed

    private void txtCodeProductoP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeProductoP1ActionPerformed

    }//GEN-LAST:event_txtCodeProductoP1ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        String codigo = txtCodeProductoP1.getText();
        if (!"".equals(codigo)) {
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
                }

                txtPrendaP1.setText(registros[1]);
                txtMarca.setText(registros[2]);
                txtCostoP1.setText(registros[4]);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al filtrar los productos de la BD: " + e.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se inserto un ID");
        }
    }//GEN-LAST:event_btnBuscarMouseClicked

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
            java.util.logging.Logger.getLogger(page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new page1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Usuario;
    private javax.swing.JPanel bgRealizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnFinalizarP1;
    private javax.swing.JButton btnGenerarP1;
    private javax.swing.JButton btnReiniciarP1;
    private javax.swing.JButton btnSiguiente2rP1;
    private javax.swing.JButton btnSiguienteP1;
    private javax.swing.JSpinner cboCantidadP1;
    private javax.swing.JComboBox<String> cboDistritoP1;
    private javax.swing.JComboBox<String> cboDocumentoP1;
    private javax.swing.JComboBox<String> cbotallasP1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel pnlCompraScroll;
    private javax.swing.JPanel pnlEntregaScroll;
    private javax.swing.JPanel pnlIdentScroll;
    private javax.swing.JPanel scroll;
    private javax.swing.JTextField txtApellidoP1;
    private javax.swing.JTextField txtCodeProductoP1;
    private javax.swing.JTextField txtCostoP1;
    private javax.swing.JTextField txtDirecP1;
    private javax.swing.JTextField txtDocumentoP1;
    private javax.swing.JTextField txtDptoP1;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombreP1;
    private javax.swing.JTextField txtNumP1;
    private javax.swing.JTextField txtPrendaP1;
    private javax.swing.JTextField txtTelefonoP1;
    private javax.swing.JTextField txtTotalP1;
    private javax.swing.JTextField txtUsuarioP1;
    // End of variables declaration//GEN-END:variables
}
