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
public class İki_Sayiyi_Toplayan_Metot {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int sayi1;
        int sayi2;
        int m;
        
        System.out.println("Lutfen 1. Sayiyi Girin");
        sayi1=k.nextInt();
        
        System.out.println("Lutfen 2. Sayiyi Girin");
        sayi2=k.nextInt();
        
        m=toplam(sayi1,sayi2);
        
        System.out.println("Toplam="+m);
    }
    
    public static int toplam(int a, int b) {
        int toplam=a+b;
        
        return toplam;
    }
}
