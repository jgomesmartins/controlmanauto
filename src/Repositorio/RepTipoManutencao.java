package Repositorio;

import Banco.Banco;
import Banco.QuerySQL;
import Entidade.TipoManutencao;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GOMES
 */
public class RepTipoManutencao implements Interface.IntefaceGenerics<TipoManutencao> {

    @Override
    public int Adicionar(TipoManutencao obj) throws Exception {
        int ret = Banco.ExecutarSQL(QuerySQL.InsertTipoManutencao(obj));
        return ret;

    }

    @Override
    public int Atualizar(TipoManutencao obj) throws Exception {
        int ret = Banco.ExecutarSQL(QuerySQL.UpdateTipoManutencao(obj));
        return ret;
    }

    @Override
    public int Excluir(TipoManutencao obj) throws Exception {
        int ret = Banco.ExecutarSQL(QuerySQL.DeleteTipoManutencao(obj));
        return ret;
    }

    @Override
    public List<TipoManutencao> Consultar(TipoManutencao obj) throws Exception {

        List<TipoManutencao> linsttm = new ArrayList<>();

        ResultSet rs = Banco.ExecutarConsultaSQL(QuerySQL.ConsultarTipoManutencao(obj));

        while (rs.next()) {

            TipoManutencao tm = new TipoManutencao();
            tm.setID(rs.getInt("ID"));
            tm.setDescricao(rs.getString("DESCRICAO"));
            tm.setTipo(rs.getInt("TIPO"));
            tm.setMeses(rs.getInt("MESES"));
            tm.setDataAdd(rs.getDate("DT_ADD"));
            tm.setDataUpd(rs.getDate("DT_UPD"));
            tm.setQuilometragem(rs.getInt("QUILOMETRAGEM"));

            linsttm.add(tm);

            tm = null;

        }

        return linsttm;

    }

}
