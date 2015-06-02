/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiParent;

/**
 *
 * @author mtrzonkowski
 */
public class SamochodOsobowy {

    private int liczbaMiejsc;
    private int liczbaDrzwi;
    private int wielkoscBagaznika;

    public SamochodOsobowy(int liczbaMiejsc, int liczbaDrzwi, int wielkoscBagaznika) {
        this.liczbaMiejsc = liczbaMiejsc;
        this.liczbaDrzwi = liczbaDrzwi;
        this.wielkoscBagaznika = wielkoscBagaznika;
    }

    public int getLiczbaMiejsc() {
        return liczbaMiejsc;
    }

    public void setLiczbaMiejsc(int liczbaMiejsc) {
        this.liczbaMiejsc = liczbaMiejsc;
    }

    public int getLiczbaDrzwi() {
        return liczbaDrzwi;
    }

    public void setLiczbaDrzwi(int liczbaDrzwi) {
        this.liczbaDrzwi = liczbaDrzwi;
    }

    public int getWielkoscBagaznika() {
        return wielkoscBagaznika;
    }

    public void setWielkoscBagaznika(int wielkoscBagaznika) {
        this.wielkoscBagaznika = wielkoscBagaznika;
    }

    
}
