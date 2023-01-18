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
public class Fibonacci_Elemanini_Veren_Metot {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int n,m;
        
        System.out.println("Kacıncı Elemani Istiyorsun?");
        n=k.nextInt();
        
        m=eleman(n);
        
        System.out.println("Sonuc="+m);
    }
    
    public static int eleman(int a) {
        int e=3;
        int b=1;
        int c=1;
        int d=b+c;
        
        for (;;) {
            b=c;
            c=d;
            d=b+c;
            e++;
            
            if(e==a){
                break;
            }
        }
        
        return d;
            
    }
}
