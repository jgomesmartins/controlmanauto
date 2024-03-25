
package GUI;

import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author GOMES
 */
public class FontUnderline {
    
    
    public static Font setUnderlineOn(Font f) {

        Map<TextAttribute, Object> atributos = new HashMap<>();
        atributos.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        Font font = f.deriveFont(atributos);

        return font;

    }

    static Font setUnderlineOff(Font f) {

        Map<TextAttribute, Object> atributos = new HashMap<>();
        atributos.put(TextAttribute.UNDERLINE, null);
        Font font = f.deriveFont(atributos);

        return font;

    }

    
    
}
