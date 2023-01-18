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
public class Adını_Soyadını_Yazma {
    
       public static void main(String[] args) {
           
           String ad;
           String soyad;
           
           Scanner oku= new Scanner(System.in);
           
           System.out.println("Adınızı Giriniz");
           ad= oku.nextLine();
           
           System.out.println("Soyadınızı Giriniz");
           soyad= oku.nextLine();
           
           System.out.println("Adınız ve Soyadınız="+ad+" "+soyad);
           
           
           
           
       }
}
