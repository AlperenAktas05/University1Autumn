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
public class Kelimeyi_Tersten_Yazma {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String kelime;
        int i;
        
        System.out.println("Bir Kelime Giriniz");
        kelime=k.nextLine();
        
        for(i=kelime.length()-1;i>=0;i--){
            System.out.print(kelime.charAt(i));
        }
    }
}
