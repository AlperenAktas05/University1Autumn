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
public class Diziyi_Kucukten_Buyuge_Siralama {
    //10 elemanlı bir diziyi kücukten buyuge sıralama
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int []list=new int [10];
        int yedek;
        
        for (int i = 0; i < list.length; i++) {
            System.out.println((i+1)+". Elemani Giriniz");
            list[i]=k.nextInt();
        }
        
        for (int j = 0; j < list.length-1; j++) {
            for (int l = 0; l < list.length-1-j; l++) {
                if(list[l]>list[l+1]){
                    yedek=list[l];
                    list[l]=list[l+1];
                    list[l+1]=yedek;
                }
            }
        }
        
        for (int m = 0; m < list.length; m++) {
            System.out.println((m+1)+". Eleman="+list[m]);
            
        }
    }
}
