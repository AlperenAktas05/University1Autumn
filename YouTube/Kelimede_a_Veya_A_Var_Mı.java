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
public class Kelimede_a_Veya_A_Var_Mı {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        char harf;
        
        System.out.println("Lutfen Bir Harf Giriniz");
        harf=k.next().charAt(0);
        
        if(harf=='a'){
            System.out.println("Harfiniz a");
        }
        
        else if(harf=='A'){
            System.out.println("Harfiniz A");
        }
        
        else{
            System.out.println("Harfiniz a veya A degil");
        }
        
        
    }
}
