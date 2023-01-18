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
public class Us_Hesaplayan_Rekürsif {
    public static void main(String[] args) {
        //a üzeri b yapan rekürsif fonksiyon//
        Scanner k=new Scanner(System.in);
        
        int taban,us,m;
        
        System.out.println("Taban Giriniz");
        taban=k.nextInt();
        
        System.out.println("Us Giriniz");
        us=k.nextInt();
        
        m=usalma(taban, us);
        System.out.println("Sonuc="+m);
    }
    
    public static int usalma(int a, int b) {
        
        if(b==0){
            return 1;
        }
        
        else{
            return a*usalma(a,b-1);
        }
    }
}
