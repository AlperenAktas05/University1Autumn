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
public class Adini_Sayi_Kadar_Yazdiran_Metot {
    //kendisine parametre olarak olarak gelen sayi kadar adınızı yazınız//
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int adet;
        
        System.out.println("Adınız Kaç Kere Yazılsın");
        adet=k.nextInt();
        
        yaz(adet); 
    }
    
    public static void yaz(int a) {
        for (int i = 0; i < a; i++) {
            System.out.println("Alperen");
        }
    }
}
