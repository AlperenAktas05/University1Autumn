/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kod;

import java.util.Scanner;

/**
 *
 * @author Alperen
 */
public class Cumledeki_Kelime_Sayisini_Bulan_Metot {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String cumle;
        int m;
        
        System.out.println("Lutfen Cumle Giriniz");
        cumle=k.nextLine();
        
        m=kelime(cumle);
        
        System.out.println("Kelime Sayisi="+m);
    }
    
    public static int kelime(String cumle) {
        int sayac=0;
        
        for (int i = 0; i < cumle.length(); i++) {
            
            if(cumle.charAt(i)==' '){
                sayac++;
            }
        }
        
        return sayac+1;
    }
}
