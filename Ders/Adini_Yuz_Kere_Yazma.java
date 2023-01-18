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
public class Adini_Yuz_Kere_Yazma {
    public static void main(String[] args) {
        //adını soyadını 100 defa yaz//
        
        Scanner k=new Scanner(System.in);
        
        String ad;
        int i;
        
        System.out.println("Adınızı Soyadınızı Giriniz");
        ad=k.nextLine();
        
        for(i=1;i<=100;i++){
            System.out.println(ad);
        }
    }
}
