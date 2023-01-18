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
public class Dizideki_Stringlerin_Uzunluğunu_Başka_Diziye_Atama {
    //stringteki karakter sayısıyla yeni dizi yapma//
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String list[]=new String[5];
        int list2[]=new int[5];
        
        for (int i = 0; i < list.length; i++) {
            System.out.println((i+1)+". Elemani Giriniz");
            list[i]=k.next();
        }
        
        for (int j = 0; j < list2.length; j++) {
            list2[j]=list[j].length();
        }
        
        for (int l = 0; l < list2.length; l++) {
            System.out.println((l+1)+". Elemanin Karakter Sayisi="+list2[l]);
        }
    }
}
