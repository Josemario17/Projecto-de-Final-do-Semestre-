/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.CadastrarUserModelo;
import Modelo.CadastrarUtentesModelo;
import Modelo.DadosFinanceirosModelo;
import Modelo.Erros;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */

    
public class userControl {
    
    ArrayList<CadastrarUserModelo> lista = new ArrayList<>();
    ArrayList<Erros> lista2 = new ArrayList<>();
       public void gravar(BufferedWriter conexao, CadastrarUserModelo cdModelo) throws FileNotFoundException, IOException {
        try {

            conexao.write(cdModelo.getUsername() + ";");
            conexao.write(cdModelo.getSenha() + "; \n");
        } catch (IOException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar");
        }
        conexao.close();
    }
       
         public void tentativas(BufferedWriter conexao, Erros cd) throws FileNotFoundException, IOException {
        try {

            conexao.write(cd.getUser() + ";");
            conexao.write(cd.getTentativas() + ";");
            conexao.write(cd.getSenha() + ";\n");
        } catch (IOException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar");
        }
        conexao.close();
    }
    
    
    public Object[][] transformaListaEmObjecto() {
        int linha = 0, tamanho;
        tamanho = lista.size();
        Object[][] dados = new Object[tamanho][3];
        try {
            while ((linha < lista.size())) {

                dados[linha][0] = lista.get(linha).getUsername();
                dados[linha][1] = lista.get(linha).getSenha();
                dados[linha][2] = lista.get(linha).getSenha();
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
            BufferedReader ler = new BufferedReader(new FileReader("dados_de_usuarios.txt"));
            Lidas = ler.readLine();
            int linhas = 0;
            while(linhas<lista.size())
            {
                 lista.removeAll(lista);
                 linhas++;
            }
            
            while(Lidas != null)
            {
                String campos[] = Lidas.split(";");
                String user, senha;
                user = campos[0];
                senha = campos[1];
                CadastrarUserModelo cd = new CadastrarUserModelo(user, senha, senha);
                lista.add(cd);
                Lidas = ler.readLine();    
            }
            
            ler.close();
            
        } catch (Exception e) {
        }

    }

    //--------------------- Crud ------------------
    public void alterar(BufferedWriter conexao,CadastrarUserModelo cdModelo,int indice)
    {
         try {
            if(indice > -1)
            {
                lista.set(indice,cdModelo);
                JOptionPane.showMessageDialog(null, "dados alterados com sucesso");
                actualizaArquivo();
            }
            
            else{
                JOptionPane.showMessageDialog(null, "Selecione um elemento");
            }
            
            
        } catch (Exception e) {
        }
  
    }
    
    public void actualizaArquivo() {
        try {
            String user, senha, confirmarSenha;

            int linha = 0;
            BufferedWriter ConexaoGravar;
            ConexaoGravar = new BufferedWriter(new FileWriter("user_estado.txt"));

            while ((linha < lista2.size())) {
                user = lista2.get(linha).getUser();
                senha = lista2.get(linha).getEstado();
                Erros erro = new Erros(user, senha);
                Bloqueado(ConexaoGravar, erro);
                linha++;
            }
            ConexaoGravar.close();
        } catch (Exception e) {
        }
    }


    public void removerElemento(int indice) {
        try {
            if (indice > -1) {
                JOptionPane.showMessageDialog(null, indice);
                lista2.remove(indice);
                JOptionPane.showMessageDialog(null, "Dados Removidos com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione o elemento que desejas eliminar");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
   public Object[][] PesquisaEstado(String Pesquisa) throws IOException {
        int linha = 0, tamanho, countLinha = 0, k = 0;
        preenchelistaTentativas();
        tamanho = lista2.size();
        while ((linha < tamanho)) {
                JOptionPane.showMessageDialog(null, " " + lista2.get(linha).getUser());
            if (lista2.get(linha).getUser().equalsIgnoreCase(Pesquisa)) {
                countLinha++;
                JOptionPane.showMessageDialog(null, " " + countLinha);
                
            }
            
            else{
                countLinha ++;
            }
                
            linha++;
            }
                if(countLinha>=2)
                {
                    BufferedWriter historia = new BufferedWriter(new FileWriter("user_estado.txt", true));
                    Erros hh;
                    hh = new Erros(Pesquisa, "bloqueado");
                    Bloqueado(historia, hh);
                }
            return null;
        }
   
   public void Bloqueado(BufferedWriter conexao, Erros cd) throws FileNotFoundException, IOException {
        try {
            
        JOptionPane.showMessageDialog(null, " " + cd.getUser());
            conexao.write(cd.getUser() + ";");
            conexao.write(cd.getEstado() + ";\n");
        } catch (IOException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar");
        }
        conexao.close();
    }
 
 public void preenchelistaTentativas(){

        try {
            String Lidas;
            BufferedReader ler = new BufferedReader(new FileReader("historico_de_tentativas.txt"));
            Lidas = ler.readLine();
            int linhas = 0;
            while(linhas < lista2.size())
            {
                 lista2.removeAll(lista2);
                 linhas++;
            }
            
            while(Lidas != null)
            {
                String campos[] = Lidas.split(";");
                String user, senha;
                user = campos[0];
                senha = campos[1];
                String tentativas = campos[2];
                int i = Integer.parseInt(tentativas);
                Erros erro = new Erros(user, senha, i);
                lista2.add(erro);
                Lidas = ler.readLine();    
            }
            
            ler.close();
            
        } catch (Exception e) {
        }

    }
 
  
 public void preenchelistaBloqueio(){

        try {
            String Lidas;
            BufferedReader ler = new BufferedReader(new FileReader("user_estado.txt"));
            Lidas = ler.readLine();
            int linhas = 0;
            while(linhas<lista2.size())
            {
                 lista2.removeAll(lista2);
                 linhas++;
            }
            
            while(Lidas != null)
            {
                String campos[] = Lidas.split(";");
                String user, estado;
                user = campos[0];
                estado = campos[1];
                Erros erro = new Erros(user, estado);
                lista2.add(erro);
                Lidas = ler.readLine();    
            }
            
            ler.close();
            
        } catch (Exception e) {
        }

    }
 
 public boolean Pesquisa2(String Pesquisa) {
        int linha = 0, tamanho, countLinha = 0, k = 0;
        tamanho = lista2.size();

        while ((linha < lista2.size())) {
            if (lista2.get(linha).getUser().equalsIgnoreCase(Pesquisa)) {
                countLinha++;
            }
            linha++;
        }
        
           if(countLinha>0){
               return true;
           }
           
           else{
           return false;
           }
        }
 
 public Object[][] transformaListaEmTentativas() {
        int linha = 0, tamanho;
        tamanho = lista2.size();
        Object[][] dados = new Object[tamanho][3];
        try {
            while ((linha < lista2.size())) {

                dados[linha][0] = lista2.get(linha).getUser();
                dados[linha][1] = lista2.get(linha).getEstado();
                linha++;
            }
        } catch (Exception ex) {
            ex.getMessage();
        }
        return dados;
    }
}
