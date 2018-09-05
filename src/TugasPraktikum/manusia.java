/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author ZIDANE
 */
public abstract class manusia {
    public double tinggibadan;
    
    public manusia(double TB){
        tinggibadan = TB;
    }
    public double getter(){
        return tinggibadan;
    }
    public abstract double HtgBBI();
}
