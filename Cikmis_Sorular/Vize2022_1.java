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
public class Vize2022_1 {
    public static void main(String[] args) {
        //iki sayı arasındaki 1 basamaklı 2 basamaklı ve 3 basamaklıları toplayan
         Scanner k=new Scanner(System.in);
         
         int s1,s2,ttop=0,itop=0,utop=0,basamak=1,i,temp;
         
         System.out.println("Baslangıc Degeri Giriniz");
         s1=k.nextInt();
         
         System.out.println("Bitis Degeri Giriniz");
         s2=k.nextInt();
         
         if(s1<=0 || s2<=0){
             System.out.println("Lutfen Pozitif Sayi Giriniz");
             System.exit(1);
         }
         
         for(i=s1;i<=s2;i++){
            temp=i;
             while(i>10 || i==10){
                 i=i/10;
                 basamak++;
             }
             
             if(basamak==1){
                 ttop+=temp;
             }
             if(basamak==2){
                 itop+=temp;
             }
             if(basamak==3){
                 utop+=temp;
             }
             basamak=1;
         }
         
         System.out.println("Tek Basamaklilarin Toplami="+ttop);
         System.out.println("Iki Basamaklilarin Toplami="+itop);
         System.out.println("Uc Basamaklilarin Toplami="+utop);
         
    }
}
