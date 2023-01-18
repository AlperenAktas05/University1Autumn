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
public class Sayinin_Basamak_Sayisini_Veren_Metot {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int sayi,m;
        
        System.out.println("Sayi Giriniz");
        sayi=k.nextInt();
        
        m=basamak(sayi);
        
        System.out.println("Basamak Sayisi="+m);
    }
    
    public static int basamak(int a) {
        int bas=1;
        
        while(a>=10){
            a=a/10;
            bas++;
        }
        
        return bas;
    }
}
