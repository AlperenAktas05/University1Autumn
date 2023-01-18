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
public class İki_Sayı_Arasındaki_Sayılari_Gösterme {
    //klavyeden girilen 2 tam sayı arasındaki sayıları kendileri de dahil olmak üzere ekrana yazdıran programı yazın//
    public static void main(String[] args) {
        Scanner k= new Scanner(System.in);
        
        int a;
        int b;
        int i;
        
        System.out.println("Ilk sayiyi girin");
        a=k.nextInt();
        
        System.out.println("Ikinci sayiyi girin");
        b=k.nextInt();
        
        if(a==b){
            System.out.println(a);
        }
        
        else if(a<b){
            for(i=a;i<=b;i++){
                System.out.println(i);
            }
        }
        
        else if(a>b){
            for(i=a;i>=b;i--){
                System.out.println(i);
            }
        }
    }
}
