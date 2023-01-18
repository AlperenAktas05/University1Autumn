/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cikmis_Sorular;

import java.util.Scanner;

/**
 *
 * @author Alperen
 */
public class Quiz_1 {
    public static void main(String[] args) {
        Scanner k= new Scanner(System.in);
        
        int sayi;
        int i;
        double top=0;
        int sayac=0;
        double ort;
        
        for(i=1;i<=10;i++){
            System.out.println("Lutfen Sayi Giriniz");
            sayi=k.nextInt();
            
            if(sayi>0){
                top=top+sayi;
                sayac=sayac+1;
            }
            
            else if(sayi==0 || sayi<0){
                System.out.println("Lutfen Pozitif Sayi Girin");
                System.exit(1);
            }
           
        }
        
        ort=(top/sayac);
        
        System.out.println("Pozitif Sayilarin Ortalamasi="+ort);
        
    }
}
