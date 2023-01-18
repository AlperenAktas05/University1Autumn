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
public class Dört_İşlem_Testi {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        //dört işlem testi:kullanıcı işleme cevap verecek doğruysa aferin yazacak, yanlışsa doğru cevabı verecek//
        
        int i;
        
        for(i=1;i<100;i++){
            
        int sayi1=(int) (Math.random()*100);
        int sayi2=(int) (Math.random()*100);
        int sayi3=(int) (Math.random()*100);
        int sayi4=(int) (Math.random()*100);
        int sayi5=(int) (Math.random()*10);
        int sayi6=(int) (Math.random()*10);
        int sayi7=(int) (Math.random()*10);
        int sayi8=(int) (Math.random()*10);       
        int toplam_sonuc;
        int cikarma_sonuc;
        int carpma_sonuc;
        int bolme_sonuc;
        int temp=sayi7;
        
        
        System.out.println(sayi1+"+"+sayi2+"=?");
        toplam_sonuc=oku.nextInt();
        
        if(sayi1+sayi2==toplam_sonuc){
            System.out.println("Aferin");
        }
        
        else{
            System.out.println("Gerizekali "+"Dogru Cevap="+(sayi1+sayi2));
              
        }
        
        System.out.println(sayi3+"-"+sayi4+"=?");
        cikarma_sonuc=oku.nextInt();
        
        if(sayi3-sayi4==cikarma_sonuc){
            System.out.println("Aferin");
        }
        
        else{
            System.out.println("Gerizekali "+"Dogru Cevap="+(sayi3-sayi4));
        }
        
        System.out.println(sayi5+"*"+sayi6+"=?");
        carpma_sonuc=oku.nextInt();
        
        if(sayi5*sayi6==carpma_sonuc){
            System.out.println("Aferin");
        }
        
        else{
            System.out.println("Gerizekali "+"Dogru Cevap="+(sayi5*sayi6));
        }       
        
        if(sayi7<sayi8){
            sayi7=sayi8;
            sayi8=temp;
        }
        
        System.out.println(sayi7+"/"+sayi8+"=?");
        bolme_sonuc=oku.nextInt();
        
        if(sayi7/sayi8==bolme_sonuc){
            System.out.println("Aferin");
        }
        
        else{
            System.out.println("Gerizekali "+"Dogru Cevap="+(sayi7/sayi8));
        }
        }
    }  
}
