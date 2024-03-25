package Negocio;

import Entidade.Proxy;
import Entidade.ProxyException;
import Repositorio.RepConfiguracao;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GOMES
 */
public class NegConfiguracao {

    Repositorio.RepConfiguracao repconf = new RepConfiguracao();

    public int SalvarProxy(Proxy obj) throws Exception, ProxyException {

        int retport = this.repconf.SalvarPortaProxy(obj);
        int rethost = this.repconf.SalvarHostProxy(obj);

        if (rethost == 0 | retport == 0) {

            throw new ProxyException("Erro ao salvar as configurações de proxy.");
        }

        return retport + rethost;
    }

    public List<Proxy> ConsultarProxy(Proxy obj) throws Exception {

        List<Proxy> listpro = new ArrayList<>();

        listpro = this.repconf.ConsultarProxy(obj);

        return listpro;
    }

    public Color consultaCorPainel() throws Exception {
        
      String[] corRgb =  this.repconf.consultaCorPainel().split(",");
      
      int r,g,b;
      r = Integer.parseInt(corRgb[0]);
      g = Integer.parseInt(corRgb[1]);
      b = Integer.parseInt(corRgb[2]);
      
      Color cor = new Color(r,g,b);
           
      return cor;
        
    }

    public void salvarCorPainel(Color corRGB) throws Exception {
              
            String cor =  String.valueOf(corRGB.getRed()) + "," + String.valueOf(corRGB.getGreen()) +"," + String.valueOf(corRGB.getBlue());
  
            int rs = this.repconf.salvarCorPainel(cor);
            
        
    }

}
