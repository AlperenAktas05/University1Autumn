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
public class Vize2018_1 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String list[][]=new String[3][4];
        
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.println((i+1)+". Satirin "+(j+1)+". Sutununu Giriniz");
                list[i][j]=k.next();
            }
        }
        
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {              
                if(list[i][j].charAt(0)>='0' && list[i][j].charAt(0)<='9'){
                    System.out.println((i+1)+". Satirin "+(j+1)+". Sutununda "+list[i][j]+" Rakamı Var");
                }
            }
        }
    }
}
