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
public class İki_Boyutlu_Dizideki_En_Büyük_Sayi_Ve_İndisi_Veren_Metod {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int list[][]=new int [2][2];
        int m[]=new int[2];
        
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                System.out.println((i+1)+". Satirin "+(j+1)+". Sutununu Giriniz");
                list[i][j]=k.nextInt();
            }
        }
        
        m=buyuk(list);
        System.out.println("Dizinin En Buyuk Sayisi "+m[0]+" ve Bu Sayi "+m[1]+". Satir "+m[2]+". Sutundadir.");
        
    }
    
    public static int[] buyuk(int a[][]) {
        int b[]=new int[3];
        int enb=a[0][0];
        int satir=0;
        int sutun=0;
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                
                if(a[i][j]>enb){
                    enb=a[i][j];
                    satir=i;
                    sutun=j;
                }
            }
        }
        
        b[0]=enb;
        b[1]=satir+1;
        b[2]=sutun+1;
        
        return b;
    }
}
