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
public class benefiiario {
    String entidade, nome, bi, genero, provincia,nacimento;
    int telefone;

    public benefiiario(String entidade, String nome, String bi, String genero, String provincia, String nacimento, int telefone) {
        this.entidade = entidade;
        this.nome = nome;
        this.bi = bi;
        this.genero = genero;
        this.provincia = provincia;
        this.nacimento = nacimento;
        this.telefone = telefone;
    }

    public String getEntidade() {
        return entidade;
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

    public String getProvincia() {
        return provincia;
    }

    public String getNacimento() {
        return nacimento;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setEntidade(String entidade) {
        this.entidade = entidade;
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

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setNacimento(String nacimento) {
        this.nacimento = nacimento;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    
}
