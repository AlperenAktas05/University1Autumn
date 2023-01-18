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
public class İki_Sayiyi_Toplayan_Metot {
    public static void main(String[] args) {
        //kendisine parametre olarak gelen 2 sayiyi toplayıp geri döndüren//
        Scanner k=new Scanner(System.in);
        int x,y,z;
        
        System.out.println("Birinci Sayiyi Giriniz");
        y=k.nextInt();
        
        System.out.println("Ikinci Sayiyi Giriniz");
        z=k.nextInt();
        
        x=toplam(y,z);
        System.out.println("Toplam="+x);
    }
    
    public static int toplam(int a, int b) {
        int m=a+b;
        return m;
    }
}
