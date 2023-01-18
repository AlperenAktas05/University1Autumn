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
public class Sayı_Pozitif_Mi {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int sayi;
        
        System.out.println("Lutfen sayi giriniz");
        sayi=k.nextInt();
        
        if(sayi>0){
            System.out.println("Sayi pozitif");
        }
        
        else{
            System.out.println("Sayi pozitif degil");
        }
    }
}
