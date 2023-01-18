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
public class Adını_10_Kere_Yazan_Rekürsif {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int tekrar;
        String ad,m;
        
        System.out.println("Adinizi Giriniz");
        ad=k.next();
        
        System.out.println("Tekrar Sayisi Giriniz");
        tekrar=k.nextInt();
        
        m=yaz(ad,tekrar);
        System.out.println(m);
                
    }
    
    public static String yaz(String a, int b) {
        
        if(b==0){
            return "";
        }
        
        else{
            return a+yaz(a,b-1);
        }
    }
}
