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
public class DadosFinanceirosModelo {
    String Id;
    String titular;
    int nConta;
    String banco;
    int valorDapolice;
    String periodo;
    String TipoCobertura;

    public DadosFinanceirosModelo(String Id, String titular, int nConta, String banco, int valorDapolice, String periodo, String TipoCobertura) {
        this.Id = Id;
        this.titular = titular;
        this.nConta = nConta;
        this.banco = banco;
        this.valorDapolice = valorDapolice;
        this.periodo = periodo;
        this.TipoCobertura = TipoCobertura;
    }

    public String getId() {
        return Id;
    }

    public String getTitular() {
        return titular;
    }

    public int getnConta() {
        return nConta;
    }

    public String getBanco() {
        return banco;
    }

    public int getValorDapolice() {
        return valorDapolice;
    }

    public String getPeriodo() {
        return periodo;
    }

    public String getTipoCobertura() {
        return TipoCobertura;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setnConta(int nConta) {
        this.nConta = nConta;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public void setValorDapolice(int valorDapolice) {
        this.valorDapolice = valorDapolice;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public void setTipoCobertura(String TipoCobertura) {
        this.TipoCobertura = TipoCobertura;
    }

    
}
