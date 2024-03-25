package Negocio;

import Entidade.Manutencao;
import Entidade.ManutencaoException;
import Entidade.Quilometragem;
import Entidade.QuilometragemException;
import Entidade.TipoManutencao;
import Fachada.FacQuilometragem;
import Repositorio.RepManutencao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NegManutencao implements Interface.IntefaceGenerics<Manutencao> {

    Repositorio.RepManutencao repman = new RepManutencao();
    Fachada.FacQuilometragem facqui = new FacQuilometragem();

    @Override
    public int Adicionar(Manutencao obj) throws Exception, ManutencaoException {

        try {

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            formato.setLenient(false);
            Date dkm = obj.getDataManutencao();
            Date dataAtual = new Date();

            int dtdif = dkm.compareTo(dataAtual);
            int dtcomp = dkm.compareTo(formato.parse(obj.getDataCompra()));

            if (dtdif > 0) {
                throw new ManutencaoException("Data da manutenção não pode ser superior a data atual.");
            }

            if (dtcomp < 0) {
                throw new ManutencaoException("Data da manutenção não pode ser inferior a data inicial do veículo.");
            }

            if (obj.getKmInicial() > obj.getQuilometragem()) {
                throw new QuilometragemException("Quilometragem não pode ser inferior a quilometragem inicial do veículo.");
            }

            List<Manutencao> listm = this.Consultar(obj);

            if (listm.size() > 0) {

                Date dtultimaman = listm.get(listm.size() - 1).getDataManutencao();
                int kmultiman = listm.get(listm.size() - 1).getQuilometragem();

                if (kmultiman > obj.getQuilometragem()) {
                    throw new ManutencaoException("Quilometragem informada não pode ser inferior a última quilometragem do mesmo tipo de manutenção.\nOperação abordada!.");
                }

                int dtdifman = dtultimaman.compareTo(obj.getDataManutencao());

                if (dtdifman > 0) {
                    throw new ManutencaoException("Data da manutenção informada não pode ser inferior a última data do mesmo tipo de manutenção.\nOperação abordada!.");
                }
            }

            Quilometragem qui = new Quilometragem();
            qui.setIDVeiculo(obj.getIDVeiculo());
            List<Quilometragem> listqui = this.facqui.Consultar(qui);

            long kmtemp = 0;

            for (Quilometragem quilom : listqui) {

                if (quilom.getQuilometragem() > kmtemp) {
                    kmtemp = quilom.getQuilometragem();
                }
            }

            if (listqui.isEmpty()) {
                throw new ManutencaoException("Não foi encontrado quilometragem cadastrado no sistema para esse veículo.\nAtualize a quilometragem do veículo no sistema em seguida repita a operação.\nOperação abortada.");
            }

            if (kmtemp < obj.getQuilometragem()) {
                throw new ManutencaoException("Quilometragem informada na manutenção é superior a última quilometragem informada no sistema.\nAtualize a quilometragem do veículo no sistema em seguida repita a operação.\nOperação abortada.");
            }

            int ret = this.repman.Adicionar(obj);

            if (ret == 0) {
                throw new ManutencaoException("Houve falha da inclusão da manutenção.\nOperação abortada.");
            }

            return ret;
        } catch (ManutencaoException me) {
            throw new ManutencaoException(me.getMessage());
        } catch (ParseException ex) {
            throw new ManutencaoException("Data da quilometragem inválida");
        } catch (Exception e) {
            if (e.getMessage().contains("unique constraint or index violation")) {
                throw new ManutencaoException("Manutenção já informado no sistema.\nInclusão abortada.");
            } else {
                throw new Exception(e.getMessage());
            }

        }

    }

    @Override
    public int Atualizar(Manutencao obj) throws Exception, ManutencaoException {
        int ret = 0;
        ret = this.repman.Atualizar(obj);
        return ret;

    }

    @Override
    public int Excluir(Manutencao obj) throws Exception, ManutencaoException {
        int ret = 0;
        ret = this.repman.Excluir(obj);

        if (ret == 0) {
            throw new ManutencaoException("Houve falha da exclusão da manutenção.\nOperação abortada.");
        }

        return ret;

    }

    @Override
    public List<Manutencao> Consultar(Manutencao obj) throws Exception {
        List<Manutencao> listman = new ArrayList<>();

        listman = this.repman.Consultar(obj);
        return listman;
    }

    public List<Object> ConsultarManutencaoTabela(Manutencao obj) throws Exception {

        List<Object> listobj = new ArrayList<>();

        listobj = this.repman.ConsultarManutencaoTabela(obj);

        return listobj;

    }

    public List<Manutencao> consultaManUpdate(Manutencao man) throws Exception {

        List<Manutencao> listman = new ArrayList<>();

        listman = this.repman.consultaManUpdate(man);

        return listman;

    }

    public int updateManDelete(Manutencao mup) throws Exception {
        int ret = this.repman.updateManDelete(mup);

        return ret;
    }

    public List<Object> ConsultarManutencaoTabela(Manutencao tmp, TipoManutencao tm) throws Exception{
       
        List<Object> listobj = new ArrayList<>();

        listobj = this.repman.ConsultarManutencaoTabela(tmp,tm);

        return listobj;
    }

}
