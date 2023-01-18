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
public class On_Elemanlı_Dizideki_Tek_Sayıların_Ortalaması {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int []list=new int [10];
        int i,j;
        double top=0;
        double sayac=0;
        double ort;
        
        for(i=0;i<list.length;i++){
            System.out.println((i+1)+". Elemani Giriniz");
            list[i]=k.nextInt();
            
            if(list[i]%2==1 && list[i]>0){
                top=top+list[i];
                sayac++;
            }
        }
        
        ort=(top/sayac);
        
        for(j=0;j<list.length;j++){
            System.out.println((j+1)+". Eleman="+list[j]);
        }
        
        System.out.println("Pozitif Tek Elemanlarin Ortalamasi="+ort);
    }
}
