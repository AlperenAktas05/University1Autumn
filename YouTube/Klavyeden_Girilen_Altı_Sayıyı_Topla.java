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
public class Klavyeden_Girilen_Altı_Sayıyı_Topla {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int sayi;
        int i;
        double top=0;
        double sayac=0;
        double ort;
        
        for(i=1;i<=6;i++){
            System.out.println("Lutfen Sayi Giriniz");
            sayi=k.nextInt();
            
            top=top+sayi;
            sayac=sayac+1;
        }
        
        System.out.println("Toplam="+top);
        
        ort=top/sayac;
        System.out.println("Ortalama="+ort);
    }
}
