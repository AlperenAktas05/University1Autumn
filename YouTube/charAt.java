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
public class charAt {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String kelime;
        char a;
        
        System.out.println("Lutfen kelime giriniz");
        kelime=k.nextLine();
        
        a=kelime.charAt(0);
        
        System.out.println("Kelimenizin bas harfi:"+a);
    }
}
