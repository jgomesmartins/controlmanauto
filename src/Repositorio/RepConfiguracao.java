package Repositorio;

import Banco.Banco;
import Entidade.Proxy;
import Banco.QuerySQL;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GOMES
 */
public class RepConfiguracao {

    public int SalvarPortaProxy(Proxy obj) throws Exception {

        int ret = 0;
        ret = Banco.ExecutarSQL(QuerySQL.updatePortaProxy(obj));
        return ret;

    }

    public int SalvarHostProxy(Proxy obj) throws Exception {

        int ret = 0;
        ret = Banco.ExecutarSQL(QuerySQL.updateHostProxy(obj));
        return ret;

    }

    public List<Proxy> ConsultarProxy(Proxy obj) throws Exception {

        List<Proxy> listpro = new ArrayList<>();

        ResultSet rs = Banco.ExecutarConsultaSQL(QuerySQL.consultarProxy());

        while (rs.next()) {

            Proxy px = new Proxy();

            if ("PROXY-HOST".equals(rs.getString("NOME"))) {
                px.setHostname(rs.getString("VALOR"));
            }

            if ("PROXY-PORTA".equals(rs.getString("NOME"))) {
                px.setPorta(rs.getString("VALOR"));
            }

            listpro.add(px);

            px = null;

        }

        return listpro;
    }

    public String consultaCorPainel() throws Exception {
        
       ResultSet rs = Banco.ExecutarConsultaSQL(QuerySQL.consultaCorPainel()); 
       rs.next();              
       return  rs.getString("VALOR");
                
        
    }

    public int salvarCorPainel(String cor) throws Exception {
        
        int rs  = Banco.ExecutarSQL(QuerySQL.salvaCorPainel(cor));
        
        return rs;
        
    }

}
