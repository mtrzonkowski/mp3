/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dynamic;

import java.util.Date;

/**
 *
 * @author mtrzonkowski
 */
public class Zawodnik {
    
    private String imie;
    private String nazwisko;
    private String druzyna;
    private Date dataPrzyjecia;
    
    private PodZawodnik podZawodnik;

    public Zawodnik(String imie, String nazwisko, String druzyna, Date dataPrzyjecia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.druzyna = druzyna;
        this.dataPrzyjecia = dataPrzyjecia;
    }
    
    public void setZawodnikType(PodZawodnik podZawodnik) throws Exception{
        if(podZawodnik.getClass().getInterfaces()!=PodZawodnik.class.getInterfaces()){
            throw new Exception("Ten obiekt nie może być zawodnikiem");
        }
        else{
            this.podZawodnik=podZawodnik;
            podZawodnik.setZawodnik(this);
        }
    }
    
}
