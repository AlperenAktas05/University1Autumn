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
public class Dizideki_Pozitif_Eleman_Sayisini_Bulan_Rekürsif {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int list[]=new int[5];
        int m;
        
        for (int i = 0; i < list.length; i++) {
            System.out.println((i+1)+". Elemani Giriniz");
            list[i]=k.nextInt();
        }
        
        m=pozitif(list,0);
        System.out.println("Dizideki Pozitif Sayisi="+m);
    }
    
    public static int pozitif(int a[],int dur) {
        
        if(dur==a.length){
            return 0;
        }
        
        else if(a[dur]>0){
            return 1+pozitif(a,dur+1);
        }
        
        else{
            return pozitif(a,dur+1);
        }
    }
}
