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
public class Diziyi_Kucukten_Buyuge_Siralama {
    public static void main(String[] args) {
        
        int list[]={6,5,4,1,2,3};
        int m[]=new int [list.length];
        
        m=siralama(list);
        for (int i = 0; i <m.length ; i++) {
            System.out.println(m[i]);
        }
    }
    
    public static int[] siralama(int a[]) {
        int temp;
        
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j< a.length-1-i; j++) {
                
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        
        return a;
    }
}
