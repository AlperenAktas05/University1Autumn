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
public class Dizide_5_Olduğunu_Bulan_Rekürsif {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int list[]=new int[5];
        boolean m;
        
        for (int i = 0; i < list.length; i++) {
            System.out.println((i+1)+". Elemani Giriniz");
            list[i]=k.nextInt();
        }
        
        m=kontrol(list,0);
        System.out.println(m);
    }
    
    public static boolean kontrol(int a[],int b) {
        
        if(b==a.length){
            return false;
        }
        
        else if(a[b]==5){
            return true;
        }
        
        else{
            return kontrol(a,b+1);
        }
    }
}
