/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package YouTube;

import java.util.Scanner;

/**
 *
 * @author Alperen
 */
public class Üslü_Sayi_Hesaplama {
    //klavyeden girilen a ve b yi a üzeri b olarak hesaplayan program//
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int a;
        int b;
        int sonuc=1;
        int i;
        
        System.out.print("Sayi Giriniz:");
        a=k.nextInt();
        
        System.out.print("Us Giriniz:");
        b=k.nextInt();
        
        for(i=1;i<=b;i++){
            sonuc=sonuc*a;
        }
        
        System.out.println("Sonuc="+sonuc);
    }
}
