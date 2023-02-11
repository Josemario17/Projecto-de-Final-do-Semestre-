/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.CadastrarUtentesModelo;
import Visão.CadastrarUtentes;
import java.io.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class CDUtenteControle {

    CadastrarUtentesModelo cdModelo = new CadastrarUtentesModelo();
    ArrayList<CadastrarUtentesModelo> lista = new ArrayList<>();

    public void gravar(BufferedWriter conexao, CadastrarUtentesModelo cdModelo) throws FileNotFoundException {
        try {

            conexao.write(cdModelo.getnBi() + ";");
            conexao.write(cdModelo.getNomeCompleto() + ";");
            conexao.write(cdModelo.getMasc()+ ";");
            conexao.write(cdModelo.getCalendar()+ ";");
            conexao.write(cdModelo.getProvincia() + ";");
            conexao.write(cdModelo.getTelef() + "; \n");
        } catch (IOException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar");
        }

    }

    public Object[][] transformaListaEmObjecto() {
        int linha = 0, tamanho;
        tamanho = lista.size();
        Object[][] dados = new Object[tamanho][10];
        try {
            while ((linha < lista.size())) {

                dados[linha][0] = lista.get(linha).getnBi();
                dados[linha][1] = lista.get(linha).getNomeCompleto();
                dados[linha][2] = lista.get(linha).getMasc();
                dados[linha][3] = lista.get(linha).getCalendar();
                dados[linha][4] = lista.get(linha).getProvincia();
                dados[linha][5] = lista.get(linha).getTelef();

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
            BufferedReader ler = new BufferedReader(new FileReader("dados_de_utentes.txt"));
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
                String nomeCompleto, bi, genero,provincia, data, telefone;
                bi = campos[0];
                nomeCompleto = campos[1];
                genero = campos[2];
                data = campos[3];
                provincia = campos[4];
                telefone = campos[5];
                CadastrarUtentesModelo cd = new CadastrarUtentesModelo(nomeCompleto, bi, genero, data, provincia, telefone);
                lista.add(cd);
                Lidas = ler.readLine();    
            }
            
            ler.close();
            
        } catch (Exception e) {
        }

    }

    //--------------------- Crud------------------
    public void actualizaArquivo() {
        try {
            String NomeCompleto, Bi, Genero, DataNascimneto, Provincia, Telef;

            int linha = 0;
            BufferedWriter ConexaoGravar;
            ConexaoGravar = new BufferedWriter(new FileWriter("dados_de_utentes.txt"));

            while ((linha < lista.size())) {
                Bi = lista.get(linha).getnBi();
                NomeCompleto = lista.get(linha).getNomeCompleto();
                Genero = lista.get(linha).getMasc();
                DataNascimneto = lista.get(linha).getCalendar();
                Provincia = lista.get(linha).getProvincia();
                Telef = lista.get(linha).getTelef();

                CadastrarUtentesModelo cd = new CadastrarUtentesModelo(NomeCompleto, Bi, Genero, DataNascimneto, Provincia, Telef);
                gravar(ConexaoGravar, cd);
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
                lista.remove(indice);
                JOptionPane.showMessageDialog(null, "Dados Removidos com sucesso");
                actualizaArquivo();
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione o elemento que desejas eliminar");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public Object[][] Pesquisa(String Pesquisa) {
        int linha = 0, tamanho, countLinha = 0, k = 0;
        tamanho = lista.size();

        while ((linha < lista.size())) {
            if (lista.get(linha).getCalendar().equalsIgnoreCase(Pesquisa)) {
                countLinha++;
            }
            linha++;
        }
        try {

            Object[][] dados = new Object[countLinha][6];
            linha = 0;
            while ((linha < lista.size())) {

                if (lista.get(linha).getCalendar().equalsIgnoreCase(Pesquisa)) {
                    dados[k][0] = lista.get(linha).getnBi();
                    dados[k][1] = lista.get(linha).getNomeCompleto();
                    dados[k][2] = lista.get(linha).getMasc();
                    dados[k][3] = lista.get(linha).getCalendar();
                    dados[k][4] = lista.get(linha).getProvincia();
                    dados[k][5] = lista.get(linha).getTelef();
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

    
        public Object[][] Pesquisa2(String Pesquisa) {
        int linha = 0, tamanho, countLinha = 0, k = 0;
        tamanho = lista.size();

        while ((linha < lista.size())) {
            if (lista.get(linha).getNomeCompleto().equalsIgnoreCase(Pesquisa) || lista.get(linha).getnBi().equalsIgnoreCase(Pesquisa)) {
                countLinha++;
            }
            linha++;
        }
        try {

            Object[][] dados = new Object[countLinha][6];
            linha = 0;
            while ((linha < lista.size())) {

                if (lista.get(linha).getNomeCompleto().equalsIgnoreCase(Pesquisa)  || lista.get(linha).getnBi().equalsIgnoreCase(Pesquisa)) {
                    dados[k][0] = lista.get(linha).getnBi();
                    dados[k][1] = lista.get(linha).getNomeCompleto();
                    dados[k][2] = lista.get(linha).getMasc();
                    dados[k][3] = lista.get(linha).getCalendar();
                    dados[k][4] = lista.get(linha).getProvincia();
                    dados[k][5] = lista.get(linha).getTelef();
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


    private void cd(String NomeCompleto, String Bi, String Genero, String DataNascimneto, String Provincia, String Telef) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
