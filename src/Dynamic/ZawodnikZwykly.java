/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dynamic;

/**
 *
 * @author mtrzonkowski
 */
public class ZawodnikZwykly implements PodZawodnik{
    
    private String pozycja;
    private Zawodnik zawodnik;

    public ZawodnikZwykly(Zawodnik zawodnik,String pozycja) throws Exception {
        setZawodnik(zawodnik);
        this.pozycja = pozycja;
    }

    public String getPozycja() {
        return pozycja;
    }

    public void setPozycja(String pozycja) {
        this.pozycja = pozycja;
    }

    @Override
    public void setZawodnik(Zawodnik zawodnik) throws Exception {
        if(this.zawodnik!=null && zawodnik!=null){
            throw new Exception("Nie można wykonać operacji");
        }else{
            this.zawodnik=zawodnik;
        }
    }
    
    
    
}
