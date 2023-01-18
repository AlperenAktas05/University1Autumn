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
public class Girilen_Sayilar_Bese_Esit_Mi {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int sayi;
        int i;
        
        for(i=1;i<=10;i++){
            System.out.println("Lutfen "+i+". Sayiyi Giriniz");
            sayi=k.nextInt();
            
            if(sayi==5){
                System.out.println(i+". Sayi Bese Esit");
            }
        }
    }
}
