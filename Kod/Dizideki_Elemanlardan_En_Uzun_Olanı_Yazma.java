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
public class Dizideki_Elemanlardan_En_Uzun_Olanı_Yazma {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String [][]list=new String [5][5];
        int i,j,l,m;
        
        for(i=0;i<list.length;i++){
            for(j=0;j<list.length;j++){
                System.out.println((i+1)+". Satirin "+(j+1)+". Sutununu Yaziniz");
                list[i][j]=k.next();
            }
        }
        
        for(l=0;l<list.length;l++){
            for(m=0;m<list.length;m++){
                if(list[l][m].length()>5){
                    System.out.println((l+1)+". Satirin "+(m+1)+". Sutunu 5 Harften Uzundur ve "+list[l][m]+"'dir.");
                }
            }
        }
    }
}
