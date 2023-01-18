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
public class Dizideki_En_Uzun_Stringi_Bulan_Metot {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String list[]=new String[5];
        int m;
        
        for (int i = 0; i < list.length; i++) {
            System.out.println((i+1)+". Elemani Giriniz");
            list[i]=k.next();
        }
        
        m=indis(list);
        
        System.out.println("En Buyuk Kelimenin Oldugu Indis="+m);
    }
    
    public static int indis(String a[]) {
        String enbk=a[0];
        int indis=0;
        
        for (int i = 0; i < a.length; i++) {
            
            if(a[i].length()>enbk.length()){
                enbk=a[i];
                indis=i+1;
            }
        }
        
        return indis;
    }
}
