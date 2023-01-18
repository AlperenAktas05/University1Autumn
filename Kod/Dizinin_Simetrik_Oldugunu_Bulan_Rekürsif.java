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
public class Dizinin_Simetrik_Oldugunu_Bulan_Rekürsif {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int list[]=new int [5];
        boolean m;
        
        for (int i = 0; i < list.length; i++) {
            System.out.println((i+1)+". Elemani Giriniz");
            list[i]=k.nextInt();
        }
        
        m=simetri(list,0,list.length-1);
        System.out.println(m);
    }
    
    public static boolean simetri(int a[],int dur,int son) {
        
        if(dur==a.length){
            return false;
        }
        
        else if(dur<son && a[dur]==a[son]){
            return true;
        }
        
        else{
            return simetri(a,dur+1,son-1);
        }
    }
}
