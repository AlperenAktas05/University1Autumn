/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kod;

import java.util.Scanner;

/**
 *
 * @author Alperen Aktaş
 */
public class Hesap_Makinesi {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        
        int a,b;
        String c;
        
        System.out.println("İslem Giriniz");
        a=oku.nextInt();
        c=oku.next();
        b=oku.nextInt();
 
        
        switch(c){
            case "+":System.out.println("Toplam="+(a+b));
            break;
            case "-":System.out.println("Cikarim="+(a-b));
            break;
            case "*":System.out.println("Carpim="+(a*b));
            break;
            case "/":System.out.println("Bolum="+(a/b));
            break;
            
        }
        
    }
    
}
