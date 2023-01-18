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
public class Sayıları_Harfle_Yazma {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int sayi;
        
        System.out.println("Lutfen 1-4 Arasi Sayi Girin");
        sayi=k.nextInt();
        
        if(sayi<1 || sayi>4){
            System.out.println("Lutfen gecerli sayi girin");
            System.exit(0);
        }
        
        switch(sayi){
            case 1:System.out.println("Bir"); break;
            case 2:System.out.println("Iki"); break;
            case 3:System.out.println("Uc"); break;
            case 4:System.out.println("Dort"); break;
        } 
    }
}
