/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ders;

/**
 *
 * @author Alperen
 */
public class Seri_4 {
    public static void main(String[] args) {
        
        double m;
        double k;
        double top=0;
        double carp=1;
        
        for(m=1;m<=3;m++){
            for(k=1;k<=4;k++){
               carp*=((Math.sin(m)*Math.cos(k)));
            }
            
            top=top+carp;
        }
        
        System.out.println("Sonuc="+top);
    }
}
