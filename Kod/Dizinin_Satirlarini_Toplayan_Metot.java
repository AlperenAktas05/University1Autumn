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
public class Dizinin_Satirlarini_Toplayan_Metot {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        
        System.out.println("Diziniz Kac Satirdan Olusacak?");
        int satir=k.nextInt();
        
        System.out.println("Diziniz Kac Sutundan Olusacak?");
        int sutun=k.nextInt();
        
        int list[][]=new int[satir][sutun];
        int m;
        int m2[]=new int[2];
        int m3[]=new int[satir];
        
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                System.out.println((i+1)+". Satirin "+(j+1)+". Sutununu Giriniz");
                list[i][j]=k.nextInt();
            }
        }
        
        m=buyuk(list);  
        System.out.println("Dizinin En Buyuk Elemani="+m);
        
        m2=indis(list);
        System.out.println("Dizinin En Buyuk Elemaninin Satiri "+(m2[0]+1)+" Sutunu "+(m2[1]+1)+"'dir");
        
        m3=toplam(list);
        for (int i = 0; i < m3.length; i++) {
            System.out.println((i+1)+". Satirin Elemanlari Toplami="+m3[i]);
        }
    }
    
    public static int buyuk(int a[][]) {
        int enb=a[0][0];
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                
                if(a[i][j]>enb){
                    enb=a[i][j];
                }
            }
        }
        
        return enb;
    }
    
    public static int[] indis(int a[][]) {
        int enb=a[0][0];
        int indis[]=new int[2];
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                
                if(a[i][j]>enb){
                    enb=a[i][j];
                    indis[0]=i;
                    indis[1]=j;
                }
            }
        }
        
        return indis;
    }
    
    public static int[] toplam(int a[][]) {
        int satir[]=new int [a.length];
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                satir[i]=satir[i]+a[i][j];
                
            }
        }
        
        return satir;
        
    }
}
