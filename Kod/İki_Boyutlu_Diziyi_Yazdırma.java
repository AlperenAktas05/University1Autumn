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
public class İki_Boyutlu_Diziyi_Yazdırma {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int [][]list= new int [2][2];
        int i,j,m,l;
        int top=0;
        
        for(i=0;i<list.length;i++){
            for(j=0;j<list.length;j++){
                System.out.println((i+1)+". Satirin "+(j+1)+". Sutununu Yaziniz");
                list[i][j]=k.nextInt();
                top=top+list[i][j];
            }
        }
        
        for(m=0;m<list.length;m++){
            for(l=0;l<list.length;l++){
                System.out.println((m+1)+". Satirin "+(l+1)+". Sutunu="+list[m][l]);
            }
        }
        
        System.out.println("Elemanlarin Toplami="+top);
    }
}
