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
public class Diziyi_Sağa_Döndürme {
    //bir diziyi 1 sağa döndürme//
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int []list=new int[10];
        int []list2=new int[10];
        
        for (int i = 0; i < list.length; i++) {
            System.out.println((i+1)+". Elemani Giriniz");
            list[i]=k.nextInt();
        }
        
        list2[0]=list[9];
        
        for (int j = 0; j < list2.length-2; j++) {
            list[j]=list2[j+1];
        }
        
        for (int l = 0; l < list2.length; l++) {
            System.out.println("Dizinin Sağa Donmus "+(l+1)+". Elemani="+list2[l]);
        }
        
    }
}
