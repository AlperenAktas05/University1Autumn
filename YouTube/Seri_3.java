/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package YouTube;

/**
 *
 * @author Alperen
 */
public class Seri_3 {
    public static void main(String[] args) {
        
        int m;
        int n;
        int carp=1;
        
        for(m=1;m<=3;m++){
            for(n=1;n<=4;n++){
                carp=carp*(m+n);
            }
        }
        
        System.out.println("Carpim="+carp);
    }
}
