/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3;

import Abstract.PracownikEtatowy;
import Abstract.PracownikZlecenie;
import Overlapping.Zawodnik;
import Overlapping.Sedzia;
import Overlapping.Osoba;
import java.util.Date;

/**
 *
 * @author mtrzonkowski
 */
public class Mp3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PracownikEtatowy pracownikE1 = new PracownikEtatowy("Jan", "Kminek", new Date(1983, 5, 17), new Date(2015, 1, 1), 3000, 20);
        pracownikE1.setLiczbaNadgodzin(10);
        System.out.println("Pracownik etatowy zarobił: "+pracownikE1.getPensja());
        
        PracownikZlecenie pracownikZ1 = new PracownikZlecenie("Karol","Pożoga",new Date(1978,5,13),new Date(2014,1,1),17); 
        pracownikZ1.setLiczbaGodzin(200);
        System.out.println("Pracownik zlecenie zarobił: "+pracownikZ1.getPensja());
    
        Osoba osoba1 =new Osoba("Radosław", "Wichrowski", new Date(1983,5,1));
        Zawodnik zawodnik1= new Zawodnik(osoba1,"Kruszyna",new Date(2015,5,1));

        Osoba osoba3 =new Osoba("Aleksandra", "Rawecka", new Date(1983,12,21));
        Zawodnik zawodnik3= new Zawodnik(osoba3,"Hilda",new Date(2015,3,21));
        Sedzia sedzia3 = new Sedzia(osoba3,new Date(2015,5,1));
        
    }

}
