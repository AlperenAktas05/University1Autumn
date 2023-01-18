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
public class Diziyi_Sağa_Döndüren_Metot {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int list[]=new int[10];
        int m[]=new int[10];
        
        for (int i = 0; i < list.length; i++) {
            System.out.println((i+1)+". Elemani Giriniz");
            list[i]=k.nextInt();
        }
        
        m=sag(list);
        
        for (int i = 0; i < m.length; i++) {
            System.out.println("Saga Donmus Dizinin "+(i+1)+". Elemani= "+m[i]);
        }
    }
    
    public static int[] sag(int a[]) {
        int temp=a[0];
        
        for (int i = 0; i < a.length-1; i++) {
            a[i]=a[i+1];
        }
        
        a[9]=temp;
        
        return a;
    }
}
