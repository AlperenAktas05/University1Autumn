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
public class Karakter_A_İle_E_Arasında_Mı {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        char harf;
        
        System.out.println("Lutfen Harf Giriniz");
        harf=k.next().charAt(0);
        
        if(harf=='a' || harf=='b' || harf=='c' || harf=='d' || harf=='e'){
            System.out.println("Harf a ile e arasında");
        }
        
        else{
            System.out.println("Harf a ile e arasında degil");
        }
    }
}
