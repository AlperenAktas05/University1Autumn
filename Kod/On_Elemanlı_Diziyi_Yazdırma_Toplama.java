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
public class On_Elemanlı_Diziyi_Yazdırma_Toplama {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String []list=new String[10];
        int i,j;
        int top=0;
        
        for(i=0;i<list.length;i++){
            System.out.println((i+1)+". Elemani Giriniz");
            list[i]=k.next();
        }
        
        for(j=0;j<list.length;j++){
            System.out.println((j+1)+". eleman="+list[j]);
        }  
    }
}
