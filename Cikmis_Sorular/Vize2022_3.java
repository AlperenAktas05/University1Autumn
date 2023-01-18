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
public class Vize2022_3 {
    public static void main(String[] args) {
        //aynı uzunlukta...//
        Scanner k=new Scanner(System.in);
        
        String s1,s2,stop="";
        int i;
        
        System.out.println("Birinci Kelimeyi Girin");
        s1=k.next();
        
        System.out.println("Ikinci Kelimeyi Girin");
        s2=k.next();
        
        if(s1.length()!=s2.length()){
            System.out.println("Lutfen Ayni Uzunlukta Kelime Giriniz");
            System.exit(0);
        }
        
        for(i=0;i<=s1.length()-1;i++){
            stop=stop+s1.charAt(i)+s2.charAt(i);
        }
        
        System.out.println("Sonuc:"+stop);
    }
}
