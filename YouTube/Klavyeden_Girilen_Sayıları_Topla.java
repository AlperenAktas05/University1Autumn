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
public class Klavyeden_Girilen_Sayıları_Topla {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int sayi;
        int top=0;
        
        for(;;){
            System.out.println("Lutfen Sayi Giriniz");
            sayi=k.nextInt();
            
            if(sayi!=-9999){
                top=top+sayi;
            }
            
            if(sayi==-9999){
                break;
            }
        }
        
        System.out.println("Toplam="+top);
    }
}
