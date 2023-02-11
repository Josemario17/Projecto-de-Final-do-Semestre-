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
public class Historico {
    String ID_user;
    String Nome;
    int ValorAdicionado;
    int ValorRetirado;
    String dataDaAlteracao;
    String userAlterador;

    public Historico(String ID_user, String dataDaAlteracao, String userAlterador) {
        this.ID_user = ID_user;
        this.dataDaAlteracao = dataDaAlteracao;
        this.userAlterador = userAlterador;
    }

    public Historico(String ID_user, String Nome, int ValorAdicionado, int ValorRetirado, String dataDaAlteracao, String userAlterador) {
        this.ID_user = ID_user;
        this.Nome = Nome;
        this.ValorAdicionado = ValorAdicionado;
        this.ValorRetirado = ValorRetirado;
        this.dataDaAlteracao = dataDaAlteracao;
        this.userAlterador = userAlterador;
    }

    public Historico(String ID_user, String Nome, int ValorAdicionado, String dataDaAlteracao, String userAlterador) {
        this.ID_user = ID_user;
        this.Nome = Nome;
        this.ValorAdicionado = ValorAdicionado;
        this.dataDaAlteracao = dataDaAlteracao;
        this.userAlterador = userAlterador;
    }
    
    
    

    public String getID_user() {
        return ID_user;
    }

    public String getNome() {
        return Nome;
    }

    public int getValorAdicionado() {
        return ValorAdicionado;
    }

    public int getValorRetirado() {
        return ValorRetirado;
    }

    public String getDataDaAlteracao() {
        return dataDaAlteracao;
    }

    public String getUserAlterador() {
        return userAlterador;
    }

    public void setID_user(String ID_user) {
        this.ID_user = ID_user;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setValorAdicionado(int ValorAdicionado) {
        this.ValorAdicionado = ValorAdicionado;
    }

    public void setValorRetirado(int ValorRetirado) {
        this.ValorRetirado = ValorRetirado;
    }

    public void setDataDaAlteracao(String dataDaAlteracao) {
        this.dataDaAlteracao = dataDaAlteracao;
    }

    public void setUserAlterador(String userAlterador) {
        this.userAlterador = userAlterador;
    }

    
    

    
    
    
}
