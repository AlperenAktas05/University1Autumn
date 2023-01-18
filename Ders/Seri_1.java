/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ders;

/**
 *
 * @author Alperen
 */
public class Seri_1 {
    public static void main(String[] args) {
        
        double c=1;
        double t=1;
        double i;
        double n;
        
        for(i=2;i<=10;i++){
            t=t+(i/(i+1));
        }
        
        System.out.println("10 Eleman Toplamı="+t);
        
        for(n=2;n<=5;n++){
            c=c*(n/(n+1));
        }
        
        System.out.println("5 Eleman Carpim="+c);
        
        
    }
}
