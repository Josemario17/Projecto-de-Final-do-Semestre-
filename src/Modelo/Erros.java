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
public class Erros {
    String user;
    String senha;
    String estado;
    int tentativas;

    public Erros(String user, String senha, int tentativas) {
        this.user = user;
        this.senha = senha;
        this.tentativas = tentativas;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }

    
    public String getUser() {
        return user;
    }

    public String getSenha() {
        return senha;
    }

    public String getEstado() {
        return estado;
    }

    public int getTentativas() {
        return tentativas;
    }

    public Erros(String user, String estado) {
        this.user = user;
        this.estado = estado;
    }
    
    
}
