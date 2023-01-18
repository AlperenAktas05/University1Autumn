/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kod;

/**
 *
 * @author Alperen
 */
public class Sutunlardaki_En_Buyuk_Eleman {
    public static void main(String[] args) {
        
        int list[][]={{1,2,3},{4,5,6},{7,8,9}};
        int m[]=new int[3];
        
        m=buyuk(list);
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i]);
        }
    }
    
    public static int[] buyuk(int a[][]) {
        int enb[]=new int[3];
        for (int i = 0; i < enb.length; i++) {
            enb[i]=0;
        }
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                
                if(a[j][i]>enb[i]){
                    enb[i]=a[j][i];
                }
            }
        }
        
        return enb;
    }
}
