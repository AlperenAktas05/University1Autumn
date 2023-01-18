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
public class Quiz_2 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int i, sayac=0;
        String kelime;
        char j;
        
        System.out.println("Lutfen Bir Kelime Girin");
        kelime=k.nextLine();
        
        for(i=0;i<=kelime.length()-1;i++){
            for(j='a';j<='z';j++){
            
                if(kelime.charAt(i)==j){
                sayac=sayac+1;
                }
                
            }  
        }
        System.out.println("Kucuk Harflerin Sayisi="+sayac); 
    }
}
