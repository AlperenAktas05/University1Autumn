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
public class Üçgen_Çeşidini_Bulma {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        
        int a,b,c;
        
        System.out.println("Lutfen Kenar Uzunluklarini Giriniz");
        a=oku.nextInt();
        b=oku.nextInt();
        c=oku.nextInt();
        
        if(a==b && b==c){
            System.out.println("Eskenar Ucgen");
        }
        
        else if(a==b || a==c || b==c){
            System.out.println("Ikizkenar Ucgen");
        }
        
        else{
            System.out.println("Cesitkenar Ucgen");
        }
    }
}
