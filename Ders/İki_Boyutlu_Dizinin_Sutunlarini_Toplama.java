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
public class İki_Boyutlu_Dizinin_Sutunlarini_Toplama {
    //2 boyutlu a dizisinin sutunlarini toplayıp yeni elemana yazdıran//
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int list[][]=new int [3][4];
        int toplam[][]=new int [3][4];
        int top=0;
        int temp=0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println((i+1)+". Satirin "+(j+1)+". Sutununu Giriniz");
                list[i][j]=k.nextInt();
            }
        }
        
        for (int l = 0; l < 4; l++) {
            for (int m = 0; m < 3; m++) {
                top+=list[m][l];
            }
            System.out.println((l+1)+". Sutundakilerin Toplami="+top);
            top=0;
        }
        
        
    }
}
