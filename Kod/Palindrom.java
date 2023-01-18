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
public class Palindrom {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String kelime;
        int bas=0;
        int son;
        boolean kontrol=true;
        
        System.out.println("Kelime Giriniz");
        kelime=k.nextLine();
        
        son=kelime.length()-1;
        
        while(bas<son){
            
            if(kelime.charAt(bas)!=kelime.charAt(son)){
                kontrol=false;
                break;
            }
            
            bas++;
            son--;
        }
        
        if(kontrol){
            System.out.println(kelime+" Bir Palindromdur.");
        }
        
        else{
            System.out.println(kelime+" Bir Palindrom Degildir.");
        }
        
    }
}
