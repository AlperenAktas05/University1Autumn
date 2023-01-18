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
public class Vize2018_5 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int list[]=new int [10];
        boolean kontrol = true;
        
        for (int i = 0; i < list.length; i++) {
            System.out.println((i+1)+". Elemani Giriniz");
            list[i]=k.nextInt();
        }
        
        for (int i = 0; i < list.length; i++) {
            
            for (int j = 2; j <list[i] ; j++) {
                if(list[i]%j==0){
                    kontrol=false;
                }
                
            }
            if(kontrol){
                System.out.println((i+1)+". Eleman Asal Sayidir");
            }
            
            else if(kontrol==false){
                System.out.print("");
            }
        }
    }
}
