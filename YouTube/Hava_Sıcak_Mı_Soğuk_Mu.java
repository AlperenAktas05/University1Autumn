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
public class Hava_Sıcak_Mı_Soğuk_Mu {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int sicaklik;
        
        System.out.println("Lutfen sicakligi yaziniz");
        sicaklik=k.nextInt();
        
        if(sicaklik>=20){
            System.out.println("Hava Sicak");
        }
        
        else if(sicaklik<20 && sicaklik>=10){
            System.out.println("Hava Serin");
        }
        
        else if(sicaklik<=10 && sicaklik>=0){
            System.out.println("Hava Soguk");
        }
        
        else{
            System.out.println("Hava Buz Gibi");
        }
    }
}
