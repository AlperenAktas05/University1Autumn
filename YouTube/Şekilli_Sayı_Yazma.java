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
public class Şekilli_Sayı_Yazma {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int sayi;
        String strsayi;
        int i,j;
        
        System.out.println("Lutfen Bir Sayi Girin");
        sayi=k.nextInt();
        
        strsayi=String.valueOf(sayi);
                
        for(i=1;i<=strsayi.length();i++){
            System.out.println(strsayi.substring(0,i));
        }
        
        for(j=strsayi.length()-1;j>=1;j--){
            System.out.println(strsayi.substring(0,j));
        }
 
    }
}
