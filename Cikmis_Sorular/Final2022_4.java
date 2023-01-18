/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cikmis_Sorular;

/**
 *
 * @author Alperen
 */
public class Final2022_4 {
    public static void main(String[] args) {
        
        String list[][]={{"3li","veli"},{"4hmet","mehmet"}};
        String m;
        
        m=rakam(list);
        System.out.println(m);
    }
    
    public static String rakam(String[][] a) {
        String top="";
        boolean kontrol=true;
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length(); k++) {
                    
                    if(a[i][j].charAt(k)>='0' && a[i][j].charAt(k)<='9'){
                        kontrol=false;
                    }
                }
                
                if(kontrol==true){
                    top+=a[i][j];
                }
                kontrol=true;
            }
        }
        
        return top;
    }
}
