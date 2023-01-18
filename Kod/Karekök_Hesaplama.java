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
public class Karekök_Hesaplama {
    public static void main(String[] args) {
        
        int sayi;
        double sonuc;
        
        Scanner oku=new Scanner(System.in);
        
        System.out.println("Lutfen Sayiyi Girin");
        sayi=oku.nextInt();
        
        sonuc=Math.sqrt(sayi);
        
        System.out.println("Sayinin Karekoku= "+sonuc);
        
    }
}
