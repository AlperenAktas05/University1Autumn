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
public class İki_Diziyi_Toplayan_Metot {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int list1[]=new int[10];
        int list2[]=new int[10];
        int m;
        
        for (int i = 0; i < list1.length; i++) {
            System.out.println("1. Dizinin "+(i+1)+". Elemanini Giriniz");
            list1[i]=k.nextInt();
        }
        
        for (int i = 0; i < list2.length; i++) {
            System.out.println("2. Dizinin "+(i+1)+". Elemanini Giriniz");
            list2[i]=k.nextInt();
        }
        
        m=toplam(list1,list2);
        System.out.println("2 Dizinin Elemanlari Toplami="+m);
    }
    
    public static int toplam(int a[], int b[]) {
        int top=0;
        
        for (int i = 0; i < a.length; i++) {
            top+=a[i]+b[i];
        }
        
        return top;
    }
}
