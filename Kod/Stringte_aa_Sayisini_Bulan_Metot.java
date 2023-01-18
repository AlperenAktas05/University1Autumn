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
public class Stringte_aa_Sayisini_Bulan_Metot {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String kelime;
        int m;
        
        System.out.println("Kelime Giriniz");
        kelime=k.nextLine();
        
        m=say(kelime);
        
        System.out.println("aa Sayisi="+m);
    }
    
    public static int say(String a) {
        int sayac=0;
        
        for (int i = 0; i < a.length()-1; i++) {
            
            if(a.charAt(i)=='a' && a.charAt(i+1)=='a'){
                sayac++;
            }
            
        }
        
        return sayac;
    }
}