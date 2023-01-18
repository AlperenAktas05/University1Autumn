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
public class Sayı_Bulma_Oyunu {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int sayi= (int)(Math.random()*500);
        int i;
        int tahmin;
        
        System.out.println("10 Tahmin Hakkiniz Var");
        
        for(i=1;i<=10;i++){
            System.out.println("Bir Sayi Giriniz");
            tahmin=k.nextInt();
            
            if(tahmin<sayi){
                System.out.println("Sayi Daha Buyuk");
            }
            
            else if(tahmin>sayi){
                System.out.println("Sayi Daha Kucuk");
            }
            
            else{
                System.out.println("Kazandin");
                break;
            }
        }
    }
}
