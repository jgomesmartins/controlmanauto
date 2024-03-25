package GUI;

import Entidade.TipoManutencao;
import Entidade.TipoManutencaoException;
import Fachada.FacTipoManutencao;
import java.awt.Color;
import java.awt.HeadlessException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class JPTipoManutencao extends javax.swing.JPanel {

    private FacTipoManutencao factipomanu;

    public JPTipoManutencao() {
        initComponents();
        this.JPIDAlterar.setVisible(false);
        factipomanu = new FacTipoManutencao();
        this.jlQtdeRegistroTable.setVisible(false);

        JTableHeader header = jTableTipoManutencao.getTableHeader();
        header.setForeground(new Color(0, 102, 153));
        header.setFont((new java.awt.Font("Century Gothic", 0, 12)));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupPecasServicos = new javax.swing.ButtonGroup();
        buttonGroupPecasServicosFiltro = new javax.swing.ButtonGroup();
        jMenuSuspenso = new javax.swing.JPopupMenu();
        jMenuItemEditar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemExcluir = new javax.swing.JMenuItem();
        JLHome = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JLCadastro = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTabbedPaneTipoManutencao = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        JBCadTipoManutencaoProcurar = new javax.swing.JButton();
        JTextDescricaoFiltro = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButtonPecaFiltro = new javax.swing.JRadioButton();
        jRadioButtonServicoFiltro = new javax.swing.JRadioButton();
        jRadioButtonServicoTodos = new javax.swing.JRadioButton();
        JBCadTipoManutencaoImprimir = new javax.swing.JButton();
        jScrollPaneVeiculo = new javax.swing.JScrollPane();
        jTableTipoManutencao = new jTableCustom();
        jlQtdeRegistroTable = new javax.swing.JLabel();
        JPIncluir = new javax.swing.JPanel();
        JPTipo = new javax.swing.JPanel();
        jRadioButtonPeca = new javax.swing.JRadioButton();
        jRadioButtonServico = new javax.swing.JRadioButton();
        JTextDescricao = new javax.swing.JTextField();
        JPAcao = new javax.swing.JPanel();
        JBCadPecasServicosCancelar = new javax.swing.JButton();
        JBCadPecasServicosSalvar = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        JPIDPrazo = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        JTextQuilometragem = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        JTextMeses = new javax.swing.JTextField();
        JPIDAlterar = new javax.swing.JPanel();
        JLIDValor = new javax.swing.JLabel();

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

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText(">");
        jLabel8.setToolTipText("");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 153));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Peças e Serviços");
        jLabel10.setToolTipText("");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Manutenção no cadastro de peças e serviços");
        jLabel6.setToolTipText("");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("___________________________________________________________________________________________________________________________________________________________");
        jLabel4.setToolTipText("");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTabbedPaneTipoManutencao.setForeground(new java.awt.Color(0, 102, 153));
        jTabbedPaneTipoManutencao.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPaneTipoManutencao.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14), new java.awt.Color(0, 102, 153))); // NOI18N

        JBCadTipoManutencaoProcurar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JBCadTipoManutencaoProcurar.setForeground(new java.awt.Color(0, 102, 153));
        JBCadTipoManutencaoProcurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-pesquisa-google-na-web-40.png"))); // NOI18N
        JBCadTipoManutencaoProcurar.setToolTipText("Procurar.");
        JBCadTipoManutencaoProcurar.setBorderPainted(false);
        JBCadTipoManutencaoProcurar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBCadTipoManutencaoProcurar.setFocusPainted(false);
        JBCadTipoManutencaoProcurar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBCadTipoManutencaoProcurar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBCadTipoManutencaoProcurarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBCadTipoManutencaoProcurarMouseExited(evt);
            }
        });
        JBCadTipoManutencaoProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadTipoManutencaoProcurarActionPerformed(evt);
            }
        });

        JTextDescricaoFiltro.setDocument(new JTextFieldLimit(50));
        JTextDescricaoFiltro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JTextDescricaoFiltro.setForeground(new java.awt.Color(0, 102, 153));
        JTextDescricaoFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTextDescricaoFiltroKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextDescricaoFiltroKeyTyped(evt);
            }
        });

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 102, 153));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Descrição");
        jLabel23.setToolTipText("");
        jLabel23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 15), new java.awt.Color(0, 102, 153))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 102, 153));
        jPanel1.setToolTipText("");

        buttonGroupPecasServicosFiltro.add(jRadioButtonPecaFiltro);
        jRadioButtonPecaFiltro.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jRadioButtonPecaFiltro.setForeground(new java.awt.Color(0, 102, 153));
        jRadioButtonPecaFiltro.setText("Peça");
        jRadioButtonPecaFiltro.setActionCommand("0");
        jRadioButtonPecaFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPecaFiltroActionPerformed(evt);
            }
        });

        buttonGroupPecasServicosFiltro.add(jRadioButtonServicoFiltro);
        jRadioButtonServicoFiltro.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jRadioButtonServicoFiltro.setForeground(new java.awt.Color(0, 102, 153));
        jRadioButtonServicoFiltro.setText("Serviço");
        jRadioButtonServicoFiltro.setActionCommand("1");
        jRadioButtonServicoFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonServicoFiltroActionPerformed(evt);
            }
        });

        buttonGroupPecasServicosFiltro.add(jRadioButtonServicoTodos);
        jRadioButtonServicoTodos.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jRadioButtonServicoTodos.setForeground(new java.awt.Color(0, 102, 153));
        jRadioButtonServicoTodos.setSelected(true);
        jRadioButtonServicoTodos.setText("Todos");
        jRadioButtonServicoTodos.setActionCommand("1");
        jRadioButtonServicoTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonServicoTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jRadioButtonPecaFiltro)
                .addGap(28, 28, 28)
                .addComponent(jRadioButtonServicoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonServicoTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonServicoTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonPecaFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonServicoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        JBCadTipoManutencaoImprimir.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JBCadTipoManutencaoImprimir.setForeground(new java.awt.Color(0, 102, 153));
        JBCadTipoManutencaoImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-enviar-para-a-impressora-40.png"))); // NOI18N
        JBCadTipoManutencaoImprimir.setToolTipText("Gerar relatório.");
        JBCadTipoManutencaoImprimir.setBorderPainted(false);
        JBCadTipoManutencaoImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBCadTipoManutencaoImprimir.setEnabled(false);
        JBCadTipoManutencaoImprimir.setFocusPainted(false);
        JBCadTipoManutencaoImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBCadTipoManutencaoImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBCadTipoManutencaoImprimirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBCadTipoManutencaoImprimirMouseExited(evt);
            }
        });
        JBCadTipoManutencaoImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadTipoManutencaoImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(0, 219, Short.MAX_VALUE))
                    .addComponent(JTextDescricaoFiltro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBCadTipoManutencaoImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBCadTipoManutencaoProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(JTextDescricaoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JBCadTipoManutencaoProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCadTipoManutencaoImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPaneVeiculo.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPaneVeiculo.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jScrollPaneVeiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jScrollPaneVeiculoMousePressed(evt);
            }
        });

        jTableTipoManutencao.setAutoCreateRowSorter(true);
        jTableTipoManutencao.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jTableTipoManutencao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TIPO", "DESCRIÇÃO", "QUILOMETRAGEM", "MESES", "DT. CADASTRO", "DT. ATUALIZAÇÃO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTipoManutencao.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTableTipoManutencao.setAutoscrolls(false);
        jTableTipoManutencao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableTipoManutencaoMousePressed(evt);
            }
        });
        jScrollPaneVeiculo.setViewportView(jTableTipoManutencao);
        if (jTableTipoManutencao.getColumnModel().getColumnCount() > 0) {
            jTableTipoManutencao.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTableTipoManutencao.getColumnModel().getColumn(1).setPreferredWidth(80);
            jTableTipoManutencao.getColumnModel().getColumn(2).setPreferredWidth(200);
            jTableTipoManutencao.getColumnModel().getColumn(3).setPreferredWidth(120);
            jTableTipoManutencao.getColumnModel().getColumn(4).setPreferredWidth(80);
            jTableTipoManutencao.getColumnModel().getColumn(5).setPreferredWidth(100);
            jTableTipoManutencao.getColumnModel().getColumn(6).setPreferredWidth(120);
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneVeiculo)
                    .addComponent(jlQtdeRegistroTable, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPaneVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlQtdeRegistroTable, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jTabbedPaneTipoManutencao.addTab("CONSULTAR", new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-lista-de-verificação-18.png")), jPanel2); // NOI18N

        JPTipo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 15), new java.awt.Color(0, 102, 153))); // NOI18N

        buttonGroupPecasServicos.add(jRadioButtonPeca);
        jRadioButtonPeca.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jRadioButtonPeca.setForeground(new java.awt.Color(0, 102, 153));
        jRadioButtonPeca.setText("Peça");
        jRadioButtonPeca.setActionCommand("0");

        buttonGroupPecasServicos.add(jRadioButtonServico);
        jRadioButtonServico.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jRadioButtonServico.setForeground(new java.awt.Color(0, 102, 153));
        jRadioButtonServico.setText("Serviço");
        jRadioButtonServico.setActionCommand("1");
        jRadioButtonServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonServicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPTipoLayout = new javax.swing.GroupLayout(JPTipo);
        JPTipo.setLayout(JPTipoLayout);
        JPTipoLayout.setHorizontalGroup(
            JPTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPTipoLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jRadioButtonPeca, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonServico, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        JPTipoLayout.setVerticalGroup(
            JPTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPTipoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonPeca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonServico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JTextDescricao.setDocument(new JTextFieldLimit(50));
        JTextDescricao.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JTextDescricao.setForeground(new java.awt.Color(0, 102, 153));

        JPAcao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14), new java.awt.Color(0, 102, 153))); // NOI18N

        JBCadPecasServicosCancelar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JBCadPecasServicosCancelar.setForeground(new java.awt.Color(0, 102, 153));
        JBCadPecasServicosCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-cancelar-30.png"))); // NOI18N
        JBCadPecasServicosCancelar.setText("Cancelar");
        JBCadPecasServicosCancelar.setToolTipText("Limpa os campos a cancela operação.");
        JBCadPecasServicosCancelar.setBorderPainted(false);
        JBCadPecasServicosCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBCadPecasServicosCancelar.setFocusPainted(false);
        JBCadPecasServicosCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBCadPecasServicosCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBCadPecasServicosCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBCadPecasServicosCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBCadPecasServicosCancelarMouseExited(evt);
            }
        });
        JBCadPecasServicosCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadPecasServicosCancelarActionPerformed(evt);
            }
        });

        JBCadPecasServicosSalvar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JBCadPecasServicosSalvar.setForeground(new java.awt.Color(0, 102, 153));
        JBCadPecasServicosSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-guardar-todos-30.png"))); // NOI18N
        JBCadPecasServicosSalvar.setText("Salvar");
        JBCadPecasServicosSalvar.setToolTipText("Salvar as informações.");
        JBCadPecasServicosSalvar.setBorderPainted(false);
        JBCadPecasServicosSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBCadPecasServicosSalvar.setFocusPainted(false);
        JBCadPecasServicosSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBCadPecasServicosSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBCadPecasServicosSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBCadPecasServicosSalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBCadPecasServicosSalvarMouseExited(evt);
            }
        });
        JBCadPecasServicosSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadPecasServicosSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPAcaoLayout = new javax.swing.GroupLayout(JPAcao);
        JPAcao.setLayout(JPAcaoLayout);
        JPAcaoLayout.setHorizontalGroup(
            JPAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPAcaoLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(JBCadPecasServicosCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBCadPecasServicosSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPAcaoLayout.setVerticalGroup(
            JPAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPAcaoLayout.createSequentialGroup()
                .addGroup(JPAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBCadPecasServicosCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCadPecasServicosSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("* Campos com preenchimento obrigatório.");
        jLabel20.setToolTipText("");
        jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Descrição*");
        jLabel12.setToolTipText("");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JPIDPrazo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Validade*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 15), new java.awt.Color(0, 102, 153))); // NOI18N

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 153));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Meses");
        jLabel17.setToolTipText("");
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JTextQuilometragem.setDocument(new JTextFieldLimit(7));
        JTextQuilometragem.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JTextQuilometragem.setForeground(new java.awt.Color(0, 102, 153));
        JTextQuilometragem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextQuilometragemKeyTyped(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 102, 153));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Quilometragem");
        jLabel18.setToolTipText("");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JTextMeses.setDocument(new JTextFieldLimit(3));
        JTextMeses.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JTextMeses.setForeground(new java.awt.Color(0, 102, 153));
        JTextMeses.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextMesesKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout JPIDPrazoLayout = new javax.swing.GroupLayout(JPIDPrazo);
        JPIDPrazo.setLayout(JPIDPrazoLayout);
        JPIDPrazoLayout.setHorizontalGroup(
            JPIDPrazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPIDPrazoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(JPIDPrazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JPIDPrazoLayout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JTextQuilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPIDPrazoLayout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JTextMeses)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        JPIDPrazoLayout.setVerticalGroup(
            JPIDPrazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPIDPrazoLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(JPIDPrazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextQuilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPIDPrazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTextMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLIDValor, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        JPIDAlterarLayout.setVerticalGroup(
            JPIDAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPIDAlterarLayout.createSequentialGroup()
                .addComponent(JLIDValor, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JPIncluirLayout = new javax.swing.GroupLayout(JPIncluir);
        JPIncluir.setLayout(JPIncluirLayout);
        JPIncluirLayout.setHorizontalGroup(
            JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPIncluirLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPIncluirLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JPIncluirLayout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTextDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(JPIncluirLayout.createSequentialGroup()
                        .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(JPIncluirLayout.createSequentialGroup()
                                .addComponent(JPTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JPIDAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JPIDPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addComponent(JPAcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        JPIncluirLayout.setVerticalGroup(
            JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPIncluirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPIncluirLayout.createSequentialGroup()
                        .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JPTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JPIDAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(JPIDPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JPAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        jTabbedPaneTipoManutencao.addTab("INCLUIR/ALTERAR", new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-adicionar-linha-18.png")), JPIncluir); // NOI18N

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
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTabbedPaneTipoManutencao, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPaneTipoManutencao)
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JLHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLHomeMouseClicked
        JFPrincipal.setPanelMain(new JPHome());
    }//GEN-LAST:event_JLHomeMouseClicked

    private void JLCadastroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLCadastroMousePressed
        JFPrincipal.setPanelMain(new JPCadastro());
    }//GEN-LAST:event_JLCadastroMousePressed

    private void JBCadTipoManutencaoProcurarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCadTipoManutencaoProcurarMouseEntered
        this.JBCadTipoManutencaoProcurar.setBackground(new Color(169, 169, 169));
    }//GEN-LAST:event_JBCadTipoManutencaoProcurarMouseEntered

    private void JBCadTipoManutencaoProcurarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCadTipoManutencaoProcurarMouseExited
        this.JBCadTipoManutencaoProcurar.setBackground(this.getBackground());
    }//GEN-LAST:event_JBCadTipoManutencaoProcurarMouseExited

    private void JBCadTipoManutencaoProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadTipoManutencaoProcurarActionPerformed
        try {

            this.carregaTableTipoManutencao();

            if (this.jTableTipoManutencao.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "A consulta não retornou resultado.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                this.JBCadTipoManutencaoImprimir.setEnabled(false);
            }else{
                this.JBCadTipoManutencaoImprimir.setEnabled(true);
            }

        } catch (TipoManutencaoException te) {
            JOptionPane.showMessageDialog(null, te.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBCadTipoManutencaoProcurarActionPerformed

    private void JTextDescricaoFiltroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextDescricaoFiltroKeyPressed

        this.JBCadTipoManutencaoImprimir.setEnabled(false);
        
        if (evt.getKeyCode() == 10) {

            try {

                this.carregaTableTipoManutencao();

                if (this.jTableTipoManutencao.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(this, "A consulta não retornou resultado.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    this.JBCadTipoManutencaoImprimir.setEnabled(false);
                }else{
                this.JBCadTipoManutencaoImprimir.setEnabled(true);
                }

            } catch (TipoManutencaoException te) {
                JOptionPane.showMessageDialog(null, te.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }

        }

    }//GEN-LAST:event_JTextDescricaoFiltroKeyPressed

    private void JTextDescricaoFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextDescricaoFiltroKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextDescricaoFiltroKeyTyped

    private void jTableTipoManutencaoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTipoManutencaoMousePressed

        if (evt.getButton() == evt.BUTTON3) {
            if (this.jTableTipoManutencao.getSelectedRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Selecione um item na lista.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                jMenuSuspenso.show(jTableTipoManutencao, evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jTableTipoManutencaoMousePressed

    private void jScrollPaneVeiculoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPaneVeiculoMousePressed

    }//GEN-LAST:event_jScrollPaneVeiculoMousePressed

    private void jRadioButtonServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonServicoActionPerformed

    private void JTextQuilometragemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextQuilometragemKeyTyped
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_JTextQuilometragemKeyTyped

    private void JBCadPecasServicosCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCadPecasServicosCancelarMouseEntered
        this.JBCadPecasServicosCancelar.setBackground(new Color(169, 169, 169));
    }//GEN-LAST:event_JBCadPecasServicosCancelarMouseEntered

    private void JBCadPecasServicosCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCadPecasServicosCancelarMouseExited
        this.JBCadPecasServicosCancelar.setBackground(this.getBackground());
    }//GEN-LAST:event_JBCadPecasServicosCancelarMouseExited

    private void JBCadPecasServicosCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadPecasServicosCancelarActionPerformed
        this.limpaCampos();
    }//GEN-LAST:event_JBCadPecasServicosCancelarActionPerformed

    private void JBCadPecasServicosSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCadPecasServicosSalvarMouseEntered
        this.JBCadPecasServicosSalvar.setBackground(new Color(169, 169, 169));
    }//GEN-LAST:event_JBCadPecasServicosSalvarMouseEntered

    private void JBCadPecasServicosSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCadPecasServicosSalvarMouseExited
        this.JBCadPecasServicosSalvar.setBackground(this.getBackground());
    }//GEN-LAST:event_JBCadPecasServicosSalvarMouseExited

    private void JBCadPecasServicosSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadPecasServicosSalvarActionPerformed

        try {

            this.validaCampos();

            TipoManutencao tipomanu = new TipoManutencao();
            tipomanu.setDescricao(this.JTextDescricao.getText().trim());

            if (!this.JTextQuilometragem.getText().trim().equals("")) {
                tipomanu.setQuilometragem(Integer.parseInt(this.JTextQuilometragem.getText().trim()));
            }

            if (!this.JTextMeses.getText().trim().equals("")) {
                tipomanu.setMeses(Integer.parseInt(this.JTextMeses.getText().trim()));
            }

            if (this.jRadioButtonPeca.isSelected()) {
                tipomanu.setTipo(1);
            }

            if (this.jRadioButtonServico.isSelected()) {
                tipomanu.setTipo(2);
            }

            if (JLIDValor.getText().equals("")) {

                factipomanu.Adicionar(tipomanu);
                JOptionPane.showMessageDialog(this, "Tipo de manutenção cadastrado com  sucesso!.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                this.limpaCampos();

            } else {

                tipomanu.setID(Integer.parseInt(this.JLIDValor.getText()));
                tipomanu.setTipo((this.jRadioButtonPeca.isSelected()) ? 1 : (this.jRadioButtonServico.isSelected()) ? 2 : -1);
                factipomanu.Atualizar(tipomanu);
                JOptionPane.showMessageDialog(this, "Tipo manutenção atualizado com  sucesso!.\n"
                        + "Atenção: Manutenções realizadas em veículos antes da alteração, só entraram em vigor na próxima manutenção.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                this.limpaCampos();
            }

        } catch (TipoManutencaoException tme) {
            JOptionPane.showMessageDialog(null, tme.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {

        }
    }//GEN-LAST:event_JBCadPecasServicosSalvarActionPerformed

    private void JTextMesesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextMesesKeyTyped
             String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_JTextMesesKeyTyped

    private void jRadioButtonServicoTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonServicoTodosActionPerformed
       this.JBCadTipoManutencaoImprimir.setEnabled(false);
    }//GEN-LAST:event_jRadioButtonServicoTodosActionPerformed

    private void jRadioButtonServicoFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonServicoFiltroActionPerformed
      this.JBCadTipoManutencaoImprimir.setEnabled(false);
    }//GEN-LAST:event_jRadioButtonServicoFiltroActionPerformed

    private void jMenuItemEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEditarActionPerformed

        try {

            this.carregaDadoAlteracao();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItemEditarActionPerformed

    private void jMenuItemExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExcluirActionPerformed

        try {
            TipoManutencao ve = new TipoManutencao();
            ve.setID((int) this.jTableTipoManutencao.getValueAt(this.jTableTipoManutencao.getSelectedRow(), 0));
            ve.setDescricao((String) this.jTableTipoManutencao.getValueAt(this.jTableTipoManutencao.getSelectedRow(), 1));

            String msg = "ID: " + ve.getID() + "\n";
            msg += "Tipo: " + this.jTableTipoManutencao.getValueAt(this.jTableTipoManutencao.getSelectedRow(), 2).toString().toLowerCase() + "\n";
            msg += "Descrição: " + ve.getDescricao() + "\n\n";

            if (JOptionPane.showConfirmDialog(this, msg + "Deseja realmente excluir o tipo de manutenção?.", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION) {

                this.excluirTipoManutencao(ve);
                this.carregaTableTipoManutencao();
                JOptionPane.showMessageDialog(jTableTipoManutencao, "Tipo de mantenção excluído com sucesso.", "Aviso", JOptionPane.INFORMATION_MESSAGE);

            }

        } catch (TipoManutencaoException vex) {
            JOptionPane.showMessageDialog(null, vex.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jMenuItemExcluirActionPerformed

    private void JBCadTipoManutencaoImprimirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCadTipoManutencaoImprimirMouseEntered
        this.JBCadTipoManutencaoImprimir.setBackground(new Color(169, 169, 169));
    }//GEN-LAST:event_JBCadTipoManutencaoImprimirMouseEntered

    private void JBCadTipoManutencaoImprimirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCadTipoManutencaoImprimirMouseExited
        this.JBCadTipoManutencaoImprimir.setBackground(this.getBackground());
    }//GEN-LAST:event_JBCadTipoManutencaoImprimirMouseExited

    private void JBCadTipoManutencaoImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadTipoManutencaoImprimirActionPerformed

        HashMap parametros = new HashMap();

        try {
            
            int tipo = -1;
            tipo = ((this.jRadioButtonPecaFiltro.isSelected()) ? 1 : (this.jRadioButtonServicoFiltro.isSelected()) ? 2 : -1);
            
            parametros.put("P_TIPO",tipo);
            parametros.put("P_DESCRICAO", this.JTextDescricaoFiltro.getText().trim());
            JFPrincipal.reportShow.showReportTipoManutencao(parametros);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro a gerar o relatório.\n"+ ex.getMessage(), "Erro.", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_JBCadTipoManutencaoImprimirActionPerformed

    private void jRadioButtonPecaFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPecaFiltroActionPerformed
      this.JBCadTipoManutencaoImprimir.setEnabled(false);
    }//GEN-LAST:event_jRadioButtonPecaFiltroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCadPecasServicosCancelar;
    private javax.swing.JButton JBCadPecasServicosSalvar;
    private javax.swing.JButton JBCadTipoManutencaoImprimir;
    private javax.swing.JButton JBCadTipoManutencaoProcurar;
    private javax.swing.JLabel JLCadastro;
    private javax.swing.JLabel JLHome;
    private javax.swing.JLabel JLIDValor;
    private javax.swing.JPanel JPAcao;
    private javax.swing.JPanel JPIDAlterar;
    private javax.swing.JPanel JPIDPrazo;
    private javax.swing.JPanel JPIncluir;
    private javax.swing.JPanel JPTipo;
    private javax.swing.JTextField JTextDescricao;
    private javax.swing.JTextField JTextDescricaoFiltro;
    private javax.swing.JTextField JTextMeses;
    private javax.swing.JTextField JTextQuilometragem;
    private javax.swing.ButtonGroup buttonGroupPecasServicos;
    private javax.swing.ButtonGroup buttonGroupPecasServicosFiltro;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItemEditar;
    private javax.swing.JMenuItem jMenuItemExcluir;
    private javax.swing.JPopupMenu jMenuSuspenso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButtonPeca;
    private javax.swing.JRadioButton jRadioButtonPecaFiltro;
    private javax.swing.JRadioButton jRadioButtonServico;
    private javax.swing.JRadioButton jRadioButtonServicoFiltro;
    private javax.swing.JRadioButton jRadioButtonServicoTodos;
    private javax.swing.JScrollPane jScrollPaneVeiculo;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPaneTipoManutencao;
    private javax.swing.JTable jTableTipoManutencao;
    private javax.swing.JLabel jlQtdeRegistroTable;
    // End of variables declaration//GEN-END:variables

    private void limpaCampos() {

        this.buttonGroupPecasServicos.clearSelection();

        this.JTextDescricao.setText("");
        this.JTextMeses.setText("");
        this.JTextQuilometragem.setText("");

        this.JLIDValor.setText("");

        this.JPIDAlterar.setVisible(false);

    }

    private void validaCampos() throws TipoManutencaoException {

        if (!(jRadioButtonPeca.isSelected() || jRadioButtonServico.isSelected())) {

            throw new TipoManutencaoException("Selecione o tipo da manutenção.");
        }

        if (this.JTextQuilometragem.getText().trim().equals("")) {
            this.JTextQuilometragem.requestFocus();
            throw new TipoManutencaoException("Informe a quilometragem.");
        }

        if (this.JTextDescricao.getText().trim().equals("")) {
            this.JTextDescricao.requestFocus();
            throw new TipoManutencaoException("Informe a descrição da peça ou serviço.");
        }

    }

    private void carregaTableTipoManutencao() throws Exception, TipoManutencaoException {

  
        DefaultTableModel dt = (DefaultTableModel) this.jTableTipoManutencao.getModel();
        List<TipoManutencao> listtm = new ArrayList<>();
        TipoManutencao tm = new TipoManutencao();

        tm.setTipo((this.jRadioButtonPecaFiltro.isSelected()) ? 1 : (this.jRadioButtonServicoFiltro.isSelected()) ? 2 : -1);
        tm.setDescricao(this.JTextDescricaoFiltro.getText().trim());

        listtm = this.factipomanu.Consultar(tm);

        DefaultTableModel dfm = (DefaultTableModel) this.jTableTipoManutencao.getModel();

        DecimalFormat df = new DecimalFormat("#,###,###");
        SimpleDateFormat dtf = new SimpleDateFormat("dd/MM/yyyy");

        while (this.jTableTipoManutencao.getModel().getRowCount() > 0) {
            dt = (DefaultTableModel) this.jTableTipoManutencao.getModel();
            dt.removeRow(0);
        }

        for (TipoManutencao tpom : listtm) {

            Object[] row = {tpom.getID(),
                (tpom.getTipo() == 1) ? "Peça" : "Serviço",
                tpom.getDescricao(),
                (tpom.getQuilometragem() == -1) ? "" : df.format(tpom.getQuilometragem()),
                (tpom.getMeses() == -1) ? "" : tpom.getMeses(),
                (tpom.getDataAdd() == null) ? "" : dtf.format(tpom.getDataAdd()),
                (tpom.getDataUpd() == null) ? "" : dtf.format(tpom.getDataUpd())};

            dfm.addRow(row);
        }

        this.jlQtdeRegistroTable.setVisible(true);
        this.jlQtdeRegistroTable.setText("Quantidade de registro encontrado: " + dt.getRowCount());
        
        jTableCustom jtc = new jTableCustom();
        
        jtc = (jTableCustom) this.jTableTipoManutencao;
        jtc.ColorRow(jTableTipoManutencao, new String[]{"D","E","E","D","D","C","C"});
        

    }

    private void excluirTipoManutencao(TipoManutencao ve) throws Exception, TipoManutencaoException {

        this.factipomanu.Excluir(ve);
    }

    private void carregaDadoAlteracao() {

        this.JTextDescricao.setText((String) this.jTableTipoManutencao.getValueAt(this.jTableTipoManutencao.getSelectedRow(), 2));
        this.JLIDValor.setText(Integer.toString((int) this.jTableTipoManutencao.getValueAt(this.jTableTipoManutencao.getSelectedRow(), 0)));
        this.JTextQuilometragem.setText((String) this.jTableTipoManutencao.getValueAt(this.jTableTipoManutencao.getSelectedRow(), 3).toString().replace(".", ""));
        this.JTextMeses.setText(this.jTableTipoManutencao.getValueAt(this.jTableTipoManutencao.getSelectedRow(), 4) == "" ? "" : Integer.toString((int) this.jTableTipoManutencao.getValueAt(this.jTableTipoManutencao.getSelectedRow(), 4)));
        String vtipo = ("Peça".equals((String) (this.jTableTipoManutencao.getValueAt(this.jTableTipoManutencao.getSelectedRow(), 1))) ? "Peça" : "Serviço");
        this.jRadioButtonPeca.setSelected(("Peça".equals(vtipo)));
        this.jRadioButtonServico.setSelected(("Serviço".equals(vtipo)));

        this.JPIDAlterar.setVisible(true);

        this.jTabbedPaneTipoManutencao.setSelectedIndex(1);

    }
}
