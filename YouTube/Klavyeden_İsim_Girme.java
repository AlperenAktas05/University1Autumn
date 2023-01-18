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
public class Klavyeden_İsim_Girme {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String isim;
        
        System.out.println("Lutfen isminizi giriniz");
        isim=k.nextLine();
        
        System.out.println("Isminiz:"+isim);
    }
}
