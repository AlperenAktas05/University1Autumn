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
public class Klavyeden_Girilen_5_Stringi_Diziye_Atama {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String list[]=new String[5];
        
        for (int i = 0; i < list.length; i++) {
            System.out.println((i+1)+". Elemani Giriniz");
            list[i]=k.next();
        }
        
        for (int i = 0; i < list.length; i++) {
            System.out.println((i+1)+". Eleman="+list[i]);
        }
    }
}
