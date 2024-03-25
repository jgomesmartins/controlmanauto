package Negocio;

import Entidade.Veiculo;
import Repositorio.RepDashboard;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GOMES
 */
public class NegDashboard {

    Repositorio.RepDashboard repdash = new RepDashboard();

    public List<Object> CarregaDadosGerais(Veiculo v) throws Exception {

        List<Object> listobj = new ArrayList<>();
        listobj = this.repdash.CarregaDadosGerais(v);

        return listobj;

    }

    public List<Object> CarregaTabelaTodasManutencao(Veiculo v) throws Exception {

        List<Object> listobj = new ArrayList<>();
        listobj = this.repdash.CarregaTabelaTodasManutencao(v);

        return listobj;

    }

    public List<Object> CarregaTabelaProximasManutencao(Veiculo v) throws Exception {
        List<Object> listobj = new ArrayList<>();
        listobj = this.repdash.CarregaTabelaProximasManutencao(v);

        return listobj;
    }

    public List<Object> CarregaTabelaVencidasManutencao(Veiculo v) throws Exception {
        List<Object> listobj = new ArrayList<>();
        listobj = this.repdash.CarregaTabelaVencidasManutencao(v);

        return listobj;
    }

}
