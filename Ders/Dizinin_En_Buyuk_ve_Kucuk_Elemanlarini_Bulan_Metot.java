/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ders;

/**
 *
 * @author Alperen
 */
public class Dizinin_En_Buyuk_ve_Kucuk_Elemanlarini_Bulan_Metot {
    //kendisine parametre olarak gelen dizinin en buyuk ve en kucuk elemanini geri donduren//
    public static void main(String[] args) {
        int list[]={7,4,6,1};
        int y[]=new int[2];
        
        y=en(list);
        
        System.out.println("En Buyuk Eleman "+y[0]+" En Kucuk Eleman "+y[1]);
    }
    
    public static int [] en(int []a) {
        int enb=a[0];
        int enk=a[0];
        int r[]=new int[2];
        
        
        for (int i = 0; i < a.length; i++) {
            if(a[i]>enb){
                enb=a[i];
            }
            
            if(a[i]<enk){
                enk=a[i];
            }
        }
        
        r[0]=enb;
        r[1]=enk;
        
        return r;
        
    }
}
