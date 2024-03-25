package Negocio;

import Entidade.TipoManutencao;
import Entidade.TipoManutencaoException;
import Repositorio.RepTipoManutencao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GOMES
 */
public class NegTipoManutencao implements Interface.IntefaceGenerics<TipoManutencao> {

    Repositorio.RepTipoManutencao reptipomanu = new RepTipoManutencao();

    @Override
    public int Adicionar(TipoManutencao obj) throws Exception, TipoManutencaoException {

        List<TipoManutencao> listret = new ArrayList<>();
        TipoManutencao tmptemp = new TipoManutencao();

        tmptemp.setID(-2);
        tmptemp.setDescricao(obj.getDescricao());
        tmptemp.setTipo(obj.getTipo());
        tmptemp.setQuilometragem(obj.getQuilometragem());

        listret = this.Consultar(tmptemp);

        if (listret.size() > 0) {
            throw new TipoManutencaoException("Tipo de manutenção já cadastrado no sistema.");
        }

        int ret = reptipomanu.Adicionar(obj);

        if (ret == 0) {
            throw new TipoManutencaoException("Houve falha na inclusão solicitada.\nTipo de manutenção não cadastrado no sistema.");
        }

        return ret;

    }

    @Override
    public int Atualizar(TipoManutencao obj) throws Exception, TipoManutencaoException {

        List<TipoManutencao> listret = new ArrayList<>();
        TipoManutencao tmptemp = new TipoManutencao();

        tmptemp.setID(obj.getID());
        tmptemp.setDescricao(obj.getDescricao());
        tmptemp.setTipo(obj.getTipo());
        tmptemp.setQuilometragem(obj.getQuilometragem());

        listret = this.Consultar(tmptemp);

        for (TipoManutencao tmanu : listret) {

            if (tmanu.getID() != obj.getID()) {
                throw new TipoManutencaoException("Tipo de manutenção já cadastrado no sistema.");
            }
        }

        int ret = reptipomanu.Atualizar(obj);

        if (ret == 0) {
            throw new TipoManutencaoException("Houve falha na inclusão solicitada.\nTipo de manutenção não cadastrado no sistema.");
        }

        return ret;

    }

    @Override
    public int Excluir(TipoManutencao obj) throws Exception, TipoManutencaoException {

        try {
            int ret = reptipomanu.Excluir(obj);
            return ret;

        } catch (Exception e) {

            if (e.getMessage().contains("foreign key no action")) {
                throw new TipoManutencaoException("Tipo de manutenção não pode ser excluído quando estiver assossiada a manutenção de veículo.\nOperação abortada!.");
            } else {

                throw new Exception(e.getMessage());
            }

        }

    }

    @Override
    public List<TipoManutencao> Consultar(TipoManutencao obj) throws Exception, TipoManutencaoException {

        List<TipoManutencao> listtm = new ArrayList<>();
        listtm = this.reptipomanu.Consultar(obj);

        return listtm;

    }

}
