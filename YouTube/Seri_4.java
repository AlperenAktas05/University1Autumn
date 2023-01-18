/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package YouTube;

/**
 *
 * @author Alperen
 */
public class Seri_4 {
    public static void main(String[] args) {
        
        int m;
        int k;
        double toplam=0;
        double carpim=1;
        
        for(m=1;m<=3;m++){
            for(k=1;k<=4;k++){
                carpim=carpim*(Math.sin(m)*Math.cos(k));
            }
            toplam=toplam+carpim;
        }
        
        System.out.println("Sonuc="+toplam);
    }
}
