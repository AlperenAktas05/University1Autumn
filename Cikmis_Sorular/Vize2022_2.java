/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cikmis_Sorular;

/**
 *
 * @author Alperen
 */
public class Vize2022_2 {
    public static void main(String[] args) {
        //200+1/3+2/7+3/11... diye giden 30. eleman 
        
        double i,toplam=200;
        
        for(i=1;i<=49;i++){
            toplam=toplam+(i/(4*i-1));
            
            if(i==29){
                System.out.println("30. Eleman="+(i/(4*i-1)));
            }
        }
        System.out.println("Sonuc="+toplam);
    }
}
