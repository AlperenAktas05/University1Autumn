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
public class Dizideki_En_Buyuk_Elemani_Bulan_Rekürsif {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int list[]={3,4,2,7,8,9,2};
        int m;
        
        m=indis(list,0,0);
        System.out.println("En Buyuk Eleman="+m);
    }
    
    public static int indis(int a[],int dur, int enb) {
        
        if(dur==a.length){
            return a[enb];
        }
        
        else if(a[enb]<a[dur]){
            return indis(a,dur+1,dur);
        }
        
        else{
            return indis(a,dur+1,enb);
        }
    }
}
