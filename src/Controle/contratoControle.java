/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.CadastrarUtentesModelo;
import Modelo.DadosFinanceirosModelo;
import Modelo.UtenteSelecionado;
import Visão.DadosFinanceiros;
import Visão.Step_PV;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class contratoControle {
    String ID;
    int ValorGeral;
    public void utente(String nome, String bi)
    {
        ID = bi;
        int requisita;
    }
    
    
   public void Salvar(BufferedWriter conexao, DadosFinanceirosModelo df)
   {
       try {
               conexao.write(df.getId() + ";");
               conexao.write(df.getTitular() + ";");
               conexao.write(df.getnConta() + ";");
               conexao.write(df.getBanco() + ";");
               conexao.write(+df.getValorDapolice() + ";");
               conexao.write(df.getPeriodo() + ";");
               conexao.write(df.getTipoCobertura() + ";\n");
               JOptionPane.showMessageDialog(null, "PROCESSO FINALIZADO COM SUCESSO, será remetido em Espera.");
               conexao.close();
           } catch (Exception e) {
           }
   }
   
    ArrayList<DadosFinanceirosModelo> lista = new ArrayList<>();

    public Object[][] transformaListaEmObjecto() {
        int linha = 0, tamanho;
        tamanho = lista.size();
        Object[][] dados = new Object[tamanho][10];
        try {
            while ((linha < lista.size())) {

                dados[linha][1] = lista.get(linha).getId();
                dados[linha][0] = lista.get(linha).getTitular();
                dados[linha][2] = lista.get(linha).getnConta();
                dados[linha][3] = lista.get(linha).getBanco();
                dados[linha][4] = lista.get(linha).getValorDapolice();
                dados[linha][5] = lista.get(linha).getPeriodo();
                dados[linha][6] = lista.get(linha).getTipoCobertura();
                

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
            BufferedReader ler = new BufferedReader(new FileReader("utente_e_seu_dossier.txt"));
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
                String titular = campos[0];
                String Id = campos[1];
                int nConta = Integer.parseInt(campos[2]);
                String banco = campos[3];
                int valorDapolice = Integer.parseInt(campos[4]);
                String periodo = campos[5];
                String TipoCobertura = campos[6];
                
                DadosFinanceirosModelo dfm = new DadosFinanceirosModelo(Id, titular, nConta, banco, valorDapolice, periodo, TipoCobertura);
                lista.add(dfm);
                Lidas = ler.readLine();    
            }
            
            ler.close();
            
        } catch (Exception e) {
        }

    }
    
     public void actualizaArquivo(int val, String sinal) {
        try {
            
               String Id;
               String titular;
               int nConta;
               String banco;
               int valorDapolice;
               String periodo;
               String TipoCobertura;
               int i = 0;

            int linha = 0;
            BufferedWriter ConexaoGravar;
            ConexaoGravar = new BufferedWriter(new FileWriter("utente_e_seu_dossier.txt"));
            while ((linha < lista.size())) {
                
                titular = lista.get(linha).getTitular();
                Id = lista.get(linha).getId();
                nConta= lista.get(linha).getnConta();
                banco = lista.get(linha).getBanco();
                valorDapolice = lista.get(linha).getValorDapolice();
                periodo = lista.get(linha).getPeriodo();
                TipoCobertura = lista.get(linha).getTipoCobertura();
                
                if(sinal.equals("+"))
                {
                  valorDapolice = valorDapolice + val;
                }
                
                else if(sinal.equals("-")){
                    
                    valorDapolice = valorDapolice - val;
                    
                }
                
                DadosFinanceirosModelo dfm = new DadosFinanceirosModelo(Id, titular, nConta, banco, valorDapolice, periodo, TipoCobertura);
                Salvar(ConexaoGravar, dfm);
                linha++;
                
            }
            ConexaoGravar.close();
        } catch (Exception e) {
        }
    }

    


}
