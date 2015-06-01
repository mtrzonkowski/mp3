/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overlapping;

import java.util.Date;

/**
 *
 * @author mtrzonkowski
 */
public class Osoba {

    private String imie;
    private String nazwisko;
    private Date dataUrodzenia;

    private Zawodnik zawodnik = null;
    private Sedzia sedzia = null;

    public Osoba(String imie, String nazwisko, Date dataUrodzenia, Zawodnik zawodnik, Sedzia sedzia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.setZawodnik(zawodnik);
        this.setSedzia(sedzia);
    }

    public Osoba(String imie, String nazwisko, Date dataUrodzenia, Zawodnik zawodnik) {
        this(imie, nazwisko, dataUrodzenia, zawodnik, null);
    }

    public Osoba(String imie, String nazwisko, Date dataUrodzenia, Sedzia sedzia) {
        this(imie, nazwisko, dataUrodzenia, null, sedzia);
    }

    public Osoba(String imie, String nazwisko, Date dataUrodzenia) {
        this(imie, nazwisko, dataUrodzenia, null, null);
    }

    public void setSedzia(Sedzia sedzia) {
        if (this.sedzia != sedzia) {
            if (this.sedzia != null) {
                this.sedzia.setOsoba(null);
            }
            this.sedzia = sedzia;
            if (sedzia != null) {
                sedzia.setOsoba(this);
            }
        }

    }

    public void setZawodnik(Zawodnik zawodnik) {
        if (this.zawodnik != zawodnik) {
            if (this.zawodnik != null) {
                zawodnik.setOsoba(null);
            }
            this.zawodnik = zawodnik;
            zawodnik.setOsoba(this);
        }

    }

    public boolean isZawodnik() {
        return zawodnik != null;
    }

    public boolean isSedzia() {
        return sedzia != null;
    }

    public boolean isZawodnikAndSedzia() {
        return isSedzia() && isZawodnik();
    }

    public boolean isNotZawodnikAndSedzia() {
        return !isSedzia() && !isZawodnik();
    }
}
