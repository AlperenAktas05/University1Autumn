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
public class Dizinin_Sıralı_Oldugunu_Bulan_Rekürsif {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int list[]=new int[5];
        boolean m;
        
        for (int i = 0; i < list.length; i++) {
            System.out.println((i+1)+". Elemani Giriniz");
            list[i]=k.nextInt();
        }
        
        m=sira(list,0);
        System.out.println(m);
    }
    
    public static boolean sira(int a[],int dur) {
        
        if(dur==a.length-1){
            return false;
        }
        
        else if(a[dur]<a[dur+1]){
            return true;
        }
        
        else{
            return sira(a,dur+1);
        }
    }
}
