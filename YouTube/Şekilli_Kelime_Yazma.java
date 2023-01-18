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
public class Şekilli_Kelime_Yazma {
    //klavyeden girilen stringi şekilli yazan program//
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String kelime;
        int i, j;
        
        System.out.print("Lufen Bir Kelime Giriniz:");
        kelime=k.nextLine();
        
        for(i=1;i<=kelime.length();i++){
            System.out.println(kelime.substring(0, i));
        }
        
        for(j=kelime.length()-1;j>=1;j--){
            System.out.println(kelime.substring(0, j));
        }
    }    
}    