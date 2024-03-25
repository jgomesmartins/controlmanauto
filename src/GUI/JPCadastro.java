package GUI;

import java.awt.Color;


public class JPCadastro extends javax.swing.JPanel {

      public JPCadastro() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JLHome = new javax.swing.JLabel();
        JBCadAutomovel = new javax.swing.JButton();
        JBCadPecasServicos = new javax.swing.JButton();

        setAutoscrolls(true);
        setName("JPCadastro"); // NOI18N

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("___________________________________________________________________________________________________________________________________________________________");
        jLabel4.setToolTipText("");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText(">");
        jLabel5.setToolTipText("");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Manutenção no cadastro do sistema");
        jLabel6.setToolTipText("");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Cadastro");
        jLabel7.setToolTipText("");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

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

        JBCadAutomovel.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        JBCadAutomovel.setForeground(new java.awt.Color(0, 102, 153));
        JBCadAutomovel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-suv-70.png"))); // NOI18N
        JBCadAutomovel.setText("VEÍCULO");
        JBCadAutomovel.setBorderPainted(false);
        JBCadAutomovel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBCadAutomovel.setFocusPainted(false);
        JBCadAutomovel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBCadAutomovel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBCadAutomovel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBCadAutomovelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBCadAutomovelMouseExited(evt);
            }
        });
        JBCadAutomovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadAutomovelActionPerformed(evt);
            }
        });

        JBCadPecasServicos.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        JBCadPecasServicos.setForeground(new java.awt.Color(0, 102, 153));
        JBCadPecasServicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-ferramentas-administrativas-70.png"))); // NOI18N
        JBCadPecasServicos.setText("PEÇA E SERVIÇO");
        JBCadPecasServicos.setBorderPainted(false);
        JBCadPecasServicos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBCadPecasServicos.setFocusPainted(false);
        JBCadPecasServicos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBCadPecasServicos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBCadPecasServicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBCadPecasServicosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBCadPecasServicosMouseExited(evt);
            }
        });
        JBCadPecasServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadPecasServicosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(JLHome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBCadAutomovel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(JBCadPecasServicos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(231, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JLHome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBCadAutomovel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCadPecasServicos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(477, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JBCadAutomovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadAutomovelActionPerformed
        JFPrincipal.setPanelMain(new JPVeiculo());
    }//GEN-LAST:event_JBCadAutomovelActionPerformed

    private void JBCadPecasServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadPecasServicosActionPerformed
        JFPrincipal.setPanelMain(new JPTipoManutencao());
    }//GEN-LAST:event_JBCadPecasServicosActionPerformed

    private void JBCadAutomovelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCadAutomovelMouseEntered
        this.JBCadAutomovel.setBackground(new Color(169,169,169));
    }//GEN-LAST:event_JBCadAutomovelMouseEntered

    private void JBCadAutomovelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCadAutomovelMouseExited
        this.JBCadAutomovel.setBackground(this.getBackground());
    }//GEN-LAST:event_JBCadAutomovelMouseExited

    private void JBCadPecasServicosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCadPecasServicosMouseEntered
       this.JBCadPecasServicos.setBackground(new Color(169,169,169));
    }//GEN-LAST:event_JBCadPecasServicosMouseEntered

    private void JBCadPecasServicosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCadPecasServicosMouseExited
        this.JBCadPecasServicos.setBackground(this.getBackground());
    }//GEN-LAST:event_JBCadPecasServicosMouseExited

    private void JLHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLHomeMouseClicked
       JFPrincipal.setPanelMain(new JPHome());
   
    }//GEN-LAST:event_JLHomeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCadAutomovel;
    private javax.swing.JButton JBCadPecasServicos;
    private javax.swing.JLabel JLHome;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
