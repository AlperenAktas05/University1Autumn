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
public class Slayt_1 {
    public static void main(String[] args) {
        Scanner oku=new Scanner (System.in);
        
        String kelime;
        String kelime2;
        String kelime3;
        String kharf;
        String bharf;
        String bolum;
        String bolum2;
        int nerede;
        String sil;
        char karakter;
        
        System.out.print("Lutfen Buyuk Harflerle Bir Kelime Giriniz:");
        kelime=oku.nextLine();
        
        kharf=kelime.toLowerCase();
        System.out.println("Kelimenizin Kucultulmus Hali:"+kharf);
        //-------------------------------------------------------------------//
        System.out.print("Lutfen Kucuk Harflerle Bir Kelime Giriniz:");
        kelime=oku.nextLine();
        
        bharf=kelime.toUpperCase();
        System.out.println("Kelimenizin Buyultulmus Hali:"+bharf);
        //-------------------------------------------------------------------//
        System.out.print("Lutfen Bir Kelime Giriniz:");
        kelime=oku.nextLine();
        
        bolum=kelime.substring(0, 3);
        System.out.println("Kelimenizin Ilk 3 Harfi:"+bolum);
        
        bolum2=kelime.substring(3);
        System.out.println("Kelimenizin Son 4 Harfi:"+bolum2);
        //-------------------------------------------------------------------//
        System.out.print("Lutfen Bir Kelime Giriniz:");
        kelime=oku.nextLine();
        
        nerede=kelime.indexOf("eren");
        System.out.println("eren Kelimesi "+nerede+". Hanede Başlıyor");
        //-------------------------------------------------------------------//
        System.out.print("Lutfen Bosluklu Bir Kelime Giriniz:");
        kelime=oku.nextLine();
        
        sil=kelime.trim();       
        System.out.println("Kelimenizin Bosluksuz Hali:"+sil);
        //-------------------------------------------------------------------//
        System.out.print("Lutfen Bir Kelime Giriniz:");
        kelime=oku.nextLine();
        
        karakter=kelime.charAt(0);
        System.out.println("Kelimenizin Bas Harfi:"+karakter);
        //-------------------------------------------------------------------//
        System.out.print("Lutfen Birinci Kelimeyi Girin:");
        kelime=oku.nextLine();
        System.out.print("Lutfen Ikinci Kelimeyi Girin:");
        kelime2=oku.nextLine();
        System.out.print("Lutfen Ucuncu Kelimeyi Girin:");
        kelime3=oku.nextLine();
        
        System.out.println("1. Kelime 1. Kelimeyle Ayni "+kelime.equals(kelime));
        System.out.println("1. Kelime 2. Kelimeyle Ayni "+kelime.equals(kelime2));
        System.out.println("1. Kelime 3. Kelimeyle Ayni "+kelime.equalsIgnoreCase(kelime3));
    }
}
