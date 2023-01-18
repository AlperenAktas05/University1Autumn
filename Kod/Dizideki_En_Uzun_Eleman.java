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
public class Dizideki_En_Uzun_Eleman {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String []list=new String [10];
        int enb;
        String enbe;
        int i;
        
        System.out.println("1. Elemani Giriniz");
        list[0]=k.next();
        
        enb=list[0].length();
        enbe=list[0];
        
        for(i=1;i<list.length;i++){
            System.out.println((i+1)+". Elemani Giriniz");
            list[i]=k.next();
            
            if(list[i].length()>enb){
                enbe=list[i];
            }
        }
        
        System.out.println("Dizinin En Uzun Elemani:"+enbe);
    }
}
