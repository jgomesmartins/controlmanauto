package GUI;

import Entidade.Quilometragem;
import Entidade.QuilometragemException;
import Classes.Utils;
import Entidade.Veiculo;
import Entidade.VeiculoException;
import Fachada.FacQuilometragem;
import java.awt.Color;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author GOMES
 */
public class JPQuilometragem extends javax.swing.JPanel {

    private final Fachada.FacVeiculo facveiculo;
    private final Fachada.FacQuilometragem facquilometragem;

    private final Quilometragem quifiltro;

    public JPQuilometragem() throws Exception {
        initComponents();
        this.facveiculo = new Fachada.FacVeiculo();
        this.facquilometragem = new FacQuilometragem();
        //  this.JPIDAlterar.setVisible(false);
        this.jTabbedPaneQuilometragem.setSelectedIndex(1);
        this.carregaComboVeiculo();
        this.JPDadosVeiculos.setVisible(false);
        this.quifiltro = new Quilometragem();
        this.jlQtdeRegistroTable.setVisible(false);

        JTableHeader header = jTableQuilometragem.getTableHeader();
        header.setForeground(new Color(0, 102, 153));
        header.setFont((new java.awt.Font("Century Gothic", 0, 12)));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuSuspenso = new javax.swing.JPopupMenu();
        jMenuItemExcluir = new javax.swing.JMenuItem();
        JLHome = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTabbedPaneQuilometragem = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        JBCadQuilometragemProcurar = new javax.swing.JButton();
        jComboBoxVeiculoMesAnoFiltro = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        JBQuilometragemImprimir = new javax.swing.JButton();
        jComboBoxVeiculoFiltro = new GUI.JComboBoxCustom();
        jScrollPaneQuilometragem = new javax.swing.JScrollPane();
        jTableQuilometragem = new jTableCustom();
        jlQtdeRegistroTable = new javax.swing.JLabel();
        JPIncluir = new javax.swing.JPanel();
        JPAcao = new javax.swing.JPanel();
        JBCadPecasServicosCancelar = new javax.swing.JButton();
        JBCadPecasServicosSalvar = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBoxVeiculo = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        JTextQuilometragem = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        JTextDataQuilometragem = new javax.swing.JFormattedTextField();
        JPDadosVeiculos = new javax.swing.JPanel();
        jLProprietario = new javax.swing.JLabel();
        jLCor = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLModelo = new javax.swing.JLabel();
        jLFabricante = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLDataQuilometragem = new javax.swing.JLabel();
        jLUltimaQuilometragem = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();

        jMenuItemExcluir.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jMenuItemExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-apagar-para-sempre-18 (1).png"))); // NOI18N
        jMenuItemExcluir.setText("EXCLUIR");
        jMenuItemExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExcluirActionPerformed(evt);
            }
        });
        jMenuSuspenso.add(jMenuItemExcluir);

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

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

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 153));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Quilometragem");
        jLabel10.setToolTipText("");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Informar quilometragem do veículo");
        jLabel6.setToolTipText("");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("____________________________________________________________________________________________________________________________________________________");
        jLabel4.setToolTipText("");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTabbedPaneQuilometragem.setForeground(new java.awt.Color(0, 102, 153));
        jTabbedPaneQuilometragem.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPaneQuilometragem.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14), new java.awt.Color(0, 102, 153))); // NOI18N

        JBCadQuilometragemProcurar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JBCadQuilometragemProcurar.setForeground(new java.awt.Color(0, 102, 153));
        JBCadQuilometragemProcurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-pesquisa-google-na-web-40.png"))); // NOI18N
        JBCadQuilometragemProcurar.setToolTipText("Procurar.");
        JBCadQuilometragemProcurar.setBorderPainted(false);
        JBCadQuilometragemProcurar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBCadQuilometragemProcurar.setFocusPainted(false);
        JBCadQuilometragemProcurar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBCadQuilometragemProcurar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBCadQuilometragemProcurarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBCadQuilometragemProcurarMouseExited(evt);
            }
        });
        JBCadQuilometragemProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadQuilometragemProcurarActionPerformed(evt);
            }
        });

        jComboBoxVeiculoMesAnoFiltro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jComboBoxVeiculoMesAnoFiltro.setForeground(new java.awt.Color(0, 102, 153));
        jComboBoxVeiculoMesAnoFiltro.setEnabled(false);
        jComboBoxVeiculoMesAnoFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxVeiculoMesAnoFiltroActionPerformed(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 102, 153));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("Mês/Ano");
        jLabel21.setToolTipText("");
        jLabel21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 102, 153));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Veículo");
        jLabel22.setToolTipText("");
        jLabel22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JBQuilometragemImprimir.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JBQuilometragemImprimir.setForeground(new java.awt.Color(0, 102, 153));
        JBQuilometragemImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-enviar-para-a-impressora-40.png"))); // NOI18N
        JBQuilometragemImprimir.setToolTipText("Gerar relatório.");
        JBQuilometragemImprimir.setBorderPainted(false);
        JBQuilometragemImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBQuilometragemImprimir.setEnabled(false);
        JBQuilometragemImprimir.setFocusPainted(false);
        JBQuilometragemImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBQuilometragemImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBQuilometragemImprimirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBQuilometragemImprimirMouseExited(evt);
            }
        });
        JBQuilometragemImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBQuilometragemImprimirActionPerformed(evt);
            }
        });

        jComboBoxVeiculoFiltro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxVeiculoFiltroItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(380, 380, 380))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBoxVeiculoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxVeiculoMesAnoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(JBQuilometragemImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(JBCadQuilometragemProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxVeiculoMesAnoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxVeiculoFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(JBQuilometragemImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCadQuilometragemProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jScrollPaneQuilometragem.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPaneQuilometragem.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jScrollPaneQuilometragem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jScrollPaneQuilometragemMousePressed(evt);
            }
        });

        jTableQuilometragem.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jTableQuilometragem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "QUILOMETRAGEM", "DATA QUILOMETRAGEM", "DT. CADASTRO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableQuilometragem.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTableQuilometragem.setAutoscrolls(false);
        jTableQuilometragem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableQuilometragemMousePressed(evt);
            }
        });
        jScrollPaneQuilometragem.setViewportView(jTableQuilometragem);
        if (jTableQuilometragem.getColumnModel().getColumnCount() > 0) {
            jTableQuilometragem.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTableQuilometragem.getColumnModel().getColumn(1).setPreferredWidth(120);
            jTableQuilometragem.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTableQuilometragem.getColumnModel().getColumn(3).setPreferredWidth(120);
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
                    .addComponent(jlQtdeRegistroTable, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPaneQuilometragem, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneQuilometragem, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlQtdeRegistroTable)
                .addGap(37, 37, 37))
        );

        jTabbedPaneQuilometragem.addTab("CONSULTAR", new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-lista-de-verificação-18.png")), jPanel2); // NOI18N

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
                .addContainerGap()
                .addComponent(JBCadPecasServicosCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBCadPecasServicosSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        JPAcaoLayout.setVerticalGroup(
            JPAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPAcaoLayout.createSequentialGroup()
                .addGroup(JPAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBCadPecasServicosSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCadPecasServicosCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        jLabel12.setText("Data*");
        jLabel12.setToolTipText("");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jComboBoxVeiculo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jComboBoxVeiculo.setForeground(new java.awt.Color(0, 102, 153));
        jComboBoxVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxVeiculoActionPerformed(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 102, 153));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Veículo*");
        jLabel19.setToolTipText("");
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JTextQuilometragem.setDocument(new JTextFieldLimit(10));
        JTextQuilometragem.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JTextQuilometragem.setForeground(new java.awt.Color(0, 102, 153));
        JTextQuilometragem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextQuilometragemKeyTyped(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 153));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Quilometragem*");
        jLabel13.setToolTipText("");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JTextDataQuilometragem.setForeground(new java.awt.Color(0, 102, 153));
        try {
            JTextDataQuilometragem.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JTextDataQuilometragem.setToolTipText("");
        JTextDataQuilometragem.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        JPDadosVeiculos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do veículo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14), new java.awt.Color(0, 102, 153))); // NOI18N

        jLProprietario.setBackground(new java.awt.Color(255, 255, 255));
        jLProprietario.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLProprietario.setForeground(new java.awt.Color(0, 102, 153));
        jLProprietario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLProprietario.setText("jLProprietario");
        jLProprietario.setToolTipText("");
        jLProprietario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLCor.setBackground(new java.awt.Color(255, 255, 255));
        jLCor.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLCor.setForeground(new java.awt.Color(0, 102, 153));
        jLCor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLCor.setText("jLCor");
        jLCor.setToolTipText("");
        jLCor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 102, 153));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("Fabricante:");
        jLabel24.setToolTipText("");
        jLabel24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 102, 153));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("Cor:");
        jLabel25.setToolTipText("");
        jLabel25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 102, 153));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("Proprietário:");
        jLabel26.setToolTipText("");
        jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 102, 153));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel27.setText("Modelo:");
        jLabel27.setToolTipText("");
        jLabel27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLModelo.setBackground(new java.awt.Color(255, 255, 255));
        jLModelo.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLModelo.setForeground(new java.awt.Color(0, 102, 153));
        jLModelo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLModelo.setText("jLModelo");
        jLModelo.setToolTipText("");
        jLModelo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLFabricante.setBackground(new java.awt.Color(255, 255, 255));
        jLFabricante.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLFabricante.setForeground(new java.awt.Color(0, 102, 153));
        jLFabricante.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLFabricante.setText("jLFabricante");
        jLFabricante.setToolTipText("");
        jLFabricante.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quiliometragem", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14), new java.awt.Color(0, 102, 153))); // NOI18N

        jLDataQuilometragem.setBackground(new java.awt.Color(255, 255, 255));
        jLDataQuilometragem.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLDataQuilometragem.setForeground(new java.awt.Color(0, 102, 153));
        jLDataQuilometragem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLDataQuilometragem.setText("jLDataQuilometragem");
        jLDataQuilometragem.setToolTipText("");
        jLDataQuilometragem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLUltimaQuilometragem.setBackground(new java.awt.Color(255, 255, 255));
        jLUltimaQuilometragem.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLUltimaQuilometragem.setForeground(new java.awt.Color(0, 102, 153));
        jLUltimaQuilometragem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLUltimaQuilometragem.setText("jLUltimaQuilometragem");
        jLUltimaQuilometragem.setToolTipText("");
        jLUltimaQuilometragem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 102, 153));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel32.setText("Data:");
        jLabel32.setToolTipText("");
        jLabel32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 102, 153));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel33.setText("Última:");
        jLabel33.setToolTipText("");
        jLabel33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLUltimaQuilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLDataQuilometragem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLUltimaQuilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLDataQuilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JPDadosVeiculosLayout = new javax.swing.GroupLayout(JPDadosVeiculos);
        JPDadosVeiculos.setLayout(JPDadosVeiculosLayout);
        JPDadosVeiculosLayout.setHorizontalGroup(
            JPDadosVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPDadosVeiculosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(JPDadosVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JPDadosVeiculosLayout.createSequentialGroup()
                        .addGroup(JPDadosVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPDadosVeiculosLayout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPDadosVeiculosLayout.createSequentialGroup()
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPDadosVeiculosLayout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPDadosVeiculosLayout.createSequentialGroup()
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLCor, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 81, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JPDadosVeiculosLayout.setVerticalGroup(
            JPDadosVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPDadosVeiculosLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(JPDadosVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(JPDadosVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(JPDadosVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(JPDadosVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout JPIncluirLayout = new javax.swing.GroupLayout(JPIncluir);
        JPIncluir.setLayout(JPIncluirLayout);
        JPIncluirLayout.setHorizontalGroup(
            JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPIncluirLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(JPIncluirLayout.createSequentialGroup()
                            .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(JPIncluirLayout.createSequentialGroup()
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(JTextDataQuilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(JPIncluirLayout.createSequentialGroup()
                                    .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(JTextQuilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(29, 29, 29)
                            .addComponent(JPAcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(JPDadosVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPIncluirLayout.setVerticalGroup(
            JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPIncluirLayout.createSequentialGroup()
                .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPIncluirLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(JPAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPIncluirLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextQuilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTextDataQuilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPDadosVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPaneQuilometragem.addTab("INCLUIR", new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-adicionar-linha-18.png")), JPIncluir); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTabbedPaneQuilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLHome, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLHome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPaneQuilometragem, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JLHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLHomeMouseClicked
        JFPrincipal.setPanelMain(new JPHome());
    }//GEN-LAST:event_JLHomeMouseClicked

    private void JBCadQuilometragemProcurarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCadQuilometragemProcurarMouseEntered
        this.JBCadQuilometragemProcurar.setBackground(new Color(169, 169, 169));
    }//GEN-LAST:event_JBCadQuilometragemProcurarMouseEntered

    private void JBCadQuilometragemProcurarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCadQuilometragemProcurarMouseExited
        this.JBCadQuilometragemProcurar.setBackground(this.getBackground());
    }//GEN-LAST:event_JBCadQuilometragemProcurarMouseExited

    private void JBCadQuilometragemProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadQuilometragemProcurarActionPerformed
        try {

            if (this.jComboBoxVeiculoFiltro.getSelectedIndex() == 0) {
                throw new QuilometragemException("Selecione o veículo na lista.");
            }

            this.CarregaTableQuilometragem();

            if (this.jTableQuilometragem.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "A consulta não retornou resultado.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                this.JBQuilometragemImprimir.setEnabled(false);
            } else {
                this.JBQuilometragemImprimir.setEnabled(true);
            }

        } catch (QuilometragemException qe) {
            JOptionPane.showMessageDialog(null, qe.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBCadQuilometragemProcurarActionPerformed

    private void jTableQuilometragemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableQuilometragemMousePressed

        if (evt.getButton() == evt.BUTTON3) {
            if (this.jTableQuilometragem.getSelectedRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Selecione um item na lista.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                jMenuSuspenso.show(jTableQuilometragem, evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jTableQuilometragemMousePressed

    private void jScrollPaneQuilometragemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPaneQuilometragemMousePressed

    }//GEN-LAST:event_jScrollPaneQuilometragemMousePressed

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

            String text = this.jComboBoxVeiculo.getSelectedItem().toString();
            String[] placa = text.split("Placa:");
            Veiculo veic = new Veiculo();
            veic.setPlaca(placa[1].trim());
            veic.setID(-1);

            List<Veiculo> listv = new ArrayList<>();
            listv = this.facveiculo.Consultar(veic);

            Quilometragem qui = new Quilometragem();
            qui.setQuilometragem(Integer.parseInt(JTextQuilometragem.getText()));
            Date dtkm = new SimpleDateFormat("dd/MM/yyyy").parse(JTextDataQuilometragem.getText());
            qui.setDataQuilometragem(dtkm);
            qui.setIDVeiculo(listv.get(0).getID());
            qui.setDataCompra(listv.get(0).getDataCompra());
            qui.setKmInicial(listv.get(0).getKmInicial());

            int ret = facquilometragem.Adicionar(qui);
            JOptionPane.showMessageDialog(null, "Quilometragem salva com sucesso.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.limpaCampos();

        } catch (QuilometragemException | VeiculoException qe) {
            JOptionPane.showMessageDialog(null, qe.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {

        }
    }//GEN-LAST:event_JBCadPecasServicosSalvarActionPerformed

    private void JTextQuilometragemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextQuilometragemKeyTyped
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_JTextQuilometragemKeyTyped

    private void jComboBoxVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxVeiculoActionPerformed

        try {
            if (this.jComboBoxVeiculo.getSelectedIndex() > 0) {

                this.CarregaDadosVeiculo();
                this.JPDadosVeiculos.setVisible(true);
                this.JTextQuilometragem.requestFocus();
            } else {
                this.JPDadosVeiculos.setVisible(false);
            }
        } catch (VeiculoException ve) {
            JOptionPane.showMessageDialog(null, ve.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jComboBoxVeiculoActionPerformed


    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

    }//GEN-LAST:event_formComponentShown

    private void jComboBoxVeiculoMesAnoFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxVeiculoMesAnoFiltroActionPerformed

        DefaultTableModel dt = (DefaultTableModel) this.jTableQuilometragem.getModel();
        while (this.jTableQuilometragem.getModel().getRowCount() > 0) {
            dt = (DefaultTableModel) this.jTableQuilometragem.getModel();
            dt.removeRow(0);
        }

        this.JBQuilometragemImprimir.setEnabled(false);

    }//GEN-LAST:event_jComboBoxVeiculoMesAnoFiltroActionPerformed

    private void jMenuItemExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExcluirActionPerformed

        try {
            Quilometragem ve = new Quilometragem();
            ve.setIDQuilometragem((int) this.jTableQuilometragem.getValueAt(this.jTableQuilometragem.getSelectedRow(), 0));

            String km = (String) this.jTableQuilometragem.getValueAt(this.jTableQuilometragem.getSelectedRow(), 1);
            km = km.replace(".", "");
            ve.setQuilometragem(Integer.parseInt(km));

            ve.setDataQuilometragem(Utils.ConvertStringToDate("dd/MM/yyyy", (String) this.jTableQuilometragem.getValueAt(this.jTableQuilometragem.getSelectedRow(), 2)));
            ve.setIDVeiculo(this.quifiltro.getIDVeiculo());
            String msg = "ID: " + ve.getIDQuilometragem() + "\n";
            msg += "Quilometragem: " + this.jTableQuilometragem.getValueAt(this.jTableQuilometragem.getSelectedRow(), 1).toString().toLowerCase() + "\n";
            msg += "Data Quilometragem: " + Utils.FormatData("dd/MM/yyyy", ve.getDataQuilometragem()) + "\n\n";

            if (JOptionPane.showConfirmDialog(this, msg + "Deseja realmente excluir a quilometragem?.", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION) {

                this.excluirQuilometragem(ve);
                this.CarregaTableQuilometragem();
                this.carregaComboVeiculoMesAno();
                JOptionPane.showMessageDialog(jTableQuilometragem, "Quilometragem excluída com sucesso.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                this.jComboBoxVeiculo.setSelectedIndex(0);
            }

        } catch (VeiculoException | QuilometragemException qe) {
            JOptionPane.showMessageDialog(null, qe.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItemExcluirActionPerformed

    private void JBQuilometragemImprimirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBQuilometragemImprimirMouseEntered
        this.JBQuilometragemImprimir.setBackground(new Color(169, 169, 169));
    }//GEN-LAST:event_JBQuilometragemImprimirMouseEntered

    private void JBQuilometragemImprimirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBQuilometragemImprimirMouseExited
        this.JBQuilometragemImprimir.setBackground(this.getBackground());
    }//GEN-LAST:event_JBQuilometragemImprimirMouseExited

    private void JBQuilometragemImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBQuilometragemImprimirActionPerformed

        HashMap parametro = new HashMap();

        try {

            String dtfilto = "";
            if (this.jComboBoxVeiculoMesAnoFiltro.getSelectedIndex() > 0) {
                dtfilto = this.jComboBoxVeiculoMesAnoFiltro.getSelectedItem().toString();
            }

            parametro.put("P_VEICULO", this.quifiltro.getIDVeiculo());
            parametro.put("P_VEICULOPLACA", this.jComboBoxVeiculoFiltro.getSelectedItem());
            parametro.put("P_MESANO", dtfilto);
            JFPrincipal.reportShow.showReportQuilometragem(parametro);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro a gerar o relatório.\n" + ex.getMessage(), "Erro.", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_JBQuilometragemImprimirActionPerformed

    private void jComboBoxVeiculoFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxVeiculoFiltroItemStateChanged

        if (this.jComboBoxVeiculoFiltro.getSelectedIndex() > 0) {
            this.carregaComboVeiculoMesAno();
            this.jComboBoxVeiculoMesAnoFiltro.setEnabled(true);
        } else {

            this.jComboBoxVeiculoMesAnoFiltro.setEnabled(false);
            this.jComboBoxVeiculoMesAnoFiltro.removeAllItems();
        }

    }//GEN-LAST:event_jComboBoxVeiculoFiltroItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCadPecasServicosCancelar;
    private javax.swing.JButton JBCadPecasServicosSalvar;
    private javax.swing.JButton JBCadQuilometragemProcurar;
    private javax.swing.JButton JBQuilometragemImprimir;
    private javax.swing.JLabel JLHome;
    private javax.swing.JPanel JPAcao;
    private javax.swing.JPanel JPDadosVeiculos;
    private javax.swing.JPanel JPIncluir;
    private javax.swing.JFormattedTextField JTextDataQuilometragem;
    private javax.swing.JTextField JTextQuilometragem;
    private javax.swing.JComboBox<String> jComboBoxVeiculo;
    private GUI.JComboBoxCustom jComboBoxVeiculoFiltro;
    private javax.swing.JComboBox<String> jComboBoxVeiculoMesAnoFiltro;
    private javax.swing.JLabel jLCor;
    private javax.swing.JLabel jLDataQuilometragem;
    private javax.swing.JLabel jLFabricante;
    private javax.swing.JLabel jLModelo;
    private javax.swing.JLabel jLProprietario;
    private javax.swing.JLabel jLUltimaQuilometragem;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItemExcluir;
    private javax.swing.JPopupMenu jMenuSuspenso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPaneQuilometragem;
    private javax.swing.JTabbedPane jTabbedPaneQuilometragem;
    private javax.swing.JTable jTableQuilometragem;
    private javax.swing.JLabel jlQtdeRegistroTable;
    // End of variables declaration//GEN-END:variables

    private void limpaCampos() {

        this.jComboBoxVeiculo.setSelectedIndex(0);
        this.JTextDataQuilometragem.setText("");
        this.JTextQuilometragem.setText("");

        //  this.JLIDValor.setVisible(false);
        this.JPDadosVeiculos.setVisible(false);

        this.jComboBoxVeiculoFiltro.setSelectedIndex(0);
        this.jComboBoxVeiculoMesAnoFiltro.removeAllItems();

    }

    private void validaCampos() throws QuilometragemException, Exception {

        if (this.jComboBoxVeiculo.getSelectedIndex() == 0) {
            throw new VeiculoException("Selecione o veículo.");
        }

        if (this.JTextQuilometragem.getText().trim().equals("")) {
            this.JTextQuilometragem.requestFocus();
            throw new QuilometragemException("Informe a quilometragem.");
        }

        if (this.JTextDataQuilometragem.getText().replace("/", "").trim().equals("")) {
            this.JTextDataQuilometragem.requestFocus(true);
            throw new VeiculoException("Informe data da compra.");
        }

    }

    private void carregaComboVeiculo() throws Exception, VeiculoException {

        Veiculo v = new Veiculo();
        v.setID(-1);
        v.setPlaca("");

        List<Veiculo> listv = new ArrayList<Veiculo>();
        listv = this.facveiculo.Consultar(v);

        Collections.sort(listv, Comparator.comparing(Veiculo::getModelo));

        this.jComboBoxVeiculo.addItem("-- Selecione --");
        this.jComboBoxVeiculoFiltro.addItem("-- Selecione --");

        for (Veiculo veiculo : listv) {
            this.jComboBoxVeiculo.addItem(veiculo.getModelo() + ", Placa: " + veiculo.getPlaca());
            this.jComboBoxVeiculoFiltro.addItem(veiculo.getModelo() + ", Placa: " + veiculo.getPlaca());
        }

        this.jComboBoxVeiculo.setSelectedIndex(0);
        this.jComboBoxVeiculoFiltro.setSelectedIndex(0);

    }

    private void CarregaDadosVeiculo() throws Exception, VeiculoException {

        String text = this.jComboBoxVeiculo.getSelectedItem().toString();
        String[] placa = text.split("Placa:");
        DecimalFormat df = new DecimalFormat("#,###,###");
        Veiculo veic = new Veiculo();
        veic.setPlaca(placa[1].trim());
        veic.setID(-1);

        List<Veiculo> listv = new ArrayList<>();

        listv = this.facveiculo.Consultar(veic);

        if (listv.size() > 0) {

            Quilometragem quirodape = new Quilometragem();
            quirodape.setIDVeiculo(listv.get(0).getID());

            String[] retdados = this.facquilometragem.ConsultaMaxQuilometragem(quirodape);

            for (Veiculo veiculo : listv) {

                if (retdados[1] != null) {

                    retdados[1] = retdados[1].replace("-", "");

                    String dtf = retdados[1].substring(6, 8);
                    dtf += "/" + retdados[1].substring(4, 6);
                    dtf += "/" + retdados[1].substring(0, 4);
                    this.jLDataQuilometragem.setText(dtf);
                } else {
                    this.jLDataQuilometragem.setText("");
                }

                this.jLProprietario.setText(veiculo.getProprietario());
                this.jLModelo.setText(veiculo.getModelo());
                this.jLFabricante.setText(veiculo.getFabricante());
                this.jLCor.setText(veiculo.getCor());
                this.jLUltimaQuilometragem.setText((retdados[0] != null) ? Utils.FormartDecimal("#,###,###", Integer.parseInt(retdados[0])) : "");

            }
        } else {

            this.jLProprietario.setText("");
            this.jLModelo.setText("");
            this.jLFabricante.setText("");
            this.jLCor.setText("");
        }

    }

    private void carregaComboVeiculoMesAno() {

        try {

            this.jComboBoxVeiculoMesAnoFiltro.removeAllItems();
            this.jComboBoxVeiculoMesAnoFiltro.addItem("-- Todos --");
            List<String> listmesano = new ArrayList<>();

            String text = this.jComboBoxVeiculoFiltro.getSelectedItem().toString();
            String[] placa = text.split("Placa:");
            Veiculo veic = new Veiculo();
            veic.setPlaca(placa[1].trim());
            veic.setID(-1);

            List<Veiculo> listv = new ArrayList<>();
            listv = this.facveiculo.Consultar(veic);

            this.quifiltro.setIDVeiculo(listv.get(0).getID());

            listmesano = this.facquilometragem.CarregaComboMesAno(this.quifiltro);

            Collections.reverse(listmesano);

            for (String object : listmesano) {

                this.jComboBoxVeiculoMesAnoFiltro.addItem(object);
            }

        } catch (VeiculoException | QuilometragemException ve) {
            JOptionPane.showMessageDialog(null, ve.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void CarregaTableQuilometragem() {

        try {

            List<Quilometragem> listqui = new ArrayList<>();
            Quilometragem quifil = new Quilometragem();
            quifil.setIDVeiculo(this.quifiltro.getIDVeiculo());

            if (this.jComboBoxVeiculoMesAnoFiltro.getSelectedIndex() > 0) {
                String dtquilo = "01/" + (String) this.jComboBoxVeiculoMesAnoFiltro.getSelectedItem();
                Date dtquilodt = Utils.ConvertStringToDate("dd/MM/yyyy", dtquilo);
                quifil.setDataQuilometragem(dtquilodt);
            } else {
                quifil.setDataQuilometragem(null);
            }

            listqui = this.facquilometragem.ConsultarTabela(quifil);

            DefaultTableModel dt = (DefaultTableModel) this.jTableQuilometragem.getModel();

            while (this.jTableQuilometragem.getModel().getRowCount() > 0) {
                dt = (DefaultTableModel) this.jTableQuilometragem.getModel();
                dt.removeRow(0);
            }

            for (Quilometragem qui : listqui) {
                Object[] row = {qui.getIDQuilometragem(), Utils.FormartDecimal("#,###,###", qui.getQuilometragem()), Utils.FormatData("dd/MM/yyyy", qui.getDataQuilometragem()), Utils.FormatData("dd/MM/yyyy", qui.getDataAdd())};
                dt.addRow(row);
            }

            this.jlQtdeRegistroTable.setVisible(true);
            this.jlQtdeRegistroTable.setText("Quantidade de registro encontrado: " + dt.getRowCount());

            jTableCustom jtb = new jTableCustom();
            jtb = (jTableCustom) this.jTableQuilometragem;

            jtb.ColorRow(jTableQuilometragem, new String[]{"D", "D", "C", "C"});

        } catch (VeiculoException | QuilometragemException vq) {
            JOptionPane.showMessageDialog(null, vq.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void excluirQuilometragem(Quilometragem ve) throws VeiculoException, VeiculoException, Exception {

        int ret = this.facquilometragem.Excluir(ve);

    }
}
