/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kod;

/**
 *
 * @author Alperen
 */
public class Birden_Yüze_Kadar_Sayıların_Toplamı {
        public static void main(String[] args) {
        
        int top=0;
        int ort=0;
        int i;
        
        for(i=1;i<101;i++){
            top=top+i;  
            System.out.println(top);
        }
        
        ort=(top/100);
        
        System.out.print("Toplam=");
        System.out.println(top);
        System.out.print("Ortalama=");
        System.out.println(ort);
    }
}
