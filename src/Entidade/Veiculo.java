
package Entidade;

import java.util.Date;


public class Veiculo {
    
    private int ID;
    private int Tipo;
    private int AnoFabricacao;
    private int AnoModelo;
    private String Modelo;
    private String Fabricante;
    private String Cor;
    private int KmInicial;
    private String DataCompra;
    private String Placa;
    private int Combustivel;
    private String Proprietario;
    private Date DataAdd;
    private Date DataUpd;

    public Veiculo() {
        this.ID = -1;
        this.Placa = "";
        this.Tipo = -1;
        this.AnoFabricacao = -1;
        this.AnoModelo = -1;
        this.Modelo = "";
        this.Fabricante = "";
        this.Cor = "";
        this.Placa = "";
        this.Combustivel = -1;
        this.Proprietario = "";

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

    public int getAnoFabricacao() {
        return AnoFabricacao;
    }

    public void setAnoFabricacao(int AnoFabricacao) {
        this.AnoFabricacao = AnoFabricacao;
    }

    public int getAnoModelo() {
        return AnoModelo;
    }

    public void setAnoModelo(int AnoModelo) {
        this.AnoModelo = AnoModelo;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public int getKmInicial() {
        return KmInicial;
    }

    public void setKmInicial(int KmInicial) {
        this.KmInicial = KmInicial;
    }

    public String getDataCompra() {
        return DataCompra;
    }

    public void setDataCompra(String DataCompra) {
        this.DataCompra = DataCompra;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public int getCombustivel() {
        return Combustivel;
    }

    public void setCombustivel(int Combustivel) {
        this.Combustivel = Combustivel;
    }

    public String getProprietario() {
        return Proprietario;
    }

    public void setProprietario(String Proprietario) {
        this.Proprietario = Proprietario;
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
