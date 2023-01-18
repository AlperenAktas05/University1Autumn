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
public class Klavyeden_Girilen_Sayi_Dizide_Mi {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int sayi;
        int []list= new int[5];
        int i,j;
        
        for(i=0;i<list.length;i++){
            System.out.println((i+1)+". Elemani Yaziniz");
            list[i]=k.nextInt();
        }
        
        System.out.println("Lutfen Bir Sayi Giriniz");
        sayi=k.nextInt();
        
        for(j=0;j<list.length;j++){
            if(list[j]==sayi){
                System.out.println("Girdiginiz Sayi Dizide Var Ve "+(j+1)+". Elemandir.");
                System.exit(0);
            }
        }
        
        System.out.println("Girdiginiz Sayi Dizide Yok");
    }
}
