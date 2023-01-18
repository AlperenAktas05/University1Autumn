/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kod;

import java.util.Scanner;

/**
 *
 * @author Alperen
 */
public class Faktöriyel {
    // girilen tam sayının faktöriyelini hesaplayan programı yazınız//
    public static void main(String[] args) {
        Scanner k= new Scanner(System.in);
        
        int sayi;
        int f=1;
        
        System.out.println("Lutfen Sayi Giriniz");
        sayi=k.nextInt();
        
        if(sayi<0){
            System.out.println("Lutfen Pozitif Sayi Giriniz");
            System.exit(1);
        }
        
        else if(sayi==0){
            System.out.println("1");
        }
        
        else{
            for(int i=1;i<=sayi;i++){
                f=f*i;
            }
        }
        
        System.out.println("Sayinin Faktoriyeli= "+f);
    }
}
