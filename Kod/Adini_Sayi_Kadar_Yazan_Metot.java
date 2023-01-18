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
public class Adini_Sayi_Kadar_Yazan_Metot {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int tekrar;
        String ad;
        
        System.out.println("Adinizi Girin");
        ad=k.next();
        
        System.out.println("Tekrar Sayisi Girin");
        tekrar=k.nextInt();
        
        tekraryazma(tekrar,ad);

    }
    
    public static void tekraryazma(int b,String a) {
        
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
        
    }
}
