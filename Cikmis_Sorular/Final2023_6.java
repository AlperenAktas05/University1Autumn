/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cikmis_Sorular;

import java.util.Scanner;

/**
 *
 * @author Alperen
 */
public class Final2023_6 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        String s,m;
        
        System.out.println("String Giriniz");
        s=k.nextLine();
        
        m=bosluksuz(s,0);
        System.out.println(m);
    }
    
    public static String bosluksuz(String a, int b) {
        
        if(b==a.length()){
            return "";
        }
        
        else if(a.charAt(b)==' '){
            return bosluksuz(a,b+1);
        }
        
        else{
            return a.charAt(b)+bosluksuz(a,b+1);
        }
    }
}
