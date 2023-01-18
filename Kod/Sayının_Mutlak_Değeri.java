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
public class Sayının_Mutlak_Değeri {
    public static void main(String[] args) {
        
        int a;
        
        Scanner oku=new Scanner(System.in);
        
        System.out.println("Lutfen Sayiyi Girin");
        a=oku.nextInt();
        
        if(a<0){
            System.out.println("Sayinin Mutlak Degeri="+(-1*a)); 
        }
        
        else{
            System.out.println("Sayinin Mutlak Degeri="+a);
        }
    }
}
