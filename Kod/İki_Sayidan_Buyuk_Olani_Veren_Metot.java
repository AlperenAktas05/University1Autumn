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
public class İki_Sayidan_Buyuk_Olani_Veren_Metot {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int sayi1,sayi2,m;
        
        System.out.println("1. Sayiyi Girin");
        sayi1=k.nextInt();
        
        System.out.println("2. Sayiyi Girin");
        sayi2=k.nextInt();
        
        m=buyuk(sayi1,sayi2);
        
        System.out.println("Buyuk Olan Sayi="+m);
    }
    
    public static int buyuk(int a, int b) {
        int enb=a;
        
        if(b>a){
            enb=b;
        }
        
        return enb;
    }
}
