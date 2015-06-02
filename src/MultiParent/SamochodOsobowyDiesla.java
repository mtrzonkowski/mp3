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
public class SamochodOsobowyDiesla extends SamochodOsobowy implements SilnikDiesla{
    
    private float pojemnosc;
    private float spalanie;
    private boolean filtrCzastekStalych;

    public SamochodOsobowyDiesla(int liczbaMiejsc, int liczbaDrzwi, int wielkoscBagaznika,float pojemnosc,float spalanie,boolean filtrCzastekStalych) {
        super(liczbaMiejsc, liczbaDrzwi, wielkoscBagaznika);
        setPojemnosc(pojemnosc);
        setSpalanie(spalanie);
        setFiltrCzastekStalych(filtrCzastekStalych);
    }

    public SamochodOsobowyDiesla(int liczbaMiejsc, int liczbaDrzwi, int wielkoscBagaznika) {
        this(liczbaMiejsc, liczbaDrzwi, wielkoscBagaznika,0f,0f,false);
    }

    @Override
    public void setPojemnosc(float pojemnosc) {
        this.pojemnosc=pojemnosc;
    }

    @Override
    public float getPojemnosc() {
        return pojemnosc;
    }

    @Override
    public void setSpalanie(float spalanie) {
        this.spalanie=spalanie;
    }

    @Override
    public float getSpalanie() {
        return spalanie;
    }

    @Override
    public void setFiltrCzastekStalych(boolean filtrCzastekStalych) {
        this.filtrCzastekStalych=filtrCzastekStalych;
    }

    @Override
    public boolean getFiltrCzastekStalych() {
        return filtrCzastekStalych;
    }
    
}
