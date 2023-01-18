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
public class Stringte_a_Harfini_Bulan_Metot {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String kelime;
        
        System.out.println("Kelime Giriniz");
        kelime=k.next();
        
        a(kelime);
    }
    
    public static void a(String kelime) {
        
        boolean kontrol=false;
        
        for (int i = 0; i < kelime.length(); i++) {
            
            if(kelime.charAt(i)=='a'){
                kontrol=true;
            }
        }
        
        if(kontrol==true){
            System.out.println("Kelimenizde a Harfi Var");
        }
        
        else if(kontrol==false){
            System.out.println("Kelimenizde a Harfi Yok");
        }
    }
}
