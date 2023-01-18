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
public class Girilen_Sayiya_Kadar_Sayilari_Toplayan_Metot {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int sayi,m;
        
        System.out.println("Sayi Giriniz");
        sayi=k.nextInt();
        
        m=toplam(sayi);
        
        System.out.println("Girdiginiz Sayiya Kadar Olan Sayilarin Toplami="+m);
    }
    
    public static int toplam(int a) {
        int top=0;
        
        for (int i = 0; i <= a; i++) {
            top=top+i;
        }
        
        return top;
    }
}
