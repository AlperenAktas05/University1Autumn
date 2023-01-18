/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kod;

import java.util.Scanner;

/**
 *
 * @author Alperen Aktaş
 */
public class Adını_10_Kere_Yazma {
    public static void main(String[] args) {
        
        String ad;
        int i;
        
        Scanner oku=new Scanner(System.in);
        
        System.out.println("Adınızı Girin");
        ad=oku.nextLine();
        
        for(i=1;i<=10;i++){
            System.out.println(ad);
        }
        
                
                
    }
}
