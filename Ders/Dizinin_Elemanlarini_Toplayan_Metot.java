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
public class Dizinin_Elemanlarini_Toplayan_Metot {
    // kendisine parametre olarak gelen dizinin toplamını geri döndüren//
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int x[]={1,7,3,6,5,2};
        
        double y=toplam(x);
        System.out.println("Sonuc="+y);
    }
    
    public static int toplam(int a[]) {
        int top=0;
        for (int i = 0; i < a.length; i++) {
            top+=a[i];
        }
        
        return (top/a.length);
    }
}
