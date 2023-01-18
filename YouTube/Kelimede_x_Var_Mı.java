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
public class Kelimede_x_Var_Mı {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String kelime;
        int i;
        int sayac=0;
        
        System.out.println("Lutfen Bir Kelime Giriniz");
        kelime=k.nextLine();
        
        for(i=0;i<=kelime.length()-1;i++){
            
            if(kelime.charAt(i)=='x' || kelime.charAt(i)=='X'){
                sayac=sayac+1;
            }
        }
        
        if(sayac==0){
            System.out.println("Kelimede x veya X yok");
        }
        
        else{
            System.out.println("Kelimede x veya X var ve "+sayac+" tane");
        }
    }
}
