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
public class Sinifin_Not_Ortalamasini_Bulan_Metot {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int sayi;
        
        System.out.println("Sinif Kac Kisi?");
        sayi=k.nextInt();
        
        double v[]=new double[sayi];
        double f[]=new double[sayi];
        double m;
        
        for (int i = 0; i < v.length; i++) {
            System.out.println((i+1)+". Kisinin Vize Notu");
            v[i]=k.nextDouble();
        }
        
        for (int i = 0; i < f.length; i++) {
            System.out.println((i+1)+". Kisinin Final Notu");
            f[i]=k.nextDouble();
        }
        
        m=ort(v,f);
        
        System.out.println("Sinifin Ortalamasi="+m);
    }
    
    public static double ort(double a[], double b[]) {
        double ort[]=new double[a.length];
        double kisi=a.length;
        double top=0;
        double sonuc;
        
        for (int i = 0; i < a.length; i++) {
            ort[i]=(a[i]*0.4)+(b[i]*0.6);
        }
        
        for (int i = 0; i < ort.length; i++) {
            top+=ort[i];
        }
        
        sonuc=top/kisi;
        
        return sonuc;
    }
}
