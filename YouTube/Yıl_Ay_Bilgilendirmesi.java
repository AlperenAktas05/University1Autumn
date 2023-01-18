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
public class Yıl_Ay_Bilgilendirmesi {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int yil;
        int ay;
        
        System.out.println("Lutfen bulundugunuz yili girin");
        yil=k.nextInt();

        if(yil<0 || yil>2022){
            System.out.println("Lutfen gecerli bir yil giriniz");
            System.exit(0);
        }
        
        System.out.println("Lutfen bulundugunuz ayi girin");
        ay=k.nextInt();
        
        if(ay<1 || ay>12){
            System.out.println("Lutfen gecerli bir ay giriniz");
            System.exit(0);
        }
        
        System.out.println("Bulundugunuz yil "+yil);
        
        switch(ay){
            case 1:System.out.println("Bulundugunuz ay Ocak ve 31 gun"); break;
            case 3:System.out.println("Bulundugunuz ay Mart ve 31 gun"); break;
            case 5:System.out.println("Bulundugunuz ay Mayıs ve 31 gun"); break;
            case 7:System.out.println("Bulundugunuz ay Temmuz ve 31 gun"); break;
            case 8:System.out.println("Bulundugunuz ay Agustos ve 31 gun"); break;
            case 10:System.out.println("Bulundugunuz ay Ekim ve 31 gun"); break;
            case 12:System.out.println("Bulundugunuz ay Aralik ve 31 gun"); break;
        }
        
        switch(ay){
            case 4:System.out.println("Bulundugunuz ay Nisan ve 30 gun"); break;
            case 6:System.out.println("Bulundugunuz ay Haziran ve 30 gun"); break;     
            case 9:System.out.println("Bulundugunuz ay Eylul ve 30 gun"); break;
            case 11:System.out.println("Bulundugunuz ay Kasim ve 30 gun"); break;     
        }
        
        if(ay==2 && yil%4==0){
            System.out.println("Bulundugunuz ay Subat ve 29 gun");
        }
        
        else if(ay==2 && yil%4!=0){
            System.out.println("Bulundugunuz ay Subat ve 28 gun");
        }
    }
}
