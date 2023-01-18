/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kod;

import java.util.Scanner;

/**
 *
 * @author Alperen
 */
public class Taş_Kağıt_Makas {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        //tas=0, kağıt=1, makas=2//
        
        String kisi;
        int i;
        
        for(i=1;i<100;i++){
            
        int pc= (int)(Math.random()*3);
        
        System.out.println("Lutfen Tas, Kagit veya Makas Yaziniz");
        kisi=oku.nextLine();
        
        if(pc==0 && kisi.equals("Tas")){
            System.out.println("Berabere");
        }
        
        else if(pc==0 && kisi.equals("Kagit")){
            System.out.println("Kazandin, Bot Tasi Secmisti");
        }
        
        else if(pc==0 && kisi.equals("Makas")){
            System.out.println("Kaybettin, Bot Tasi Secmisti");
        }
        
        else if(pc==1 && kisi.equals("Tas")){
            System.out.println("Kaybettin, Bot Kagidi Secmisti");
        }
        
        else if(pc==1 && kisi.equals("Kagit")){
            System.out.println("Berabere");
        }
        
        else if(pc==1 && kisi.equals("Makas")){
            System.out.println("Kazandin, Bot Kagidi Secmisti");
        }
        
        else if(pc==2 && kisi.equals("Tas")){
            System.out.println("Kazandin, Bot Makasi Secmisti");
        }
        
        else if(pc==2 && kisi.equals("Kagit")){
            System.out.println("Kaybettin, Bot Makasi Secmisti");
        }
        
        else if(pc==2 && kisi.equals("Makas")){
            System.out.println("Berabere");
        }
        
        else{
            System.out.println("Lutfen Sadece Tas,Kagit Ya Da Makas Yaziniz");
        }
        
        }
    }
}
