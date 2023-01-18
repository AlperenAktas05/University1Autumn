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
public class Us_Hesaplayan_Metot {
    //kendisine parametre olarak gelen 2 sayinin x üzeri y yi yaziniz//
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int x,y,z;
        
        System.out.println("Tabani Yazin");
        x=k.nextInt();
        
        System.out.println("Ussu Yazin");
        y=k.nextInt();
        
        z=us(x,y);
        System.out.println("Sonuc="+z);
    }
    
    public static int us(int a,int b) {
        int f=1;
        for (int i = 0; i < b; i++) {
            f=f*a;
        }
        
        return f;
    }
}
