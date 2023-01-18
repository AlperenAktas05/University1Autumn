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
public class İkiye_Ve_Üçe_Bölünme_Kuralı {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int sayi;
        
        System.out.println("Sayi girin");
        sayi=k.nextInt();
        
        if(sayi%2==0 && sayi%3==0){
            System.out.println("Sayi altiya bolunur");
        }
        
        else if(sayi%2==0){
            System.out.println("Sayi ikiye bolunur");
            System.exit(0);
        }
        
        else if(sayi%3==0){
            System.out.println("Sayi uce bolunur");
        }
        
        else{
            System.out.println("Sayi ikiye ve uce bolunmez");
        }
    }
}
