/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kod;

import java.util.Scanner;

/**
 *
 * @author Alperen Aktaş
 */
public class Dört_İşlem_Yapma {
    public static void main(String[] args) {
        
        int sayi1;
        int sayi2;
        int toplama;
        int cikarma;
        int carpma;
        float bolme;
        
        Scanner oku= new Scanner(System.in);
        System.out.println("Birinci Sayiyi Girin");
        sayi1= oku.nextInt();
        
        System.out.println("İkinci Sayiyi Girin");
        sayi2= oku.nextInt();                           
                
        toplama=sayi1+sayi2;
        cikarma=sayi1-sayi2;
        carpma=sayi1*sayi2;
        bolme=sayi1/sayi2;
        
        System.out.println("Toplam="+toplama);
        System.out.println("Cikarim="+cikarma);
        System.out.println("Carpım="+carpma);
        System.out.println("Bolum="+bolme);
        
    }
}
