/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.CadastrarUserModelo;
import Modelo.CadastrarUtentesModelo;
import java.awt.HeadlessException;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class CadastrarUserControle {
    
    CadastrarUserModelo cdModelo = new CadastrarUserModelo();
    public void gravar(BufferedWriter conexao, CadastrarUserModelo cdModelo) {
        try {

            conexao.write(cdModelo.getUsername() + ";");
            conexao.write(cdModelo.getSenha() + ";\n");
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (IOException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar");
        }

    }
    
   
}
