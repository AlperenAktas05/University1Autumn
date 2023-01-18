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
public class Stringteki_Harfleri_Buyuten_Metot {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String kelime,m;
        
        System.out.println("Kelime Giriniz");
        kelime=k.nextLine();
        
        m=buyutucu(kelime);
        
        System.out.println("Kelimenizin Buyuk Harflerle Yazılısı:"+m);
    }
    
    public static String buyutucu(String a) {
        String top="";
        
        for (int i = 0; i < a.length(); i++) {
            
            if(a.charAt(i)>='a' && a.charAt(i)<='z'){
                top+=(char)(a.charAt(i)-32);
            }
            
            else{
                top+=a.charAt(i);
            }
        }
        
        return top;
    }
}
