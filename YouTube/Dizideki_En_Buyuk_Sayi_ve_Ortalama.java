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
public class Dizideki_En_Buyuk_Sayi_ve_Ortalama {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        double list[]=new double[5];
        double enb,ort,top=0.0;
        
        for (int i = 0; i < list.length; i++) {
            System.out.println((i+1)+". Elemani Giriniz");
            list[i]=k.nextDouble();
        }
        
        enb=list[0];
        
        for (int i = 0; i < list.length; i++) {
            
            if(list[i]>enb){
                enb=list[i];
            }
            
            top=top+list[i];
        }
        
        ort=(top/5.0);
        
        System.out.println("Dizideki En Buyuk Eleman="+enb);
        System.out.println("Dizinin Ortalamasi="+ort);
                
    }
}
