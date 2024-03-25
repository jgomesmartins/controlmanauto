package GUI;

import Entidade.Veiculo;
import Entidade.VeiculoException;
import Fachada.FacVeiculo;
import java.awt.Color;
import java.awt.Component;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class JPVeiculo extends javax.swing.JPanel {

    private Fachada.FacVeiculo facveiulo = null;

    public JPVeiculo() {
        initComponents();

        this.facveiulo = new FacVeiculo();
        JTextDataCompra.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        this.jlQtdeRegistroTable.setVisible(false);
        this.JPIDAlterar.setVisible(false);
        this.JLIDValor.setVisible(false);
        this.JLIDValor.setText("");
        
        
        
        JTableHeader header = jTableVeiculo.getTableHeader();
        header.setForeground(new Color(0, 102, 153));
        header.setFont((new java.awt.Font("Century Gothic", 0, 12)));
             
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTipo = new javax.swing.ButtonGroup();
        jMenuSuspenso = new javax.swing.JPopupMenu();
        jMenuItemEditar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemExcluir = new javax.swing.JMenuItem();
        JLHome = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JLCadastro = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTabbedPaneVeiculo = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        JBCadAutomovelProcurar = new javax.swing.JButton();
        JTextProprietarioFiltro = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        JTextPlacaFiltro = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        JBCadAutomovelImprimir = new javax.swing.JButton();
        jScrollPaneVeiculo = new javax.swing.JScrollPane();
        jTableVeiculo = new jTableCustom();
        jlQtdeRegistroTable = new javax.swing.JLabel();
        JPIncluir = new javax.swing.JPanel();
        JPTipo = new javax.swing.JPanel();
        jRadioButtonCarro = new javax.swing.JRadioButton();
        jRadioButtonMoto = new javax.swing.JRadioButton();
        jRadioButtonOutros = new javax.swing.JRadioButton();
        JPAno = new javax.swing.JPanel();
        JTextAnoFabricacao = new javax.swing.JTextField();
        JTextAnoModelo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        JTextModelo = new javax.swing.JTextField();
        JTextFabricante = new javax.swing.JTextField();
        JTextCor = new javax.swing.JTextField();
        JTextKMInicial = new javax.swing.JTextField();
        JTextDataCompra = new javax.swing.JFormattedTextField();
        JTextPlaca = new javax.swing.JTextField();
        jComboBoxCombustivel = new javax.swing.JComboBox<>();
        JTextProprietario = new javax.swing.JTextField();
        JPAcao = new javax.swing.JPanel();
        JBCadAutomovelCancelar = new javax.swing.JButton();
        JBCadAutomovelSalvar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        JPIDAlterar = new javax.swing.JPanel();
        JLIDValor = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jMenuItemEditar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jMenuItemEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-editar-propriedade-18.png"))); // NOI18N
        jMenuItemEditar.setText("EDITAR");
        jMenuItemEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEditarActionPerformed(evt);
            }
        });
        jMenuSuspenso.add(jMenuItemEditar);
        jMenuSuspenso.add(jSeparator1);

        jMenuItemExcluir.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jMenuItemExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-apagar-para-sempre-18 (1).png"))); // NOI18N
        jMenuItemExcluir.setText("EXCLUIR");
        jMenuItemExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExcluirActionPerformed(evt);
            }
        });
        jMenuSuspenso.add(jMenuItemExcluir);

        JLHome.setBackground(new java.awt.Color(255, 255, 255));
        JLHome.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        JLHome.setForeground(new java.awt.Color(0, 102, 153));
        JLHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-casa-14.png"))); // NOI18N
        JLHome.setText("Home");
        JLHome.setToolTipText("");
        JLHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JLHome.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        JLHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLHomeMouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText(">");
        jLabel5.setToolTipText("");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JLCadastro.setBackground(new java.awt.Color(255, 255, 255));
        JLCadastro.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        JLCadastro.setForeground(new java.awt.Color(0, 102, 153));
        JLCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLCadastro.setText("Cadastro");
        JLCadastro.setToolTipText("");
        JLCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JLCadastro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JLCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JLCadastroMousePressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("___________________________________________________________________________________________________________________________________________________________");
        jLabel4.setToolTipText("");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Manutenção no cadastro de veículo");
        jLabel6.setToolTipText("");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText(">");
        jLabel8.setToolTipText("");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTabbedPaneVeiculo.setForeground(new java.awt.Color(0, 102, 153));
        jTabbedPaneVeiculo.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPaneVeiculo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTabbedPaneVeiculo.setName("TableVeiculo"); // NOI18N

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14), new java.awt.Color(0, 102, 153))); // NOI18N

        JBCadAutomovelProcurar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JBCadAutomovelProcurar.setForeground(new java.awt.Color(0, 102, 153));
        JBCadAutomovelProcurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-pesquisa-google-na-web-40.png"))); // NOI18N
        JBCadAutomovelProcurar.setToolTipText("Procurar.");
        JBCadAutomovelProcurar.setBorderPainted(false);
        JBCadAutomovelProcurar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBCadAutomovelProcurar.setFocusPainted(false);
        JBCadAutomovelProcurar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBCadAutomovelProcurar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBCadAutomovelProcurarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBCadAutomovelProcurarMouseExited(evt);
            }
        });
        JBCadAutomovelProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadAutomovelProcurarActionPerformed(evt);
            }
        });

        JTextProprietarioFiltro.setDocument(new JTextFieldLimit(50));
        JTextProprietarioFiltro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JTextProprietarioFiltro.setForeground(new java.awt.Color(0, 102, 153));
        JTextProprietarioFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTextProprietarioFiltroKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextProprietarioFiltroKeyTyped(evt);
            }
        });

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 102, 153));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Proprietário");
        jLabel23.setToolTipText("");
        jLabel23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JTextPlacaFiltro.setDocument(new JTextFieldLimit(7));
        JTextPlacaFiltro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JTextPlacaFiltro.setForeground(new java.awt.Color(0, 102, 153));
        JTextPlacaFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTextPlacaFiltroKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextPlacaFiltroKeyTyped(evt);
            }
        });

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 102, 153));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("Placa");
        jLabel24.setToolTipText("");
        jLabel24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JBCadAutomovelImprimir.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JBCadAutomovelImprimir.setForeground(new java.awt.Color(0, 102, 153));
        JBCadAutomovelImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-enviar-para-a-impressora-40.png"))); // NOI18N
        JBCadAutomovelImprimir.setToolTipText("Gerar relatório.");
        JBCadAutomovelImprimir.setBorderPainted(false);
        JBCadAutomovelImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBCadAutomovelImprimir.setEnabled(false);
        JBCadAutomovelImprimir.setFocusPainted(false);
        JBCadAutomovelImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBCadAutomovelImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBCadAutomovelImprimirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBCadAutomovelImprimirMouseExited(evt);
            }
        });
        JBCadAutomovelImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadAutomovelImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextPlacaFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextProprietarioFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(200, 200, 200)
                .addComponent(JBCadAutomovelImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBCadAutomovelProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBCadAutomovelProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(JTextPlacaFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(JTextProprietarioFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JBCadAutomovelImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jScrollPaneVeiculo.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPaneVeiculo.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jScrollPaneVeiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jScrollPaneVeiculoMousePressed(evt);
            }
        });

        jTableVeiculo.setAutoCreateRowSorter(true);
        jTableVeiculo.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jTableVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PROPRIETÁRIO", "FABRICANTE", "MODELO", "COR", "PLACA", "TIPO", "ANO MODELO", "ANO FABRICAÇÃO", "KM INICIAL", "DT. COMPRA", "COMBUSTÍVEL", "DT. CADASTRO", "DT. ATUALIZAÇÃO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableVeiculo.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTableVeiculo.setAutoscrolls(false);
        jTableVeiculo.setName(""); // NOI18N
        jTableVeiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableVeiculoMousePressed(evt);
            }
        });
        jScrollPaneVeiculo.setViewportView(jTableVeiculo);
        if (jTableVeiculo.getColumnModel().getColumnCount() > 0) {
            jTableVeiculo.getColumnModel().getColumn(0).setResizable(false);
            jTableVeiculo.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTableVeiculo.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTableVeiculo.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTableVeiculo.getColumnModel().getColumn(3).setPreferredWidth(150);
            jTableVeiculo.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTableVeiculo.getColumnModel().getColumn(5).setPreferredWidth(100);
            jTableVeiculo.getColumnModel().getColumn(7).setPreferredWidth(100);
            jTableVeiculo.getColumnModel().getColumn(8).setPreferredWidth(100);
            jTableVeiculo.getColumnModel().getColumn(9).setPreferredWidth(100);
            jTableVeiculo.getColumnModel().getColumn(10).setPreferredWidth(100);
            jTableVeiculo.getColumnModel().getColumn(11).setPreferredWidth(150);
            jTableVeiculo.getColumnModel().getColumn(12).setPreferredWidth(100);
            jTableVeiculo.getColumnModel().getColumn(13).setPreferredWidth(120);
        }

        jlQtdeRegistroTable.setBackground(new java.awt.Color(255, 255, 255));
        jlQtdeRegistroTable.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jlQtdeRegistroTable.setForeground(new java.awt.Color(0, 102, 153));
        jlQtdeRegistroTable.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlQtdeRegistroTable.setText("jlQtdeRegistroTable");
        jlQtdeRegistroTable.setToolTipText("");
        jlQtdeRegistroTable.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPaneVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlQtdeRegistroTable, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPaneVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlQtdeRegistroTable, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPaneVeiculo.addTab("CONSULTAR", new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-lista-de-verificação-18.png")), jPanel2); // NOI18N

        JPTipo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 15), new java.awt.Color(0, 102, 153))); // NOI18N

        buttonGroupTipo.add(jRadioButtonCarro);
        jRadioButtonCarro.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jRadioButtonCarro.setForeground(new java.awt.Color(0, 102, 153));
        jRadioButtonCarro.setText("Carro");
        jRadioButtonCarro.setActionCommand("0");

        buttonGroupTipo.add(jRadioButtonMoto);
        jRadioButtonMoto.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jRadioButtonMoto.setForeground(new java.awt.Color(0, 102, 153));
        jRadioButtonMoto.setText("Moto");
        jRadioButtonMoto.setActionCommand("1");
        jRadioButtonMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMotoActionPerformed(evt);
            }
        });

        buttonGroupTipo.add(jRadioButtonOutros);
        jRadioButtonOutros.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jRadioButtonOutros.setForeground(new java.awt.Color(0, 102, 153));
        jRadioButtonOutros.setText("Outros");
        jRadioButtonOutros.setActionCommand("2");

        javax.swing.GroupLayout JPTipoLayout = new javax.swing.GroupLayout(JPTipo);
        JPTipo.setLayout(JPTipoLayout);
        JPTipoLayout.setHorizontalGroup(
            JPTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPTipoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jRadioButtonCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jRadioButtonMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jRadioButtonOutros, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JPTipoLayout.setVerticalGroup(
            JPTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPTipoLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(JPTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonOutros, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        JPAno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ano*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 15), new java.awt.Color(0, 102, 153))); // NOI18N
        JPAno.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        JTextAnoFabricacao.setDocument(new JTextFieldLimit(4));
        JTextAnoFabricacao.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JTextAnoFabricacao.setForeground(new java.awt.Color(0, 102, 153));
        JTextAnoFabricacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTextAnoFabricacaoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextAnoFabricacaoKeyTyped(evt);
            }
        });

        JTextAnoModelo.setDocument(new JTextFieldLimit(4));
        JTextAnoModelo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JTextAnoModelo.setForeground(new java.awt.Color(0, 102, 153));
        JTextAnoModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextAnoModeloKeyTyped(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 153));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Modelo:");
        jLabel14.setToolTipText("");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 153));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Fabricação:");
        jLabel15.setToolTipText("");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout JPAnoLayout = new javax.swing.GroupLayout(JPAno);
        JPAno.setLayout(JPAnoLayout);
        JPAnoLayout.setHorizontalGroup(
            JPAnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPAnoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(JPAnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPAnoLayout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPAnoLayout.createSequentialGroup()
                        .addComponent(JTextAnoFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(JTextAnoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        JPAnoLayout.setVerticalGroup(
            JPAnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPAnoLayout.createSequentialGroup()
                .addGroup(JPAnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPAnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTextAnoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextAnoFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        JTextModelo.setDocument(new JTextFieldLimit(50));
        JTextModelo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JTextModelo.setForeground(new java.awt.Color(0, 102, 153));

        JTextFabricante.setDocument(new JTextFieldLimit(50));
        JTextFabricante.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JTextFabricante.setForeground(new java.awt.Color(0, 102, 153));

        JTextCor.setDocument(new JTextFieldLimit(50));
        JTextCor.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JTextCor.setForeground(new java.awt.Color(0, 102, 153));
        JTextCor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTextCorFocusLost(evt);
            }
        });

        JTextKMInicial.setDocument(new JTextFieldLimit(10));
        JTextKMInicial.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JTextKMInicial.setForeground(new java.awt.Color(0, 102, 153));
        JTextKMInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextKMInicialKeyTyped(evt);
            }
        });

        JTextDataCompra.setForeground(new java.awt.Color(0, 102, 153));
        try {
            JTextDataCompra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JTextDataCompra.setToolTipText("");
        JTextDataCompra.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        JTextPlaca.setDocument(new JTextFieldLimit(7));
        JTextPlaca.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JTextPlaca.setForeground(new java.awt.Color(0, 102, 153));
        JTextPlaca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JTextPlacaMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JTextPlacaMouseReleased(evt);
            }
        });

        jComboBoxCombustivel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jComboBoxCombustivel.setForeground(new java.awt.Color(0, 102, 153));
        jComboBoxCombustivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Selecione --", "Gasolina", "Etanol", "Diesel", "Flex(Etanol/Gasolina)" }));

        JTextProprietario.setDocument(new JTextFieldLimit(50));
        JTextProprietario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JTextProprietario.setForeground(new java.awt.Color(0, 102, 153));

        JPAcao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14), new java.awt.Color(0, 102, 153))); // NOI18N
        JPAcao.setLayout(null);

        JBCadAutomovelCancelar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JBCadAutomovelCancelar.setForeground(new java.awt.Color(0, 102, 153));
        JBCadAutomovelCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-cancelar-30.png"))); // NOI18N
        JBCadAutomovelCancelar.setText("Cancelar");
        JBCadAutomovelCancelar.setToolTipText("Limpa os campos a cancela operação.");
        JBCadAutomovelCancelar.setBorderPainted(false);
        JBCadAutomovelCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBCadAutomovelCancelar.setFocusPainted(false);
        JBCadAutomovelCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBCadAutomovelCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBCadAutomovelCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBCadAutomovelCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBCadAutomovelCancelarMouseExited(evt);
            }
        });
        JBCadAutomovelCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadAutomovelCancelarActionPerformed(evt);
            }
        });
        JPAcao.add(JBCadAutomovelCancelar);
        JBCadAutomovelCancelar.setBounds(10, 30, 100, 80);

        JBCadAutomovelSalvar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JBCadAutomovelSalvar.setForeground(new java.awt.Color(0, 102, 153));
        JBCadAutomovelSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-guardar-todos-30.png"))); // NOI18N
        JBCadAutomovelSalvar.setText("Salvar");
        JBCadAutomovelSalvar.setToolTipText("Salvar as informações.");
        JBCadAutomovelSalvar.setBorderPainted(false);
        JBCadAutomovelSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBCadAutomovelSalvar.setFocusPainted(false);
        JBCadAutomovelSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBCadAutomovelSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBCadAutomovelSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBCadAutomovelSalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBCadAutomovelSalvarMouseExited(evt);
            }
        });
        JBCadAutomovelSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadAutomovelSalvarActionPerformed(evt);
            }
        });
        JPAcao.add(JBCadAutomovelSalvar);
        JBCadAutomovelSalvar.setBounds(10, 110, 100, 80);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 153));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Fabricante*");
        jLabel13.setToolTipText("");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 153));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Cor");
        jLabel16.setToolTipText("");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 153));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("KM Inicial*");
        jLabel17.setToolTipText("");
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 102, 153));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Data Inicial*");
        jLabel18.setToolTipText("");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 102, 153));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Placa*");
        jLabel19.setToolTipText("");
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("* Campos com preenchimento obrigatório.");
        jLabel20.setToolTipText("");
        jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 102, 153));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("* Propretário");
        jLabel21.setToolTipText("");
        jLabel21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 102, 153));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Combustível");
        jLabel22.setToolTipText("");
        jLabel22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Modelo*");
        jLabel12.setToolTipText("");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JPIDAlterar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 15), new java.awt.Color(0, 102, 153))); // NOI18N

        JLIDValor.setBackground(new java.awt.Color(255, 255, 255));
        JLIDValor.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        JLIDValor.setForeground(new java.awt.Color(0, 102, 153));
        JLIDValor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLIDValor.setToolTipText("");
        JLIDValor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout JPIDAlterarLayout = new javax.swing.GroupLayout(JPIDAlterar);
        JPIDAlterar.setLayout(JPIDAlterarLayout);
        JPIDAlterarLayout.setHorizontalGroup(
            JPIDAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPIDAlterarLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(JLIDValor, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        JPIDAlterarLayout.setVerticalGroup(
            JPIDAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPIDAlterarLayout.createSequentialGroup()
                .addComponent(JLIDValor, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JPIncluirLayout = new javax.swing.GroupLayout(JPIncluir);
        JPIncluir.setLayout(JPIncluirLayout);
        JPIncluirLayout.setHorizontalGroup(
            JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPIncluirLayout.createSequentialGroup()
                .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPIncluirLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(JPTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(JPIDAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JPAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPIncluirLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPIncluirLayout.createSequentialGroup()
                                .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTextModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTextFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTextCor, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTextKMInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTextDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTextPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(JPIncluirLayout.createSequentialGroup()
                                .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTextProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(JPAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        JPIncluirLayout.setVerticalGroup(
            JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPIncluirLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JPTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPAno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPIDAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPIncluirLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(JPAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPIncluirLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTextModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTextFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTextCor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTextKMInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTextDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTextPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTextProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        JTextFabricante.getAccessibleContext().setAccessibleName("");
        JTextFabricante.getAccessibleContext().setAccessibleDescription("");

        jTabbedPaneVeiculo.addTab("INCLUIR/ALTERAR", new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-adicionar-linha-18.png")), JPIncluir); // NOI18N

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 153));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Veículo");
        jLabel10.setToolTipText("");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(JLHome, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(JLCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTabbedPaneVeiculo)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLHome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPaneVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JLHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLHomeMouseClicked
        JFPrincipal.setPanelMain(new JPHome());
    }//GEN-LAST:event_JLHomeMouseClicked

    private void JLCadastroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLCadastroMousePressed
        JFPrincipal.setPanelMain(new JPCadastro());
    }//GEN-LAST:event_JLCadastroMousePressed

    private void jRadioButtonMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMotoActionPerformed

    private void JBCadAutomovelCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCadAutomovelCancelarMouseEntered
        this.JBCadAutomovelCancelar.setBackground(new Color(169, 169, 169));
    }//GEN-LAST:event_JBCadAutomovelCancelarMouseEntered

    private void JBCadAutomovelCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCadAutomovelCancelarMouseExited
        this.JBCadAutomovelCancelar.setBackground(this.getBackground());
    }//GEN-LAST:event_JBCadAutomovelCancelarMouseExited

    private void JBCadAutomovelCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadAutomovelCancelarActionPerformed
        this.LimpaCampos();

    }//GEN-LAST:event_JBCadAutomovelCancelarActionPerformed

    private void LimpaCampos() {

        for (Component c : JPIncluir.getComponents()) {

            if (c instanceof JTextField) {
                ((JTextField) c).setText("");
            }
        }

        for (Component c : JPAno.getComponents()) {

            if (c instanceof JTextField) {
                ((JTextField) c).setText("");
            }
        }

        buttonGroupTipo.clearSelection();

        jComboBoxCombustivel.setSelectedIndex(0);

        this.jRadioButtonCarro.setEnabled(true);
        this.jRadioButtonMoto.setEnabled(true);
        this.jRadioButtonOutros.setEnabled(true);

        this.JTextAnoModelo.setEnabled(true);
        this.JTextAnoFabricacao.setEnabled(true);

        this.JTextFabricante.setEnabled(true);
        this.JTextModelo.setEnabled(true);
        this.JTextKMInicial.setEnabled(true);
        this.JTextDataCompra.setEnabled(true);
        
        this.JPIDAlterar.setVisible(false);
        this.JLIDValor.setVisible(false);
        this.JLIDValor.setText("");
              

    }

    private void JBCadAutomovelSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCadAutomovelSalvarMouseEntered
        this.JBCadAutomovelSalvar.setBackground(new Color(169, 169, 169));
    }//GEN-LAST:event_JBCadAutomovelSalvarMouseEntered

    private void JBCadAutomovelSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCadAutomovelSalvarMouseExited
        this.JBCadAutomovelSalvar.setBackground(this.getBackground());
    }//GEN-LAST:event_JBCadAutomovelSalvarMouseExited

    private void JBCadAutomovelSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadAutomovelSalvarActionPerformed

        try {
           
                this.ValidaCampos();

                Veiculo v = new Veiculo();
                v.setTipo(Integer.parseInt(this.buttonGroupTipo.getSelection().getActionCommand()));
                v.setAnoFabricacao(Integer.parseInt(this.JTextAnoFabricacao.getText().trim()));
                v.setAnoModelo(Integer.parseInt(this.JTextAnoModelo.getText().trim()));
                v.setModelo(this.JTextModelo.getText().trim());
                v.setFabricante(this.JTextFabricante.getText().trim());
                v.setCor(this.JTextCor.getText().trim());
                v.setKmInicial(Integer.parseInt(this.JTextKMInicial.getText().trim()));
                v.setDataCompra(this.JTextDataCompra.getText().trim());
                v.setPlaca(this.JTextPlaca.getText().trim());
                v.setProprietario(this.JTextProprietario.getText().trim());
                v.setCombustivel(this.jComboBoxCombustivel.getSelectedIndex());
                
            if (JLIDValor.getText().equals("")) {
               
                this.SalvarVeiculo(v);
                JOptionPane.showMessageDialog(this, "Veículo cadastrado com  sucesso!.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                this.LimpaCampos();

            } else {
                
                v.setID(Integer.parseInt(this.JLIDValor.getText()));
                this.AtualizarVeiculo(v);
                JOptionPane.showMessageDialog(this, "Veículo atualizado com  sucesso!.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                this.LimpaCampos();

            }

        } catch (VeiculoException ve) {
            JOptionPane.showMessageDialog(null, ve.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
           
        }

    }//GEN-LAST:event_JBCadAutomovelSalvarActionPerformed

    private void SalvarVeiculo(Veiculo veiculo) throws Exception, VeiculoException {

        try {
            int ret = this.facveiulo.Adicionar(veiculo);

        } catch (VeiculoException ve) {
            throw new VeiculoException(ve.getMessage());

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    private void ValidaCampos() throws VeiculoException {

        if (!(jRadioButtonMoto.isSelected() || jRadioButtonCarro.isSelected() || jRadioButtonOutros.isSelected())) {
            throw new VeiculoException("Selecione o tipo.");
        }

        if (this.JTextAnoFabricacao.getText().trim().equals("")) {
            this.JTextAnoFabricacao.requestFocus(true);
            throw new VeiculoException("Informe o ano de fabricação.");
        }

        if (this.JTextAnoModelo.getText().trim().equals("")) {
            this.JTextAnoModelo.requestFocus(true);
            throw new VeiculoException("Informe o ano do modelo.");
        }

        if (this.JTextModelo.getText().trim().equals("")) {
            this.JTextModelo.requestFocus(true);
            throw new VeiculoException("Informe o modelo.");
        }

        if (this.JTextFabricante.getText().trim().equals("")) {
            this.JTextFabricante.requestFocus(true);
            throw new VeiculoException("Informe o fabricante.");
        }

        if (this.JTextKMInicial.getText().trim().equals("")) {
            this.JTextKMInicial.requestFocus(true);
            throw new VeiculoException("Informe a quilometragem inicial.");
        }

        if (this.JTextDataCompra.getText().replace("/", "").trim().equals("")) {
            this.JTextDataCompra.requestFocus(true);
            throw new VeiculoException("Informe data da compra.");
        }

        if (this.JTextPlaca.getText().trim().equals("")) {
            this.JTextPlaca.requestFocus(true);
            throw new VeiculoException("Informe a placa.");
        }

        if (this.JTextProprietario.getText().trim().equals("")) {
            this.JTextProprietario.requestFocus(true);
            throw new VeiculoException("Informe o nome do proprietário.");
        }

    }


    private void JBCadAutomovelProcurarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCadAutomovelProcurarMouseEntered
        this.JBCadAutomovelProcurar.setBackground(new Color(169, 169, 169));
    }//GEN-LAST:event_JBCadAutomovelProcurarMouseEntered

    private void JBCadAutomovelProcurarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCadAutomovelProcurarMouseExited
        this.JBCadAutomovelProcurar.setBackground(this.getBackground());
    }//GEN-LAST:event_JBCadAutomovelProcurarMouseExited

    private void JBCadAutomovelProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadAutomovelProcurarActionPerformed
        try {

            this.carregaTableVeiculo();

            if (this.jTableVeiculo.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "A consulta não retornou resultado.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                this.JBCadAutomovelImprimir.setEnabled(false);
            }else{
                this.JBCadAutomovelImprimir.setEnabled(true);
            }


        } catch (VeiculoException ve) {
            JOptionPane.showMessageDialog(null, ve.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBCadAutomovelProcurarActionPerformed

    private void carregaTableVeiculo() throws Exception, VeiculoException {

        Veiculo v = new Veiculo();
        v.setPlaca(this.JTextPlacaFiltro.getText().trim());
        v.setProprietario(this.JTextProprietarioFiltro.getText());
        List<Veiculo> list = this.facveiulo.Consultar(v);
        DefaultTableModel dt = (DefaultTableModel) this.jTableVeiculo.getModel();


        while (this.jTableVeiculo.getModel().getRowCount() > 0) {
            dt = (DefaultTableModel) this.jTableVeiculo.getModel();
            dt.removeRow(0);
        }

        for (Veiculo ve : list) {

            String tipo = null;
            switch (ve.getTipo()) {
                case 0:
                    tipo = "Carro";
                    break;
                case 1:
                    tipo = "Moto";
                    break;
                case 2:
                    tipo = "Outros";
                    break;
                default:
                    break;
            }

            String comb = null;
            switch (ve.getCombustivel()) {
                case 1:
                    comb = "Gasolina";
                    break;
                case 2:
                    comb = "Etanol";
                    break;
                case 3:
                    comb = "Diesel";
                    break;
                case 4:
                    comb = "Flex(Etanol/Gasolina)";
                    break;
                default:
                    break;
            }

            DecimalFormat df = new DecimalFormat("#,###,###");
            String kminicial = df.format(ve.getKmInicial());

            SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
            String dtAdd = fmt.format(ve.getDataAdd());
            String dtUpd = "";

            if (ve.getDataUpd() != null) {
                dtUpd = fmt.format(ve.getDataUpd());
            }

            Object[] row = {ve.getID(), ve.getProprietario(),
                ve.getFabricante(), ve.getModelo(),
                ve.getCor(), ve.getPlaca(), tipo,
                ve.getAnoModelo(), ve.getAnoFabricacao(),
                kminicial, ve.getDataCompra(),
                comb, dtAdd, dtUpd};
            dt.addRow(row);
        }

        this.jlQtdeRegistroTable.setVisible(true);
        this.jlQtdeRegistroTable.setText("Quantidade de registro encontrado: " + dt.getRowCount());
        
        jTableCustom jtc = new jTableCustom();
        jtc = (jTableCustom) this.jTableVeiculo;
        jtc.ColorRow(jTableVeiculo, new String[]{"D","E","E","E","E","E","E","C","C","D","C","E","C","C"});

    }

    private void JTextAnoFabricacaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextAnoFabricacaoKeyPressed


    }//GEN-LAST:event_JTextAnoFabricacaoKeyPressed

    private void JTextAnoFabricacaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextAnoFabricacaoKeyTyped

        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }


    }//GEN-LAST:event_JTextAnoFabricacaoKeyTyped

    private void JTextAnoModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextAnoModeloKeyTyped
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }

    }//GEN-LAST:event_JTextAnoModeloKeyTyped

    private void JTextKMInicialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextKMInicialKeyTyped
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }

    }//GEN-LAST:event_JTextKMInicialKeyTyped

    private void JTextProprietarioFiltroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextProprietarioFiltroKeyPressed

        this.JBCadAutomovelImprimir.setEnabled(false);
        
        if (evt.getKeyCode() == 10) {

            try {

                this.carregaTableVeiculo();
                
                if (this.jTableVeiculo.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(this, "A consulta não retornou resultado.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    this.JBCadAutomovelImprimir.setEnabled(false);
                } else {
                    this.JBCadAutomovelImprimir.setEnabled(true);
                }
                
            } catch (VeiculoException ve) {
                JOptionPane.showMessageDialog(null, ve.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }

        }


    }//GEN-LAST:event_JTextProprietarioFiltroKeyPressed

    private void JTextProprietarioFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextProprietarioFiltroKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextProprietarioFiltroKeyTyped

    private void JTextPlacaFiltroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextPlacaFiltroKeyPressed

        this.JBCadAutomovelImprimir.setEnabled(false);
        
        if (evt.getKeyCode() == 10) {

            try {

                this.carregaTableVeiculo();
                
                if (this.jTableVeiculo.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(this, "A consulta não retornou resultado.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    this.JBCadAutomovelImprimir.setEnabled(false);
                } else {
                    this.JBCadAutomovelImprimir.setEnabled(true);
                }

            } catch (VeiculoException ve) {
                JOptionPane.showMessageDialog(null, ve.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }

        }

    }//GEN-LAST:event_JTextPlacaFiltroKeyPressed

    private void JTextPlacaFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextPlacaFiltroKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextPlacaFiltroKeyTyped

    private void jTableVeiculoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVeiculoMousePressed

        if (evt.getButton() == evt.BUTTON3) {
            if (this.jTableVeiculo.getSelectedRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Selecione um item na lista.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                jMenuSuspenso.show(jTableVeiculo, evt.getX(), evt.getY());
            }
        }

    }//GEN-LAST:event_jTableVeiculoMousePressed

    private void jScrollPaneVeiculoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPaneVeiculoMousePressed

    }//GEN-LAST:event_jScrollPaneVeiculoMousePressed
    private void excluirVeiculo(Veiculo ve) throws Exception, VeiculoException {

        this.facveiulo.Excluir(ve);

    }


    private void jMenuItemExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExcluirActionPerformed

        try {
            Veiculo ve = new Veiculo();
            ve.setID((int) this.jTableVeiculo.getValueAt(this.jTableVeiculo.getSelectedRow(), 0));
            ve.setProprietario((String) this.jTableVeiculo.getValueAt(this.jTableVeiculo.getSelectedRow(), 1));
            ve.setPlaca((String) this.jTableVeiculo.getValueAt(this.jTableVeiculo.getSelectedRow(), 5));

            String msg = "Proprietário: " + ve.getProprietario() + "\n";
            msg += "Placa: " + ve.getPlaca() + "\n\n";

            if (JOptionPane.showConfirmDialog(JTextAnoModelo, msg + "Deseja realmente excluir o veículo?.", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION) {

                this.excluirVeiculo(ve);
                this.carregaTableVeiculo();
                JOptionPane.showMessageDialog(jTableVeiculo, "Veículo excluído com sucesso.", "Aviso", JOptionPane.INFORMATION_MESSAGE);

            }

        } catch (VeiculoException vex) {
            JOptionPane.showMessageDialog(null, vex.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jMenuItemExcluirActionPerformed

    private void carregaDadoAlteracao(){
    
            Veiculo ve = new Veiculo();
           
            ve.setDataCompra((String) this.jTableVeiculo.getValueAt(this.jTableVeiculo.getSelectedRow(), 10));
            ve.setID((int) this.jTableVeiculo.getValueAt(this.jTableVeiculo.getSelectedRow(), 0));
            ve.setProprietario((String) this.jTableVeiculo.getValueAt(this.jTableVeiculo.getSelectedRow(), 1));
            ve.setPlaca((String) this.jTableVeiculo.getValueAt(this.jTableVeiculo.getSelectedRow(), 5));
            ve.setCor(((String) this.jTableVeiculo.getValueAt(this.jTableVeiculo.getSelectedRow(), 4)));
            ve.setAnoFabricacao(((int) this.jTableVeiculo.getValueAt(this.jTableVeiculo.getSelectedRow(), 7)));
            ve.setAnoModelo(((int) this.jTableVeiculo.getValueAt(this.jTableVeiculo.getSelectedRow(), 8)));
            ve.setModelo((String) this.jTableVeiculo.getValueAt(this.jTableVeiculo.getSelectedRow(), 3));
            ve.setFabricante((String) this.jTableVeiculo.getValueAt(this.jTableVeiculo.getSelectedRow(), 2));
            String kminicial =  (String) this.jTableVeiculo.getValueAt(this.jTableVeiculo.getSelectedRow(),9);
            kminicial = kminicial.replace(".", "");
            ve.setKmInicial(Integer.parseInt(kminicial));
                        
            this.JTextCor.setText(ve.getCor());
            this.JTextAnoFabricacao.setText(Integer.toString(ve.getAnoFabricacao()));
            this.JTextAnoModelo.setText(Integer.toString(ve.getAnoModelo()));
            this.JTextPlaca.setText(ve.getPlaca());
            this.JTextProprietario.setText(ve.getProprietario());
            this.JTextModelo.setText(ve.getModelo());
            this.JTextFabricante.setText(ve.getFabricante());
            this.JTextKMInicial.setText(Integer.toString(ve.getKmInicial()).replace(".", ""));
            this.JTextDataCompra.setText(ve.getDataCompra());
            
            this.JPIDAlterar.setVisible(true);
            this.JLIDValor.setVisible(true);
            this.JLIDValor.setText(Integer.toString(ve.getID()));
            
          String comb = (String) this.jTableVeiculo.getValueAt(this.jTableVeiculo.getSelectedRow(),11);
            //-- Selecione --, Gasolina, Etanol, Diesel, Flex(Etanol/Gasolina)
            switch (comb) {
                case "Gasolina":
                    this.jComboBoxCombustivel.setSelectedIndex(1);
                    break;
                case "Etanol":
                    this.jComboBoxCombustivel.setSelectedIndex(2);
                    break;    
                case "Diesel":
                    this.jComboBoxCombustivel.setSelectedIndex(3);
                    break;
                case "Flex(Etanol/Gasolina)":
                    this.jComboBoxCombustivel.setSelectedIndex(4);
                    break;
                default:
                    this.jComboBoxCombustivel.setSelectedIndex(0);
                    break;
            }

            String tp = (String) this.jTableVeiculo.getValueAt(this.jTableVeiculo.getSelectedRow(),6);
            //Carro, Moto, Outros
            switch (tp) {
                case "Carro":
                    this.jRadioButtonCarro.setSelected(true);
                    break;
                case "Moto":
                    this.jRadioButtonMoto.setSelected(true);
                    break;    
                case "Outro":
                    this.jRadioButtonOutros.setSelected(true);
                    break;
                default:
                    break;
            }
            
            this.jTabbedPaneVeiculo.setSelectedIndex(1);
            
            this.jRadioButtonCarro.setEnabled(false);
            this.jRadioButtonMoto.setEnabled(false);
            this.jRadioButtonOutros.setEnabled(false);
            
            this.JTextAnoModelo.setEnabled(false);
            this.JTextAnoFabricacao.setEnabled(false);
            
            this.JTextFabricante.setEnabled(false);
            this.JTextModelo.setEnabled(false);
            this.JTextKMInicial.setEnabled(false);
            this.JTextDataCompra.setEnabled(false);
    }
            
    
    private void jMenuItemEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEditarActionPerformed
        
        try {
            
            this.carregaDadoAlteracao();
            
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jMenuItemEditarActionPerformed

    private void JTextPlacaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTextPlacaMouseReleased
       
       
        
    }//GEN-LAST:event_JTextPlacaMouseReleased

    private void JTextPlacaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTextPlacaMouseEntered
         this.JTextPlaca.setText(this.JTextPlaca.getText().toUpperCase());
    }//GEN-LAST:event_JTextPlacaMouseEntered

    private void JTextCorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTextCorFocusLost
        JTextKMInicial.requestFocus();
    }//GEN-LAST:event_JTextCorFocusLost

    private void JBCadAutomovelImprimirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCadAutomovelImprimirMouseEntered
        this.JBCadAutomovelImprimir.setBackground(new Color(169, 169, 169));
    }//GEN-LAST:event_JBCadAutomovelImprimirMouseEntered

    private void JBCadAutomovelImprimirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCadAutomovelImprimirMouseExited
        this.JBCadAutomovelImprimir.setBackground(this.getBackground());      
    }//GEN-LAST:event_JBCadAutomovelImprimirMouseExited

    private void JBCadAutomovelImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadAutomovelImprimirActionPerformed
 
        HashMap parametros = new HashMap();

        try {

            parametros.put("P_PLACA", this.JTextPlacaFiltro.getText().trim());
            parametros.put("P_PROPRIETARIO", this.JTextProprietarioFiltro.getText().trim());
            JFPrincipal.reportShow.showReportVeiculo(parametros);


        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, "Erro a gerar o relatório.\n"+ ex.getMessage(), "Erro.", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_JBCadAutomovelImprimirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCadAutomovelCancelar;
    private javax.swing.JButton JBCadAutomovelImprimir;
    private javax.swing.JButton JBCadAutomovelProcurar;
    private javax.swing.JButton JBCadAutomovelSalvar;
    private javax.swing.JLabel JLCadastro;
    private javax.swing.JLabel JLHome;
    private javax.swing.JLabel JLIDValor;
    private javax.swing.JPanel JPAcao;
    private javax.swing.JPanel JPAno;
    private javax.swing.JPanel JPIDAlterar;
    private javax.swing.JPanel JPIncluir;
    private javax.swing.JPanel JPTipo;
    private javax.swing.JTextField JTextAnoFabricacao;
    private javax.swing.JTextField JTextAnoModelo;
    private javax.swing.JTextField JTextCor;
    private javax.swing.JFormattedTextField JTextDataCompra;
    private javax.swing.JTextField JTextFabricante;
    private javax.swing.JTextField JTextKMInicial;
    private javax.swing.JTextField JTextModelo;
    private javax.swing.JTextField JTextPlaca;
    private javax.swing.JTextField JTextPlacaFiltro;
    private javax.swing.JTextField JTextProprietario;
    private javax.swing.JTextField JTextProprietarioFiltro;
    private javax.swing.ButtonGroup buttonGroupTipo;
    private javax.swing.JComboBox<String> jComboBoxCombustivel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItemEditar;
    private javax.swing.JMenuItem jMenuItemExcluir;
    private javax.swing.JPopupMenu jMenuSuspenso;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButtonCarro;
    private javax.swing.JRadioButton jRadioButtonMoto;
    private javax.swing.JRadioButton jRadioButtonOutros;
    private javax.swing.JScrollPane jScrollPaneVeiculo;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPaneVeiculo;
    private javax.swing.JTable jTableVeiculo;
    private javax.swing.JLabel jlQtdeRegistroTable;
    // End of variables declaration//GEN-END:variables

 

    private void AtualizarVeiculo(Veiculo v) throws Exception,VeiculoException {
        this.facveiulo.Atualizar(v);
    }
}
