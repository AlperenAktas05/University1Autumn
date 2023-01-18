/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ders;

/**
 *
 * @author Alperen
 */
public class Asal_Sayi_Bulma {
    //0-100 arası asal sayıları yazdır//
    public static void main(String[] args) {
        
        int i;
        boolean asal=true;
        
        for(i=2;i<=100;i++){
            asal=true;
            for (int j = 2; j<i; j++) {
                if(i%j==0){
                    asal=false;
                    break;
                }               
            }
            if(asal){
                System.out.println("Asal Sayi="+i);
            }

        }
    }
}
