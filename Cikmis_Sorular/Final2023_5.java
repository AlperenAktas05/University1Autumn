/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cikmis_Sorular;

import java.util.Scanner;

/**
 *
 * @author Alperen
 */
public class Final2023_5 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int list[]=new int [10];
        int sayi,enb,sayac=0;
        boolean kontrol=true;
        
        for (;;) {
            System.out.println("Sayi Giriniz");
            sayi=k.nextInt();
            
            for (int i = 2; i < sayi; i++) {
                if(sayi%i==0){
                    kontrol=false;
                    break;
                }
            }
            
            for (int i = 0; i < list.length; i++) {
                if(kontrol==true){
                    list[i]=sayi;
                    sayac++;
                }
            }
            
            kontrol=true;
            
            if(sayac==10){
                break;
            }
        }
        
        enb=list[0];
        
        for (int i = 0; i < list.length; i++) {
            if(list[i]>enb){
                enb=list[i];
            }
        }
        System.out.println(enb);
    }
}
