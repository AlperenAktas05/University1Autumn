/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package YouTube;

import java.util.Scanner;

/**
 *
 * @author Alperen
 */
public class Dizide_Sozlukteki_İlk_String {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String list[]=new String [5];
        int i;
        
        for (i = 0; i < list.length; i++) {
            System.out.println((i+1)+". Elemani Giriniz");
            list[i]=k.next();
        }
        
            for (int l = 0; l < list.length; l++) {
                for (int j = 0; j < list[l].length(); j++) {
                
                    if((char)(list[l].charAt(0))>(char)(list[j].charAt(0))){
                        String temp=list[l];
                        list[l]=list[j];
                        list[j]=temp;
                    }
                }
            }
        
        for (int o = 0; o < list.length; i++) {
             System.out.println(list[i]);
        }
    }
}
