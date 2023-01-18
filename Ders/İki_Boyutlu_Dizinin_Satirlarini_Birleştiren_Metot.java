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
public class İki_Boyutlu_Dizinin_Satirlarini_Birleştiren_Metot {
    //kendisine parametre olarak gelen 2 boyutlu stringin satirlarini birleştirip geri döndüren//
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        String list[][]=new String[2][2];
        String x[]=new String[2];
        
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                System.out.println((i+1)+". Satirin "+(j+1)+" Sutununu Giriniz");
                list[i][j]=k.next();
            }
        }
        
        x=birles(list);
        
        for (int i = 0; i < x.length; i++) {
            System.out.println((i+1)+". Satirin Toplami="+x[i]);
        }
    }
    
    public static String[] birles(String[][] a) {
        String []b=new String [2];
        
        for (int i = 0; i < a.length; i++) {
            b[i]="";
            for (int j = 0; j < a.length; j++) {
                b[i]+=a[i][j];
            }
        }
        
        return b;
    }
}
