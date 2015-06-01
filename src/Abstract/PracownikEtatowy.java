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
public class PracownikEtatowy extends Pracownik{
    
    private int stawkaPodstawowa;
    private int stawkaNadgodziny;
    private int liczbaNadgodzin;

    public PracownikEtatowy(String imie, String nazwisko, Date dataUrodzenia, Date dataZatrudnienia,int stawkaPodstawowa,int stawkaNadgodziny) {
        super(imie, nazwisko, dataUrodzenia, dataZatrudnienia);
        this.stawkaPodstawowa=stawkaPodstawowa;
        this.stawkaNadgodziny=stawkaNadgodziny;
    }

    public int getStawkaPodstawowa() {
        return stawkaPodstawowa;
    }

    public void setStawkaPodstawowa(int stawkaPodstawowa) {
        this.stawkaPodstawowa = stawkaPodstawowa;
    }

    public int getStawkaNadgodziny() {
        return stawkaNadgodziny;
    }

    public void setStawkaNadgodziny(int stawkaNadgodziny) {
        this.stawkaNadgodziny = stawkaNadgodziny;
    }

    public int getLiczbaNadgodzin() {
        return liczbaNadgodzin;
    }

    public void setLiczbaNadgodzin(int liczbaNadgodzin) {
        this.liczbaNadgodzin = liczbaNadgodzin;
    }

    
    public int wyplata(){
        return stawkaPodstawowa+liczbaNadgodzin*stawkaNadgodziny;
    }
    
    @Override
    public int getPensja() {
        return this.wyplata();
    }
    
    
    
}
