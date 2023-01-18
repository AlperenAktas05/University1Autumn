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
public class Stringi_Tersten_Yazan_Rekürsif {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String kelime;
        String m;
        
        System.out.println("Kelime Giriniz");
        kelime=k.next();
        
        m=ters(kelime,0);
        System.out.println("Kelimenin Tersten Yazılısı:"+m);
    }
    
    public static String ters(String a,int dur) {
        
        if(dur==a.length()){
            return "";
        }
        
        else{
            return ters(a,dur+1)+a.charAt(dur);
        }
    }
}
