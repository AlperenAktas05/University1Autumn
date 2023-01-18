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
public class On_Üçe_Bölünme_Kuralı {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int sayi;
        
        System.out.println("Lutfen Sayi Girin");
        sayi=k.nextInt();
        
        if(sayi%13==0){
            System.out.println("Sayi 13'e Bolunur");
        }
        
        else{
            System.out.println("Sayi 13'e Bolunmez");
        }
    }
}
