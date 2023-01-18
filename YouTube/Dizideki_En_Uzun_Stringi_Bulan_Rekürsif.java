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
public class Dizideki_En_Uzun_Stringi_Bulan_Rekürsif {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String list[]=new String[5];
        String m;
        
        for (int i = 0; i < list.length; i++) {
            System.out.println((i+1)+". Elemani Giriniz");
            list[i]=k.next();
        }
        
        m=uzun(list,0,0);
        System.out.println("En Uzun String:"+m);
    }
    
    public static String uzun(String[] a, int b, int c) {
        
        if(b==a.length-1){
            return a[c];
        }
        
        else if(a[c].length()<a[b].length()){
            return uzun(a,b+1,b);
        }
        
        else{
            return uzun(a,b+1,c);
        }
    }
}
