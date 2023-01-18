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
public class Dizideki_Stringleri_Ters_Yazma {
    //tek boyutlu string dizisindeki stringleri tersten ekrana yazan indis olarak tersten yazan, büyükleri küçük küçükleri büyük yapan
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String []list=new String[3];
        String top="";
        String top2="";
        String top3="";
        
        for (int i = 0; i < list.length; i++) {
            System.out.println((i+1)+". Elemani Giriniz");
            list[i]=k.next();
        }
        
        for (int j = list.length-1; j >= 0; j--) {
            top=top+list[j]+" ";
        }
        
        System.out.println("Elemanlarin Yeri Ters Olursa:"+top);
        
        for (int l = 0; l < list.length; l++) {
            for (int m = list[l].length()-1;m >=0;m--) {
                top3=top3+list[l].charAt(m);
            }
        }
        System.out.println("Elemanlar Ters Yazılırsa:"+top3);
        
        for (int a = list.length-1; a >= 0; a--) {
            top2=top2+list[a].toUpperCase()+" ";
        }
        System.out.println("Elemanlarin Yeri Ters Ve Buyuk Olursa:"+top2);
    }
}