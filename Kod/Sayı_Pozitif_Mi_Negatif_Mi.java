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
public class Sayı_Pozitif_Mi_Negatif_Mi {
    public static void main(String[] args) {
        
        int a;
        
        Scanner oku= new Scanner(System.in);
        
        System.out.println("Lütfen Sayi Girin");
        a=oku.nextInt();
        
        if (a<0) {
            System.out.println("Sayi Negatif");
        }
        
        else if(a>0) {
            System.out.println("Sayi Pozitif");
        }
        
        else {
            System.out.println("Sayi Notr");        
    }
          
    }
}
