/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ders;

/**
 *
 * @author Alperen
 */
public class Yüze_Kadar_Olan_Çift_Sayilarin_Ortalamasi {
    // 1le 100 arasındaki çift sayıların toplamı//
    public static void main(String[] args) {
        
        int i;
        double toplam=0;
        double sayac=0;
        double ort;
        
        for(i=1;i<100;i++){
            
            if(i%2==0){
                toplam=toplam+i;
                sayac=sayac+1;
            }
        }
        System.out.println(toplam);
        
        ort=toplam/sayac;
        System.out.println(ort);
        
        
    }
}
