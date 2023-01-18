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
public class Girilen_Sayılardan_Çift_Olanları_Yazma {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int sayi;
        
        for(;;){
            System.out.println("Lutfen Bir Sayi Giriniz");
            sayi=k.nextInt();
            
            if(sayi%2==0){
                System.out.println("Sayi Çift");
            }
            
            else if(sayi%2!=0 && sayi!=9999){
                System.out.println("Sayi Çift Degil");
            }
            
            if(sayi==9999){
                System.out.println("Uygulama Kapatılıyor");
                break;
            }
        }
    }
}
