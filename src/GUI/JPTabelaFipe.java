package GUI;

import Entidade.FIPEAno;
import Entidade.FIPEFabricante;
import Entidade.FIPEModelo;
import Entidade.FIPEVeiculo;
import Entidade.FIPEVeiculoException;
import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;

public class JPTabelaFipe extends javax.swing.JPanel {

    public JPTabelaFipe() {
        initComponents();

        Entidade.WSFipe.setProxyAlpa();
        this.limpaCampos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLHome = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jComboBoxFabricante = new GUI.JComboBoxCustom();
        jLabel22 = new javax.swing.JLabel();
        jComboBoxTIpo = new GUI.JComboBoxCustom();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jComboBoxModelo = new GUI.JComboBoxCustom();
        jLabel25 = new javax.swing.JLabel();
        jComboBoxAno = new GUI.JComboBoxCustom();
        JPAcao = new javax.swing.JPanel();
        JBCadManutencaoCancelar = new javax.swing.JButton();
        JBCadManutencaoConsultar = new javax.swing.JButton();
        JPresultadoFIPE = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        JLReferencia = new javax.swing.JLabel();
        JLFabricante = new javax.swing.JLabel();
        JLModelo = new javax.swing.JLabel();
        JLCombustivel = new javax.swing.JLabel();
        JLPreco = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        JLCodigoFIPE = new javax.swing.JLabel();
        JBResultadoFIPEImprimir = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        JLFonteFIPE = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Tabela Fipe");
        jLabel7.setToolTipText("");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Consultar tabela FIPE On line");
        jLabel6.setToolTipText("");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("__________________________________________________________________________________________________________________________________________________________________________");
        jLabel4.setToolTipText("");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTabbedPane1.setForeground(new java.awt.Color(0, 102, 153));
        jTabbedPane1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jPanel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jComboBoxFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFabricanteActionPerformed(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 102, 153));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Fabricante*");
        jLabel22.setToolTipText("");
        jLabel22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jComboBoxTIpo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Selecione --", "CARROS E UTILITÁRIOS DE PASSEIO", "MOTOS", "CAMNHOES MICRO-ÔNIBUS" }));
        jComboBoxTIpo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTIpoActionPerformed(evt);
            }
        });

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 102, 153));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Tipo*");
        jLabel23.setToolTipText("");
        jLabel23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 102, 153));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("Modelo*");
        jLabel24.setToolTipText("");
        jLabel24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jComboBoxModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxModeloActionPerformed(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 102, 153));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("Ano modelo*");
        jLabel25.setToolTipText("");
        jLabel25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jComboBoxAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAnoActionPerformed(evt);
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

        JBCadManutencaoConsultar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JBCadManutencaoConsultar.setForeground(new java.awt.Color(0, 102, 153));
        JBCadManutencaoConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-internet-30.png"))); // NOI18N
        JBCadManutencaoConsultar.setText("Consultar");
        JBCadManutencaoConsultar.setToolTipText("Realiza consulta na Internet.");
        JBCadManutencaoConsultar.setBorderPainted(false);
        JBCadManutencaoConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBCadManutencaoConsultar.setFocusPainted(false);
        JBCadManutencaoConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBCadManutencaoConsultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBCadManutencaoConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBCadManutencaoConsultarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBCadManutencaoConsultarMouseExited(evt);
            }
        });
        JBCadManutencaoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadManutencaoConsultarActionPerformed(evt);
            }
        });
        JPAcao.add(JBCadManutencaoConsultar);
        JBCadManutencaoConsultar.setBounds(120, 20, 100, 80);

        JPresultadoFIPE.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 15), new java.awt.Color(0, 102, 153))); // NOI18N

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 102, 153));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("Referência:");
        jLabel26.setToolTipText("");
        jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 102, 153));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel27.setText("Modelo:");
        jLabel27.setToolTipText("");
        jLabel27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 102, 153));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText("Fabricante:");
        jLabel28.setToolTipText("");
        jLabel28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 102, 153));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setText("Ano/Combustível:");
        jLabel29.setToolTipText("");
        jLabel29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 102, 153));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("Preço:");
        jLabel30.setToolTipText("");
        jLabel30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JLReferencia.setBackground(new java.awt.Color(255, 255, 255));
        JLReferencia.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        JLReferencia.setForeground(new java.awt.Color(0, 102, 153));
        JLReferencia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLReferencia.setText("JLReferencia");
        JLReferencia.setToolTipText("");
        JLReferencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JLFabricante.setBackground(new java.awt.Color(255, 255, 255));
        JLFabricante.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        JLFabricante.setForeground(new java.awt.Color(0, 102, 153));
        JLFabricante.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLFabricante.setText("JLFabricante");
        JLFabricante.setToolTipText("");
        JLFabricante.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JLModelo.setBackground(new java.awt.Color(255, 255, 255));
        JLModelo.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        JLModelo.setForeground(new java.awt.Color(0, 102, 153));
        JLModelo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLModelo.setText("JLModelo");
        JLModelo.setToolTipText("");
        JLModelo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JLCombustivel.setBackground(new java.awt.Color(255, 255, 255));
        JLCombustivel.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        JLCombustivel.setForeground(new java.awt.Color(0, 102, 153));
        JLCombustivel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLCombustivel.setText("JLCombustivel");
        JLCombustivel.setToolTipText("");
        JLCombustivel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JLPreco.setBackground(new java.awt.Color(255, 255, 255));
        JLPreco.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        JLPreco.setForeground(new java.awt.Color(0, 102, 153));
        JLPreco.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLPreco.setText("JLPreco");
        JLPreco.setToolTipText("");
        JLPreco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 102, 153));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setText("Código FIPE:");
        jLabel31.setToolTipText("");
        jLabel31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JLCodigoFIPE.setBackground(new java.awt.Color(255, 255, 255));
        JLCodigoFIPE.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        JLCodigoFIPE.setForeground(new java.awt.Color(0, 102, 153));
        JLCodigoFIPE.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLCodigoFIPE.setText("JLCodigoFIPE");
        JLCodigoFIPE.setToolTipText("");
        JLCodigoFIPE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JBResultadoFIPEImprimir.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JBResultadoFIPEImprimir.setForeground(new java.awt.Color(0, 102, 153));
        JBResultadoFIPEImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-enviar-para-a-impressora-40.png"))); // NOI18N
        JBResultadoFIPEImprimir.setToolTipText("Gerar relatório.");
        JBResultadoFIPEImprimir.setBorderPainted(false);
        JBResultadoFIPEImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBResultadoFIPEImprimir.setFocusPainted(false);
        JBResultadoFIPEImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBResultadoFIPEImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBResultadoFIPEImprimirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBResultadoFIPEImprimirMouseExited(evt);
            }
        });
        JBResultadoFIPEImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBResultadoFIPEImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPresultadoFIPELayout = new javax.swing.GroupLayout(JPresultadoFIPE);
        JPresultadoFIPE.setLayout(JPresultadoFIPELayout);
        JPresultadoFIPELayout.setHorizontalGroup(
            JPresultadoFIPELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPresultadoFIPELayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(JPresultadoFIPELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPresultadoFIPELayout.createSequentialGroup()
                        .addGroup(JPresultadoFIPELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPresultadoFIPELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPresultadoFIPELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(JLPreco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLCombustivel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                    .addComponent(JLModelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLFabricante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLReferencia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLCodigoFIPE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(66, 66, 66)
                .addComponent(JBResultadoFIPEImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        JPresultadoFIPELayout.setVerticalGroup(
            JPresultadoFIPELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPresultadoFIPELayout.createSequentialGroup()
                .addGroup(JPresultadoFIPELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPresultadoFIPELayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(JPresultadoFIPELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(JBResultadoFIPEImprimir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPresultadoFIPELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPresultadoFIPELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPresultadoFIPELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPresultadoFIPELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPresultadoFIPELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLCodigoFIPE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("* Campos com preenchimento obrigatório.");
        jLabel20.setToolTipText("");
        jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JLFonteFIPE.setBackground(new java.awt.Color(255, 255, 255));
        JLFonteFIPE.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        JLFonteFIPE.setForeground(new java.awt.Color(0, 102, 153));
        JLFonteFIPE.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        JLFonteFIPE.setText("Fonte: http://fipeapi.appspot.com/");
        JLFonteFIPE.setToolTipText("Acessar o link.");
        JLFonteFIPE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JLFonteFIPE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JLFonteFIPE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLFonteFIPEMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JLFonteFIPEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JLFonteFIPEMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPresultadoFIPE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxFabricante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxAno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxTIpo, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(JPAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JLFonteFIPE, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxTIpo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxAno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLFonteFIPE, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JPresultadoFIPE, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("TABELA FIPE", jPanel1);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Consulta Online na Internet");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 901, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 15, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLHome, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLHome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(1, 1, 1)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JLHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLHomeMouseClicked
        JFPrincipal.setPanelMain(new JPHome());
    }//GEN-LAST:event_JLHomeMouseClicked

    private void jComboBoxFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFabricanteActionPerformed
try {

            if (jComboBoxFabricante.getSelectedIndex() > 0) {
                this.JPresultadoFIPE.setVisible(false);
                this.carregaModelo();
                this.jComboBoxModelo.setEnabled(true);
                this.jComboBoxAno.removeAllItems();
                this.jComboBoxAno.setEnabled(false);
            } 

        } catch (IOException | RuntimeException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao preencher a combo modelo.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_jComboBoxFabricanteActionPerformed

    private void jComboBoxTIpoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTIpoActionPerformed

        try {

            if (jComboBoxTIpo.getSelectedIndex() > 0) {
                
                this.JPresultadoFIPE.setVisible(false);
                this.carregaFabricante();
                this.jComboBoxFabricante.setEnabled(true);
                this.jComboBoxModelo.removeAllItems();
                this.jComboBoxModelo.setEnabled(false);
                this.jComboBoxAno.removeAllItems();
                this.jComboBoxAno.setEnabled(false);
            } else {

                
            }

        } catch (IOException | NoSuchFieldException |RuntimeException  ex) {
            JOptionPane.showMessageDialog(this, "Erro ao preencher a combo fabricante.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jComboBoxTIpoActionPerformed

    private void jComboBoxModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxModeloActionPerformed
       
        try {

            if (jComboBoxModelo.getSelectedIndex() > 0) {
                this.JPresultadoFIPE.setVisible(false);
                this.JPresultadoFIPE.setVisible(false);
                this.carregaAno();
                this.jComboBoxAno.setEnabled(true);
  
            } else {
                
            }

        } catch (RuntimeException | IOException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao preencher a combo ano modelo.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_jComboBoxModeloActionPerformed

    private void jComboBoxAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAnoActionPerformed
        
 
            if (jComboBoxAno.getSelectedIndex() > 0) {
                this.JPresultadoFIPE.setVisible(false);
                this.jComboBoxAno.setEnabled(true);
  
            } 

    }//GEN-LAST:event_jComboBoxAnoActionPerformed

    private void JBCadManutencaoCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCadManutencaoCancelarMouseEntered
        this.JBCadManutencaoCancelar.setBackground(new Color(169, 169, 169));
    }//GEN-LAST:event_JBCadManutencaoCancelarMouseEntered

    private void JBCadManutencaoCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCadManutencaoCancelarMouseExited
        this.JBCadManutencaoCancelar.setBackground(this.getBackground());
    }//GEN-LAST:event_JBCadManutencaoCancelarMouseExited

    private void JBCadManutencaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadManutencaoCancelarActionPerformed
        this.limpaCampos();
    }//GEN-LAST:event_JBCadManutencaoCancelarActionPerformed

    private void JBCadManutencaoConsultarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCadManutencaoConsultarMouseEntered
        this.JBCadManutencaoConsultar.setBackground(new Color(169, 169, 169));
    }//GEN-LAST:event_JBCadManutencaoConsultarMouseEntered

    private void JBCadManutencaoConsultarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCadManutencaoConsultarMouseExited
        this.JBCadManutencaoConsultar.setBackground(this.getBackground());
    }//GEN-LAST:event_JBCadManutencaoConsultarMouseExited

    private void JBCadManutencaoConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadManutencaoConsultarActionPerformed

        try {
        
        this.JPresultadoFIPE.setVisible(false);
        this.validaCampos();    
        this.consultarVeiculoFipe();        
        this.JPresultadoFIPE.setVisible(true);
        
        }catch(FIPEVeiculoException ffe){
            JOptionPane.showMessageDialog(this,ffe.getMessage(), "Eviso", JOptionPane.WARNING_MESSAGE);
        }catch (RuntimeException | IOException ex) {
           JOptionPane.showMessageDialog(this, "Erro consultar dados do veículo.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        

    }//GEN-LAST:event_JBCadManutencaoConsultarActionPerformed

    private void JLFonteFIPEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLFonteFIPEMouseEntered
        JLFonteFIPE.setText("");        
        JLFonteFIPE.setText("<html><u>"+"Fonte: http://fipeapi.appspot.com/"+"</u></html>");
    }//GEN-LAST:event_JLFonteFIPEMouseEntered

    private void JLFonteFIPEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLFonteFIPEMouseClicked
          Desktop desk = java.awt.Desktop.getDesktop();
        try {
            desk.browse(new java.net.URI("http://fipeapi.appspot.com/"));
        } catch (URISyntaxException ex) {
             JOptionPane.showMessageDialog(this, "Falha a tentar acessar o link.\n"+ex.getMessage(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException exc) {
             JOptionPane.showMessageDialog(this, "Falha a tentar acessar o link.\n"+exc.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JLFonteFIPEMouseClicked

    private void JLFonteFIPEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLFonteFIPEMouseExited
         JLFonteFIPE.setText("Fonte: http://fipeapi.appspot.com/");        
        
    }//GEN-LAST:event_JLFonteFIPEMouseExited

    private void JBResultadoFIPEImprimirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBResultadoFIPEImprimirMouseEntered
        this.JBResultadoFIPEImprimir.setBackground(new Color(169, 169, 169));
    }//GEN-LAST:event_JBResultadoFIPEImprimirMouseEntered

    private void JBResultadoFIPEImprimirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBResultadoFIPEImprimirMouseExited
        this.JBResultadoFIPEImprimir.setBackground(this.getBackground());
    }//GEN-LAST:event_JBResultadoFIPEImprimirMouseExited

    private void JBResultadoFIPEImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBResultadoFIPEImprimirActionPerformed

        HashMap parametro = new HashMap();
        List<Object> lista = new ArrayList<>();
        
        try {
           
           lista.add("FIPE");
            
           parametro.put("P_TIPO",jComboBoxTIpo.getSelectedItem());
           parametro.put("P_REFERENCIA",JLReferencia.getText());
           parametro.put("P_FABRICANTE",JLFabricante.getText());
           parametro.put("P_MODELO",JLModelo.getText());
           parametro.put("P_ANO",JLCombustivel.getText());
           parametro.put("P_PRECO",JLPreco.getText());
           parametro.put("P_CODFIPE",JLCodigoFIPE.getText());
           
           JFPrincipal.reportShow.showReportResultadoFIPE(parametro,lista);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro a gerar o relatório.\n"+ ex.getMessage(), "Erro.", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBResultadoFIPEImprimirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCadManutencaoCancelar;
    private javax.swing.JButton JBCadManutencaoConsultar;
    private javax.swing.JButton JBResultadoFIPEImprimir;
    private javax.swing.JLabel JLCodigoFIPE;
    private javax.swing.JLabel JLCombustivel;
    private javax.swing.JLabel JLFabricante;
    private javax.swing.JLabel JLFonteFIPE;
    private javax.swing.JLabel JLHome;
    private javax.swing.JLabel JLModelo;
    private javax.swing.JLabel JLPreco;
    private javax.swing.JLabel JLReferencia;
    private javax.swing.JPanel JPAcao;
    private javax.swing.JPanel JPresultadoFIPE;
    private GUI.JComboBoxCustom jComboBoxAno;
    private GUI.JComboBoxCustom jComboBoxFabricante;
    private GUI.JComboBoxCustom jComboBoxModelo;
    private GUI.JComboBoxCustom jComboBoxTIpo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    private void carregaFabricante() throws MalformedURLException, IOException, NoSuchFieldException {

        List<FIPEFabricante> listffab = new ArrayList<>();

        String tipo = "";
        switch (jComboBoxTIpo.getSelectedIndex()) {
            case 1:
                tipo = "carros";
                break;
            case 2:
                tipo = "motos";
                break;
            case 3:
                tipo = "caminhoes";
                break;
            default:
                break;
        }

        listffab.clear();
        listffab = Entidade.WSFipe.getFabricante(tipo);

        int[] cod = new int[listffab.size() + 1];
        int ite = 1;

        Collections.sort(listffab, Comparator.comparing(FIPEFabricante::getName));

        jComboBoxFabricante.removeAllItems();

        Object idx = "-- Selecione --";
        jComboBoxFabricante.addItem(idx);

        for (FIPEFabricante ffab : listffab) {

            cod[ite] = ffab.getID();
            Object row = ffab.getName().toUpperCase();
            jComboBoxFabricante.addItem(row);
            ite += 1;

        }
        jComboBoxFabricante.setCodCombo(cod);

    }

    private void limpaCampos() {

        this.jComboBoxModelo.removeAllItems();
        this.jComboBoxAno.removeAllItems();
        this.jComboBoxFabricante.removeAllItems();

        this.jComboBoxModelo.setEnabled(false);
        this.jComboBoxAno.setEnabled(false);
        this.jComboBoxFabricante.setEnabled(false);

        this.jComboBoxTIpo.setSelectedIndex(0);
        
        this.JPresultadoFIPE.setVisible(false);

    }

    private void carregaModelo() throws IOException {
        List<FIPEModelo> listfmod = new ArrayList<>();

        String tipo = "";
        switch (jComboBoxTIpo.getSelectedIndex()) {
            case 1:
                tipo = "carros";
                break;
            case 2:
                tipo = "motos";
                break;
            case 3:
                tipo = "caminhoes";
                break;
            default:
                break;
        }

        listfmod.clear();
        listfmod = Entidade.WSFipe.getModelo(tipo,jComboBoxFabricante.getCodSelect());

        int[] cod = new int[listfmod.size() + 1];
        int ite = 1;

        Collections.sort(listfmod, Comparator.comparing(FIPEModelo::getName));

        jComboBoxModelo.removeAllItems();

        Object idx = "-- Selecione --";
        jComboBoxModelo.addItem(idx);

        for (FIPEModelo ffab : listfmod) {

            cod[ite] = ffab.getID();
            Object row = ffab.getName().toUpperCase();
            jComboBoxModelo.addItem(row);
            ite += 1;

        }
        jComboBoxModelo.setCodCombo(cod);
    }

    private void carregaAno() throws IOException {
    List<FIPEAno> listfano = new ArrayList<>();

        String tipo = "";
        switch (jComboBoxTIpo.getSelectedIndex()) {
            case 1:
                tipo = "carros";
                break;
            case 2:
                tipo = "motos";
                break;
            case 3:
                tipo = "caminhoes";
                break;
            default:
                break;
        }

        listfano.clear();
        listfano = Entidade.WSFipe.getAno(tipo,jComboBoxFabricante.getCodSelect(),jComboBoxModelo.getCodSelect());

        String[] cod = new String[listfano.size() + 1];
        int ite = 1;

        Collections.sort(listfano, Comparator.comparing(FIPEAno::getName));

        jComboBoxAno.removeAllItems();

        Object idx = "-- Selecione --";
        jComboBoxAno.addItem(idx);

        for (FIPEAno ffab : listfano) {

            cod[ite] = ffab.getFIPECodigo();
            Object row = ffab.getName().toUpperCase();
            jComboBoxAno.addItem(row);
            ite += 1;

        }
        jComboBoxAno.setCodCombo(cod);
    }

    private void consultarVeiculoFipe() throws IOException {
        
        List<FIPEVeiculo> listfvei = new ArrayList<>();
        
        String tipo = "";
        switch (jComboBoxTIpo.getSelectedIndex()) {
            case 1:
                tipo = "carros";
                break;
            case 2:
                tipo = "motos";
                break;
            case 3:
                tipo = "caminhoes";
                break;
            default:
                break;
        }
        
        
        listfvei.clear();
        listfvei = Entidade.WSFipe.getDadosVeiculo(tipo,jComboBoxFabricante.getCodSelect(),jComboBoxModelo.getCodSelect(),this.jComboBoxAno.getCodSelectStr());
        
        this.JLReferencia.setText(listfvei.get(0).getReferência());
        this.JLFabricante.setText(listfvei.get(0).getMarca());
        this.JLModelo.setText(listfvei.get(0).getVeiculo());

        
        String selectAno = (String) this.jComboBoxAno.getSelectedItem();
        
        if (selectAno.contains("ZERO KM")) {

            this.JLCombustivel.setText("ZERO KM" + " " + listfvei.get(0).getCombustivel());
        } else {
            this.JLCombustivel.setText(listfvei.get(0).getAnoModelo() + " " + listfvei.get(0).getCombustivel());
        }

        this.JLPreco.setText(listfvei.get(0).getPreco());
        this.JLCodigoFIPE.setText(listfvei.get(0).getFipeCodigo());
    }

    private void validaCampos() throws FIPEVeiculoException {
        
        int jctipo = this.jComboBoxTIpo.getSelectedIndex();
        int jctfab = this.jComboBoxFabricante.getSelectedIndex();
        int jctmod = this.jComboBoxModelo.getSelectedIndex();
        int jctano = this.jComboBoxAno.getSelectedIndex();

        if (jctipo == 0 | jctfab == 0 | jctmod == 0 | jctano == 0) {
            throw new FIPEVeiculoException("Todos os campos são de preenchimento obrigatório!.");
        }
        
    }
    }


