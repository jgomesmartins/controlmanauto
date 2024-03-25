package Fachada;

import Entidade.Veiculo;
import Negocio.NegDashboard;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GOMES
 */
public class FacDashboard {
    
    Negocio.NegDashboard negdash = new NegDashboard();
    
        public int CarregaTabelaManutencao(Veiculo obj) throws Exception {
   
            return  0;
        
    }

    public List<Object> CarregaDadosGerais(Veiculo v) throws Exception {
        
         List<Object> listobj = new ArrayList<>();
         listobj = this.negdash.CarregaDadosGerais(v);
        
        return listobj;
        
    }
    
    public List<Object> CarregaTabelaTodasManutencao(Veiculo v) throws Exception {
        
         List<Object> listobj = new ArrayList<>();
         listobj = this.negdash.CarregaTabelaTodasManutencao(v);
        
        return listobj;
        
    }

 
        public List<Object> CarregaTabelaProximasManutencao(Veiculo v) throws Exception {
        
         List<Object> listobj = new ArrayList<>();
         listobj = this.negdash.CarregaTabelaProximasManutencao(v);
        
        return listobj;
        
    }
    
        
        public List<Object> CarregaTabelaVencidasManutencao(Veiculo v) throws Exception {
        List<Object> listobj = new ArrayList<>();
        listobj = this.negdash.CarregaTabelaVencidasManutencao(v);

        return listobj;
    }
        
}
