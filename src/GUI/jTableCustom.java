package GUI;

import java.awt.Color;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

public class jTableCustom extends JTable {

    public jTableCustom() {

        JTableHeader header = this.getTableHeader();
        header.setForeground(new Color(0, 102, 153));
        header.setFont((new java.awt.Font("Century Gothic", 0, 12)));
        this.setFont(new java.awt.Font("Century Gothic", 0, 12)); 
        this.setSize(100, 100);
        this.showHorizontalLines = true;
        this.showVerticalLines = true;
        this.setRowHeight(22);
    }

    public void deleteRows() {

        while (this.getModel().getRowCount() > 0) {
            DefaultTableModel dt = (DefaultTableModel) this.getModel();
            dt.removeRow(0);
        }

    }

    public void ColorRow(JTable jt, String[] alin) {

        TableColumn column = null;

        for (int i = 0; i < jt.getColumnCount(); i++) {

            ColorJTable cf = new ColorJTable();

            switch (alin[i]) {
                case "D":
                    cf.setHorizontalAlignment(SwingConstants.RIGHT);
                    break;
                case "C":
                    cf.setHorizontalAlignment(SwingConstants.CENTER);
                    break;
                case "E":
                    cf.setHorizontalAlignment(SwingConstants.LEFT);
                    break;
                default:
                    break;
            }

            column = jt.getColumnModel().getColumn(i);
            column.setCellRenderer(cf);

            cf = null;
        }
    }

}
