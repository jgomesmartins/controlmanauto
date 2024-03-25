package Fachada;

import Entidade.Proxy;
import Entidade.ProxyException;
import Negocio.NegConfiguracao;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GOMES
 */
public class FacConfiguracao {
   
    private Negocio.NegConfiguracao jegconf = new NegConfiguracao();
    
    
    public int SalvarProxy(Proxy obj) throws Exception,ProxyException {
        int ret = this.jegconf.SalvarProxy(obj);
        return ret;
    }

    public List<Proxy> ConsultarProxy(Proxy obj) throws Exception, Exception {

        List<Proxy> listpro = new ArrayList<>();
        listpro = this.jegconf.ConsultarProxy(obj);
        
        return listpro;
        
    }
    
    public void gravaCorPainel(Color corRGB) throws Exception{
    

        jegconf.salvarCorPainel(corRGB);
        
    }
    
     public Color consultaCorPainel() throws Exception{
    
        Color cor =  jegconf.consultaCorPainel();
         
        return cor;

    }
    

   
    
}
