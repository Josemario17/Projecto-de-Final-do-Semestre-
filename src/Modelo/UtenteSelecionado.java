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
public class UtenteSelecionado {
    String nome, bi, genero, naturalidade, nasc, telefone;

    public UtenteSelecionado(String nome, String bi, String genero, String naturalidade, String nasc, String telefone) {
        this.nome = nome;
        this.bi = bi;
        this.genero = genero;
        this.naturalidade = naturalidade;
        this.nasc = nasc;
        this.telefone = telefone;
    }

    public UtenteSelecionado() {
        }


    public String getNome() {
        return nome;
    }

    public String getBi() {
        return bi;
    }

    public String getGenero() {
        return genero;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public String getNasc() {
        return nasc;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setBi(String bi) {
        this.bi = bi;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public void setNasc(String nasc) {
        this.nasc = nasc;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
