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
public class Vize2018_4 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int list[][]=new int [5][5];
        
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                System.out.println((i+1)+". Sutunun "+(j+1)+". Satirini Giriniz");
                list[i][j]=k.nextInt();
            }
        }
        
        int enb=list[0][0];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                
                if(list[i][j]>enb){
                    enb=list[i][j];
                }
            }
            System.out.println((i+1)+". Sutunun En Buyuk Elemani="+enb);
        }
    }
}
