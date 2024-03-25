package Banco;

import Entidade.Manutencao;
import Entidade.Proxy;
import Entidade.Quilometragem;
import Entidade.TipoManutencao;
import Classes.Utils;
import Entidade.Veiculo;

public class QuerySQL {

    private static String sql;

    public static String InsertVeiculo(Veiculo v) {

        sql = "INSERT INTO TB_VEICULO(ANO_FAB,ANO_MOD,COMBUSTIVEL,COR,DATA_COMPRA,DT_ADD,FABRICANTE,KM_INICIAL,MODELO,PLACA,PROPRIETARIO,TIPO)\n"
                + "VALUES('" + v.getAnoFabricacao() + "','" + v.getAnoModelo() + "'," + v.getCombustivel()
                + ",'" + v.getCor() + "','" + v.getDataCompra() + "',Now(),'" + v.getFabricante() + "'," + v.getKmInicial()
                + ",'" + v.getModelo() + "','" + v.getPlaca() + "','" + v.getProprietario() + "'," + v.getTipo() + ")";

        return sql;
    }

    public static String ConsultarVeiculo(Veiculo v) {

        String filtro = "";

        if (!v.getPlaca().trim().equals("")) {
            filtro += " and placa='" + v.getPlaca() + "'";
        }

        if (v.getID() >= 0) {
            filtro += " and id=" + v.getID();
        }

        if (!v.getProprietario().trim().equals("")) {
            filtro += " and proprietario like '%" + v.getProprietario().trim() + "%'";
        }

        sql = "SELECT ANO_FAB,ANO_MOD,COMBUSTIVEL,COR,DATA_COMPRA,DT_ADD,DT_UPD,FABRICANTE,ID,KM_INICIAL,MODELO,PLACA,PROPRIETARIO,TIPO\n"
                + "FROM TB_VEICULO where id >= 0 " + filtro;

        return sql;
    }

    public static String DeleteVeiculo(Veiculo v) {

        sql = "DELETE FROM TB_VEICULO WHERE ID=" + v.getID();

        return sql;
    }

    public static String UpdateVeiculo(Veiculo v) {

        sql = "UPDATE TB_VEICULO SET COR ='" + v.getCor() + "',PLACA ='"
                + v.getPlaca() + "',COMBUSTIVEL="
                + v.getCombustivel() + ", PROPRIETARIO = '"
                + v.getProprietario() + "',DT_UPD = now()  WHERE ID=" + v.getID();

        return sql;
    }

    public static String UpdateTipoManutencao(TipoManutencao tm) {

        sql = "UPDATE TB_TIPO_MANUTENCAO SET "
                + "DESCRICAO = '" + tm.getDescricao() + "',"
                + "TIPO ="
                + tm.getTipo() + ","
                + "MESES =" + tm.getMeses() + ","
                + "QUILOMETRAGEM ="
                + tm.getQuilometragem() + ""
                + ",DT_UPD= now() WHERE ID =" + tm.getID();

        return sql;

    }

    public static String DeleteTipoManutencao(TipoManutencao tm) {

        sql = "delete from tb_tipo_manutencao where id = " + tm.getID();

        return sql;
    }

    public static String InsertTipoManutencao(TipoManutencao tm) {

        sql = "INSERT INTO TB_TIPO_MANUTENCAO(DESCRICAO,DT_ADD,MESES,QUILOMETRAGEM,TIPO)\n"
                + "VALUES('" + tm.getDescricao() + "',now()," + tm.getMeses() + "," + tm.getQuilometragem() + "," + tm.getTipo() + ")";

        return sql;
    }

