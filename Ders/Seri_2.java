/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ders;

/**
 *
 * @author Alperen
 */
public class Seri_2 {
    public static void main(String[] args) {
        
        double t=(-100+200);
        double i;
        double x;
        
        for(i=0,x=2;i<48;i++,x+=3){
            t=t+(x/(x+3));
        }
        
        System.out.println("Toplam= "+t);
        
    }
}
