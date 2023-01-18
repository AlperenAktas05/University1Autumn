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
public class Palindrom_Bulan_Metot {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String kelime;
        
        System.out.println("Kelime Giriniz");
        kelime=k.next();
        
        palindrom(kelime);
    }
    
    public static void palindrom(String kelime) {
        boolean kontrol=true;
        int bas=0;
        int son=kelime.length()-1;
        
        while(bas<son){
            
            if(kelime.charAt(bas)!=kelime.charAt(son)){
                kontrol=false;
                break;
            }
            
            bas++;
            son--;
        }
        
        if(kontrol==true){
            System.out.println("Kelime Palindromdur");
        }
        
        if(kontrol==false){
            System.out.println("Kelime Palindrom Degildir");
        }
        
    }
}
