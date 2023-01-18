/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kod;

import java.util.Scanner;

/**
 *
 * @author Alperen Aktaş
 */
public class İkinci_Dereceden_Denklemin_Köklerini_Bulma {
    public static void main(String[] args) {
        
        int a;
        int b;
        int c;
        int d;
        double x1;
        double x2;
        
        System.out.println("ax*x+b*x+c");
        
        Scanner oku= new Scanner(System.in);
        
        System.out.println("Lutfen a,b ve c degerlerini girin");
        
        System.out.print("a=");
        a=oku.nextInt();
        
        System.out.print("b=");
        b=oku.nextInt();
        
        System.out.print("c=");
        c=oku.nextInt();
        
        d=b*b-4*a*c;
        
        if(d>0){
            x1=(-1*b+Math.sqrt(d))/2*a;
            x2=(-1*b-Math.sqrt(d))/2*a;
            
            System.out.println("Denklemin Kokleri= "+x1+" ve "+x2);
        }
        
        else if(d==0){
            x1=(-1*b)/(2*a);
            
            System.out.println("Denklemin Koku= "+x1);
        }
        
        else{
            System.out.println("Denklemin Koku Yok");
        }
            
    }
}
