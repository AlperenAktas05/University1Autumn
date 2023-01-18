/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cikmis_Sorular;

/**
 *
 * @author Alperen
 */
public class Final2022_5 {
    public static void main(String[] args) {
        
        int t1 =0,c=1,t2=0;
        
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int k = 1; k <= 4; k++) {
                    t1+=(i+j+k);
                }
                c*=t1;
                t1=0;
            }
            t2+=c;
            c=1;
        }
        
        System.out.println(t2);
    }
}
