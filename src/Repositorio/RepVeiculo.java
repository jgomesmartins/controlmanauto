package Repositorio;

import Banco.Banco;
import Banco.QuerySQL;
import Entidade.Veiculo;
import Entidade.VeiculoException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RepVeiculo implements Interface.IntefaceGenerics<Veiculo> {

    @Override
    public int Adicionar(Veiculo obj) throws VeiculoException, Exception {

        try {

            int rs = Banco.ExecutarSQL(QuerySQL.InsertVeiculo(obj));

            return rs;

        } catch (VeiculoException ve) {
            throw new VeiculoException(ve.getMessage());
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    @Override
    public int Atualizar(Veiculo obj) throws VeiculoException, Exception {

        try {

            int rs;

            rs = Banco.ExecutarSQL(QuerySQL.UpdateVeiculo(obj));
            return rs;
        } catch (VeiculoException ve) {
            throw new VeiculoException(ve.getMessage());
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    @Override
    public int Excluir(Veiculo obj) throws VeiculoException, Exception {

        try {
            int rs = Banco.ExecutarSQL(QuerySQL.DeleteVeiculo(obj));
            return rs;
        } catch (VeiculoException ve) {
            throw new VeiculoException(ve.getMessage());
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    @Override
    public List<Veiculo> Consultar(Veiculo obj) throws VeiculoException, Exception {
        try {

            List<Veiculo> rsveiculo = new ArrayList<>();

            ResultSet rs = Banco.ExecutarConsultaSQL(QuerySQL.ConsultarVeiculo(obj));

            while (rs.next()) {

                Veiculo vei = new Veiculo();
                vei.setID(rs.getInt("ID"));
                vei.setAnoFabricacao(rs.getInt("ANO_FAB"));
                vei.setAnoModelo(rs.getInt("ANO_MOD"));
                vei.setCombustivel(rs.getInt("COMBUSTIVEL"));
                vei.setCor(rs.getString("COR"));
                vei.setDataAdd(rs.getDate("DT_ADD"));
                vei.setDataUpd(rs.getDate("DT_UPD"));
                vei.setFabricante(rs.getString("FABRICANTE"));
                vei.setKmInicial(rs.getInt("KM_INICIAL"));
                vei.setModelo(rs.getString("MODELO"));
                vei.setPlaca(rs.getString("PLACA"));
                vei.setProprietario(rs.getString("PROPRIETARIO"));
                vei.setDataCompra(rs.getString("DATA_COMPRA"));
                vei.setTipo(rs.getInt("TIPO"));

                rsveiculo.add(vei);
                vei = null;

            }

            return rsveiculo;

        } catch (VeiculoException ve) {
            throw new VeiculoException(ve.getMessage());
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

}
