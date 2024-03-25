package Negocio;

import Entidade.Manutencao;
import Entidade.Quilometragem;
import Entidade.QuilometragemException;
import Classes.Utils;
import Entidade.VeiculoException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author GOMES
 */
public class NegQuilometragem implements Interface.IntefaceGenerics<Quilometragem> {

    Repositorio.RepQuilometragem repqui = new Repositorio.RepQuilometragem();
    Negocio.NegManutencao negman;

    @Override
    public int Adicionar(Quilometragem obj) throws Exception, QuilometragemException, VeiculoException {

        try {

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            formato.setLenient(false);
            Date dkm = obj.getDataQuilometragem();
            Date dataAtual = new Date();

            int dtdif = dkm.compareTo(dataAtual);
            int dtcomp = dkm.compareTo(formato.parse(obj.getDataCompra()));

            if (dtdif > 0) {
                throw new QuilometragemException("Data da quilometragem não pode ser superior a data atual.");
            }

            if (dtcomp < 0) {
                throw new QuilometragemException("Data da quilometragem não pode ser inferior a data inicial do veículo.");
            }

            if (obj.getKmInicial() > obj.getQuilometragem()) {
                throw new QuilometragemException("Quilometragem não pode ser inferior a quilometragem inicial do veículo.");
            }

            String[] rets = this.ConsultaMaxQuilometragem(obj);

            if (rets[0] != null && rets[1] != null) {

                rets[1] = rets[1].replace("-", "");

                String dtf = rets[1].substring(6, 8);
                dtf += "/" + rets[1].substring(4, 6);
                dtf += "/" + rets[1].substring(0, 4);

                Date dkmatual = Utils.ConvertStringToDate("dd/MM/yyyy", dtf);

                int dtdifatual = dkm.compareTo(dkmatual);
                int kmatual = Integer.parseInt(rets[0]);

                if (dtdifatual < 0) {
                    throw new QuilometragemException("Data da quilometragem não pode ser inferior a da data da última quilometragem informado no sistema.");
                }

                if (kmatual > obj.getQuilometragem()) {
                    throw new QuilometragemException("Quilometragem não pode ser inferior a última quilometragem informado no sistema.");
                }

            }

            int ret = repqui.Adicionar(obj);

            if (ret == 0) {
                throw new QuilometragemException("Houve falha da inclusão da quilometragem.\nOperação abortada.");
            }

            return ret;

        } catch (ParseException ex) {
            throw new QuilometragemException("Data da quilometragem inválida");
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    @Override
    public int Atualizar(Quilometragem obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Excluir(Quilometragem obj) throws Exception, VeiculoException, QuilometragemException {

        int retval = this.repqui.ConsultaDeleteQuilometragem(obj);

        if (retval > 0) {
            throw new QuilometragemException("Existe quilometragem mais atualizada que impede a exclusão de registro mais antigos.\nQuilometragem não excluída.");
        }

        Manutencao objMan = new Manutencao();
        this.negman = new Negocio.NegManutencao();
        objMan.setIDVeiculo(obj.getIDVeiculo());
        List<Manutencao> listman = new ArrayList<>();
        listman = this.negman.Consultar(objMan);

        for (Manutencao man : listman) {

            if (man.getQuilometragem() > obj.getQuilometragem()) {

                throw new QuilometragemException("Não é permitido excluir quilometragem com manutenção superior a quilometragem que está sendo excluída.\nQuilometragem não excluída.");
            }

        }

        int ret = this.repqui.Excluir(obj);

        if (ret == 0) {
            throw new QuilometragemException("Houve falha na exclusão da quilometragem.\nOperação abortada.");
        }

        return ret;
    }

    @Override
    public List<Quilometragem> Consultar(Quilometragem obj) throws Exception, VeiculoException, QuilometragemException {

        List<Quilometragem> listqui = new ArrayList<>();
        listqui = this.repqui.Consultar(obj);
        return listqui;

    }

    public List<Quilometragem> ConsultarTabela(Quilometragem obj) throws Exception, VeiculoException, QuilometragemException {

        List<Quilometragem> listqui = new ArrayList<>();
        listqui = this.repqui.ConsultarTabela(obj);
        return listqui;

    }

    public List<String> CarregaComboMesAno(Quilometragem obj) throws Exception, VeiculoException, QuilometragemException {

        List<Quilometragem> listqui = new ArrayList<>();
        SimpleDateFormat formato = new SimpleDateFormat("MM/yyyy");
        listqui = this.Consultar(obj);

        List<String> ret = new ArrayList<>();

        for (Quilometragem qui : listqui) {

            // Date dtform = new SimpleDateFormat("dd/MM/yyyy").parse(qui.getDataQuilometragem());
            Date dtform = qui.getDataQuilometragem();
            if (!ret.contains(formato.format(dtform))) {
                ret.add(formato.format(dtform));
            }

        }

        return ret;

    }

    public String[] ConsultaMaxQuilometragem(Quilometragem obj) throws Exception, VeiculoException, QuilometragemException {

        String[] ret = this.repqui.ConsultaMaxQuilometragem(obj);

        return ret;

    }

}
