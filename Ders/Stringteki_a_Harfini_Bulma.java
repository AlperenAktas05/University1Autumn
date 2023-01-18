/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ders;

import java.util.Scanner;

/**
 *
 * @author Alperen
 */
public class Stringteki_a_Harfini_Bulma {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String kelime;
        int i;
        
        System.out.print("Kelime Giriniz:");
        kelime=k.nextLine();
        
        for(i=0;i<=kelime.length()-1;i++){
            
            if(kelime.charAt(i)=='a'){
                System.out.println(i+1);
            }
          
        }
        
        
        
        
        
        
        
    }
}
