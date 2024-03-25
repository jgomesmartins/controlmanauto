package GUI;

import Classes.Config;
import Entidade.Manutencao;
import Entidade.ManutencaoException;
import Entidade.QuilometragemException;
import Entidade.TipoManutencao;
import Classes.Utils;
import Entidade.Veiculo;
import Entidade.VeiculoException;
import Fachada.FacManutencao;
import Fachada.FacQuilometragem;
import Fachada.FacTipoManutencao;
import Fachada.FacVeiculo;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GOMES
 */
public class JPManutencao extends javax.swing.JPanel {

    private final FacVeiculo facveiculo;
    private final FacQuilometragem facquilometragem;
    private final FacTipoManutencao factipomanutencao;
    private final FacManutencao facmanutencao;

    /**
     * Creates new form JPManutencao
     */
    public JPManutencao() {
        initComponents();

        this.facveiculo = new Fachada.FacVeiculo();
        this.facquilometragem = new FacQuilometragem();
        this.factipomanutencao = new FacTipoManutencao();
        this.facmanutencao = new FacManutencao();

        this.CarregaComboVeiculo();
        this.CarregaComboTipoManutencao();
        this.carregaComboSituacao();

        this.jTabbedPaneManutencao.setSelectedIndex(1);
        this.jlQtdeRegistroTable.setVisible(false);

        this.JPDatosUltimaTroca.setVisible(false);

    }

