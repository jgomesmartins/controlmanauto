package Negocio;

import Entidade.Quilometragem;
import Entidade.Veiculo;
import Entidade.VeiculoException;
import Repositorio.RepVeiculo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NegVeiculo implements Interface.IntefaceGenerics<Veiculo> {

    private final RepVeiculo repveiculo = new RepVeiculo();
    private final NegQuilometragem negqui = new NegQuilometragem();

    @Override
    public int Adicionar(Veiculo obj) throws Exception, VeiculoException {

        try {

            int ret = 0;

            if (obj.getAnoFabricacao() > obj.getAnoModelo()) {
                throw new VeiculoException("Ano de fabricação não pode ser superior ao ano do modelo.");
            }

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            formato.setLenient(false);
            Date dcompra = formato.parse(obj.getDataCompra());
            Date dataAtual = new Date();

            int dtdif = dcompra.compareTo(dataAtual);

            if (dtdif > 0) {
                throw new VeiculoException("Data inicial não pode ser superior a data atual.");
            }

            List<Veiculo> listv = new ArrayList<>();
            listv = this.Consultar(obj);

            if (listv.size() > 0) {
                throw new VeiculoException("Veículo de placa: " + obj.getPlaca().toUpperCase() + " já está cadastrado na base de dados.\nOperação abortada!.");
            }

            ret = this.repveiculo.Adicionar(obj);

            if (ret == 0) {
                throw new VeiculoException("Erro ao inserir na base de dados.");
            }

            return ret;
        } catch (ParseException ex) {
            throw new VeiculoException("Data de compra inválida");
        } catch (VeiculoException ve) {
            throw new VeiculoException(ve.getMessage());
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    @Override
    public int Atualizar(Veiculo obj) throws Exception, VeiculoException {

        Veiculo vtemp = new Veiculo();

        vtemp.setID(-1);
        vtemp.setProprietario("");
        vtemp.setPlaca(obj.getPlaca());

        List<Veiculo> listv = new ArrayList<>();
        listv = this.Consultar(vtemp);

        for (Veiculo veiculo : listv) {

            if (veiculo.getID() != obj.getID()) {
                throw new VeiculoException("Veículo de placa: " + obj.getPlaca().toUpperCase() + " já está cadastrado na base de dados.\nOperação abortada!.");
            }
        }

        int ret = this.repveiculo.Atualizar(obj);

        if (ret == 0) {
            throw new VeiculoException("Erro ao inserir na base de dados.");
        }

        return ret;
    }

    @Override
    public int Excluir(Veiculo obj) throws Exception, VeiculoException {

        List<Quilometragem> listqui = new ArrayList<>();
        Quilometragem qui = new Quilometragem();
        qui.setIDVeiculo(obj.getID());

        listqui = this.negqui.Consultar(qui);

        if (listqui.size() > 0) {

            throw new VeiculoException("Não é permitido excluir veículo com registro de quilometragem informado no sistema." + "\nOperação abortada, veículo não excluído.");
        }

        int ret = this.repveiculo.Excluir(obj);

        if (ret == 0) {
            throw new VeiculoException("Ocorreram erros ao tentar excluir o registro." + "Operação abortada!.");
        }

        return ret;
    }

    @Override
    public List<Veiculo> Consultar(Veiculo obj) throws VeiculoException, Exception {
        try {

            List<Veiculo> listv = new ArrayList<>();
            listv = repveiculo.Consultar(obj);

            return listv;

        } catch (VeiculoException ve) {
            throw new VeiculoException(ve.getMessage());
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
