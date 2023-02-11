/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controle.LoginControl;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class CadastrarUserModelo {
    private String Username;
    private String Senha;
    private String ConfirmarSenha;
    
    ArrayList<CadastrarUserModelo> lista = new ArrayList<>();


    public CadastrarUserModelo(String Username, String Senha, String ConfirmarSenha) {
        this.Username = Username;
        this.Senha = Senha;
        this.ConfirmarSenha = ConfirmarSenha;
    }

    public CadastrarUserModelo() {
       }

    public String getUsername() {
        return Username;
    }

    public String getSenha() {
        return Senha;
    }

    public String getConfirmarSenha() {
        return ConfirmarSenha;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public void setConfirmarSenha(String ConfirmarSenha) {
        this.ConfirmarSenha = ConfirmarSenha;
    }
    
       
}
