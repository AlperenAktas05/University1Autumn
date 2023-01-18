/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package YouTube;

import java.util.Scanner;

/**
 *
 * @author Alperen
 */
public class Diziyi_Kucukten_Buyuge_Siralama {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int list[]=new int[5];
        
        for (int i = 0; i <list.length; i++) {
            System.out.println((i+1)+". Elemani Giriniz");
            list[i]=k.nextInt();
        }
        
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                
                if(list[i]<list[j]){
                    int temp=list[i];
                    list[i]=list[j];
                    list[j]=temp;
                }
            }
        }
        
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+" ");
        }
    }
}
