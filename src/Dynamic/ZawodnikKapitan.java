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
public class ZawodnikKapitan implements PodZawodnik{
    
    private Date dataNadania;
    private Zawodnik zawodnik;

    public ZawodnikKapitan(Zawodnik zawodnik,Date dataNadania) {
        this.dataNadania = dataNadania;
        this.zawodnik = zawodnik;
    }
    
    
    
    @Override
    public void setZawodnik(Zawodnik zawodnik) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
