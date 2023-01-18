/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ders;

/**
 *
 * @author Alperen
 */
public class Faktöriyel_Bulan_Rekürsif {
    public static void main(String[] args) {
        
        int n=fac(3);
        System.out.println(n);
    }
    
    public static int fac(int a) {
        
        if(a==0){
            return 1;
        }
        
        else{
            return a*fac(a-1);
        }
    }
}
