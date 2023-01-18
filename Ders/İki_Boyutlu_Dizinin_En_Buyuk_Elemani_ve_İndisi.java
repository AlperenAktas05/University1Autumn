/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ders;

import java.util.Scanner;

/**
 *
 * @author Alperen
 */
public class İki_Boyutlu_Dizinin_En_Buyuk_Elemani_ve_İndisi {
    //2 boyutlu tam sayı dizisindeki en büyük sayının indisini yaz//
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int [][]list=new int[3][3];
        int enb;
        int i,j,l,m;
        int satir=0,sutun=0;
        
        for(i=0;i<list.length;i++){
            for(j=0;j<list.length;j++){
                System.out.println((i+1)+". Satirin "+(j+1)+". Sutununu Yaziniz");
                list[i][j]=k.nextInt();
            }
        }
        
        enb=list[0][0];
        
        for(l=1;l<list.length;l++){
            for(m=0;m<list.length;m++){
                if(list[l][m]>enb){
                    enb=list[l][m];
                    satir=l;
                    sutun=m;
                }
            }
        }
        
        System.out.println("Dizinin En Buyuk Elemani "+(satir+1)+". Satirin "+(sutun+1)+". Sutunundadir.");
    }
}
