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
public class Stringi_Tersten_Yazan_Metot {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String kelime,m;
        
        System.out.println("Kelime Giriniz");
        kelime=k.next();
        
        m=ters(kelime);
        
        System.out.println("Kelimenizin Tersten Yazılısı: "+m);
    }
    
    public static String ters(String a) {
        String stop="";
        
        for (int i = a.length()-1; i >= 0; i--) {
            stop+=a.charAt(i);
        }
        
        return stop;
    }
}
