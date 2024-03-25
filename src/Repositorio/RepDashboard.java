package Repositorio;

import Banco.Banco;
import Banco.QuerySQL;
import Classes.Utils;
import Entidade.Veiculo;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GOMES
 */
public class RepDashboard {

    public List<Object> CarregaDadosGerais(Veiculo v) throws Exception {

        List<Object> listobj = new ArrayList<>();

        ResultSet rs = Banco.ExecutarConsultaSQL(QuerySQL.CarregaDadosGerais(v));
        String dkmatual;
        int kmmatual = 0;

        while (rs.next()) {

            int de = Utils.FormatData("dd/MM/yyyy", rs.getDate("DT_KM_ATUAL")).length();

            if (de > 0) {

                dkmatual = Utils.FormatData("dd/MM/yyyy", rs.getDate("DT_KM_ATUAL"));

            } else {

                String dtau = rs.getString("DATA_COMPRA");
                dkmatual = Utils.FormatData("dd/MM/yyyy", dtau);
            }

            if (rs.getInt("KM_ATUAL") > 0) {
                kmmatual = rs.getInt("KM_ATUAL");
            } else {

                kmmatual = rs.getInt("KM_INICIAL");
            }

            Object[] row = {
                rs.getString("PROPRIETARIO"),
                Utils.FormatData("dd/MM/yyyy", rs.getString("DATA_COMPRA")),
                Utils.FormartDecimal("###,###", rs.getInt("KM_INICIAL")),
                Utils.FormartDecimal("###,###", kmmatual),
                Utils.FormartDecimal("###,###.00", rs.getDouble("VALOR_TOTAL")),
                //rs.getString("DT_KM_ATUAL"),
                Utils.FormatData("dd/MM/yyyy", dkmatual)

            };
            listobj.add(row);
        }

        return listobj;

    }

    public List<Object> CarregaTabelaTodasManutencao(Veiculo v) throws Exception {
        List<Object> listobj = new ArrayList<>();

        ResultSet rs = Banco.ExecutarConsultaSQL(QuerySQL.CarregaTabelaTodasManutencao(v));

        while (rs.next()) {

            String strsituacao = "";

            if (rs.getDouble("SITUACAO") == 1) {
                strsituacao = "EM USO";
            } else if (rs.getDouble("SITUACAO") == 2) {
                strsituacao = "SUBSTITUÍDO";
            }

            String kmtroca = "";
            if (rs.getInt("KM_TROCA") > 0) {
                kmtroca = Utils.FormartDecimal("###,###", rs.getInt("KM_TROCA"));
            }

            Object[] row = {
                rs.getString("TIPO_MANUTENCAO"),
                Utils.FormatData("dd/MM/yyyy", rs.getDate("DT_MANUTENCAO")),
                Utils.FormartDecimal("###,###", rs.getInt("QUILOMETRAGEM")),
                Utils.FormartDecimal("#,###.00", rs.getDouble("VALOR")),
                strsituacao,
                rs.getString("OBSERVACAO"),
                kmtroca,
                Utils.FormatData("dd/MM/yyyy", rs.getDate("DT_TROCA"))

            };
            listobj.add(row);

        }

        return listobj;
    }

    public List<Object> CarregaTabelaProximasManutencao(Veiculo v) throws Exception {
        List<Object> listobj = new ArrayList<>();

        ResultSet rs = Banco.ExecutarConsultaSQL(QuerySQL.CarregaTabelaProximasManutencao(v));

        while (rs.next()) {

            Object[] row = {
                rs.getString("TIPO_MANUTENCAO"),
                Utils.FormatData("dd/MM/yyyy", rs.getDate("DT_PROX_TROCA")),
                Utils.FormartDecimal("###,###", rs.getInt("KM_PROX_TROCA")),
                Utils.FormatData("dd/MM/yyyy", rs.getDate("DT_MANUTENCAO")),
                Utils.FormartDecimal("###,###", rs.getInt("QUILOMETRAGEM")),
                rs.getInt("KM_TIPO_MANUTENCAO")};
            listobj.add(row);

        }

        return listobj;

    }

    public List<Object> CarregaTabelaVencidasManutencao(Veiculo v) throws Exception {

        List<Object> listobj = new ArrayList<>();

        ResultSet rs = Banco.ExecutarConsultaSQL(QuerySQL.CarregaTabelaVencidasManutencao(v));

        while (rs.next()) {

            Object[] row = {
                rs.getString("TIPO_MANUTENCAO"),
                Utils.FormatData("dd/MM/yyyy", rs.getDate("DT_PROX_TROCA")),
                Utils.FormartDecimal("###,###", rs.getInt("KM_PROX_TROCA"))};

            listobj.add(row);

        }

        return listobj;

    }

}
