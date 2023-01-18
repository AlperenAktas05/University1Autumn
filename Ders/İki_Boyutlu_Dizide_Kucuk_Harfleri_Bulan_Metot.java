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
public class İki_Boyutlu_Dizide_Kucuk_Harfleri_Bulan_Metot {
    //kendisine parametre olarak gelen 2 boyutlu string dizisindeki küçük karakterleri geri döndüren//
    public static void main(String[] args) {
        
        String list[][]={{"aAB","cDE"},{"fG","hijkL"}};
        String m;
        
        m=kucuk(list);
        System.out.println(m);
    }
    
    public static String kucuk(String a[][]) {
        String bos="";
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length(); k++) {
                    if(a[i][j].charAt(k)>='a' && a[i][j].charAt(k)<='z'){
                        bos+=a[i][j].charAt(k);
                    }
                }  
            }
        }
        
        return bos;
    }
}
