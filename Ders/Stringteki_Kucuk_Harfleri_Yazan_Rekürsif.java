/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ders;

import java.util.Scanner;

/**
 *
 * @author Alperen
 */
public class Stringteki_Kucuk_Harfleri_Yazan_Rekürsif {
    //kendisine parametre olarak gelen stringteki kucuk harf sayisi//
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String kelime;
        String m;
        
        System.out.println("Kelime Giriniz");
        kelime=k.next();
        
        m=kucuk(kelime, 0);
        System.out.println("Kucuk Harfler="+m);
    }
    
    public static String kucuk(String a, int c) {
        
        if(c==a.length()){
            return "";
        }
        
        else if(a.charAt(c)>='a' && a.charAt(c)<='z'){
            return a.charAt(c)+kucuk(a,c+1);
        }
        
        else{
            return kucuk(a,c+1);
        }
    }
}
