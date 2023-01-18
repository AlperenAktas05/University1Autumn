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
public class Artık_Yılı_Bulma {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int yil;
        
        System.out.println("Bulundugunuz yili giriniz");
        yil=k.nextInt();
        
        
        if(yil<0){
            System.out.println("Lutfen milattan sonraki yillari girin");
            System.exit(0);
        }
        
        if(yil%4==0){
            System.out.println("Artik yildasiniz. Subat 29 gun");
        }
        
        else{
            System.out.println("Artik yilda degilsiniz. Subat 28 gun");
        }
    }
}
