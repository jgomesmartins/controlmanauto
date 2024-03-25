package Entidade;

import java.util.Date;

/**
 *
 * @author GOMES
 */
public class Quilometragem extends Veiculo {

    private int IDQuilometragem;
    private int Quilometragem;
    private Date DataQuilometragem;
    private Date DataAdd;
    private Date DataUpd;

    public int getIDQuilometragem() {
        return IDQuilometragem;
    }

    public void setIDQuilometragem(int IDQuilometragem) {
        this.IDQuilometragem = IDQuilometragem;
    }

    public int getIDVeiculo() {
        return super.getID();
    }

    public void setIDVeiculo(int IDVeiculo) {
        super.setID(IDVeiculo);
    }

    public int getQuilometragem() {
        return Quilometragem;
    }

    public void setQuilometragem(int Quilometragem) {
        this.Quilometragem = Quilometragem;
    }

    public Date getDataQuilometragem() {
        return DataQuilometragem;
    }

    public void setDataQuilometragem(Date DataQuilometragem) {
        this.DataQuilometragem = DataQuilometragem;
    }

    @Override
    public Date getDataAdd() {
        return DataAdd;
    }

    @Override
    public void setDataAdd(Date DataAdd) {
        this.DataAdd = DataAdd;
    }

    @Override
    public Date getDataUpd() {
        return DataUpd;
    }

    @Override
    public void setDataUpd(Date DataUpd) {
        this.DataUpd = DataUpd;
    }

    public Quilometragem() {
        this.IDQuilometragem = -1;
        this.Quilometragem = -1;
       
    }

}
