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
public class İki_Boyutlu_Dizideki_Stringleri_Eksene_Göre_Birleştirme {
    //2 boyutlu string dizisindeki stringleri birleştiren , her bir satırını ayrı ayrı birleştirip string dizisi oluşturan, satırlarını birleştirip tek dizi yapan
    //sutunlari dizi yapan
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int [][]list=new int[3][3];
        int []yedek=new int [9];
        int i,j,l,m,a,b;
        String top="";
        String top2 = "";
        String top3="";
        
        for(i=0;i<list.length;i++){
            for(j=0;j<list.length;j++){
                System.out.println((i+1)+". Satirin "+(j+1)+". Sutununu Yazın");
                list[i][j]=k.nextInt();
            }
        }
        
        for(l=0;l<list.length;l++){
            for (m = 0; m <list.length; m++) {
                top=top+list[l][m];
            }
        }
        
        System.out.println("Birleştirilmiş Hali:"+top);
        
        for (int n = 0; n < list.length; n++) {
            for (int o = 0; o < list.length; o++) {
                top2+=list[n][o];
            }
            System.out.println((n+1)+". Satirin Elemanlari:"+top2);
            top2="";
        }
        
        for (int r = 0,v=0; r < list.length; r++,v++) {
            for (int s = 0; s < list.length; s++) {
                top3+=list[s][r];
            }
            System.out.println((v+1)+". Sutunun Elemanlari:"+top3);
            top3="";
        }
    }
}
