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
public class Klavyeden_Girilen_3_Karakteri_Diziye_Atama {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        char list[]=new char[3];
        
        for (int i = 0; i < list.length; i++) {
            System.out.println((i+1)+". Elemani Giriniz");
            list[i]=k.next().charAt(0);
        }
        
        for (int i = 0; i < list.length; i++) {
            System.out.println((i+1)+". Eleman="+list[i]);
        }
        
    }
}
