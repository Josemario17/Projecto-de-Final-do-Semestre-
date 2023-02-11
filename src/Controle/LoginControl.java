/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.CadastrarUserModelo;
import Visão.Login1;
import Visão.Menu;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class LoginControl {
    
    ArrayList<CadastrarUserModelo> lista = new ArrayList<>();
   public boolean bloqueio(String User, String Senha)
   {
       String LinhasLidas;
               try {
                 BufferedReader leitura = new BufferedReader(new FileReader("dados_de_usuarios.txt"));
                 LinhasLidas = leitura.readLine();
                 int linha = 0;
                 JOptionPane.showMessageDialog(null, ""  + lista.size());
                 while(linha<lista.size())
                 {
                     lista.removeAll(lista);
                     linha ++;
                 }
                 
                 int tam = 0;
                 String campos[] = LinhasLidas.split(";");
                 int linhas = campos.length;
                 
                 userControl uc = new userControl();
                 uc.preenchelistaBloqueio();
                 while(linhas > 0){
                        String username = campos[tam];
                        String senha = campos[tam+1];
                        if(uc.Pesquisa2(User) == true)
                                {
                                JOptionPane.showMessageDialog(null, "Bloqueiado");
                                return false;
                        }
                                
                         else if(User.equals(username)&&Senha.equals(senha))
                        {
                            linhas = 0;
                            return true;
                        }
                        
                 else{
                     tam = tam + 1;
                 }
                     linhas --;
                 }
                
       } catch (Exception e) {
       }
        return false;
   }
}
