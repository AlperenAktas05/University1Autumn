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
public class ASCİ_Karşılığı {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String ad;
        String asci;
        String top="";
        
        System.out.println("Lutfen Adinizi Giriniz");
        ad=k.next();
        
        System.out.println("Lutfen Adinizin Asci Kodunu Giriniz");
        asci=k.next();
        
        int list[]=new int[ad.length()];
        
        for (char i = 0; i < ad.length(); i++) {
            list[i]=ad.charAt(i);
        }
        
        for (int j = 0; j < ad.length(); j++) {
            System.out.print(list[j]);
            top=top+list[j];
        }
        
        if(top.equals(asci)){
            System.out.println("Giris Dogru");
        }
        
        else{
            System.out.println("Giris Yanlis");
        }
    }
}

