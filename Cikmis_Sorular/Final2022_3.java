/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cikmis_Sorular;

/**
 *
 * @author Alperen
 */
public class Final2022_3 {
    public static void main(String[] args) {
        
        String list[][]={{"ali","veli"},{"ahmet","mehmet"}};
        String m[]=new String[2];
        
        m=sutun(list);
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i]);
        }
        
        
    }
    
    public static String[] sutun(String a[][]) {
        String top[]=new String[2];
        
        for (int i = 0; i < a.length; i++) {
            top[i]="";
            for (int j = 0; j < a[i].length; j++) {
                top[i]+=a[j][i];
            }
        }
        
        return top;
        
    }
}
