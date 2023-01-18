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
public class Klavyeden_Girilen_10_İsmi_Yazma {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String ad;
        int i;
        
        for(i=1;i<=10;i++){
            System.out.println("Lutfen Adinizi Giriniz");
            ad=k.nextLine();
            
            System.out.println("Adiniz:"+ad);
        }
    }
}
