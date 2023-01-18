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
public class Vize2018_2 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String isim,no;
        
        System.out.println("Adinizi Ve Soyadinizi Giriniz");
        isim=k.nextLine();
        
        System.out.println("Okul Numaranizi Giriniz");
        no=k.next();
        
        for (int i = 0; i < 100; i++) {
            System.out.println("Adiniz Soyadiniz: "+isim+" Okul Numaraniz: "+no);
        }
    }
}
