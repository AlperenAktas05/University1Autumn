/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cikmis_Sorular;

/**
 *
 * @author Alperen
 */
public class Final2023_2 {
    public static void main(String[] args) {
        
        int t=0,c=1;
        
        for (int j = 1; j <=3; j++) {
            for (int k = 1; k <=3; k++) {
                c*=(f1(1+j,f2(k)))/(Math.cos(k));
            }
            t+=c;
            c=1;
        }
        
        System.out.println(t);
    }
    
    public static int f1(int a, int b) {
        int s1=1;
        
        for (int i = 1; i <= b; i++) {
            s1*=a;
        }
        
        return s1;
    }
    
    public static int f2(int c) {
        int s2=1;
        
        for (int i = 1; i <= c; i++) {
            s2*=i;
        }
        
        return s2;
    }
}
