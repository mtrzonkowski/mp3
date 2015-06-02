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
public interface SilnikDiesla {
    
    public abstract void setPojemnosc(float pojemnosc);
    public abstract float getPojemnosc();
    public abstract void setSpalanie(float spalanie);
    public abstract float getSpalanie();
    public abstract void setFiltrCzastekStalych(boolean filtrCzastekStalych);
    public abstract boolean getFiltrCzastekStalych();
}
