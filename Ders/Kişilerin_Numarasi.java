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
public class Kişilerin_Numarasi {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int kisi;
        int i;
        String ad;
        String soyad;
        long no;
        
        System.out.println("Lutfen Kisi Sayisi Giriniz");
        kisi=k.nextInt();
        
        for(i=1;i<=kisi;i++){
            System.out.println("Ad Giriniz");
            ad=k.next();
            
            System.out.println("Soyad Giriniz");
            soyad=k.next();
            
            System.out.println("Numara Giriniz");
            no=k.nextLong();
            
            System.out.println(ad);
            System.out.println(soyad);
            System.out.println(no);
            
        }
        
        if(kisi<=0){
            System.out.println("Yanlıs Deger");
            System.exit(0);
        }
    }
}
