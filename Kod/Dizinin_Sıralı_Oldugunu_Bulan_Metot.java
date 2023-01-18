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
public class Dizinin_Sıralı_Oldugunu_Bulan_Metot {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int list[]=new int[5];
        int m;
        
        for (int i = 0; i < list.length; i++) {
            System.out.println((i+1)+". Elemani Giriniz");
            list[i]=k.nextInt();
        }
        
        kontrol(list);
        
    }
    
    public static void kontrol(int a[]) {
        boolean kontrol=true;
        
        for (int i = 0; i < a.length-1; i++) {
            if(a[i]>=a[i+1]){
                kontrol=false;
            }
        }
        
        if(kontrol==true){
            System.out.println("Dizi Siralidir");
        }
        
        if(kontrol==false){
            System.out.println("Dizi Sirali Degildir");
        }
    }
}
