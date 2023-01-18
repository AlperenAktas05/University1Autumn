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
public class Stringte_b_Harfi_Var_Mi {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String kelime;
        int i;
        
        System.out.print("Bir Kelime Giriniz: ");
        kelime=k.nextLine();
        
        for(i=0;i<=kelime.length()-1;i++){
            if(kelime.charAt(i)=='b' || kelime.charAt(i)=='B'){
                System.out.println("Kelimede b veya B harfi vardir");
            }
            
            if(kelime.charAt(i)=='b'){
                System.out.println("b Bulunan Indisler="+(i+1));
            }
            
            if(kelime.charAt(i)=='B'){
                System.out.println("B Bulunan Indisler="+(i+1));
            }
            
        }
        
        
        
    }
}
