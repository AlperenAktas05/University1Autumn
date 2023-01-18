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
public class Asal_Sayi_Bulan_Metot {
    // kendisine parametre olarak gelen sayinin asal sayi olup olmadıgını bulan metod//
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        System.out.println("Sayi Giriniz");
        int sayi=k.nextInt();
        
        boolean x=asal(sayi);
        
        if(x){
            System.out.println("Sayi Asal");
        }
        
        else{
            System.out.println("Sayi Asal Degil");
        }
    }
    
    public static boolean asal(int a) {
        boolean kontrol=true;
        
        for (int i = 2; i < a; i++) {
            if(a%i==0){
                kontrol=false;
                break;
            }
        }
        
        return kontrol;
    }
}
