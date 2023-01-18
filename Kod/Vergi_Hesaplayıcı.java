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
public class Vergi_Hesaplayıcı {
    public static void main(String[] args) {
        
        int urun;
        int vergi;
        
        Scanner oku=new Scanner(System.in);
        
        System.out.print("Urun Fiyatini Giriniz:");
        urun=oku.nextInt();
        
        vergi=urun+(urun*18/100);
        
        System.out.print("Urunun Satis Fiyati:"+vergi);
        
        
    }
}
