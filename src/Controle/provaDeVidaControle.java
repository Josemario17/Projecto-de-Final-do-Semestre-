/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.DadosFinanceirosModelo;
import Modelo.provaDeVida;
import java.io.BufferedWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class provaDeVidaControle {
    public void Salvar(BufferedWriter conexao, provaDeVida pc)
   {
       try {
               conexao.write(pc.getNomeCompleto() + ";");
               conexao.write(pc.getID() + ";");
               conexao.write(pc.getDataEmissao() + ";");
               conexao.write(pc.getDataExpirar() + ";");
               conexao.write(pc.getBI() + ";\n");
               JOptionPane.showMessageDialog(null, "PROCESSO FINALIZADO COM SUCESSO, será remetido em Espera.");
               conexao.close();
           } catch (Exception e) {
           }
   }
    
    
    
}
