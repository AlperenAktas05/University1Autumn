/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ders;

import java.util.Scanner;

/**
 *
 * @author Alperen
 */
public class Dizideki_Stringlerin_Harflerin_Boyutunu_Degistiren_Rekürsif {
    //kendisine parametre olarak gelen stringin harflerin boyutunu değiştiren rekürsif
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String kelime;
        String m;
        
        System.out.println("Kelime Giriniz");
        kelime=k.next();
        
        m=degis(kelime,0);
        System.out.println(m);
    }
    
    public static String degis(String a,int dur) {
        
        if(dur==a.length()){
            return "";
        }
        
        else if(a.charAt(dur)>='a' && a.charAt(dur)<='z'){
            return (char)(a.charAt(dur)-32)+degis(a,dur+1);
        }
        
        else{
            return (char)(a.charAt(dur)+32)+(String)degis(a,dur+1);
        }
    }
}
