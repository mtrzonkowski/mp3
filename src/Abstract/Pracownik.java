/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

import java.util.Date;

/**
 *
 * @author mtrzonkowski
 */
public abstract class Pracownik {
    
    private String imie;
    private String nazwisko;
    private Date dataUrodzenia;
    private Date dataZatrudnienia;

    public Pracownik(String imie, String nazwisko, Date dataUrodzenia, Date dataZatrudnienia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.dataZatrudnienia = dataZatrudnienia;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public Date getDataZatrudnienia() {
        return dataZatrudnienia;
    }

    public void setDataZatrudnienia(Date dataZatrudnienia) {
        this.dataZatrudnienia = dataZatrudnienia;
    }
    
    
    
    public abstract int getPensja();
}
