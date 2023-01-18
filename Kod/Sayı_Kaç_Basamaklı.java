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
public class Sayı_Kaç_Basamaklı {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        double sayi;
        int basamak=1;
        int i, j;
        String basamak2;
        
        System.out.println("Lutfen Sayi Giriniz");
        sayi=k.nextInt();       
        
        while(sayi>10 || sayi==10){
            sayi=sayi/10;
            basamak=basamak+1;
        }
        
        System.out.println("Sayınız "+basamak+" Basamaklı");
        
        System.out.println("Lutfen Sayiyi Tekrar Giriniz");
        basamak2=k.next();
        
        for(i=1;i<=basamak;i++){
            System.out.println(i+"'ler Basamagı="+basamak2.charAt(basamak-i));
        }
    }
}
