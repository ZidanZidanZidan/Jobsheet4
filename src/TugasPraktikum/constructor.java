/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

import java.util.Scanner;


/**
 *
 * @author ZIDANE
 */
public class constructor {
    public static void main(String[]args){
        Scanner masukan = new Scanner(System.in);
        manusia l = new Laki_Laki(0);
        manusia p = new perempuan(0);
        String kelamin;
        System.out.println("User 1");
        System.out.print("Masukkan Tinggi Badan Anda (cm) = ");
        l.tinggibadan = p.tinggibadan = masukan.nextDouble();
        System.out.print("Masukkan Jenis Kelamin = ");
        kelamin = masukan.next();
        switch(kelamin){
            case "L" : System.out.print("Berat Badan Pria Ideal Anda adalah = "+l.HtgBBI());
            break;
            case "P" : System.out.print("Berat Badan Wanita Ideal Anda adalah = "+p.HtgBBI());
            break;
            case "l" : System.out.print("Berat Badan Pria Ideal Anda adalah = "+l.HtgBBI());
            break;
            case "p" : System.out.print("Berat Badan Pria Ideal Anda adalah = "+p.HtgBBI());
            break;
        }
        System.out.println("\n");
        System.out.println("User 2");
        System.out.print("Masukkan Tinggi Badan Anda (cm) = ");
        l.tinggibadan = p.tinggibadan = masukan.nextDouble();
        System.out.print("Masukkan Jenis Kelamin = ");
        kelamin = masukan.next();
        switch(kelamin){
            case "L" : System.out.print("Berat Badan Pria Ideal Anda adalah = "+l.HtgBBI());
            break;
            case "P" : System.out.print("Berat Badan Wanita Ideal Anda adalah = "+p.HtgBBI());
            break;
            case "l" : System.out.print("Berat Badan Pria Ideal Anda adalah = "+l.HtgBBI());
            break;
            case "p" : System.out.print("Berat Badan Pria Ideal Anda adalah = "+p.HtgBBI());
            break;
        }
        
        
        
    }
    
}
