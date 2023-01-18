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
public class Stringteki_Kucuk_Harf_Sayisini_Bulan_Metot {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String kelime;
        int m;
        
        System.out.println("Kelime Giriniz");
        kelime=k.next();
        
        m=kharf(kelime);
        
        System.out.println("Kucuk Harf Sayisi="+m);
    }
    
    public static int kharf(String a) {
        int sayac=0;
        
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)>='a' && a.charAt(i)<='z'){
                sayac++;
            }
        }
        
        return sayac;
    }
}
