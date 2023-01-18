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
public class Girilen_Sayi_Integer_Mı {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int sayi;
        
        System.out.println("Maksimum int degeri="+Integer.MAX_VALUE);
        System.out.println("Minimum int degeri="+Integer.MIN_VALUE);
        
        System.out.println("Lutfen Sayi Girin");
        sayi=k.nextInt();
        
        if(sayi<Integer.MIN_VALUE || sayi>Integer.MAX_VALUE){
            System.out.println("Girilen Sayi int Degil");
        }
        
        
    }
}
