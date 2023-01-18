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
public class İki_Dizinin_Elemanlarindan_Hangisi_Buyuk {
    //kendisine parametre olarak gelen tek boyutlu 2 diziden elemani büyük olani yazan metod//
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);

        int list1[]=new int [3];
        int list2[]=new int [3];
        int m[]=new int[3];
        
        for (int i = 0; i < list1.length; i++) {
            System.out.println("1. Dizinin "+(i+1)+". Elemani Giriniz");
            list1[i]=k.nextInt();
        }
        
        for (int i = 0; i < list2.length; i++) {
            System.out.println("2. Dizinin "+(i+1)+". Elemani Giriniz");
            list2[i]=k.nextInt();
        }

        m=buyuk(list1,list2);
        for (int i = 0; i < m.length; i++) {
            System.out.println("Buyuk Olan Eleman= "+m[i]);
        }
    }
    
    public static int[] buyuk(int a[],int b[]) {
        int c[]=new int [3];
        
        for (int i = 0; i < a.length; i++) {
            c[i]=a[i];
        }
        
        for (int i = 0; i < a.length; i++) {
            if(b[i]>a[i]){
                c[i]=b[i];
            }
        }
        
        return c;
    }
}