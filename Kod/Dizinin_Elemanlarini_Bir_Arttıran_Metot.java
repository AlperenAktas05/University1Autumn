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
public class Dizinin_Elemanlarini_Bir_Arttıran_Metot {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int list[]=new int[5];
        int m[]=new int [5];
        
        for (int i = 0; i < list.length; i++) {
            System.out.println((i+1)+". Elemani Giriniz");
            list[i]=k.nextInt();
        }
        
        m=art(list);
        
        for (int i = 0; i < m.length; i++) {
            System.out.println((i+1)+". Eleman="+m[i]);
        }
    }
    
    public static int[] art(int a[]) {
        
        for (int i = 0; i < a.length; i++) {
            a[i]=a[i]+1;
        }
        
        return a;
    }
}
