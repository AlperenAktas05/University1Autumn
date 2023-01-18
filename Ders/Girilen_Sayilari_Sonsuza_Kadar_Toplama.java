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
public class Girilen_Sayilari_Sonsuza_Kadar_Toplama {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int sayi;
        int toplam=0;
        
        for(;;){
            System.out.println("Sayi Giriniz");
            sayi=k.nextInt();
            
            if(sayi==0){
                break;
            }
            
            toplam=toplam+sayi;
        }
        System.out.println("Sayilarin Toplami= "+toplam);  
    }
}