    private void carregaComboSituacao() {

        this.jComboBoxVeiculoSituacaoFiltro.removeAllItems();

        int cod[] = {-1, 1, 2};

        this.jComboBoxVeiculoSituacaoFiltro.setCodCombo(cod);
        this.jComboBoxVeiculoSituacaoFiltro.addItem("-- Todas --");
        this.jComboBoxVeiculoSituacaoFiltro.addItem("EM USO");
        this.jComboBoxVeiculoSituacaoFiltro.addItem("SUBSTITUÍDO");

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
        jTabbedPaneManutencao = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jlQtdeRegistroTable = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableManutencao = new GUI.jTableCustom();
        jPanel6 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        JBCadQuilometragemProcurar = new javax.swing.JButton();
        JBManutencaoImprimir = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jComboBoxVeiculoManutencaoFiltro = new GUI.JComboBoxCustom();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jComboBoxVeiculoFiltro = new GUI.JComboBoxCustom();
        jLabel36 = new javax.swing.JLabel();
        jComboBoxVeiculoSituacaoFiltro = new GUI.JComboBoxCustom();
        JPIncluir = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        JTextQuilometragem = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        JTextDataQuilometragem = new javax.swing.JFormattedTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextObservacao = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        JLQtdeCaracretes = new javax.swing.JLabel();
        JTextValor = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jComboBoxTipoManutencao = new GUI.JComboBoxCustom();
        jComboBoxVeiculo = new GUI.JComboBoxCustom();
        JPAcao = new javax.swing.JPanel();
        JBCadManutencaoCancelar = new javax.swing.JButton();
        JBCadManutencaoSalvar = new javax.swing.JButton();
        JPDatosUltimaTroca = new javax.swing.JPanel();
        JLDataUltimaTroca = new javax.swing.JLabel();
        JLQuilometragemUltimaTroca = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

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

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 153));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Manutenção");
        jLabel10.setToolTipText("");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Informar manutenção executada no veículo");
        jLabel6.setToolTipText("");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTabbedPaneManutencao.setForeground(new java.awt.Color(0, 102, 153));
        jTabbedPaneManutencao.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPaneManutencao.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jlQtdeRegistroTable.setBackground(new java.awt.Color(255, 255, 255));
        jlQtdeRegistroTable.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jlQtdeRegistroTable.setForeground(new java.awt.Color(0, 102, 153));
        jlQtdeRegistroTable.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlQtdeRegistroTable.setText("jlQtdeRegistroTable");
        jlQtdeRegistroTable.setToolTipText("");
        jlQtdeRegistroTable.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTableManutencao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DESCRIÇÃO", "KM. MANUTENÇÃO", "DT. MANUTENÇÃO", "VALOR", "OBSERVAÇÃO", "DT. CADASTRO", "SITUAÇÃO", "KM. PROX. TROCA", "DT.PROX. TROCA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableManutencao.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTableManutencao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableManutencaoMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTableManutencao);
        if (jTableManutencao.getColumnModel().getColumnCount() > 0) {
            jTableManutencao.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTableManutencao.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTableManutencao.getColumnModel().getColumn(2).setPreferredWidth(120);
            jTableManutencao.getColumnModel().getColumn(3).setPreferredWidth(130);
            jTableManutencao.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTableManutencao.getColumnModel().getColumn(5).setPreferredWidth(230);
            jTableManutencao.getColumnModel().getColumn(6).setPreferredWidth(100);
            jTableManutencao.getColumnModel().getColumn(7).setPreferredWidth(100);
            jTableManutencao.getColumnModel().getColumn(8).setPreferredWidth(120);
            jTableManutencao.getColumnModel().getColumn(9).setPreferredWidth(120);
        }

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14), new java.awt.Color(0, 102, 153))); // NOI18N

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 102, 153));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Veículo");
        jLabel22.setToolTipText("");
        jLabel22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JBCadQuilometragemProcurar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JBCadQuilometragemProcurar.setForeground(new java.awt.Color(0, 102, 153));
        JBCadQuilometragemProcurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-pesquisa-google-na-web-40.png"))); // NOI18N
        JBCadQuilometragemProcurar.setToolTipText("Procurar.");
        JBCadQuilometragemProcurar.setBorderPainted(false);
        JBCadQuilometragemProcurar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBCadQuilometragemProcurar.setFocusPainted(false);
        JBCadQuilometragemProcurar.setFocusable(false);
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

        JBManutencaoImprimir.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JBManutencaoImprimir.setForeground(new java.awt.Color(0, 102, 153));
        JBManutencaoImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-enviar-para-a-impressora-40.png"))); // NOI18N
        JBManutencaoImprimir.setToolTipText("Gerar relatório.");
        JBManutencaoImprimir.setBorderPainted(false);
        JBManutencaoImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBManutencaoImprimir.setEnabled(false);
        JBManutencaoImprimir.setFocusPainted(false);
        JBManutencaoImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBManutencaoImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBManutencaoImprimirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBManutencaoImprimirMouseExited(evt);
            }
        });
        JBManutencaoImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBManutencaoImprimirActionPerformed(evt);
            }
        });

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 102, 153));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText("Veículo");
        jLabel28.setToolTipText("");
        jLabel28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 102, 153));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setText("Veículo");
        jLabel29.setToolTipText("");
        jLabel29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 102, 153));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel32.setText("Veículo");
        jLabel32.setToolTipText("");
        jLabel32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jComboBoxVeiculoManutencaoFiltro.setEnabled(false);
        jComboBoxVeiculoManutencaoFiltro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxVeiculoManutencaoFiltroItemStateChanged(evt);
            }
        });
        jComboBoxVeiculoManutencaoFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxVeiculoManutencaoFiltroActionPerformed(evt);
            }
        });

        jLabel34.setBackground(new java.awt.Color(255, 255, 255));
        jLabel34.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 102, 153));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel34.setText("Tipo Manutenção");
        jLabel34.setToolTipText("");
        jLabel34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 102, 153));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel35.setText("Veículo");
        jLabel35.setToolTipText("");
        jLabel35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jComboBoxVeiculoFiltro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxVeiculoFiltroItemStateChanged(evt);
            }
        });
        jComboBoxVeiculoFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxVeiculoFiltroActionPerformed(evt);
            }
        });

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 102, 153));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel36.setText("Situação");
        jLabel36.setToolTipText("");
        jLabel36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jComboBoxVeiculoSituacaoFiltro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxVeiculoSituacaoFiltroItemStateChanged(evt);
            }
        });
        jComboBoxVeiculoSituacaoFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxVeiculoSituacaoFiltroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxVeiculoFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                            .addComponent(jComboBoxVeiculoManutencaoFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxVeiculoSituacaoFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addComponent(JBManutencaoImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBCadQuilometragemProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBCadQuilometragemProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBManutencaoImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxVeiculoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxVeiculoManutencaoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxVeiculoSituacaoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(48, 48, 48)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlQtdeRegistroTable, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlQtdeRegistroTable, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        jTabbedPaneManutencao.addTab("CONSULTAR", new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-lista-de-verificação-18.png")), jPanel2); // NOI18N

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("* Campos com preenchimento obrigatório.");
        jLabel20.setToolTipText("");
        jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Quantidade de caracteres restantes:");
        jLabel12.setToolTipText("");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

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

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 102, 153));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Tipo*");
        jLabel23.setToolTipText("");
        jLabel23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 153));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Valor $*");
        jLabel14.setToolTipText("");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTextObservacao.setColumns(20);
        jTextObservacao.setDocument(new JTextFieldLimit(200));
        jTextObservacao.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextObservacao.setForeground(new java.awt.Color(0, 102, 153));
        jTextObservacao.setLineWrap(true);
        jTextObservacao.setRows(5);
        jTextObservacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextObservacaoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextObservacaoKeyTyped(evt);
            }
        });
        jTextObservacao.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jTextObservacaoVetoableChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTextObservacao);

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 153));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Observação");
        jLabel15.setToolTipText("");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JLQtdeCaracretes.setBackground(new java.awt.Color(255, 255, 255));
        JLQtdeCaracretes.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        JLQtdeCaracretes.setForeground(new java.awt.Color(0, 102, 153));
        JLQtdeCaracretes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLQtdeCaracretes.setText("200");
        JLQtdeCaracretes.setToolTipText("");
        JLQtdeCaracretes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JTextValor.setDocument(new JTextFieldLimit(10));
        JTextValor.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JTextValor.setForeground(new java.awt.Color(0, 102, 153));
        JTextValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextValorKeyTyped(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 153));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Data*");
        jLabel16.setToolTipText("");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jComboBoxTipoManutencao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoManutencaoActionPerformed(evt);
            }
        });

        jComboBoxVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxVeiculoActionPerformed(evt);
            }
        });

        JPAcao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14), new java.awt.Color(0, 102, 153))); // NOI18N
        JPAcao.setLayout(null);

        JBCadManutencaoCancelar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JBCadManutencaoCancelar.setForeground(new java.awt.Color(0, 102, 153));
        JBCadManutencaoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-cancelar-30.png"))); // NOI18N
        JBCadManutencaoCancelar.setText("Cancelar");
        JBCadManutencaoCancelar.setToolTipText("Limpa os campos a cancela operação.");
        JBCadManutencaoCancelar.setBorderPainted(false);
        JBCadManutencaoCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBCadManutencaoCancelar.setFocusPainted(false);
        JBCadManutencaoCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBCadManutencaoCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBCadManutencaoCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBCadManutencaoCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBCadManutencaoCancelarMouseExited(evt);
            }
        });
        JBCadManutencaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadManutencaoCancelarActionPerformed(evt);
            }
        });
        JPAcao.add(JBCadManutencaoCancelar);
        JBCadManutencaoCancelar.setBounds(20, 20, 100, 80);

        JBCadManutencaoSalvar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JBCadManutencaoSalvar.setForeground(new java.awt.Color(0, 102, 153));
        JBCadManutencaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-guardar-todos-30.png"))); // NOI18N
        JBCadManutencaoSalvar.setText("Salvar");
        JBCadManutencaoSalvar.setToolTipText("Salvar as informações.");
        JBCadManutencaoSalvar.setBorderPainted(false);
        JBCadManutencaoSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBCadManutencaoSalvar.setFocusPainted(false);
        JBCadManutencaoSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBCadManutencaoSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBCadManutencaoSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBCadManutencaoSalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBCadManutencaoSalvarMouseExited(evt);
            }
        });
        JBCadManutencaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadManutencaoSalvarActionPerformed(evt);
            }
        });
        JPAcao.add(JBCadManutencaoSalvar);
        JBCadManutencaoSalvar.setBounds(120, 20, 100, 80);

        JPDatosUltimaTroca.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Última troca", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14), new java.awt.Color(0, 102, 153))); // NOI18N
        JPDatosUltimaTroca.setLayout(null);

        JLDataUltimaTroca.setBackground(new java.awt.Color(255, 255, 255));
        JLDataUltimaTroca.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        JLDataUltimaTroca.setForeground(new java.awt.Color(0, 102, 153));
        JLDataUltimaTroca.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLDataUltimaTroca.setText("Data:");
        JLDataUltimaTroca.setToolTipText("");
        JLDataUltimaTroca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JPDatosUltimaTroca.add(JLDataUltimaTroca);
        JLDataUltimaTroca.setBounds(80, 40, 80, 20);

        JLQuilometragemUltimaTroca.setBackground(new java.awt.Color(255, 255, 255));
        JLQuilometragemUltimaTroca.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        JLQuilometragemUltimaTroca.setForeground(new java.awt.Color(0, 102, 153));
        JLQuilometragemUltimaTroca.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLQuilometragemUltimaTroca.setText("Quilometragem:");
        JLQuilometragemUltimaTroca.setToolTipText("");
        JLQuilometragemUltimaTroca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JPDatosUltimaTroca.add(JLQuilometragemUltimaTroca);
        JLQuilometragemUltimaTroca.setBounds(320, 40, 80, 20);

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 102, 153));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("Data:");
        jLabel26.setToolTipText("");
        jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JPDatosUltimaTroca.add(jLabel26);
        jLabel26.setBounds(20, 40, 60, 20);

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 102, 153));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel27.setText("Quilometragem:");
        jLabel27.setToolTipText("");
        jLabel27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JPDatosUltimaTroca.add(jLabel27);
        jLabel27.setBounds(190, 40, 130, 20);

        javax.swing.GroupLayout JPIncluirLayout = new javax.swing.GroupLayout(JPIncluir);
        JPIncluir.setLayout(JPIncluirLayout);
        JPIncluirLayout.setHorizontalGroup(
            JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPIncluirLayout.createSequentialGroup()
                .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPIncluirLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPIncluirLayout.createSequentialGroup()
                                .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JPIncluirLayout.createSequentialGroup()
                                        .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(JTextQuilometragem)
                                            .addComponent(JTextDataQuilometragem, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                            .addComponent(JTextValor))
                                        .addGap(47, 47, 47)
                                        .addComponent(JPDatosUltimaTroca, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jComboBoxTipoManutencao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                                        .addComponent(jComboBoxVeiculo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPIncluirLayout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JPAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(JPIncluirLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(JLQtdeCaracretes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPIncluirLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(237, Short.MAX_VALUE))
        );
        JPIncluirLayout.setVerticalGroup(
            JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPIncluirLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPIncluirLayout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPIncluirLayout.createSequentialGroup()
                        .addComponent(jComboBoxVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jComboBoxTipoManutencao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPIncluirLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(JTextQuilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(JTextDataQuilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(JTextValor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPIncluirLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(JPDatosUltimaTroca, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(16, 16, 16)
                .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPIncluirLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLQtdeCaracretes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneManutencao.addTab("INCLUIR", new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-adicionar-linha-18.png")), JPIncluir); // NOI18N

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("___________________________________________________________________________________________________________________________________________________________");
        jLabel4.setToolTipText("");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

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
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTabbedPaneManutencao)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLHome, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
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
                .addGap(0, 0, 0)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPaneManutencao)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JLHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLHomeMouseClicked
        JFPrincipal.setPanelMain(new JPHome());
    }//GEN-LAST:event_JLHomeMouseClicked

    private void JTextQuilometragemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextQuilometragemKeyTyped
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_JTextQuilometragemKeyTyped

    private void jTextObservacaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextObservacaoKeyReleased

        int qtdcarac = 0;
        qtdcarac = 200 - this.jTextObservacao.getText().length();

        this.JLQtdeCaracretes.setText(Integer.toString(qtdcarac));
    }//GEN-LAST:event_jTextObservacaoKeyReleased

    private void jTextObservacaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextObservacaoKeyTyped

    }//GEN-LAST:event_jTextObservacaoKeyTyped

    private void jTextObservacaoVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jTextObservacaoVetoableChange

    }//GEN-LAST:event_jTextObservacaoVetoableChange

    private void JTextValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextValorKeyTyped
        String caracteres = "0987654321,";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_JTextValorKeyTyped

    private void JBCadManutencaoCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCadManutencaoCancelarMouseEntered
        this.JBCadManutencaoCancelar.setBackground(new Color(169, 169, 169));
    }//GEN-LAST:event_JBCadManutencaoCancelarMouseEntered

    private void JBCadManutencaoCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCadManutencaoCancelarMouseExited
        this.JBCadManutencaoCancelar.setBackground(this.getBackground());
    }//GEN-LAST:event_JBCadManutencaoCancelarMouseExited

    private void JBCadManutencaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadManutencaoCancelarActionPerformed
        this.limpaCampos();
    }//GEN-LAST:event_JBCadManutencaoCancelarActionPerformed

    private void JBCadManutencaoSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCadManutencaoSalvarMouseEntered
        this.JBCadManutencaoSalvar.setBackground(new Color(169, 169, 169));
    }//GEN-LAST:event_JBCadManutencaoSalvarMouseEntered

    private void JBCadManutencaoSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCadManutencaoSalvarMouseExited
        this.JBCadManutencaoSalvar.setBackground(this.getBackground());
    }//GEN-LAST:event_JBCadManutencaoSalvarMouseExited

    private void JBCadManutencaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadManutencaoSalvarActionPerformed

        try {

            this.validaCampos();

            Manutencao man = new Manutencao();

            man.setIDTipoManutencao(this.jComboBoxTipoManutencao.getCodSelect());
            man.setIDVeiculo(this.jComboBoxVeiculo.getCodSelect());
            man.setQuilometragem(Integer.parseInt(this.JTextQuilometragem.getText()));
            man.setDataManutencao(Utils.ConvertStringToDate("dd/MM/yyyy", this.JTextDataQuilometragem.getText()));
            man.setValor(Float.parseFloat(this.JTextValor.getText().replace(",", ".")));
            man.setObservacao(this.jTextObservacao.getText().trim());
            man.setPlaca("");
            man.setSituacao(1);

            List<Veiculo> listv = new ArrayList<>();
            listv = this.facveiculo.Consultar(man);

            man.setKmInicial(listv.get(0).getKmInicial());
            man.setDataCompra(listv.get(0).getDataCompra());

            TipoManutencao tm = new TipoManutencao();
            tm.setID(this.jComboBoxTipoManutencao.getCodSelect());

            List<TipoManutencao> listtpm = new ArrayList<>();
            listtpm = this.factipomanutencao.Consultar(tm);

            if (listtpm.get(0).getQuilometragem() > 0) {
                int kmproxtroca = man.getQuilometragem() + listtpm.get(0).getQuilometragem() + 1;
                man.setKMProxTroca(kmproxtroca);
            }

            if (listtpm.get(0).getMeses() > 0) {

                Calendar cal = Calendar.getInstance();
                cal.setTime(man.getDataManutencao());
                cal.add(Calendar.MONTH, listtpm.get(0).getMeses());
                cal.add(Calendar.DATE, 1);
                man.setDTProxTroca(cal.getTime());
            }

            List<Manutencao> listman = new ArrayList<>();

            listman = this.facmanutencao.Consultar(man);

            for (Manutencao m : listman) {
                man.setIDManutencao(m.getIDManutencao());
                man.setKMTroca(man.getQuilometragem());
                man.setDTTroca(man.getDataManutencao());
            }

            int ret = this.gravarManutencao(man);

            if (listman.size() > 0) {
                int retUp = this.atualizaUltimaManutencao(man);
            }

            JOptionPane.showMessageDialog(null, "Manutenção salva com sucesso.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.limpaCampos();

        } catch (ManutencaoException | VeiculoException | QuilometragemException | ParseException qe) {
            JOptionPane.showMessageDialog(null, qe.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBCadManutencaoSalvarActionPerformed

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

            this.CarregaTableManutencao();

            if (this.jTableManutencao.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "A consulta não retornou resultado.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                this.JBManutencaoImprimir.setEnabled(false);
            } else {
                this.JBManutencaoImprimir.setEnabled(true);
            }

        } catch (QuilometragemException | ManutencaoException | VeiculoException qe) {
            JOptionPane.showMessageDialog(null, qe.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBCadQuilometragemProcurarActionPerformed

    private void jMenuItemExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExcluirActionPerformed

        try {
            Manutencao man = new Manutencao();
            man.setIDManutencao((int) this.jTableManutencao.getValueAt(this.jTableManutencao.getSelectedRow(), 0));

            String msg = "ID: " + man.getIDManutencao() + "\n";
            msg += "Tipo: " + this.jTableManutencao.getValueAt(this.jTableManutencao.getSelectedRow(), 1) + "\n";

            String strstatus = (String) this.jTableManutencao.getValueAt(this.jTableManutencao.getSelectedRow(), 7);

            if (JOptionPane.showConfirmDialog(this, msg + "Deseja realmente excluir a manutenção?.", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION) {

                List<Manutencao> listmanup = new ArrayList<>();

                listmanup = this.consultaManUpdate(man);

                if (strstatus.equals("SUBSTITUÍDO")) {
                    throw new ManutencaoException("Não é permitido excluir manutenção que já foi realizado substituição.\nOperação abortada.");
                }

                if (listmanup.size() > 0) {
                    Manutencao mup = new Manutencao();
                    mup.setIDManutencao(listmanup.get(0).getIDManutencao());
                    int ret = this.updateManDelete(mup);
                }

                this.excluirManutencao(man);

                this.CarregaTableManutencao();
                this.jComboBoxVeiculo.setSelectedIndex(0);
                this.jComboBoxTipoManutencao.setSelectedIndex(0);
                JOptionPane.showMessageDialog(jTableManutencao, "Manutenção excluído com sucesso.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (QuilometragemException | ManutencaoException | VeiculoException qe) {
            JOptionPane.showMessageDialog(null, qe.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItemExcluirActionPerformed

    private void jTableManutencaoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableManutencaoMousePressed
        if (evt.getButton() == evt.BUTTON3) {
            if (this.jTableManutencao.getSelectedRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Selecione um item na lista.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                jMenuSuspenso.show(jTableManutencao, evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jTableManutencaoMousePressed

    private void jComboBoxTipoManutencaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoManutencaoActionPerformed

        if (this.jComboBoxVeiculo.getSelectedIndex() > 0 && this.jComboBoxTipoManutencao.getSelectedIndex() > 0) {
            this.JPDatosUltimaTroca.setVisible(true);
            this.CarregaDadosUltimaTroca();
        } else {
            this.JPDatosUltimaTroca.setVisible(false);
        }


    }//GEN-LAST:event_jComboBoxTipoManutencaoActionPerformed

    private void jComboBoxVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxVeiculoActionPerformed
        if (this.jComboBoxVeiculo.getSelectedIndex() > 0 && this.jComboBoxTipoManutencao.getSelectedIndex() > 0) {
            this.JPDatosUltimaTroca.setVisible(true);
            this.CarregaDadosUltimaTroca();

        } else {
            this.JPDatosUltimaTroca.setVisible(false);
        }
    }//GEN-LAST:event_jComboBoxVeiculoActionPerformed

    private void JBManutencaoImprimirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBManutencaoImprimirMouseEntered
        this.JBManutencaoImprimir.setBackground(new Color(169, 169, 169));
    }//GEN-LAST:event_JBManutencaoImprimirMouseEntered

    private void JBManutencaoImprimirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBManutencaoImprimirMouseExited
        this.JBManutencaoImprimir.setBackground(this.getBackground());
    }//GEN-LAST:event_JBManutencaoImprimirMouseExited

    private void JBManutencaoImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBManutencaoImprimirActionPerformed

        HashMap parametro = new HashMap();
        List<HashMap> listDados = new ArrayList<>();

        parametro.put("P_LOGO", Config.IMAGEICON.getImage());

        try {

            DefaultTableModel df = (DefaultTableModel) this.jTableManutencao.getModel();

            for (int i = 0; i < df.getRowCount(); i++) {

                HashMap row = new HashMap();

                row.put("ID", df.getValueAt(i, 0));
                row.put("DESCRICAO", df.getValueAt(i, 1));
                row.put("KMMANUTENCAO", df.getValueAt(i, 2));
                row.put("DTMANUTENCAO", df.getValueAt(i, 3));
                row.put("VALOR", Float.parseFloat(String.valueOf(df.getValueAt(i, 4)).replace(".", "").replace(",", ".")));
                row.put("OBSERVACAO", df.getValueAt(i, 5));
                row.put("DTCADASTRO", df.getValueAt(i, 6));
                row.put("SITUACAO", df.getValueAt(i, 7));
                row.put("KMPROXTROCA", df.getValueAt(i, 8));
                row.put("DTPROXTROCA", df.getValueAt(i, 9));
                row.put("VEICULO", this.jComboBoxVeiculoFiltro.getSelectedItem());
                listDados.add(row);

            }

            JFPrincipal.reportShow.showReportManutencao(parametro, listDados);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro a gerar o relatório.\n" + ex.getMessage(), "Erro.", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBManutencaoImprimirActionPerformed

    private void jComboBoxVeiculoManutencaoFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxVeiculoManutencaoFiltroActionPerformed

    }//GEN-LAST:event_jComboBoxVeiculoManutencaoFiltroActionPerformed

    private void jComboBoxVeiculoFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxVeiculoFiltroActionPerformed

    }//GEN-LAST:event_jComboBoxVeiculoFiltroActionPerformed

    private void jComboBoxVeiculoFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxVeiculoFiltroItemStateChanged

        if (this.jComboBoxVeiculoFiltro.getSelectedIndex() > 0) {
            this.carregaComboManutencaoFiltro();
            this.jComboBoxVeiculoManutencaoFiltro.setEnabled(true);
        } else {

            this.jComboBoxVeiculoManutencaoFiltro.setEnabled(false);
            this.jComboBoxVeiculoManutencaoFiltro.removeAllItems();
        }

    }//GEN-LAST:event_jComboBoxVeiculoFiltroItemStateChanged

    private void jComboBoxVeiculoManutencaoFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxVeiculoManutencaoFiltroItemStateChanged
        this.jTableManutencao.deleteRows();
        this.JBManutencaoImprimir.setEnabled(false);
    }//GEN-LAST:event_jComboBoxVeiculoManutencaoFiltroItemStateChanged

    private void jComboBoxVeiculoSituacaoFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxVeiculoSituacaoFiltroItemStateChanged
        this.jTableManutencao.deleteRows();
        this.JBManutencaoImprimir.setEnabled(false);
    }//GEN-LAST:event_jComboBoxVeiculoSituacaoFiltroItemStateChanged

    private void jComboBoxVeiculoSituacaoFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxVeiculoSituacaoFiltroActionPerformed
        
    }//GEN-LAST:event_jComboBoxVeiculoSituacaoFiltroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCadManutencaoCancelar;
    private javax.swing.JButton JBCadManutencaoSalvar;
    private javax.swing.JButton JBCadQuilometragemProcurar;
    private javax.swing.JButton JBManutencaoImprimir;
    private javax.swing.JLabel JLDataUltimaTroca;
    private javax.swing.JLabel JLHome;
    private javax.swing.JLabel JLQtdeCaracretes;
    private javax.swing.JLabel JLQuilometragemUltimaTroca;
    private javax.swing.JPanel JPAcao;
    private javax.swing.JPanel JPDatosUltimaTroca;
    private javax.swing.JPanel JPIncluir;
    private javax.swing.JFormattedTextField JTextDataQuilometragem;
    private javax.swing.JTextField JTextQuilometragem;
    private javax.swing.JTextField JTextValor;
    private GUI.JComboBoxCustom jComboBoxTipoManutencao;
    private GUI.JComboBoxCustom jComboBoxVeiculo;
    private GUI.JComboBoxCustom jComboBoxVeiculoFiltro;
    private GUI.JComboBoxCustom jComboBoxVeiculoManutencaoFiltro;
    private GUI.JComboBoxCustom jComboBoxVeiculoSituacaoFiltro;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItemExcluir;
    private javax.swing.JPopupMenu jMenuSuspenso;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPaneManutencao;
    private GUI.jTableCustom jTableManutencao;
    private javax.swing.JTextArea jTextObservacao;
    private javax.swing.JLabel jlQtdeRegistroTable;
    // End of variables declaration//GEN-END:variables

    private void limpaCampos() {

        this.jComboBoxVeiculoFiltro.setSelectedIndex(0);
        this.jComboBoxVeiculo.setSelectedIndex(0);
        this.jComboBoxTipoManutencao.setSelectedIndex(0);

        this.JTextQuilometragem.setText("");
        this.JTextDataQuilometragem.setText("");
        this.JTextValor.setText("");
        this.jTextObservacao.setText("");

    }

    private void validaCampos() throws ManutencaoException, ParseException {

        try {

            if (this.jComboBoxVeiculo.getSelectedIndex() == 0) {
                throw new ManutencaoException("Selecione o veículo");
            }

            if (this.jComboBoxTipoManutencao.getSelectedIndex() == 0) {
                throw new ManutencaoException("Selecione o tipo de manutenção");

            }

            if (this.JTextQuilometragem.getText().trim().equals("")) {
                this.JTextQuilometragem.requestFocus();
                throw new ManutencaoException("Informe quilometragem do veículo no dia que foi realizado a manutenção.");

            }

            if (this.JTextDataQuilometragem.getText().replace("/", "").trim().equals("")) {
                this.JTextDataQuilometragem.requestFocus();
                throw new ManutencaoException("Informe a data que foi realizado a manutenção.");
            }

            if (this.JTextValor.getText().replace("/", "").trim().equals("")) {
                this.JTextValor.requestFocus();
                throw new ManutencaoException("Informa o valor da manutenção");
            }

            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            df.setLenient(false);
            Date dtp = df.parse(this.JTextDataQuilometragem.getText());

        } catch (ParseException e) {
            throw new ManutencaoException("Data da manutenção inválida!.");
        }

    }

    private int gravarManutencao(Manutencao man) throws Exception, VeiculoException, QuilometragemException, ManutencaoException {

        int ret = 0;

        ret = this.facmanutencao.Adicionar(man);

        return ret;

    }

    private void CarregaComboVeiculo() {

        try {

            Veiculo v = new Veiculo();
            v.setID(-1);
            v.setPlaca("");

            List<Veiculo> listv = new ArrayList<>();
            listv = this.facveiculo.Consultar(v);

            Collections.sort(listv, Comparator.comparing(Veiculo::getModelo));

            this.jComboBoxVeiculo.addItem("-- Selecione --");
            this.jComboBoxVeiculoFiltro.addItem("-- Selecione --");

            this.jComboBoxVeiculo.setSelectedIndex(0);
            this.jComboBoxVeiculoFiltro.setSelectedIndex(0);

            int[] listaInt = new int[listv.size() + 1];

            for (int x = 1; x <= listv.size(); x++) {
                listaInt[x] = listv.get(x - 1).getID();
                this.jComboBoxVeiculo.addItem(listv.get(x - 1).getModelo() + ", Placa: " + listv.get(x - 1).getPlaca());
                this.jComboBoxVeiculoFiltro.addItem(listv.get(x - 1).getModelo() + ", Placa: " + listv.get(x - 1).getPlaca());
            }

            this.jComboBoxVeiculo.setCodCombo(listaInt);
            this.jComboBoxVeiculoFiltro.setCodCombo(listaInt);

        } catch (QuilometragemException | ManutencaoException | VeiculoException qe) {
            JOptionPane.showMessageDialog(null, qe.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void CarregaComboTipoManutencao() {

        try {

            this.jComboBoxTipoManutencao.removeAllItems();
            this.jComboBoxTipoManutencao.addItem("-- Selecione --");
            TipoManutencao tmp = new TipoManutencao();
            List<TipoManutencao> listtip = new ArrayList<>();

            listtip = this.factipomanutencao.Consultar(tmp);

            int[] listaInt = new int[listtip.size() + 1];

            for (int x = 1; x <= listtip.size(); x++) {
                listaInt[x] = listtip.get(x - 1).getID();
                this.jComboBoxTipoManutencao.addItem(listtip.get(x - 1).getDescricao() + ", KM: " + Utils.FormartDecimal("###,###", listtip.get(x - 1).getQuilometragem()));
            }

            this.jComboBoxTipoManutencao.setCodCombo(listaInt);
        } catch (QuilometragemException | ManutencaoException | VeiculoException qe) {
            JOptionPane.showMessageDialog(null, qe.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void CarregaTableManutencao() throws Exception, VeiculoException, ManutencaoException {

        Manutencao man = new Manutencao();

        TipoManutencao tm = new TipoManutencao();

        tm.setID(this.jComboBoxTipoManutencao.getCodSelect());
        tm.setDescricao((String) this.jComboBoxVeiculoManutencaoFiltro.getSelectedItem());

        man.setIDVeiculo(jComboBoxVeiculoFiltro.getCodSelect());
        man.setIDManutencao(this.jComboBoxVeiculoManutencaoFiltro.getCodSelect());
        man.setSituacao(this.jComboBoxVeiculoSituacaoFiltro.getCodSelect());
        
        this.jTableManutencao.deleteRows();
        List<Object> listob = new ArrayList<>();
        listob = this.facmanutencao.ConsultarManutencaoTabela(man, tm);

        DefaultTableModel dfm = (DefaultTableModel) this.jTableManutencao.getModel();

        for (int i = 0; i < listob.size(); i++) {

            Date dtman = (Date) ((Object[]) listob.get(i))[3];

            Object[] row = {((Object[]) listob.get(i))[0],
                (String) ((Object[]) listob.get(i))[1],
                ((Object[]) listob.get(i))[2],
                Utils.FormatData("dd/MM/yyyy", dtman),
                ((Object[]) listob.get(i))[4],
                ((Object[]) listob.get(i))[5],
                ((Object[]) listob.get(i))[6],
                ((Object[]) listob.get(i))[7],
                ((Object[]) listob.get(i))[8],
                ((Object[]) listob.get(i))[9]
            };

            dfm.addRow(row);
        }

        this.jlQtdeRegistroTable.setVisible(true);
        this.jlQtdeRegistroTable.setText("Quantidade de registro encontrado: " + dfm.getRowCount());

        this.jTableManutencao.ColorRow(this.jTableManutencao, new String[]{"D", "E", "D", "C", "D", "E", "C", "E", "D", "C"});

    }

    private void excluirManutencao(Manutencao man) throws Exception, ManutencaoException {
        this.facmanutencao.Excluir(man);

    }

    private void CarregaDadosUltimaTroca() {

        try {

            Manutencao man = new Manutencao();
            List<Manutencao> listman = new ArrayList<>();

            man.setIDVeiculo(this.jComboBoxVeiculo.getCodSelect());
            man.setIDTipoManutencao(this.jComboBoxTipoManutencao.getCodSelect());
            listman = this.facmanutencao.Consultar(man);

            this.JLDataUltimaTroca.setText("");
            this.JLQuilometragemUltimaTroca.setText("");

            for (Manutencao m : listman) {
                this.JLDataUltimaTroca.setText(Utils.FormatData("dd/MM/yyyy", m.getDataManutencao()));
                this.JLQuilometragemUltimaTroca.setText(Utils.FormartDecimal("###,###", m.getQuilometragem()));

            }

        } catch (QuilometragemException | ManutencaoException | VeiculoException qe) {
            JOptionPane.showMessageDialog(null, qe.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    private int atualizaUltimaManutencao(Manutencao man) throws Exception, ManutencaoException {

        int ret = 0;
        ret = this.facmanutencao.Atualizar(man);
        return ret;

    }

    private List<Manutencao> consultaManUpdate(Manutencao man) throws Exception {

        List<Manutencao> listman = new ArrayList<>();

        listman = this.facmanutencao.consultaManUpdate(man);

        return listman;
    }

    private int updateManDelete(Manutencao mup) throws Exception {

        int ret = this.facmanutencao.updateManDelete(mup);

        return ret;

    }

    private void carregaComboManutencaoFiltro() {

        try {

            this.jComboBoxVeiculoManutencaoFiltro.removeAllItems();
            this.jComboBoxVeiculoManutencaoFiltro.addItem("-- Todos --");
            this.jComboBoxVeiculoManutencaoFiltro.setSelectedIndex(0);

            TipoManutencao tm = new TipoManutencao();
            Manutencao tmp = new Manutencao();

            tm.setID(this.jComboBoxTipoManutencao.getCodSelect());
            tm.setDescricao((String) this.jComboBoxTipoManutencao.getSelectedItem());

            tmp.setIDVeiculo(this.jComboBoxVeiculoFiltro.getCodSelect());
            tmp.setSituacao(-1);
            List<Object> listob = new ArrayList<>();
            listob = this.facmanutencao.ConsultarManutencaoTabela(tmp, tm);
            List<TipoManutencao> listoborder = new ArrayList<>();

            /*Elimita valores duplicados.*/
            for (int i = 0; i < listob.size(); i++) {

                boolean duplicidade = false;
                TipoManutencao t = new TipoManutencao();

                t.setID((int) ((Object[]) listob.get(i))[10]);
                t.setDescricao((String) ((Object[]) listob.get(i))[1]);

                for (TipoManutencao tipoManutencao : listoborder) {

                    if (tipoManutencao.getDescricao().equals(t.getDescricao())) {
                        duplicidade = true;
                    }
                }

                if (!duplicidade) {
                    listoborder.add(t);
                }

                t = null;
            }

            /*Ordena por descrição*/
            Collections.sort(listoborder, Comparator.comparing(TipoManutencao::getDescricao));

            int[] listaInt = new int[listob.size() + 1];
            for (int i = 0; i < listoborder.size(); i++) {

                listaInt[i + 1] = listoborder.get(i).getID();
                this.jComboBoxVeiculoManutencaoFiltro.addItem(listoborder.get(i).getDescricao());

            }

            this.jComboBoxVeiculoManutencaoFiltro.setCodCombo(listaInt);

        } catch (QuilometragemException | ManutencaoException | VeiculoException qe) {
            JOptionPane.showMessageDialog(null, qe.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

}
