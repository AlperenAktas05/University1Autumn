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
public class Stringteki_Rakamlarin_Toplami {
    //klavyeden girilen stringteki sayıların toplamını bul//
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int i;
        int toplam=0;
        String str;
        int sayac=0;
        
        System.out.println("Lutfen bir string girin");
        str=k.nextLine();
        
        for(i=0;i<str.length();i++){
            if(str.charAt(i)>='0' && str.charAt(i)<'9'){
                toplam=toplam+(str.charAt(i)-48);
            }
            
            if(str.charAt(i)>='0' && str.charAt(i)<'9' && str.charAt(i)%2==0){
                sayac=sayac+1;
            }
        }
        
        System.out.println("Toplam="+toplam);
        System.out.println("Cift Sayilarin Sayisi="+sayac);
    }
}