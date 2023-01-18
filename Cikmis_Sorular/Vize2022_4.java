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
public class Vize2022_4 {
    public static void main(String[] args) {
        //girilen stringleri birleştiren//
        Scanner k=new Scanner(System.in);
        
        String s,stop="";
        
        for(;;){
            System.out.println("Lutfen Bir Kelime Girin");
            s=k.next();
            
            if(s.equals("CIKIS")){
                break;
            }            
            
            stop=stop+s;
        }
        System.out.println("Sonuc:"+stop);
    }
}
