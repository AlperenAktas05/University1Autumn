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
public class Sayinin_Basamak_Sayisini_Bulan_Rekürsif {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int sayi,m;
        
        System.out.println("Sayi Giriniz");
        sayi=k.nextInt();
        
        m=basamak(sayi);
        System.out.println("Sayiniz "+m+" Basamaklidir");
    }
    
    public static int basamak(int a) {
        
        if(a<10){
            return 1;
        }
        
        else{
            return 1+basamak(a/10);
        }
    }
}
