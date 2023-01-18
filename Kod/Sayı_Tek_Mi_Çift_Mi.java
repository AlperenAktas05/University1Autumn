/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kod;

import java.util.Scanner;

/**
 *
 * @author Alperen Aktaş
 */
public class Sayı_Tek_Mi_Çift_Mi {
    public static void main(String[] args) {
        
        int sayi;
        
        Scanner oku= new Scanner(System.in);
        
        System.out.println("Lutfen Sayiyi Girin");
        sayi=oku.nextInt();
        
        if(sayi%2==0){
            System.out.println("Sayi Cift");
        }
        
        else{
            System.out.println("Sayi Tek");
        }

        
    }
}
