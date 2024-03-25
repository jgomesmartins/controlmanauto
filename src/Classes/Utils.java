package Classes;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author GOMES
 */
public class Utils {

    public static String FormatData(String format, String data) throws ParseException {

        SimpleDateFormat formato = new SimpleDateFormat(format);
        Date dtform = new SimpleDateFormat("dd/MM/yyyy").parse(data);
        String vlformat = formato.format(dtform);

        return vlformat;
    }

    public static String FormatData(String format, Date data) {

        String vlformat = "";

        if (data != null) {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            vlformat = sdf.format(data);
        }

        return vlformat;
    }

    public static String FormartDecimal(String format, Integer valor) {
        DecimalFormat df = new DecimalFormat(format);

        String vlformat = df.format(valor);
        return vlformat;
    }
    
        public static Float FormartDecimalFloat(String format, Integer valor) {
        Float df = null;
        
        return df;
    }
    

    public static String FormartDecimal(String format, Double valor) {
        DecimalFormat df = new DecimalFormat(format);

        String vlformat = df.format(valor);
        return vlformat;
    }

    public static Date ConvertStringToDate(String format, String valor) throws ParseException {

        SimpleDateFormat sf = new SimpleDateFormat(format);
        SimpleDateFormat sf1 = new SimpleDateFormat(format);
        sf.setLenient(false);
        Date dt1 = sf.parse(valor);

        return dt1;
    }
    
        public static Date FormatDateToDate(String format, Date valor) throws ParseException {

        Locale BRAZIL = new Locale("pt","BR");    
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, BRAZIL);        
        Calendar cal = Calendar.getInstance();
        cal.setTime(valor);
        df.setCalendar(cal);
        
        return df.parse("25/07/2019");
    }

    public static Date[] FormatData(Object get) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Double FormartDecimalFloat(String format, double valor) {
        
        DecimalFormat df = new DecimalFormat(format);
        String vlformat = df.format(valor);
        return Double.valueOf(vlformat);
   
    }

    public static Double FormartDecimalFloat(String format, String val) {
         DecimalFormat df = new DecimalFormat(format);
        String vlformat = df.format(val);
        return Double.valueOf(vlformat);
    }

}
