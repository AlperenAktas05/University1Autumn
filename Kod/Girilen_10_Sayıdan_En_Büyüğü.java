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
public class Girilen_10_Sayıdan_En_Büyüğü {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int sayi;
        int enb;
        int i;
        
        System.out.println("Lutfen Sayilar Giriniz");
        sayi=k.nextInt();
        
        enb=sayi;
        
        for(i=1;i<=9;i++){
            sayi=k.nextInt();
            
            if(sayi>enb){
                enb=sayi;
            }
        }
        
        System.out.println("En Buyuk Sayi "+enb);
    }
}
