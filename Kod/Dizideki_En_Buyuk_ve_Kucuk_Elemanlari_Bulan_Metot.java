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
public class Dizideki_En_Buyuk_ve_Kucuk_Elemanlari_Bulan_Metot {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int list[]=new int[5];
        int m[]=new int[2];
        
        for (int i = 0; i < list.length; i++) {
            System.out.println((i+1)+". Elemani Giriniz");
            list[i]=k.nextInt();
        }
        
        m=en(list);
        
        System.out.println("En Buyuk Eleman "+m[0]+" En Kucuk Eleman "+m[1]);
    }
    
    public static int[] en(int a[]) {
        int en []=new int[2];
        int enb=a[0];
        int enk=a[0];
        
        for (int i = 0; i < a.length; i++) {
            
            if(a[i]>enb){
                enb=a[i];
                en[0]=enb;
            }
            
            if(a[i]<enk){
                enk=a[i];
                en[1]=enk;
            }
        }
        
        return en;
    }
}
