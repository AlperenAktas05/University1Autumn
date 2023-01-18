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
public class Final2023_4 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int sayi,top=0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Sayi Giriniz");
            sayi=k.nextInt();
            
            top+=sayi;
            
            if(sayi==0){
                System.out.println(top);
            }
        }
    }
}
