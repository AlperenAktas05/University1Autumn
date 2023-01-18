/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ders;

/**
 *
 * @author Alperen
 */
public class Dizinin_Elemanlarini_Bir_Arttıran_Metot {
    //kendisine parametre olarak gelen dizinin elemanları bir arttırıp geri döndüren//
    public static void main(String[] args) {
        
        int list[]={1,2,3,4,5,6};
        int x[]=new int[6];
        
        x=artıs(list);
        
        for (int i = 0; i < x.length; i++) {
            System.out.println((i+1)+". Eleman="+x[i]);
        }
    }
    
    public static int[] artıs(int []a) {
        for (int i = 0; i < a.length ; i++) {
            a[i]++;
        }
        
        return a;
    }
}
