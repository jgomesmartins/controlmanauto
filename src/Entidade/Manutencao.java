package Entidade;

import java.util.Date;

public class Manutencao extends Veiculo {

    private int IDManutencao;
    private int IDTipoManutencao;
    private int Quilometragem;
    private Date DataManutencao;
    private String Observacao;
    private double Valor;
    private Date DataAdd;
    private Date DataUpd;
    private int KMProxTroca;
    private Date DTProxTroca;
    private int KMTroca;
    private Date DTTroca;
    private int Situacao;
    
    public Manutencao() {
        this.IDManutencao = -1;
        this.Quilometragem = -1;
        this.DataManutencao = null;
    }

    public int getKMTroca() {
        return KMTroca;
    }

    public void setKMTroca(int KMTroca) {
        this.KMTroca = KMTroca;
    }

    public Date getDTTroca() {
        return DTTroca;
    }

    public void setDTTroca(Date DTTroca) {
        this.DTTroca = DTTroca;
    }

    
    
    public int getSituacao() {
        return Situacao;
    }

    public int getIDTipoManutencao() {
        return IDTipoManutencao;
    }

    public void setIDTipoManutencao(int IDTipoManutencao) {
        this.IDTipoManutencao = IDTipoManutencao;
    }

        
    public void setSituacao(int Situacao) {
        this.Situacao = Situacao;
    }

        
    public int getKMProxTroca() {
        return KMProxTroca;
    }

    public void setKMProxTroca(int KMProxTroca) {
        this.KMProxTroca = KMProxTroca;
    }

    public Date getDTProxTroca() {
        return DTProxTroca;
    }

    public void setDTProxTroca(Date DTProxTroca) {
        this.DTProxTroca = DTProxTroca;
    }


    
    public double getValor() {
        return Valor;
    }

    public String getObservacao() {
        return Observacao;
    }

    public void setObservacao(String Observacao) {
        this.Observacao = Observacao;
    }
    
    
    public void setValor(double Valor) {
        this.Valor = Valor;
    }

       
    public int getIDVeiculo() {
        return super.getID();
    }

    public void setIDVeiculo(int id) {
        super.setID(id);
    }

    public int getIDManutencao() {
        return IDManutencao;
    }

    public void setIDManutencao(int IDManutencao) {
        this.IDManutencao = IDManutencao;
    }

    public int getQuilometragem() {
        return Quilometragem;
    }

    public void setQuilometragem(int Quilometragem) {
        this.Quilometragem = Quilometragem;
    }

    public Date getDataManutencao() {
        return DataManutencao;
    }

    public void setDataManutencao(Date DataManutencao) {
        this.DataManutencao = DataManutencao;
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
