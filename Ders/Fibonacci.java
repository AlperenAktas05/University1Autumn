/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ders;

/**
 *
 * @author Alperen
 */
public class Fibonacci {
    public static void main(String[] args) {
        
        long a=1;
        long b=1;
        long c;
        int i;
        long top=4;
    
        c=a+b;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    
        for(i=0;i<=50;i++){
            a=b;
            b=c;
            c=a+b;
            
            System.out.println(c);
            top=top+c;
        }
        
        System.out.println("Toplam="+top);
    }

    
    
}
