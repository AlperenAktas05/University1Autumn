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
public class On_Tane_Bes_Girince_Duran_Dongu {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int sayi;
        int sayac=0;
        
        for(;;){
            System.out.println("Lutfen Sayi Giriniz");
            sayi=k.nextInt();
            
            if(sayi==5){
                sayac=sayac+1;
            }
            
            if(sayac==10){
                break;
            }
        }
        
        System.out.println("");
    }
}
