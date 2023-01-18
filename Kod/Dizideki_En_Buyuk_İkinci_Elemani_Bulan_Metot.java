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
public class Dizideki_En_Buyuk_İkinci_Elemani_Bulan_Metot {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int list[]=new int[5];
        int m;
        
        for (int i = 0; i < list.length; i++) {
            System.out.println((i+1)+". Elemani Giriniz");
            list[i]=k.nextInt();
        }
        
        m=ikinci(list);
        
        System.out.println("En Buyuk 2. Eleman="+m);
    }
    
    public static int ikinci(int a[]) {
        int enb=a[0];
        int enb2=a[0];
        
        for (int i = 0; i < a.length; i++) {
            
            if(a[i]>enb){
                enb=a[i];
            }
            
        }
        
        for (int i = 0; i < a.length; i++) {
            
            if(enb>a[i] && a[i]>enb2){
                enb2=a[i];
            }
        }
        
        return enb2;
    }
}
