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
public class Dizideki_Pozitif_Elemanlari_Bulan_Rekürsif {
    //kendisine parametre olarak gelen 10 elemanlı tam sayı dizisindeki pozitif sayıların adedini //
    public static void main(String[] args) {
        
        int list[]={1,-2,3,-4,5,-6,7,-8,9,-10};
        int m;
        
        m=pozitif(list,0);
        System.out.println("Pozitif Sayilarin Toplami="+m);
    }
    
    public static int pozitif(int a[], int b) {
        
        if(b==a.length){
            return 0;
        }
        
        else if(a[b]>0){
            return a[b]+pozitif(a,b+1);
        }
        
        else{
            return pozitif(a,b+1);
        }
        
    }
}
