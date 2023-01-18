/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Kod;

import java.util.Scanner;

/**
 *
 * @author Alperen Aktaş
 */
public class Kimlik_Bilgileri {

    public static void main(String[] args) {
        
        String ad;
        String soyad;
        char cinsiyet;
        String gsm;

        Scanner oku=new Scanner(System.in);
        
        System.out.print("Lutfen Adinizi Giriniz:");
        ad=oku.nextLine();
        
        System.out.print("Lutfen Soyadinizi Giriniz:");
        soyad=oku.nextLine();
        
        System.out.print("Lutfen Cinsiyetinizi Giriniz:");
        cinsiyet=oku.nextLine().charAt(0);
        
        System.out.print("Lutfen Telefon Numarasini Giriniz:");
        gsm=oku.nextLine();
        
        System.out.println("Adınız= "+ad);
        System.out.println("Soyadınız= "+soyad);
        System.out.println("Cinsiyetiniz= "+cinsiyet);
        System.out.println("Telefon Numaraniz= "+gsm);
        
        
        

        
        
        
        
    }
}
