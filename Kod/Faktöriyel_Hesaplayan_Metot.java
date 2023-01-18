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
public class Faktöriyel_Hesaplayan_Metot {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int sayi,m;
        
        System.out.println("Sayi Giriniz");
        sayi=k.nextInt();
        
        m=faktoriyel(sayi);
        
        System.out.println("Sayinizin Faktoriyeli="+m);
    }
    
    public static int faktoriyel(int a) {
        int f=1;
        
        for (int i = 1; i <= a; i++) {
            f=f*i;
        }
        
        return f;
    }
}
