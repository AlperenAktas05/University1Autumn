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
public class On_Tane_Kelime_Yazma {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String kelime;
        int i;
        
        for(i=1;i<=10;i++){
            System.out.print("Kelime Giriniz:");
            kelime=k.nextLine();
            System.out.println("Kelimeniz: "+kelime);
        }
    }
}