    public static String ConsultarTipoManutencao(TipoManutencao tm) {

        String filtro = "";

        //Inclusão -2
        if (tm.getID() == -2) {
            filtro += " AND TIPO = " + tm.getTipo();
            filtro += " AND DESCRICAO ='" + tm.getDescricao() + "'";
            filtro += " AND QUILOMETRAGEM = " + tm.getQuilometragem();
        }//Consulta filtro
        else if (tm.getID() == -1) {

            if (!tm.getDescricao().equals("")) {
                filtro += " AND DESCRICAO LIKE'%" + tm.getDescricao() + "%'";
            }

            if (tm.getTipo() > 0) {
                filtro += " AND TIPO = " + tm.getTipo();
            }
        }//Atualiza >0
        else if (tm.getID() > 0 && !tm.getDescricao().equals("") && tm.getQuilometragem() > 0) {
            filtro += " AND TIPO = " + tm.getTipo();
            filtro += " AND DESCRICAO ='" + tm.getDescricao() + "'";
            filtro += " AND QUILOMETRAGEM = " + tm.getQuilometragem();
        } else if (tm.getID() > 0 && tm.getDescricao().equals("") && tm.getQuilometragem() == -1) {
            filtro += " AND ID = " + tm.getID();
        }
        sql = "SELECT DESCRICAO,DT_ADD,DT_UPD,ID,MESES,QUILOMETRAGEM,TIPO\n"
                + "FROM TB_TIPO_MANUTENCAO WHERE TIPO > 0" + filtro + " ORDER BY DESCRICAO ASC";

        return sql;
    }

    public static String InsertQuilometragem(Quilometragem obj) {

        String dtqui = Utils.FormatData("dd/MM/yyyy", obj.getDataQuilometragem());

        sql = "INSERT INTO TB_QUILOMETRAGEM(DT_ADD,DT_QUILOMETRAGEM,IDVEICULO,QUILOMETRAGEM)"
                + "VALUES(now(),CDate('" + dtqui + "')," + obj.getIDVeiculo() + "," + obj.getQuilometragem() + ")";

        return sql;

    }

    public static String ConsultarQuilometragem(Quilometragem obj) {

        String filtro = "";

        if (obj.getIDVeiculo() > 0) {
            filtro += " AND IDVEICULO = " + obj.getIDVeiculo();
        }

        sql = "SELECT DT_ADD,DT_QUILOMETRAGEM as DT_QUILOMETRAGEM,DT_UPD,ID,IDVEICULO,QUILOMETRAGEM"
                + " FROM TB_QUILOMETRAGEM"
                + " WHERE ID >= 0" + filtro;

        return sql;
    }

    public static String ConsultarQuilometragemTabela(Quilometragem obj) {

        String filtro = "";

        if (obj.getIDVeiculo() > 0) {
            filtro += " AND IDVEICULO = " + obj.getIDVeiculo();
        }

        if (obj.getDataQuilometragem() != null) {
            String dtquilo = Utils.FormatData("MM/yyyy", obj.getDataQuilometragem());
            filtro += " AND format(DT_QUILOMETRAGEM,'MM/yyyy') ='" + dtquilo + "'";
        }

        sql = "SELECT DT_ADD,DT_QUILOMETRAGEM,DT_UPD,ID,IDVEICULO,QUILOMETRAGEM"
                + " FROM TB_QUILOMETRAGEM"
                + " WHERE ID >= 0" + filtro + " ORDER BY QUILOMETRAGEM DESC";

        return sql;
    }

    public static String ConsultarMaxQuilometragem(Quilometragem obj) {

        sql = "SELECT MAX(QUILOMETRAGEM) AS QUILOMETRAGEM , MAX(DT_QUILOMETRAGEM)"
                + " AS DT_QUILOMETRAGEM FROM TB_QUILOMETRAGEM WHERE IDVEICULO =" + obj.getIDVeiculo();

        return sql;
    }

    public static String DeleteQuilometragem(Quilometragem obj) {
        sql = "DELETE FROM TB_QUILOMETRAGEM WHERE ID =" + obj.getIDQuilometragem();

        return sql;
    }

