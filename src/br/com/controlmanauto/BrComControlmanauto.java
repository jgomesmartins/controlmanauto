package br.com.controlmanauto;

import Classes.Config;
import GUI.JFLogin;
import com.jgoodies.looks.plastic.PlasticLookAndFeel;
import com.jgoodies.looks.plastic.PlasticXPLookAndFeel;
import com.jgoodies.looks.plastic.theme.DesertBluer;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class BrComControlmanauto {

    public static void main(String[] args) {

        try {

            PlasticLookAndFeel.setPlasticTheme(new DesertBluer());
            try {
                UIManager.setLookAndFeel(new PlasticXPLookAndFeel());
            } catch (UnsupportedLookAndFeelException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }

            if (!Classes.Config.DEVELOPMENT) {

                if (args.length == 0) {
                    JOptionPane.showMessageDialog(null, "Acesso negado por esse caminho, execute a versão \"ControlCar.exe ou ControlCar.bat\".", "Aviso!     " + Config.NAMEAPP +"("+ Config.VERSAOAPP +")", JOptionPane.WARNING_MESSAGE);
                    System.exit(0);
                } else if (args.length > 0) {

                    String arq = args[0];
                    arq = arq.toLowerCase();

                    if (!arq.equals("controlcar.exe")) {
                        JOptionPane.showMessageDialog(null, "Acesso negado por esse caminho, execute a versão \"ControlCar.exe ou ControlCar.bat\".", "Aviso", JOptionPane.WARNING_MESSAGE);
                        System.exit(0);
                    }

                }
            }

            java.awt.EventQueue.invokeLater(() -> {
                try {
                    JFLogin jfs = new JFLogin();
                    jfs.setLocationRelativeTo(null);
                    jfs.setVisible(true);
                } catch (InterruptedException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }
            });

        } catch (HeadlessException e) {

            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

}
