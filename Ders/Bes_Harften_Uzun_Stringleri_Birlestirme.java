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
public class Bes_Harften_Uzun_Stringleri_Birlestirme {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String s;
        String stoplam=" ";
        
        while(true){
            System.out.println("Isim Giriniz");
            s=k.next();
            
            if(s.equals("EXIT")==true){
                System.out.println(stoplam);
                break;
            }
            
            if(s.length()>5){
                stoplam+=s+" ";
                System.out.println(stoplam);
            }
        }
        
    }
}
