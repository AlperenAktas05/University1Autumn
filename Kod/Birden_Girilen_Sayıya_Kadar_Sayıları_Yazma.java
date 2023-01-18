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
public class Birden_Girilen_Sayıya_Kadar_Sayıları_Yazma {
    public static void main(String[] args) {
        Scanner oku= new Scanner(System.in);
        
        int sayi;
        int i;
        
        System.out.print("Lutfen Sayi Giriniz:");
        sayi=oku.nextInt();
        
        for(i=1;i<=sayi;i++){
            System.out.println(i);
        }
        
        if(sayi<1){
            System.out.println("Pozitif Sayi Girin");
            System.exit(0);
            }
    }
}
