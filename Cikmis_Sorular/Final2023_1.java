/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cikmis_Sorular;

import java.util.Scanner;

/**
 *
 * @author Alperen
 */
public class Final2023_1 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String s1,s2,m;
        
        System.out.println("Birinci Kelimeyi Girin");
        s1=k.next();
        
        System.out.println("Ikinci Kelimeyi Girin");
        s2=k.next();
        
        m=farkli(s1,s2);
        System.out.println(m);
    }
    
    public static String farkli(String a, String b) {
        String top="";
        
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)!=b.charAt(i)){
                top=top+a.charAt(i)+b.charAt(i);
            }
        }
        
        return top;
    }
}
