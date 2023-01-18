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
public class Dizinin_Elemanlarini_Toplayan_Metot {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int list[]=new int[5];
        int m;
        
        for (int i = 0; i < list.length; i++) {
            System.out.println((i+1)+". Elemani Giriniz");
            list[i]=k.nextInt();
        }
        
        m=toplam(list);
        
        System.out.println("Elemanlar Toplami="+m);
    }
    
    public static int toplam(int a[]) {
        int top=0;
        
        for (int i = 0; i < a.length; i++) {
            top+=a[i];
        }
        
        return top;
    }
}
