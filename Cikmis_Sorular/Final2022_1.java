/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cikmis_Sorular;

/**
 *
 * @author Alperen
 */
public class Final2022_1 {
    public static void main(String[] args) {
        
        int list[]={24,2,4,6,-1,-3};
        int enb = 0;
        
        for (int i = 0; i < list.length; i++) {
            
            if(list[i]%2==1 || list[i]%2==-1){
                enb=list[i];
            }
        }
        
        for (int i = 0; i < list.length; i++) {
            
            if(list[i]%2==1 || list[i]%2==-1 && list[i]>enb){
                enb=list[i];
            }
        }
        
        System.out.println("En Buyuk Tek Sayi="+enb);
    }
}
