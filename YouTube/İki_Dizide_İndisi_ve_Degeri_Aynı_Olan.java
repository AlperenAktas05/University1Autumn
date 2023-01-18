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
public class İki_Dizide_İndisi_ve_Degeri_Aynı_Olan {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int list[][]=new int[2][2];
        int list2[][]=new int[2][2];
        
        
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                System.out.println((i+1)+". Satirin "+(j+1)+". Sutununu Giriniz");
                list[i][j]=k.nextInt();
            }
        }

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                System.out.println((i+1)+". Satirin "+(j+1+". Sutununu Giriniz"));
                list2[i][j]=k.nextInt();
            }
        }     
        
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                
                if(list[i][j]==list2[i][j]){
                    System.out.print(list[i][j]+" ");
                }
            }
        }
    }
}
