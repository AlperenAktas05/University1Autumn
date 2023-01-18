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
public class Vize2022_5 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String ad;
        int adet,i;
        
        System.out.println("Lutfen Adinizi Girin");
        ad=k.next();
        
        System.out.println("Tekrar Sayisi Girin");
        adet=k.nextInt();
        
        for(i=1;i<=adet;i++){
            System.out.println(ad);
        }
    }
}
