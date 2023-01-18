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
public class Girilen_Sayiya_Kadar_Sayilari_Toplayan_Rekürsif {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int sayi,m;
        
        System.out.println("Sayi Giriniz");
        sayi=k.nextInt();
        
        m=top(sayi);
        System.out.println("Sayiya Kadar Olan Sayilarin Toplami="+m);
    }
    
    public static int top(int a) {
        
        if(a==0){
            return 0;
        }
        
        else{
            return a+top(a-1);
        }
    }
}
