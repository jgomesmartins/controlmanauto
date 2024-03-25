/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorio;

import Banco.Banco;
import Banco.QuerySQL;
import Entidade.Quilometragem;
import Entidade.QuilometragemException;
import Entidade.VeiculoException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GOMES
 */
public class RepQuilometragem implements Interface.IntefaceGenerics<Quilometragem> {

    @Override
    public int Adicionar(Quilometragem obj) throws Exception, QuilometragemException {

        int ret = Banco.ExecutarSQL(QuerySQL.InsertQuilometragem(obj));

        return ret;
    }

    @Override
    public int Atualizar(Quilometragem obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Excluir(Quilometragem obj) throws Exception, VeiculoException, QuilometragemException {
        int ret = Banco.ExecutarSQL(QuerySQL.DeleteQuilometragem(obj));
        return ret;
    }

    @Override
    public List<Quilometragem> Consultar(Quilometragem obj) throws Exception {

        List<Quilometragem> listqui = new ArrayList<>();

        ResultSet rs = Banco.ExecutarConsultaSQL(QuerySQL.ConsultarQuilometragem(obj));

        while (rs.next()) {

            Quilometragem q = new Quilometragem();

            q.setIDVeiculo(rs.getInt("IDVEICULO"));
            q.setIDQuilometragem(rs.getInt("ID"));
            q.setDataQuilometragem(rs.getDate("DT_QUILOMETRAGEM"));
            q.setQuilometragem(rs.getInt("QUILOMETRAGEM"));
            q.setDataAdd(rs.getDate("DT_ADD"));
            listqui.add(q);
            q = null;

        }
        return listqui;
    }

    public List<Quilometragem> ConsultarTabela(Quilometragem obj) throws Exception {

        List<Quilometragem> listqui = new ArrayList<>();

        ResultSet rs = Banco.ExecutarConsultaSQL(QuerySQL.ConsultarQuilometragemTabela(obj));

        while (rs.next()) {

            Quilometragem q = new Quilometragem();

            q.setIDVeiculo(rs.getInt("IDVEICULO"));
            q.setIDQuilometragem(rs.getInt("ID"));
            q.setDataQuilometragem(rs.getDate("DT_QUILOMETRAGEM"));
            q.setQuilometragem(rs.getInt("QUILOMETRAGEM"));
            q.setDataAdd(rs.getDate("DT_ADD"));
            listqui.add(q);
            q = null;

        }
        return listqui;
    }

    public String[] ConsultaMaxQuilometragem(Quilometragem obj) throws Exception {

        ResultSet rs = Banco.ExecutarConsultaSQL(QuerySQL.ConsultarMaxQuilometragem(obj));

        String[] ret = null;

        if (rs.next()) {
            ret = new String[]{rs.getString("QUILOMETRAGEM"), rs.getString("DT_QUILOMETRAGEM")};
        }

        return ret;

    }

    public int ConsultaDeleteQuilometragem(Quilometragem obj) throws Exception {

        int ret = 0;

        ResultSet rs = Banco.ExecutarConsultaSQL(QuerySQL.ConsultaDeleteQuilometragem(obj));

        while (rs.next()) {
            ret += 1;
        }

        return ret;

    }

}
