/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ders;

import java.util.Scanner;

/**
 *
 * @author Alperen
 */
public class Sayiya_Kadar_Sayilari_Toplayan_Rekürsif {
    //kendisine parametre olarak gelen n tam sayısına kadar ki sayıların toplamını veren//
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        System.out.println("Sayi Giriniz");
        int sayi=k.nextInt();
        
        int m=top(sayi);
        System.out.println(m);
    }
    
    public static int top(int a) {
        
        if(a==1){
            return 1;
        }
        
        else if(a==0){
            return 0;
        }
        
        else{
            return a+top(a-1);
        }
    }
}