    public static String ConsultaDeleteQuilometragem(Quilometragem obj) {

        String dtquilo = Utils.FormatData("dd/MM/yyyy", obj.getDataQuilometragem());

        sql = "SELECT DT_ADD,DT_QUILOMETRAGEM,DT_UPD,ID,IDVEICULO,QUILOMETRAGEM FROM TB_QUILOMETRAGEM WHERE ID >= 0 "
                + "AND IDVEICULO = " + obj.getIDVeiculo() + " AND QUILOMETRAGEM >" + obj.getQuilometragem();

        return sql;
    }

    public static String insertManutencao(Manutencao obj) {

        String dtman = Utils.FormatData("dd/MM/yyyy", obj.getDataManutencao());
        String dtproxtroca = "";
        String dtproxtrocacab = "";

        if (obj.getDTProxTroca() != null) {
            dtproxtroca = ",CDate('" + Utils.FormatData("dd/MM/yyyy", obj.getDTProxTroca()) + "'),";
            dtproxtrocacab = "DT_PROX_TROCA,";
        } else {
            dtproxtroca = ",";
        }

        sql = "INSERT INTO TB_MANUTENCAO(ID_TIPOMANUTENCAO,ID_VEICULO,OBSERVACAO,QUILOMETRAGEM,VALOR,DT_MANUTENCAO,DT_ADD,KM_PROX_TROCA," + dtproxtrocacab + "SITUACAO)"
                + " VALUES(" + obj.getIDTipoManutencao() + "," + obj.getIDVeiculo() + ",'" + obj.getObservacao() + "'," + obj.getQuilometragem() + ",'" + obj.getValor() + "',Cdate('" + dtman + "'),now()," + obj.getKMProxTroca() + dtproxtroca + obj.getSituacao() + ")";

        return sql;

    }

    public static String ConsultarManutencaoTabela(Manutencao obj) {

        sql = "SELECT TM.ID, TTM.DESCRICAO &','& TTM.QUILOMETRAGEM AS DESCRICAO,"
                + "TM.DT_MANUTENCAO,TM.VALOR,TM.QUILOMETRAGEM,TM.OBSERVACAO,TM.DT_ADD,"
                + "TM.SITUACAO,TM.KM_PROX_TROCA,TM.DT_PROX_TROCA \n"
                + "FROM TB_MANUTENCAO TM,\n"
                + "TB_TIPO_MANUTENCAO TTM\n"
                + "WHERE TM.ID_TIPOMANUTENCAO = TTM.ID AND TM.ID_VEICULO = " + obj.getIDVeiculo() + "\n"
                + "ORDER BY TM.QUILOMETRAGEM DESC";
        return sql;
    }

    public static String ConsultarManutencao(Manutencao obj) {
        String filtro = "";

        if (obj.getIDVeiculo() > 0 && obj.getIDTipoManutencao() > 0) {
            filtro += " AND ID_VEICULO = " + obj.getIDVeiculo();
            filtro += " AND ID_TIPOMANUTENCAO = " + obj.getIDTipoManutencao();
            filtro += " ORDER BY QUILOMETRAGEM ASC";
        }

        sql = "SELECT DT_ADD,DT_MANUTENCAO,DT_PROX_TROCA,DT_UPD,ID,ID_TIPOMANUTENCAO,ID_VEICULO,KM_PROX_TROCA,OBSERVACAO,QUILOMETRAGEM,SITUACAO,VALOR\n"
                + "FROM TB_MANUTENCAO WHERE ID > 0 " + filtro;
        return sql;
    }

    public static String deleteManutencao(Manutencao obj) {
        sql = "DELETE FROM TB_MANUTENCAO WHERE ID =" + obj.getIDManutencao();
        return sql;

    }

    public static String UpdateManutencao(Manutencao obj) {
        String filtro = "";

        if (obj.getDTTroca() != null && obj.getKMTroca() > 0 && obj.getIDManutencao() > 0) {

            filtro += " SET KM_TROCA =" + obj.getKMTroca() + ",DT_TROCA=CDate('" + Utils.FormatData("dd/MM/yyyy", obj.getDTTroca()) + "'),SITUACAO = 2,DT_UPD=now() WHERE ID=" + obj.getIDManutencao();
        }

        sql = "UPDATE TB_MANUTENCAO " + filtro;

        return sql;

    }

