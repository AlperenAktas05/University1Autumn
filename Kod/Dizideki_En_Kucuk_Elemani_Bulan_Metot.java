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
public class Dizideki_En_Kucuk_Elemani_Bulan_Metot {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int list[]=new int[5];
        int m;
        
        for (int i = 0; i < list.length; i++) {
            System.out.println((i+1)+". Elemani Giriniz");
            list[i]=k.nextInt();
        }
        
        m=kucuk(list);
        
        System.out.println("En Kucuk Eleman="+m);
        
    }
    
    public static int kucuk(int a[]) {
        int enk=a[0];
        
        for (int i = 0; i < a.length; i++) {
            
            if(a[i]<enk){
                enk=a[i];
            }
        }
        
        return enk;
    }
}
