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
public class Sayinin_Kaç_Basamakli_Oldugunu_Bulan_Rekürsif {
    //kendisine parametre olarak gelen sayinin kaç basamakli oldugunu hesaplayan
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        System.out.println("Sayi Giriniz");
        int sayi=k.nextInt();
        
        int m=basamak(sayi);
        System.out.println(m);
    }
    
    public static int basamak(int a) {
        
        if(a<10){
            return 1;
        }
        
        else{
            return 1+(basamak(a/10));
        }
    }
}
