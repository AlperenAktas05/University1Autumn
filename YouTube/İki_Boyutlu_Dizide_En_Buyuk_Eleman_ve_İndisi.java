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
public class İki_Boyutlu_Dizide_En_Buyuk_Eleman_ve_İndisi {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int list[][]=new int[3][3];
        int enb,satir = 0,sutun=0;
        
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.println((i+1)+". Satirin "+(j+1)+". Sutununu Giriniz");
                list[i][j]=k.nextInt();
            }
        }
        
        enb=list[0][0];
        
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                
                if(list[i][j]>enb){
                    enb=list[i][j];
                    satir=i;
                    sutun=j;
                }
            }
        }
        
        System.out.println("En Buyuk Eleman "+enb+" ve "+(satir+1)+". Satir "+(sutun+1)+". Sutundadir");
    }
}
