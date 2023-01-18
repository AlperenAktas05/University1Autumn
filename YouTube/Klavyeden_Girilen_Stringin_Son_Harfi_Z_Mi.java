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
public class Klavyeden_Girilen_Stringin_Son_Harfi_Z_Mi {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String kelime;
        
        System.out.println("Lutfen Bir Kelime Giriniz");
        kelime=k.nextLine();
        
        if(kelime.charAt(kelime.length()-1)=='z' || kelime.charAt(kelime.length()-1)=='Z'){
            System.out.println("Kelimenizin son harfi z veya Z");
        }
        
        else{
            System.out.println("Kelimenizin son harfi z veya Z degil");
        }
    }
}
