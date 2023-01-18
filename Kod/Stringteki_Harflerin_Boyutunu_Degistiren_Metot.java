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
public class Stringteki_Harflerin_Boyutunu_Degistiren_Metot {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String kelime,m;
        
        System.out.println("Kelime Giriniz");
        kelime=k.next();
        
        m=degis(kelime);
        
        System.out.println("Kelimenizin Harflerinin Boyutu Degismis Hali: "+m);
    }
    
    public static String degis(String a) {
        String top="";
        
        for (int i = 0; i < a.length(); i++) {
            
            if(a.charAt(i)>='a' && a.charAt(i)<='z'){
                top+=(char)(a.charAt(i)-32);
            }
            
            if(a.charAt(i)>='A' && a.charAt(i)<='Z'){
                top+=(char)(a.charAt(i)+32);                   
            }
            
        }
        
        return top;
    }
}
