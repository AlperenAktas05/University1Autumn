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
public class Değişken_Türleri {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        byte a; //-128 +127 8bit
        int b; //tam sayi 32bit
        short c; //-32768 +32767 16bit
        float d; //kucuk ondalikli sayi 32bit
        double e; //buyuk ondalikli sayi 64bit
        long f; //çok uzun tam sayi 64bit
        char g; //karakter 16bit
        String h; //kelime 
        
        System.out.println("Lutfen byte giriniz");
        a=k.nextByte();
        
        System.out.println("Lutfen int giriniz");
        b=k.nextInt();
        
        System.out.println("Lutfen short giriniz");
        c=k.nextShort();
        
        System.out.println("Lutfen float giriniz");
        d=k.nextFloat();
        
        System.out.println("Lutfen double giriniz");
        e=k.nextDouble();
        
        System.out.println("Lutfen long giriniz");
        f=k.nextLong();
        
        System.out.println("Lutfen char giriniz");
        g=k.next().charAt(0);
        
        System.out.println("Lutfen String giriniz");
        h=k.nextLine();
        
        
        System.out.println("byte="+a);
        System.out.println("int="+b);
        System.out.println("short="+c);
        System.out.println("float="+d);
        System.out.println("double="+e);
        System.out.println("long="+f);
        System.out.println("char="+g);
        System.out.println("String="+h);
    }
}
