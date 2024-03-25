package Repositorio;

import Banco.Banco;
import Entidade.Manutencao;
import Banco.QuerySQL;
import Entidade.TipoManutencao;
import Classes.Utils;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RepManutencao implements Interface.IntefaceGenerics<Manutencao> {

    @Override
    public int Adicionar(Manutencao obj) throws Exception {

        int ret = Banco.ExecutarSQL(QuerySQL.insertManutencao(obj));

        return ret;
    }

    @Override
    public int Atualizar(Manutencao obj) throws Exception {
        int ret = 0;
        ret = Banco.ExecutarSQL(QuerySQL.UpdateManutencao(obj));
        return ret;

    }

    @Override
    public int Excluir(Manutencao obj) throws Exception {
        int ret = 0;
        ret = Banco.ExecutarSQL(QuerySQL.deleteManutencao(obj));
        return ret;

    }

    @Override
    public List<Manutencao> Consultar(Manutencao obj) throws Exception {
        List<Manutencao> listman = new ArrayList<>();

        ResultSet rs = Banco.ExecutarConsultaSQL(QuerySQL.ConsultarManutencao(obj));

        while (rs.next()) {

            Manutencao man = new Manutencao();

            man.setIDManutencao(rs.getInt("ID"));
            man.setIDVeiculo(rs.getInt("ID_VEICULO"));
            man.setDataManutencao(rs.getDate("DT_MANUTENCAO"));
            man.setQuilometragem(rs.getInt("QUILOMETRAGEM"));
            man.setObservacao(rs.getString("OBSERVACAO"));
            man.setSituacao(rs.getInt("SITUACAO"));
            man.setValor(rs.getDouble("VALOR"));
            man.setDataAdd(rs.getDate("DT_ADD"));
            man.setDTProxTroca(rs.getDate("DT_PROX_TROCA"));
            man.setDataUpd(rs.getDate("DT_UPD"));
            man.setKMProxTroca(rs.getInt("KM_PROX_TROCA"));
            man.setIDTipoManutencao(rs.getInt("ID_TIPOMANUTENCAO"));
            listman.add(man);
            man = null;
        }

        return listman;
    }

    public List<Object> ConsultarManutencaoTabela(Manutencao obj) throws Exception {

        List<Object> listobj = new ArrayList<>();

        ResultSet rs = Banco.ExecutarConsultaSQL(QuerySQL.ConsultarManutencaoTabela(obj));

        while (rs.next()) {

            String situacao = "";

            if (rs.getInt("SITUACAO") == 1) {
                situacao = "EM USO";
            } else if (rs.getInt("SITUACAO") == 2) {
                situacao = "SUBSTITUÍDO";
            }

            Object[] row = {rs.getInt("ID"),
                rs.getString("DESCRICAO"),
                Utils.FormartDecimal("###,###", rs.getInt("QUILOMETRAGEM")),
                rs.getDate("DT_MANUTENCAO"),
                Utils.FormartDecimal("#,###.00",  rs.getDouble("VALOR")),
                rs.getString("OBSERVACAO"),
                Utils.FormatData("dd/MM/yyyy", rs.getDate("DT_ADD")),
                situacao,
                Utils.FormartDecimal("###,###", rs.getInt("KM_PROX_TROCA")),
                Utils.FormatData("dd/MM/yyyy", rs.getDate("DT_PROX_TROCA"))
            };

            listobj.add(row);
            row = null;
        }

        return listobj;

    }

    public List<Manutencao> consultaManUpdate(Manutencao man) throws Exception {

        List<Manutencao> listman = new ArrayList<>();

        ResultSet rs = Banco.ExecutarConsultaSQL(QuerySQL.consultaManUpdate(man));

        while (rs.next()) {

            Manutencao manup = new Manutencao();

            manup.setIDManutencao(rs.getInt("ID"));
            manup.setIDVeiculo(rs.getInt("ID_VEICULO"));
            manup.setDataManutencao(rs.getDate("DT_MANUTENCAO"));
            manup.setQuilometragem(rs.getInt("QUILOMETRAGEM"));
            manup.setObservacao(rs.getString("OBSERVACAO"));
            manup.setSituacao(rs.getInt("SITUACAO"));
            manup.setValor(rs.getDouble("VALOR"));
            manup.setDataAdd(rs.getDate("DT_ADD"));
            manup.setDTProxTroca(rs.getDate("DT_PROX_TROCA"));
            manup.setDataUpd(rs.getDate("DT_UPD"));
            manup.setKMProxTroca(rs.getInt("KM_PROX_TROCA"));
            manup.setIDTipoManutencao(rs.getInt("ID_TIPOMANUTENCAO"));
            listman.add(manup);
            manup = null;
        }

        return listman;

    }

    public int updateManDelete(Manutencao mup) throws Exception {
        int ret = 0;
        ret = Banco.ExecutarSQL(QuerySQL.updateManDelete(mup));
        return ret;
    }

    public List<Object> ConsultarManutencaoTabela(Manutencao tmp, TipoManutencao tm) throws Exception{
        
                List<Object> listobj = new ArrayList<>();

        ResultSet rs = Banco.ExecutarConsultaSQL(QuerySQL.ConsultarManutencaoTabelaFiltro(tmp,tm));

        while (rs.next()) {

            String situacao = "";

            if (rs.getInt("SITUACAO") == 1) {
                situacao = "EM USO";
            } else if (rs.getInt("SITUACAO") == 2) {
                situacao = "SUBSTITUÍDO";
            }

            Object[] row = {rs.getInt("ID"),
                rs.getString("DESCRICAO"),
                Utils.FormartDecimal("###,###", rs.getInt("QUILOMETRAGEM")),
                rs.getDate("DT_MANUTENCAO"),
                Utils.FormartDecimal("#,###.00",  rs.getDouble("VALOR")),
                rs.getString("OBSERVACAO"),
                Utils.FormatData("dd/MM/yyyy", rs.getDate("DT_ADD")),
                situacao,
                Utils.FormartDecimal("###,###", rs.getInt("KM_PROX_TROCA")),
                Utils.FormatData("dd/MM/yyyy", rs.getDate("DT_PROX_TROCA")),
                rs.getInt("ID_TIPO_MAN")
            };

            listobj.add(row);
            row = null;
        }

        return listobj;
        
        
        
    }

}
