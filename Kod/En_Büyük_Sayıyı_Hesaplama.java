/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Kod;

import java.util.Scanner;

/**
 *
 * @author Alperen Aktaş
 */
public class En_Büyük_Sayıyı_Hesaplama {

    public static void main(String[] args) {
        
        int s1;
        int s2;
        int s3;
        int enb;
        
        Scanner oku= new Scanner(System.in);
        System.out.println("Birinci sayiyi girin");
        s1=oku.nextInt();
        System.out.println("İkinci Sayiyi Girin");
        s2=oku.nextInt();
        System.out.println("Ucuncu Sayiyi Girin");
        s3=oku.nextInt();
        
        enb=s1;
        
        if (s2>enb) {
            enb=s2;
    }
        
        if (s3>enb) {
            enb=s3;
    }
        
        System.out.println("En buyuk sayi="+enb);
                  
            
            
    }
}
