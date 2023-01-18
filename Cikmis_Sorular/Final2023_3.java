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
public class Final2023_3 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String list[][]=new String [2][2];
        
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                list[i][j]=k.next();
            }
        }
        
        tek(list);
    }
    
    public static void tek(String[][] a) {
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j].length()==1){
                    System.out.println(a[i][j]);
                }
            }
        }
    }
}
