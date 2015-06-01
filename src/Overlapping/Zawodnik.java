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
public class Zawodnik {
    private String callName;
    private Date dataRejestracji;
    private Osoba osoba;
    
    
    public Zawodnik(Osoba osoba,String callName,Date dataRejestracji){
        this.callName=callName;
        this.dataRejestracji=dataRejestracji;
        this.setOsoba(osoba);
    }
    
    public void setOsoba(Osoba osoba) {
        if(this.osoba!= osoba){
            if (this.osoba != null) {
                this.osoba.setZawodnik(null);
            }
            this.osoba = osoba;
            if(osoba!=null){
                osoba.setZawodnik(this);
            }    
        }
    }
    
}
