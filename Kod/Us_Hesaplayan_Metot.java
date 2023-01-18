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
public class Us_Hesaplayan_Metot {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int us,taban,m;
        
        System.out.println("Tabani Giriniz");
        taban=k.nextInt();
        
        System.out.println("Ussu Giriniz");
        us=k.nextInt();
        
        m=usalma(taban,us);
        
        System.out.println("Sonuc="+m);
    }
    
    public static int usalma(int a, int b) {
        int f=1;
        
        for (int i = 0; i < b; i++) {
            f=f*a;
        }
        
        return f;
    }
}
