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
public class Yüze_Kadar_Sayılardan_Tek_Olanları_Topla {
    public static void main(String[] args) {
        
        int i;
        int top=0;
        int adet;
        
        for(i=0,adet=0;adet<100;i++){
            
            if(i%2==1){
                System.out.println(i);
                top=top+i;
                adet++;
            }
        }
        
        System.out.println("Toplam="+top);
    }
}
