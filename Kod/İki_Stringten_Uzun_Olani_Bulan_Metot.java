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
public class İki_Stringten_Uzun_Olani_Bulan_Metot {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String s1,s2,m;
        
        System.out.println("1. Kelimeyi Giriniz");
        s1=k.next();
        
        System.out.println("2. Kelimeyi Giriniz");
        s2=k.next();
        
        m=buyuk(s1,s2);
        
        System.out.println("Buyuk Olan Kelime:"+m);
    }
    
    public static String buyuk(String a, String b) {
        String enbk=a;
        
        if(b.length()>a.length()){
            enbk=b;
        }
        
        if(b.length()==a.length()){
            System.out.println("Harf Sayisi Esit");
            System.exit(0);
        }
        
        return enbk;
    }
}
