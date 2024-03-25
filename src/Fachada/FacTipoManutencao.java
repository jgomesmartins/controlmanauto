
package Fachada;

import Entidade.TipoManutencao;
import Negocio.NegTipoManutencao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GOMES
 */
public class FacTipoManutencao implements Interface.IntefaceGenerics<TipoManutencao>{

    Negocio.NegTipoManutencao negtipomanu = new NegTipoManutencao();
    
    @Override
    public int Adicionar(TipoManutencao obj) throws Exception {
       int ret =   negtipomanu.Adicionar(obj);
       return ret;
    }

    @Override
    public int Atualizar(TipoManutencao obj) throws Exception {
        int ret =   negtipomanu.Atualizar(obj);
        return ret;
    }

    @Override
    public int Excluir(TipoManutencao obj) throws Exception {
       int ret =   negtipomanu.Excluir(obj);
       return ret;
    }

    @Override
    public List<TipoManutencao> Consultar(TipoManutencao obj) throws Exception {
        
        List<TipoManutencao> listtm = new ArrayList<>();
        
        listtm = this.negtipomanu.Consultar(obj);
        
        return listtm;
        
    }
    
}
