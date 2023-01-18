package Kod;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alperen
 */
public class Fibonacci_Dizisi {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        
        long a=1;
        long b=1;
        long c;
        int i;
        
        c=a+b;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        for(i=0;i<50;i++){
            a=b;
            b=c;
            c=a+b;
            
            System.out.println(c);
        }    
    }
}
