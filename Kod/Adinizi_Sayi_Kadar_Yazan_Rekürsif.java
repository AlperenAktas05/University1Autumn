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
public class Adinizi_Sayi_Kadar_Yazan_Rekürsif {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int sayi;
        String ad;
        String m;
        
        System.out.println("Adinizi Giriniz");
        ad=k.next();
        
        System.out.println("Tekrar Sayisi Giriniz");
        sayi=k.nextInt();
        
        m=yaz(sayi,ad);
        System.out.println(m);
    }
    
    public static String yaz(int a, String b) {
        
        if(a==0){
            return "";
        }
        
        else{
            return b+yaz(a-1,b);
        }
        
    }
}
