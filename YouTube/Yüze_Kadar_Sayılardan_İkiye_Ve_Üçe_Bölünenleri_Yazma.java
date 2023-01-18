/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package YouTube;

/**
 *
 * @author Alperen
 */
public class Yüze_Kadar_Sayılardan_İkiye_Ve_Üçe_Bölünenleri_Yazma {
    public static void main(String[] args) {
        
        int i;
        double top=0;
        double sayac=0;
        double ort;
        
        for(i=1;i<=100;i++){
            if(i%2==0 && i%3==0){
                System.out.println(i);
                top=top+i;
                sayac=sayac+1;
            }
        }
        
        System.out.println("Toplam="+top);
        
        ort=top/sayac;
        System.out.println("Ortalama="+ort);
    }
}
