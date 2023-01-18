/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kod;

/**
 *
 * @author Alperen
 */
public class Do_While_Döngüsü {
    public static void main(String[] args) {
        
        int sayac=0;
        
        do{
            sayac=sayac+1;
            
            if(sayac%2==0){
                System.out.println(sayac);
            }
        }while(sayac<=100);
    }
}
