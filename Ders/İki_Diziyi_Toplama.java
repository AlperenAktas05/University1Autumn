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
public class İki_Diziyi_Toplama {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int a[][]=new int [3][4];
        int b[][]=new int [3][4];
        int c[][]=new int [3][4];
        int enb;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("a Dizisinin "+(i+1)+". Satirinin "+(j+1)+". Sutununu Giriniz");
                a[i][j]=k.nextInt();
            }
        }
        
        enb=a[0][0];
        
        for (int l = 0; l < 3; l++) {
            for (int m = 0; m < 4; m++) {
                System.out.println("b Dizisinin "+(l+1)+". Satirinin "+(m+1)+". Sutununu Giriniz");
                b[l][m]=k.nextInt();
            }
        }
        
        for (int n = 0; n < 3; n++) {
            for (int o = 0; o < 4; o++) {
                c[n][o]=a[n][o]+b[n][o];
                System.out.println("c Dizisinin "+(n+1)+". Satirinin "+(o+1)+". Sutunu:"+c[n][o]);
            }
        }
        
        for (int p = 0; p < 3; p++) {
            for (int r = 0; r < 4; r++) {
                if(a[p][r]>enb){
                    enb=a[p][r];
                }
            }
        }
        System.out.println("a Dizisinin En Buyuk Elemani="+enb);
    }
}
