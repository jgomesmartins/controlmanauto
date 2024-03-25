package Fachada;

import Entidade.Manutencao;
import Entidade.ManutencaoException;
import Entidade.TipoManutencao;
import Negocio.NegManutencao;
import java.util.ArrayList;
import java.util.List;

public class FacManutencao implements Interface.IntefaceGenerics<Manutencao>{

    Negocio.NegManutencao negman = new NegManutencao();
    
    @Override
    public int Adicionar(Manutencao obj) throws Exception,ManutencaoException {
        
        int ret = this.negman.Adicionar(obj);
        return ret;
        
    }

    @Override
    public int Atualizar(Manutencao obj) throws Exception,ManutencaoException {
        int ret = 0;
        ret =   this.negman.Atualizar(obj);
        return ret; 
        
        
    }

    @Override
    public int Excluir(Manutencao obj) throws Exception, ManutencaoException {
       int ret = 0;
       ret = this.negman.Excluir(obj);
       return ret;
        
    }

    @Override
    public List<Manutencao> Consultar(Manutencao obj) throws Exception {
        List<Manutencao> listman = new ArrayList<>();
        
        listman = this.negman.Consultar(obj);
        return listman;
        
    }
      
      public List<Object> ConsultarManutencaoTabela(Manutencao obj) throws Exception{
    
        List<Object> listobj = new ArrayList<>();
        
           
        listobj = this.negman.ConsultarManutencaoTabela(obj);
        
        
        return listobj;
        
    }

    public List<Manutencao> consultaManUpdate(Manutencao man) throws Exception {
       List<Manutencao> listman = new ArrayList<>();

        listman = this.negman.consultaManUpdate(man);

        return listman;
    }

    public int updateManDelete(Manutencao mup) throws Exception {
      int ret = this.negman.updateManDelete(mup);
        
        return ret;
    }

    public List<Object> ConsultarManutencaoTabela(Manutencao tmp, TipoManutencao tm) throws Exception{
                List<Object> listobj = new ArrayList<>();
        
         
        listobj = this.negman.ConsultarManutencaoTabela(tmp,tm);
        
        
        return listobj;
        
    }
    
}
