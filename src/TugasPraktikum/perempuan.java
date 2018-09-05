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
public class perempuan extends manusia {
    
    public perempuan(double TB){
        super(TB);
        
    }
    
    public double HtgBBI(){
        return(super.getter()-100)*0.8;
    }
    
}
