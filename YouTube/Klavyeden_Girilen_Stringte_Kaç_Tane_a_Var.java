/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package YouTube;

import java.util.Scanner;

/**
 *
 * @author Alperen
 */
public class Klavyeden_Girilen_Stringte_Kaç_Tane_a_Var {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String kelime;
        int i;
        int sayac=0;
        
        System.out.println("Lutfen Bir Kelime Giriniz");
        kelime=k.nextLine();
        
        for(i=0;i<=kelime.length()-1;i++){
            
            if(kelime.charAt(i)=='a' || kelime.charAt(i)=='A'){
                sayac=sayac+1;
            }
        }
        
        System.out.println("Kelimede "+sayac+" tane a var");
    }
}
