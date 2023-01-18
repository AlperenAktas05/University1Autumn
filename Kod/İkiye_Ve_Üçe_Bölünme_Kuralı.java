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
public class İkiye_Ve_Üçe_Bölünme_Kuralı {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        //Sayi 2 ve 3'e bölünüyor mu?//
        
        int sayi= (int)(Math.random()*10);
        System.out.println(sayi);
        
        if(sayi%2==0){
            System.out.println("Sayi Ikiye Tam Bolunur Ve Cevap="+(sayi/2));
        }
        
        else{
            System.out.println("Sayi Ikiye Tam Bolunemez");
        }
        
        if(sayi%3==0){
            System.out.println("Sayi Uce Tam Bolunur Ve Cevap="+(sayi/3));
        }
        
        else{
            System.out.println("Sayi Uce Tam Bolunemez");
        }
        
        if(sayi%2==0 && sayi%3==0){
            System.out.println("Sayi Altiya Tam Bolunur Ve Cevap="+(sayi/6));
        }
        
    }
    
}
