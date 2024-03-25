package Fachada;

import Entidade.Quilometragem;
import Entidade.QuilometragemException;
import Entidade.VeiculoException;
import Negocio.NegQuilometragem;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GOMES
 */
public class FacQuilometragem implements Interface.IntefaceGenerics<Quilometragem>{

    NegQuilometragem negqui =  new NegQuilometragem();
    
    @Override
    public int Adicionar(Quilometragem obj) throws Exception,QuilometragemException {
        
        int ret = negqui.Adicionar(obj);
        return ret;
        
    }

    @Override
    public int Atualizar(Quilometragem obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Excluir(Quilometragem obj) throws Exception,VeiculoException,QuilometragemException {
        int ret = this.negqui.Excluir(obj);
        
        return ret;
    }

    @Override
    public List<Quilometragem> Consultar(Quilometragem obj) throws Exception,VeiculoException,QuilometragemException {
        
        List<Quilometragem> listqui = new ArrayList<>();    
        listqui = this.negqui.Consultar(obj);
        return listqui;
        
    }
    
    
    public List<Quilometragem> ConsultarTabela(Quilometragem obj) throws Exception,VeiculoException,QuilometragemException {
        
        List<Quilometragem> listqui = new ArrayList<>();    
        listqui = this.negqui.ConsultarTabela(obj);
        return listqui;
        
    }

    public List<String> CarregaComboMesAno(Quilometragem obj) throws Exception, VeiculoException, QuilometragemException {

        List<String> ret = new ArrayList<>();
        ret = this.negqui.CarregaComboMesAno(obj);
        return ret;

    }
    
     public String[] ConsultaMaxQuilometragem(Quilometragem obj) throws Exception,VeiculoException,QuilometragemException{
     
        String[] ret = this.negqui.ConsultaMaxQuilometragem(obj);
    
        return ret;
    
    }
    
}
