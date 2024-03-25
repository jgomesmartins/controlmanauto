package Fachada;

import Entidade.Veiculo;
import Entidade.VeiculoException;
import java.util.List;
import Interface.IntefaceGenerics;
import Negocio.NegVeiculo;
import java.util.ArrayList;

public class FacVeiculo implements IntefaceGenerics<Veiculo> {

    private final NegVeiculo negveiculo = new NegVeiculo();
    
    @Override
    public int Adicionar(Veiculo obj) throws Exception,VeiculoException {
        
        int ret = this.negveiculo.Adicionar(obj);              
        return ret;     
    }

    @Override
    public int Atualizar(Veiculo obj) throws Exception,VeiculoException {

        int ret = this.negveiculo.Atualizar(obj);
        return ret;
    }

    @Override
    public int Excluir(Veiculo obj) throws Exception, VeiculoException {
       int ret =  this.negveiculo.Excluir(obj);
       
       return ret;
    }

    @Override
    public List<Veiculo> Consultar(Veiculo obj) throws Exception , VeiculoException{
        
        List<Veiculo> list = new ArrayList<>();      
        list = this.negveiculo.Consultar(obj);
        
        return  list;
    }



}
