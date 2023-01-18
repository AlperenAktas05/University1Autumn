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
public class Dairenin_Alanını_Bulma {
    public static void main(String[] args) {
        
        double r;
        double alan;
        
        Scanner oku=new Scanner(System.in);
        
        System.out.print("Lutfen Yaricapi Giriniz:");
        r=oku.nextDouble();
        
        alan=r*r*3.14;
        
        if(r>0){
            System.out.print("Dairenin Alani:"+alan);
        }
        
        else{
            System.out.println("Lutfen Yaricapi Sifirdan Buyuk Giriniz");
        }
 
    }
}
