/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ders;

/**
 *
 * @author Alperen
 */
public class Seri_8 {
    public static void main(String[] args) {
        
        double carp=1.0;
        double k;
        
        for(k=1.0;k<=5.0;k++){
            carp=carp*(k*Math.sin(k));
        }
        
        System.out.println(carp);
    }
}
