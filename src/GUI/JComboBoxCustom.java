package GUI;

import javax.swing.JComboBox;

/**
 *
 * @author GOMES
 */
public class JComboBoxCustom extends JComboBox{

    int[] codCombo;
    String[] codComboStr;
    
    public JComboBoxCustom() {
        
        this.setFont(new java.awt.Font("Century Gothic", 0, 14)); 
        this.setForeground(new java.awt.Color(0, 102, 153));
        
    }
    
    
    public void setCodCombo(int[] listcod ){  
        this.codCombo = listcod;    
    }
    
    public int getCodSelect(){ 
        return this.codCombo[this.getSelectedIndex()];
    }
    

    public void setCodCombo(String[] listcod ){  
        this.codComboStr = listcod;    
    }

    public String getCodSelectStr(){ 
        return this.codComboStr[this.getSelectedIndex()];
    }    
    
}
