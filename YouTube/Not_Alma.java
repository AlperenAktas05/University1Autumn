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
public class Not_Alma {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int not;
        
        System.out.println("Lutfen notunuzu giriniz");
        not=k.nextInt();
        
        if(not<0 || not>100){
            System.out.println("Lutfen 0-100 arasi bir not giriniz");
            System.exit(0);
        }
        
        if(not>85){
            System.out.println("Notunuz A");
        }
        
        else if(not<85 && not>70){
            System.out.println("Notunuz B");
        }
        
        else if(not<70 && not>50){
            System.out.println("Notunuz C");
        }
        
        else if(not<50){
            System.out.println("Kaldiniz. Notunuz F");
        }
    }
}
