/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Banco.Banco;
import Banco.BancoException;
import Entidade.UsuarioException;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author GOMES
 */
public class JFLogin extends javax.swing.JFrame {

    /**
     * Creates new form JFSplashScreen
     * @throws java.lang.InterruptedException
     */
    public JFLogin() throws InterruptedException {
        initComponents();
        this.JLNameSoft.setText(Classes.Config.NAMEAPP);
        this.JTSenhaLogin.setFocusable(true);
        
        ImageIcon icone = new ImageIcon(System.getProperty("user.dir") +"\\icons.png");
        this.setIconImage(icone.getImage());
        this.jProgressBarLogin.setVisible(false);
        
        this.jPanel1.setVisible(false);
        this.jBEntrar.setEnabled(false);
        this.JLVersao.setText(this.JLVersao.getText() + " " + Classes.Config.VERSAOAPP);
        this.lblCopyRight.setText("©Copyright "+ Classes.Config.ANOAPP +" SEMOG");
        
                new Thread() {
            @Override
            public void run() {

                try {
                   Banco.Conectar();
                   jProgressBarLogin.setVisible(true);
                    Thread.sleep(7000);
                   
                    login();

                } catch (BancoException e) {
                    jProgressBarLogin.setVisible(false);
                    JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Aviso", 1);
                    System.exit(0);
                } catch (UsuarioException ue) {
                    jProgressBarLogin.setVisible(false);
                    JLMsgErroLogin.setText(ue.getMessage());
                    System.exit(0);
                } catch (NoClassDefFoundError | ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException be) {
                    jProgressBarLogin.setVisible(false);
                    JOptionPane.showMessageDialog(rootPane, "Erro na conexão com o banco de dados. \n" + be.getMessage(), "Erro", 2);
                    System.exit(0);
                } catch (Exception ex) {
                    jProgressBarLogin.setVisible(false);
                    JOptionPane.showMessageDialog(rootPane, "Erro na conexão com o banco de dados. \n" + ex.getMessage(), "Erro", 2);
                    System.exit(0);
                }

            }

        }.start();


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPMainLogin = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        JTUsuarioLogin = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JTSenhaLogin = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        JLMsgErroLogin = new javax.swing.JLabel();
        jBCancelar = new javax.swing.JButton();
        jBEntrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JLVersao = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblCopyRight = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        JLNameSoft = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jProgressBarLogin = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        JPMainLogin.setBackground(new java.awt.Color(0, 102, 153));
        JPMainLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        JPMainLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JPMainLoginKeyPressed(evt);
            }
        });
        JPMainLogin.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("___________________________");
        jLabel2.setToolTipText("");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 180, 380, 5);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Login");
        jLabel4.setToolTipText("");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 30, 360, 40);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Usuário");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 110, 80, 30);

        JTUsuarioLogin.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        JTUsuarioLogin.setForeground(new java.awt.Color(0, 102, 153));
        JTUsuarioLogin.setText("admin");
        JTUsuarioLogin.setBorder(null);
        JTUsuarioLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTUsuarioLoginKeyPressed(evt);
            }
        });
        jPanel1.add(JTUsuarioLogin);
        JTUsuarioLogin.setBounds(70, 150, 270, 30);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 153));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-chave-2-30.png"))); // NOI18N
        jLabel10.setToolTipText("");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 250, 30, 30);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("___________________________");
        jLabel6.setToolTipText("");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel6.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 280, 380, 5);

        JTSenhaLogin.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        JTSenhaLogin.setForeground(new java.awt.Color(0, 102, 153));
        JTSenhaLogin.setText("admin");
        JTSenhaLogin.setBorder(null);
        JTSenhaLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTSenhaLoginKeyPressed(evt);
            }
        });
        jPanel1.add(JTSenhaLogin);
        JTSenhaLogin.setBounds(70, 250, 270, 30);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 153));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Senha");
        jLabel14.setToolTipText("");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel14);
        jLabel14.setBounds(20, 210, 70, 30);

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 153));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-usuário-30.png"))); // NOI18N
        jLabel15.setToolTipText("");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel15);
        jLabel15.setBounds(30, 150, 30, 30);

        JLMsgErroLogin.setBackground(new java.awt.Color(255, 255, 255));
        JLMsgErroLogin.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JLMsgErroLogin.setForeground(new java.awt.Color(255, 0, 0));
        JLMsgErroLogin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLMsgErroLogin.setToolTipText("");
        JLMsgErroLogin.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        JLMsgErroLogin.setAutoscrolls(true);
        JLMsgErroLogin.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(JLMsgErroLogin);
        JLMsgErroLogin.setBounds(20, 90, 350, 20);

        jBCancelar.setBackground(new java.awt.Color(0, 102, 153));
        jBCancelar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jBCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jBCancelar.setText("Cancelar");
        jBCancelar.setBorderPainted(false);
        jBCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBCancelar.setFocusPainted(false);
        jBCancelar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jBCancelarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jBCancelarFocusLost(evt);
            }
        });
        jBCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBCancelarMouseExited(evt);
            }
        });
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });
        jBCancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBCancelarKeyPressed(evt);
            }
        });
        jPanel1.add(jBCancelar);
        jBCancelar.setBounds(60, 300, 100, 40);

        jBEntrar.setBackground(new java.awt.Color(0, 102, 153));
        jBEntrar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jBEntrar.setForeground(new java.awt.Color(255, 255, 255));
        jBEntrar.setText("Entrar");
        jBEntrar.setBorderPainted(false);
        jBEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBEntrar.setFocusPainted(false);
        jBEntrar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jBEntrarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jBEntrarFocusLost(evt);
            }
        });
        jBEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBEntrarMouseExited(evt);
            }
        });
        jBEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEntrarActionPerformed(evt);
            }
        });
        jBEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBEntrarKeyPressed(evt);
            }
        });
        jPanel1.add(jBEntrar);
        jBEntrar.setBounds(220, 300, 100, 40);

        JPMainLogin.add(jPanel1);
        jPanel1.setBounds(10, 10, 30, 20);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Login");
        jLabel3.setToolTipText("");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JPMainLogin.add(jLabel3);
        jLabel3.setBounds(10, 10, 420, 10);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("USUÁRIO");
        jLabel7.setToolTipText("");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JPMainLogin.add(jLabel7);
        jLabel7.setBounds(20, 100, 130, 30);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("USUÁRIO");
        jLabel8.setToolTipText("");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JPMainLogin.add(jLabel8);
        jLabel8.setBounds(20, 100, 130, 30);

        JLVersao.setBackground(new java.awt.Color(255, 255, 255));
        JLVersao.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        JLVersao.setForeground(new java.awt.Color(255, 255, 255));
        JLVersao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLVersao.setText("Versão:");
        JLVersao.setToolTipText("");
        JLVersao.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        JLVersao.setAutoscrolls(true);
        JLVersao.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        JPMainLogin.add(JLVersao);
        JLVersao.setBounds(20, 310, 490, 20);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("________________________________");
        jLabel16.setToolTipText("");
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel16.setAutoscrolls(true);
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        JPMainLogin.add(jLabel16);
        jLabel16.setBounds(20, 250, 490, 30);

        lblCopyRight.setBackground(new java.awt.Color(255, 255, 255));
        lblCopyRight.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblCopyRight.setForeground(new java.awt.Color(255, 255, 255));
        lblCopyRight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCopyRight.setText("©Copyright 2020 SEMOG ");
        lblCopyRight.setToolTipText("");
        lblCopyRight.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblCopyRight.setAutoscrolls(true);
        lblCopyRight.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        JPMainLogin.add(lblCopyRight);
        lblCopyRight.setBounds(20, 290, 490, 20);

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-serviços-150.png"))); // NOI18N
        jLabel18.setToolTipText("");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JPMainLogin.add(jLabel18);
        jLabel18.setBounds(160, 80, 210, 180);

        JLNameSoft.setBackground(new java.awt.Color(255, 255, 255));
        JLNameSoft.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        JLNameSoft.setForeground(new java.awt.Color(255, 255, 255));
        JLNameSoft.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLNameSoft.setToolTipText("");
        JLNameSoft.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JPMainLogin.add(JLNameSoft);
        JLNameSoft.setBounds(10, 10, 510, 40);

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Sistema de controle de manutenção automotiva");
        jLabel20.setToolTipText("");
        jLabel20.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel20.setAutoscrolls(true);
        jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        JPMainLogin.add(jLabel20);
        jLabel20.setBounds(10, 50, 510, 20);

        jProgressBarLogin.setBackground(new java.awt.Color(204, 204, 204));
        jProgressBarLogin.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jProgressBarLogin.setForeground(new java.awt.Color(255, 255, 255));
        jProgressBarLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jProgressBarLogin.setIndeterminate(true);
        jProgressBarLogin.setString("Aguarde...");
        jProgressBarLogin.setStringPainted(true);
        JPMainLogin.add(jProgressBarLogin);
        jProgressBarLogin.setBounds(30, 340, 470, 15);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPMainLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPMainLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
        );

        setBounds(0, 0, 535, 368);
    }// </editor-fold>//GEN-END:initComponents

    private void login() throws UsuarioException {

        String vusuario;
        char vsenha[];

        vusuario = this.JTUsuarioLogin.getText().trim();
        vsenha = this.JTSenhaLogin.getPassword();

        if (vusuario.equals("")) {
            this.JTUsuarioLogin.requestFocus();
            throw new UsuarioException("Informe o usuário.");

        }

        if (vsenha.length == 0) {
            this.JTSenhaLogin.requestFocus();
            throw new UsuarioException("Informe a senha de acesso.");
        }

        this.JLMsgErroLogin.setText("");

        this.setVisible(false);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                JFPrincipal jfs = new JFPrincipal();
                ImageIcon icone = new ImageIcon(System.getProperty("user.dir") +"\\icons.png");
                jfs.setIconImage(icone.getImage());
                jfs.setLocationRelativeTo(null);
                jfs.setTitle("ControlCar" + " - Versão: " + Classes.Config.VERSAOAPP);
                jfs.setVisible(true);
            }
        });

    }

    private void jBEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEntrarActionPerformed

        new Thread() {
            @Override
            public void run() {

                try {
                    jProgressBarLogin.setVisible(true);

                    Banco.Conectar();
                    login();

                } catch (BancoException e) {
                    jProgressBarLogin.setVisible(false);
                    JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Aviso", 1);
                } catch (UsuarioException ue) {
                    jProgressBarLogin.setVisible(false);
                    JLMsgErroLogin.setText(ue.getMessage());
                } catch (NoClassDefFoundError | ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException be) {
                    jProgressBarLogin.setVisible(false);
                    JOptionPane.showMessageDialog(rootPane, "Erro na conexão com o banco de dados. \n" + be.getMessage(), "Erro", 2);
                } catch (Exception ex) {
                    jProgressBarLogin.setVisible(false);
                    JOptionPane.showMessageDialog(rootPane, "Erro na conexão com o banco de dados. \n" + ex.getMessage(), "Erro", 2);
                }

            }

        }.start();


    }//GEN-LAST:event_jBEntrarActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        Runtime.getRuntime().exit(0);
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEntrarMouseEntered
        this.jBEntrar.setBackground(new Color(70, 130, 180));
    }//GEN-LAST:event_jBEntrarMouseEntered

    private void jBCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseEntered
        this.jBCancelar.setBackground(new Color(70, 130, 180));
    }//GEN-LAST:event_jBCancelarMouseEntered

    private void jBEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEntrarMouseExited
        this.jBEntrar.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_jBEntrarMouseExited

    private void jBCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseExited
        this.jBCancelar.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_jBCancelarMouseExited

    private void jBCancelarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jBCancelarFocusGained
        this.jBCancelar.setBackground(new Color(70, 130, 180));
    }//GEN-LAST:event_jBCancelarFocusGained

    private void jBCancelarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jBCancelarFocusLost
        this.jBCancelar.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_jBCancelarFocusLost

    private void jBEntrarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jBEntrarFocusGained
        this.jBEntrar.setBackground(new Color(70, 130, 180));
    }//GEN-LAST:event_jBEntrarFocusGained

    private void jBEntrarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jBEntrarFocusLost
        this.jBEntrar.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_jBEntrarFocusLost

    private void JPMainLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JPMainLoginKeyPressed


    }//GEN-LAST:event_JPMainLoginKeyPressed

    private void JTUsuarioLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTUsuarioLoginKeyPressed

        new Thread() {
            @Override
            public void run() {

                try {
                    jProgressBarLogin.setVisible(true);

                    Banco.Conectar();
                    login();

                } catch (BancoException e) {
                    jProgressBarLogin.setVisible(false);
                    JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Aviso", 1);
                } catch (UsuarioException ue) {
                    jProgressBarLogin.setVisible(false);
                    JLMsgErroLogin.setText(ue.getMessage());
                } catch (NoClassDefFoundError | ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException be) {
                    jProgressBarLogin.setVisible(false);
                    JOptionPane.showMessageDialog(rootPane, "Erro na conexão com o banco de dados. \n" + be.getMessage(), "Erro", 2);
                } catch (Exception ex) {
                    jProgressBarLogin.setVisible(false);
                    JOptionPane.showMessageDialog(rootPane, "Erro na conexão com o banco de dados. \n" + ex.getMessage(), "Erro", 2);
                }

            }

        }.start();

    }//GEN-LAST:event_JTUsuarioLoginKeyPressed

    private void JTSenhaLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTSenhaLoginKeyPressed
        if (evt.getKeyCode() == 10) {
            new Thread() {
                @Override
                public void run() {

                    try {
                        jProgressBarLogin.setVisible(true);

                        Banco.Conectar();
                        login();

                    } catch (BancoException e) {
                        jProgressBarLogin.setVisible(false);
                        JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Aviso", 1);
                    } catch (UsuarioException ue) {
                        jProgressBarLogin.setVisible(false);
                        JLMsgErroLogin.setText(ue.getMessage());
                    } catch (NoClassDefFoundError | ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException be) {
                        jProgressBarLogin.setVisible(false);
                        JOptionPane.showMessageDialog(rootPane, "Erro na conexão com o banco de dados. \n" + be.getMessage(), "Erro", 2);
                    } catch (Exception ex) {
                        jProgressBarLogin.setVisible(false);
                        JOptionPane.showMessageDialog(rootPane, "Erro na conexão com o banco de dados. \n" + ex.getMessage(), "Erro", 2);
                    }

                }

            }.start();
        }
    }//GEN-LAST:event_JTSenhaLoginKeyPressed

    private void jBEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBEntrarKeyPressed

        try {
            this.login();
        } catch (UsuarioException ex) {
            Logger.getLogger(JFLogin.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jBEntrarKeyPressed

    private void jBCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBCancelarKeyPressed
        Runtime.getRuntime().exit(0);
    }//GEN-LAST:event_jBCancelarKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLMsgErroLogin;
    private javax.swing.JLabel JLNameSoft;
    private javax.swing.JLabel JLVersao;
    private javax.swing.JPanel JPMainLogin;
    private javax.swing.JPasswordField JTSenhaLogin;
    private javax.swing.JTextField JTUsuarioLogin;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBarLogin;
    private javax.swing.JLabel lblCopyRight;
    // End of variables declaration//GEN-END:variables
}
