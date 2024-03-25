package Classes;

import javax.swing.ImageIcon;

public class Config {

    public static final String VERSAOAPP = "2.6.1";
    public static final String NAMEAPP = "ControlCar";
    public static final String ANOAPP = "2022";

    public static final String USER = "";
    public static final String PASS = "cc2019*";
    private static String FILEBANK;

    private static final String FILEBANKPROD = System.getProperty("user.dir") + "\\db\\dbcontrolcar.mdb";
    private static final String FILEBANKDEV = "C:\\HP\\dbcontrolcar.mdb";

    public static final String URLDRIVER = "net.ucanaccess.jdbc.UcanaccessDriver";
    public static final String CAMINHOREL = System.getProperty("user.dir") + "//rpt//";
    public static ImageIcon IMAGEICON = new ImageIcon(System.getProperty("user.dir") + "//icons.png");
    public static final boolean DEVELOPMENT = false;

    public static String getCaminhoBanco() {

        if (DEVELOPMENT) {
            FILEBANK = FILEBANKDEV;
        } else {
            FILEBANK = FILEBANKPROD;
        }

        return FILEBANK;

    }

}
