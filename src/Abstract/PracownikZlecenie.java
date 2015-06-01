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
public class PracownikZlecenie extends Pracownik{
    
    private int stawka;
    private int liczbaGodzin;

    public PracownikZlecenie(String imie, String nazwisko, Date dataUrodzenia, Date dataZatrudnienia,int stawka) {
        super(imie, nazwisko, dataUrodzenia, dataZatrudnienia);
        this.stawka=stawka;
    }

    public int getStawka() {
        return stawka;
    }

    public void setStawka(int stawka) {
        this.stawka = stawka;
    }

    public int getLiczbaGodzin() {
        return liczbaGodzin;
    }

    public void setLiczbaGodzin(int liczbaGodzin) {
        this.liczbaGodzin = liczbaGodzin;
    }
    
    public int naleznosc(){
        return stawka*liczbaGodzin;
    }
    
    @Override
    public int getPensja() {
        return naleznosc();
    }
    
}
