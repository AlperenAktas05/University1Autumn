/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kod;

import java.util.Scanner;

/**
 *
 * @author Alperen Aktaş
 */
public class Girilen_10_Sayıdan_Tek_Olanları_Topla {
    public static void main(String[] args) {
        
        int sayi;
        int top;
        int i;
        
        Scanner oku=new Scanner(System.in);
        
        top=0;       
        
        for(i=0;i<10;i++){
            System.out.print("Lutfen Sayi Girin:");
            sayi=oku.nextInt();
            
             if(sayi%2==1){
                 top=top+sayi;
            }           
        }
        
        if(top==0){
            System.out.println("Tek Sayi Girilmedi");
        }
        else{
            System.out.print("Tek Sayilarin Toplami= "+top);
        }
    }
}
