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
public class Palindrom_Bulan_Metot {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        String kelime1=k.next();
        System.out.println(polindrom(kelime1));
    }
    
    public static boolean polindrom(String kelime){
        boolean kontrol=true;
        int low=0;
        int high=kelime.length()-1;
        
        while(low<high){
            if(kelime.charAt(low)!=kelime.charAt(high)){
                kontrol=false;
                break;
            }
            low++;
            high--;
        }
        return kontrol;
    }
}
