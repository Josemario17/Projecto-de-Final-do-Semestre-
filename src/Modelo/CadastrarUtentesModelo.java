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
public class CadastrarUtentesModelo {
    public String NomeCompleto;
    public String nBi;
    public String masc;
    public String Fem;
    public String Calendar;
    public String provincia;
    public String telef;

    public CadastrarUtentesModelo(String NomeCompleto, String nBi, String masc, String Calendar, String provincia, String telef) {
        this.NomeCompleto = NomeCompleto;
        this.nBi = nBi;
        this.masc = masc;
        this.Fem = Fem;
        this.Calendar = Calendar;
        this.provincia = provincia;
        this.telef = telef;
    }

    public CadastrarUtentesModelo() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public String getNomeCompleto() {
        return NomeCompleto;
    }

    public void setNomeCompleto(String NomeCompleto) {
        this.NomeCompleto = NomeCompleto;
    }

    public String getnBi() {
        return nBi;
    }

    public void setnBi(String nBi) {
        this.nBi = nBi;
    }

    public String getMasc() {
        return masc;
    }

    public void setMasc(String masc) {
        this.masc = masc;
    }

    public String getFem() {
        return Fem;
    }

    public void setFem(String Fem) {
        this.Fem = Fem;
    }

    public String getCalendar() {
        return Calendar;
    }

    public void setCalendar(String Calendar) {
        this.Calendar = Calendar;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getTelef() {
        return telef;
    }

    public void setTelef(String telef) {
        this.telef = telef;
    }
    
    
    
}
