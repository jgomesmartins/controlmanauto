package GUI;

import java.text.DateFormat;
import java.util.Date;

public class JPHome extends javax.swing.JPanel {

    public JPHome() {
        initComponents();
        this.JLNameSoft.setText(this.JLNameSoft.getText() + " " +Classes.Config.NAMEAPP);
        this.JLVersao.setText("Versão: " + Classes.Config.VERSAOAPP);
        
       java.util.Date d = new Date();
       String dStr = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(d);
       this.JLDataAtual.setText(dStr);
       
          
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLVersao = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JLNameSoft = new javax.swing.JLabel();
        JLDataAtual = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setName("JPHOME"); // NOI18N

        JLVersao.setBackground(new java.awt.Color(255, 255, 255));
        JLVersao.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        JLVersao.setForeground(new java.awt.Color(0, 102, 153));
        JLVersao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLVersao.setText("JLVersao");
        JLVersao.setToolTipText("");
        JLVersao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-casa-14.png"))); // NOI18N
        jLabel8.setText("Home");
        jLabel8.setToolTipText("");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });

        JLNameSoft.setBackground(new java.awt.Color(255, 255, 255));
        JLNameSoft.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        JLNameSoft.setForeground(new java.awt.Color(0, 102, 153));
        JLNameSoft.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLNameSoft.setText("Bem Vindo ao");
        JLNameSoft.setToolTipText("");
        JLNameSoft.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JLDataAtual.setBackground(new java.awt.Color(255, 255, 255));
        JLDataAtual.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        JLDataAtual.setForeground(new java.awt.Color(0, 102, 153));
        JLDataAtual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLDataAtual.setText("JLDataAtual");
        JLDataAtual.setToolTipText("");
        JLDataAtual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("___________________________________");
        jLabel4.setToolTipText("");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("_________");
        jLabel5.setToolTipText("");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLDataAtual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLVersao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLNameSoft, javax.swing.GroupLayout.DEFAULT_SIZE, 1053, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(JLNameSoft, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel4)
                .addGap(3, 3, 3)
                .addComponent(JLVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLDataAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
       
        JFPrincipal.limpaUndeline();
  
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
       
    }//GEN-LAST:event_jLabel8MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLDataAtual;
    private javax.swing.JLabel JLNameSoft;
    private javax.swing.JLabel JLVersao;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
