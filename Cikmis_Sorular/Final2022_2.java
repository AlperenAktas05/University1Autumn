/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cikmis_Sorular;

/**
 *
 * @author Alperen
 */
public class Final2022_2 {
    public static void main(String[] args) {
        
        int list[]={1,-1,5,-6,7,-11};
        int m=negatif(list,0);
        System.out.println(m);
    }
    
    public static int negatif(int a[],int dur) {
        
        if(dur==a.length){
            return 0;
        }
        
        else if(a[dur]<0){
            return a[dur]+negatif(a,dur+1);
        }
        
        else{
            return negatif(a,dur+1);
        }
    }
}
