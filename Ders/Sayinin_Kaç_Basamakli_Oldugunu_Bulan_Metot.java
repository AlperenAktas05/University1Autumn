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
public class Sayinin_Kaç_Basamakli_Oldugunu_Bulan_Metot {
    //kendisine parametre olarak gelen sayinin kaç basamaklı oldğunu yazan program//
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int x,y;
        
        System.out.println("Sayi Giriniz");
        y=k.nextInt();
        
        x=basamak(y);
        System.out.println("Basamak Sayisi="+x);
    }
    
    public static int basamak(double a) {
        int c=1;
        while(a>=10){
            a=(a/10);
            c++;
        }
        
        return c;
    }
}
