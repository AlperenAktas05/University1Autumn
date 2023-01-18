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
public class Dizideki_En_Uzun_Stringi_ve_İndisini_Veren_Metod {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String []list=new String[5];
        String m1;
        int m2;
        
        for (int i = 0; i < list.length; i++) {
            System.out.println((i+1)+". Elemani Giriniz");
            list[i]=k.next();
        }
        
        m1=uzun(list);
        System.out.println("En Uzun String:"+m1);
        
        m2=indis(list);
        System.out.println("En Uzun Stringin Oldugu Indis="+(m2+1));
        
        
    }
    
    public static String uzun(String a[]) {
        String enbk=a[0];
        
        for (int i = 0; i < a.length; i++) {
            
            if(a[i].length()>enbk.length()){
                enbk=a[i];
            }
        }
        
        return enbk;
    }
    
    public static int indis(String a[]) {
        String enbk=a[0];
        int ind = 0;
        
        for (int i = 0; i < a.length; i++) {
            
            if(a[i].length()>enbk.length()){
                enbk=a[i];
                ind=i;
            }
        }
        
        return ind;
    }
}
