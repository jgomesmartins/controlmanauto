package Entidade;

import java.util.Date;

/**
 *
 * @author GOMES
 */
public class TipoManutencao {
    
    private int ID;
    private int Tipo;
    private int Quilometragem;
    private int Meses;
    private String Descricao;
    private Date DataAdd;
    private Date DataUpd;

    public TipoManutencao() {
        this.ID = -1;
        this.Tipo = -1;
        this.Quilometragem = -1;
        this.Meses = -1;
        this.Descricao = "";
   
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getTipo() {
        return Tipo;
    }

    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }

    public int getQuilometragem() {
        return Quilometragem;
    }

    public void setQuilometragem(int Quilometragem) {
        this.Quilometragem = Quilometragem;
    }

    public int getMeses() {
        return Meses;
    }

    public void setMeses(int Meses) {
        this.Meses = Meses;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public Date getDataAdd() {
        return DataAdd;
    }

    public void setDataAdd(Date DataAdd) {
        this.DataAdd = DataAdd;
    }

    public Date getDataUpd() {
        return DataUpd;
    }

    public void setDataUpd(Date DataUpd) {
        this.DataUpd = DataUpd;
    }   
    
}
