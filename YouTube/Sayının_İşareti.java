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
public class Sayının_İşareti {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int sayi;
        
        System.out.println("Lutfen sayi girin");
        sayi=k.nextInt();
        
        if(sayi>0){
            System.out.println("Sayinin isareti +");
        }
        
        else if(sayi==0){
            System.out.println("Sayi nötr");
        }
        
        else{
            System.out.println("Sayinin isareti -");
        }
    }
}
