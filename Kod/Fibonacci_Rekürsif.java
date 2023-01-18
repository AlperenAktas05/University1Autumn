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
public class Fibonacci_Rekürsif {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int sayi;
        
        System.out.println("Sayi Giriniz");
        sayi=k.nextInt();
        
        int m=fibonacci(1,1,2,sayi);
        System.out.println(m);
    }
    
    public static int fibonacci(int a, int b, int c,int d) {
        
        if(d==0){
            return b-a;
        }
        
        else{
            return fibonacci(b,c,b+c,d-1);
        }
    }
}
