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
public class En_Buyuk_Tek_Eleman {
    public static void main(String[] args) {
        //en buyuk tek eleman nedir//
        Scanner k=new Scanner(System.in);
        
        int list[]=new int[5];
        int enb;
        
        for (int i = 0; i < list.length; i++) {
            System.out.println((i+1)+". Elemani Giriniz");
            list[i]=k.nextInt();
        }
        
        
        enb=list[0];
        
        for (int i = 0; i < list.length; i++) {
            
            if(list[i]%2==1 || list[i]%2==-1){
                enb=list[i];
            }
        }
        
        for (int i = 0; i < list.length; i++) {
            
            if(list[i]%2==1 || list[i]%2==-1 && list[i]>enb){
                enb=list[i];
            }
        }
        
        System.out.println("En Buyuk Tek Eleman="+enb);
    }
}