    public static String CarregaDadosGerais(Veiculo v) {

        sql = "SELECT TV.PROPRIETARIO,\n"
                + "format(TV.DATA_COMPRA,'dd/MM/yyyy') AS DATA_COMPRA,\n"
                + "TV.KM_INICIAL,\n"
                + "(SELECT MAX(QUILOMETRAGEM)  FROM TB_QUILOMETRAGEM WHERE IDVEICULO = TV.ID) AS KM_ATUAL,\n"
                + "(SELECT SUM(VALOR) AS VALOR_TOTAL FROM TB_MANUTENCAO WHERE ID_VEICULO = TV.ID) AS VALOR_TOTAL,\n"
                + "(SELECT MAX(DT_QUILOMETRAGEM) FROM TB_QUILOMETRAGEM WHERE IDVEICULO = TV.ID) AS DT_KM_ATUAL"
                + " FROM TB_VEICULO TV WHERE TV.ID=" + v.getID();

        return sql;
    }

    public static String CarregaTabelaTodasManutencao(Veiculo v) {
        sql = "SELECT \n"
                + ""
                + "TM.ID &'-'&(SELECT DESCRICAO FROM TB_TIPO_MANUTENCAO WHERE ID = TM.ID_TIPOMANUTENCAO) AS TIPO_MANUTENCAO,\n"
                + "TM.DT_MANUTENCAO,\n"
                + "TM.QUILOMETRAGEM,\n"
                + "TM.VALOR,\n"
                + "TM.SITUACAO,\n"
                + "TM.OBSERVACAO,\n"
                + "TM.KM_TROCA,\n"
                + "TM.DT_TROCA\n"
                + "FROM TB_MANUTENCAO TM WHERE ID_VEICULO =" + v.getID() + " ORDER BY TM.QUILOMETRAGEM DESC";

        return sql;

    }

    public static String CarregaTabelaProximasManutencao(Veiculo v) {
        sql = "SELECT \n"
                + "TM.ID &'-'&(SELECT DESCRICAO FROM TB_TIPO_MANUTENCAO WHERE ID = TM.ID_TIPOMANUTENCAO) AS TIPO_MANUTENCAO,\n"
                + "TM.DT_PROX_TROCA,\n"
                + "TM.KM_PROX_TROCA,\n"
                + "TM.DT_MANUTENCAO,\n"
                + "TM.QUILOMETRAGEM,\n"
                + "(SELECT QUILOMETRAGEM FROM TB_TIPO_MANUTENCAO WHERE ID = TM.ID_TIPOMANUTENCAO) AS KM_TIPO_MANUTENCAO\n"
                + "FROM TB_MANUTENCAO TM \n"
                + "WHERE ID_VEICULO =" + v.getID() + "\n"
                + "AND TM.SITUACAO = 1\n"
                + "AND (TM.KM_PROX_TROCA > (SELECT MAX(QUILOMETRAGEM) FROM TB_QUILOMETRAGEM WHERE IDVEICULO =" + v.getID() + ")"
                + "OR TM.DT_PROX_TROCA > (SELECT MAX(DT_QUILOMETRAGEM) FROM TB_QUILOMETRAGEM WHERE IDVEICULO = " + v.getID() + ")) ORDER BY TM.KM_PROX_TROCA ASC,TM.DT_PROX_TROCA ASC ";

        return sql;

    }

