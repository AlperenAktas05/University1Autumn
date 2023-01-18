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
public class Dizideki_En_Buyuk_Elemani_Bulan_Rekürsif {
    //kendisine parametre olarak gelen dizideki en buyuk sayiyi bulan rekürsif//
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int list[]=new int[5];
        int m;
        
        for (int i = 0; i < list.length; i++) {
            System.out.println((i+1)+". Elemani Giriniz");
            list[i]=k.nextInt();
        }
        
        m=buyuk(list,0,0);
        System.out.println("En Buyuk Eleman="+m);
    }
    
    public static int buyuk(int a[],int dur,int enb) {
        
        if(dur==a.length){
            return a[enb];
        }
        
        else if(a[dur]>a[enb]){
            return buyuk(a,dur+1,dur);
        }
        
        else{
            return buyuk(a,dur+1,enb);
        }
    }
}
