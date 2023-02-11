/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.CadastrarUserModelo;
import Modelo.CadastrarUtentesModelo;
import Modelo.Historico;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ControleDeHistoricos {
    
    
    ArrayList<Historico> lista = new ArrayList<>();
      public void historicoCdUser(BufferedWriter conexao, Historico hh) throws IOException
    {
           try {

                conexao.write(hh.getID_user()+ ";");
                conexao.write(hh.getDataDaAlteracao() + ";");
                conexao.write(hh.getUserAlterador()+ ";\n");
                conexao.close();
            } catch (IOException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Erro ao Salvar");
            } 
    }
      
     public void hitoricoAlterar(BufferedWriter conexao, Historico hh) throws IOException
     {
         try {
             conexao.write(hh.getID_user() + ";");
             conexao.write(hh.getValorAdicionado() + ";");
             conexao.write(hh.getValorRetirado() + ";");
             conexao.write(hh.getDataDaAlteracao() + ";");
             conexao.write(hh.getUserAlterador() + ";\n");
         } catch (IOException | HeadlessException e){
     }
     }
     
     
          public void hitoricoContrato(BufferedWriter conexao, Historico hh) throws IOException
     {
         try {
             conexao.write(hh.getID_user() + ";");
             conexao.write(hh.getNome() + ";");
             conexao.write(hh.getValorAdicionado() + ";");
             conexao.write(hh.getDataDaAlteracao() + ";");
             conexao.write(hh.getUserAlterador() + ";\n");
         } catch (IOException | HeadlessException e){
     }
     }
     
     
     
    public Object[][] transformaListaEmObjecto() {
        int linha = 0, tamanho;
        tamanho = lista.size();
        Object[][] dados = new Object[tamanho][10];
        try {
            while ((linha < lista.size())) {
                dados[linha][0] = lista.get(linha).getID_user();
                dados[linha][1] = lista.get(linha).getNome();
                dados[linha][1] = lista.get(linha).getValorAdicionado();
                dados[linha][2] = lista.get(linha).getValorRetirado();
                dados[linha][3] = lista.get(linha).getDataDaAlteracao();
                dados[linha][4] = lista.get(linha).getUserAlterador();
                linha++;
            }
        } catch (Exception ex) {
            ex.getMessage();
        }
        return dados;
    }

    public void preencheArrayLista(){

        try {
            String Lidas;
            BufferedReader ler = new BufferedReader(new FileReader("historico_operar.txt"));
            Lidas = ler.readLine();
            int linhas = 0;
            while(linhas>lista.size())
            {
                 lista.removeAll(lista);
                 linhas++;
            }
            
            while(Lidas != null)
            {
                String campos[] = Lidas.split(";");
                String user_ID, data, alterador, valor, valor2;
                user_ID = campos[0];
                valor = campos[1];
                valor2 = campos[2];
                data = campos[3];
                alterador = campos[4];
                Historico cd = new Historico(user_ID, "", Integer.parseInt(valor), Integer.parseInt(valor2), data, alterador);
                lista.add(cd);
                Lidas = ler.readLine();
            }
           
            ler.close();
            
        } catch (Exception e) {
        }

    }  
     
  
        public Object[][] Pesquisa(String Pesquisa) {
        int linha = 0, tamanho, countLinha = 0, k = 0;
        tamanho = lista.size();
        while (linha < tamanho) {
            if (lista.get(linha).getUserAlterador().equalsIgnoreCase(Pesquisa)) {
                countLinha++;
            }
            linha++;
        }
        try {

            Object[][] dados = new Object[countLinha][10];
            linha = 0;
            while ((linha < lista.size())) {

                if (lista.get(linha).getUserAlterador().equalsIgnoreCase(Pesquisa)) {
                    dados[k][0] = lista.get(linha).getID_user();
                    dados[k][1] = lista.get(linha).getNome();
                    dados[k][1] = lista.get(linha).getValorAdicionado();
                    dados[k][3] = lista.get(linha).getDataDaAlteracao();
                    dados[k][4] = lista.get(linha).getUserAlterador();
                    k++;
                }
                linha++;
            }
            return dados;
        } catch (Exception ex) {
            ex.getMessage();
            return null;
        }

    }

    }
     