    public static String CarregaTabelaVencidasManutencao(Veiculo v) {
        sql = "SELECT\n"
                + "TM.ID &'-'&(SELECT DESCRICAO FROM TB_TIPO_MANUTENCAO WHERE ID = TM.ID_TIPOMANUTENCAO) AS TIPO_MANUTENCAO,\n"
                + "TM.DT_PROX_TROCA,\n"
                + "TM.KM_PROX_TROCA\n"
                + "FROM TB_MANUTENCAO TM \n"
                + "WHERE ID_VEICULO =" + v.getID() + "\n"
                + "AND TM.SITUACAO = 1 \n"
                + "AND (TM.KM_PROX_TROCA < (SELECT MAX(QUILOMETRAGEM) FROM TB_QUILOMETRAGEM WHERE IDVEICULO =" + v.getID() + ")"
                + "OR TM.DT_PROX_TROCA < (SELECT MAX(DT_QUILOMETRAGEM) FROM TB_QUILOMETRAGEM WHERE IDVEICULO = " + v.getID() + "))";
        return sql;
    }

    public static String consultaManUpdate(Manutencao man) {
        sql = "SELECT *  FROM TB_MANUTENCAO \n"
                + "WHERE ID_TIPOMANUTENCAO IN (SELECT ID_TIPOMANUTENCAO  FROM TB_MANUTENCAO WHERE ID =" + man.getIDManutencao() + " )\n"
                + "AND SITUACAO = 2 ORDER BY QUILOMETRAGEM DESC ";

        return sql;

    }

    public static String updateManDelete(Manutencao mup) {
        sql = "UPDATE TB_MANUTENCAO SET SITUACAO = 1,DT_TROCA = null,KM_TROCA = null,DT_UPD=now() where id =" + mup.getIDManutencao();

        return sql;
    }

    public static String updatePortaProxy(Proxy obj) {

        sql = "UPDATE TB_CONFIGURACAO SET VALOR ='" + obj.getPorta() + "',DT_UPD = now() WHERE NOME='PROXY-PORTA'";
        return sql;

    }

    public static String updateHostProxy(Proxy obj) {

        sql = "UPDATE TB_CONFIGURACAO SET VALOR ='" + obj.getHostname() + "',DT_UPD = now() WHERE NOME='PROXY-HOST'";
        return sql;

    }

    public static String consultarProxy() {

        sql = "SELECT NOME,VALOR  FROM TB_CONFIGURACAO WHERE NOME IN ('PROXY-HOST','PROXY-PORTA')";

        return sql;
    }

    public static String consultaCorPainel() {

        sql = "select valor\n"
                + "from tb_configuracao \n"
                + "where nome = 'COR-PAINEL' ";

        return sql;

    }

    public static String salvaCorPainel(String cor) {

        sql = "update tb_configuracao set valor = '" + cor + "' where nome='COR-PAINEL'";

        return sql;

    }

    public static String ConsultarManutencaoTabelaFiltro(Manutencao tmp, TipoManutencao tm) {

        String filmanu = "";
        String filsitucao = "";

        if (tmp.getIDManutencao() > 0) {

            filmanu = " and (TTM.DESCRICAO & ',' & TTM.QUILOMETRAGEM)  = '" + tm.getDescricao() + "'";
        }

        if (tmp.getSituacao() >= 0) {
            filsitucao = " and TM.SITUACAO =" + tmp.getSituacao() + "\n";
        }

        sql = "SELECT TM.ID, TTM.DESCRICAO &','& TTM.QUILOMETRAGEM AS DESCRICAO,"
                + "TM.DT_MANUTENCAO,TM.VALOR,TM.QUILOMETRAGEM,TM.OBSERVACAO,TM.DT_ADD,"
                + "TM.SITUACAO,TM.KM_PROX_TROCA,TM.DT_PROX_TROCA,TTM.ID AS ID_TIPO_MAN \n"
                + "FROM TB_MANUTENCAO TM,\n"
                + "TB_TIPO_MANUTENCAO TTM\n"
                + "WHERE TM.ID_TIPOMANUTENCAO = TTM.ID AND TM.ID_VEICULO = " + tmp.getIDVeiculo() + filmanu + filsitucao + "\n"
                + "ORDER BY TM.QUILOMETRAGEM DESC";
        return sql;

    }

}
