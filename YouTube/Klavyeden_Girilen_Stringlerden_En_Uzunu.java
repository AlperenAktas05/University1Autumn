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
public class Klavyeden_Girilen_Stringlerden_En_Uzunu {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String kelime;
        int enb;
        String enbk;
            
            System.out.println("Lutfen Bir Kelime Giriniz");
            kelime=k.next();
            
            enb=kelime.length();
            enbk=kelime;
            
        for(;;){
            System.out.println("Lutfen Bir Kelime Giriniz");
            kelime=k.nextLine();
            
            if(kelime.length()>enb){
                enbk=kelime;
                enb=kelime.length();
            }
            
            if(kelime.equals("Exit")){
                break;
            }
        }
        
        System.out.println("En Uzun Kelime:"+enbk);
        System.out.println("En Uzun Kelimenin Sayisi:"+enb);
        
    }
}
