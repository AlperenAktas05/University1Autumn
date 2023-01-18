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
public class İki_Boyutlu_Dizide_En_Uzun_Stringin_Yerini_Bulan_Metot {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String list[][]=new String[3][3];
        String m;
        int m2[]=new int[2];
        
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                System.out.println((i+1)+". Satirin "+(j+1)+". Sutununu Giriniz");
                list[i][j]=k.next();
            }
        }
        
        m=uzun(list);
        System.out.println("En Uzun Eleman:"+m);
        
        m2=indis(list);
        System.out.println("En Uzun Elemanin Satiri "+(m2[0]+1)+" Sutunu "+(m2[1]+1)+"'dir");
    }
    
    public static String uzun(String a[][]) {
        String enbk=a[0][0];
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                
                if(a[i][j].length()>enbk.length()){
                    enbk=a[i][j];
                }
            }
        }
        
        return enbk;
    }
    
    public static int[] indis(String a[][]) {
        String enbk=a[0][0];
        int indis[]=new int[2];
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                
                if(a[i][j].length()>enbk.length()){
                    enbk=a[i][j];
                    indis[0]=i;
                    indis[1]=j;
                }
            }
        }
        
        return indis;
    }
}
