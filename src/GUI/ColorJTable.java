package GUI;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author GOMES
 */
public class ColorJTable extends DefaultTableCellRenderer {
    
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        if (row % 2 == 1) {
            setBackground(new Color(220, 220, 220));
        } else {
            setBackground(Color.WHITE);
        }

        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

    }

}


