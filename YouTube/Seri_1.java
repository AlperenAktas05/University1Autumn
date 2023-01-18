/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package YouTube;

/**
 *
 * @author Alperen
 */
public class Seri_1 {
    public static void main(String[] args) {
        
        int i;
        int top=1;
        
        for(i=1;i<=99;i++){
            top=top+(i/(i+1));
        }
        
        System.out.println("Toplam="+top);
    }
}
