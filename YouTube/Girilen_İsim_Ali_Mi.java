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
public class Girilen_İsim_Ali_Mi {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String isim;
        
        System.out.println("Lutfen isim girin");
        isim=k.nextLine();
        
        if(isim.charAt(0)=='a' || isim.charAt(0)=='A' && isim.charAt(1)=='l' && isim.charAt(2)=='i'){
            System.out.println("Isminiz ali");
        }
        
        else{
            System.out.println("Isminiz ali degil");
        }
    }
}
