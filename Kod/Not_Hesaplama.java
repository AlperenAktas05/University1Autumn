/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kod;

import java.util.Scanner;

/**
 *
 * @author Alperen Aktaş
 */
public class Not_Hesaplama {
    public static void main(String[] args) {
        
        int v;
        int f;
        double ort;
        int i;
        double s_ort;
        double top;
        int sayac;
             
        Scanner oku= new Scanner(System.in);
        
        top=0;
        sayac=0;
        
        for(i=0;i<5;i++){
            
        System.out.print("Vize notunu girin:");
        v= oku.nextInt();
        
        System.out.print("Final notunu girin:");
        f= oku.nextInt();
        
        ort = ((v*4/10)+(f*6/10));
        
        System.out.println("Ortalamanız="+ort);
        
        if(f<50) {
            System.out.println("Notunuz FF-Kaldiniz");   
        }   
        
        else if(ort<50) {
            System.out.println("Notunuz FF-Kaldiniz");
        }
        
        else if(50<=ort&&ort<70){
            System.out.println("Notunuz CC-Gectiniz");
        }
        
        else if(70<=ort&&ort<85){
            System.out.println("Notunuz BB-Gectiniz");
        }
        
        else if(85<=ort&&ort<100){
            System.out.println("Notunuz AA-Gectiniz");
        }
        
        top=top+ort;
        sayac=sayac+1;
       }
        
        s_ort=top/sayac;
        System.out.println("Sinif Ortalamasi= "+s_ort);
    }
}