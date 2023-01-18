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
public class Ortalama_Hesaplama {
    public static void main(String[] args) {
        
        int sayi;
        int top;
        int sayac;
        int i;
        double ort;
        
        Scanner oku=new Scanner(System.in);
        
        top=0;
        sayac=0;
        
        for(i=1;i<=5;i++){
            System.out.println("Lutfen Sayiyi Girin");
            sayi=oku.nextInt();
            
            if(sayi>0){
                top=top+sayi;
                sayac=sayac+1;
            }
        }
        
        ort=top/sayac;
        
        System.out.println("Sayıların Ortalaması= "+ort);
    }
}
