/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author user
 */
public class provaDeVida {
    public String NomeCompleto;
    public String ID;
    public String dataEmissao;
    public String dataExpirar;
    public String BI;

    public provaDeVida(String NomeCompleto, String ID, String dataEmissao, String dataExpirar, String BI) {
        this.NomeCompleto = NomeCompleto;
        this.ID = ID;
        this.dataEmissao = dataEmissao;
        this.dataExpirar = dataExpirar;
        this.BI = BI;
    }

    public void setNomeCompleto(String NomeCompleto) {
        this.NomeCompleto = NomeCompleto;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public void setDataExpirar(String dataExpirar) {
        this.dataExpirar = dataExpirar;
    }

    public void setBI(String BI) {
        this.BI = BI;
    }

    public String getNomeCompleto() {
        return NomeCompleto;
    }

    public String getID() {
        return ID;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public String getDataExpirar() {
        return dataExpirar;
    }

    public String getBI() {
        return BI;
    }

    
}
