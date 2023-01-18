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
public class Dizideki_Tek_Elemanlarin_Ortalamasını_Bulan_Metot {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        double list[]=new double[10];
        double m;
        
        for (int i = 0; i <list.length ; i++) {
            System.out.println((i+1)+". Elemani Giriniz");
            list[i]=k.nextInt();
        }
        
        m=ort(list);
        System.out.println("Dizideki Tek Elemanlarin Ortalamasi="+m);
    }
    
    public static double ort(double a[]) {
        double top=0;
        double sayac=0;
        double ort;
        
        for (int i = 0; i < a.length; i++) {
            
            if(a[i]%2==1){
                top+=a[i];
                sayac++;
            }
        }
        
        ort=top/sayac;
        return ort;
    }
}
