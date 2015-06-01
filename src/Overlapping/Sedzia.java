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
class Sedzia {
    
    private Date dataUzyskaniaUpr;
    private Osoba osoba;
    
    public Sedzia(Osoba osoba,Date dataUzyskaniaUpr){
        this.setOsoba(osoba);
        this.dataUzyskaniaUpr=dataUzyskaniaUpr;
                
    }
        public void setOsoba(Osoba osoba) {
        if(this.osoba!= osoba){
            if (this.osoba != null) {
                this.osoba.setSedzia(null);
            }
            this.osoba = osoba;
            if(osoba!=null){
                osoba.setSedzia(this);
            }    
        }
    }
    
}
