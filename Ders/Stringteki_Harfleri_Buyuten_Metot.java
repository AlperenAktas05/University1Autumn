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
public class Stringteki_Harfleri_Buyuten_Metot {
    //kendisine parametre olarak gelen stringi büyük harflerine çeviren//
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String kelime;
        String x;
        
        System.out.println("Kelime Yaziniz");
        kelime=k.next();
        
        x=buyuk(kelime);
        System.out.println("Sonuc:"+x);
    }
    
    public static String buyuk(String a) {
        String top="";
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)>='a' && a.charAt(i)<='z'){
                top+=(char)(a.charAt(i)-32);
            }
            
            else{
                top=top+a.charAt(i);
            }
        }
        
        return top;
    }
}
