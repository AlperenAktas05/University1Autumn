/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package YouTube;

import java.util.Scanner;

/**
 *
 * @author Alperen
 */
public class İki_Boyutlu_Dizide_En_Uzun_String {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String list[][]=new String[3][3];
        String enbk;
        
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                System.out.println((i+1)+". Satirin "+(j+1+". Sutununu Giriniz"));
                list[i][j]=k.next();
            }
        }
        
        enbk=list[0][0];
        
        for (int i = 0; i <list.length ; i++) {
            for (int j = 0; j < list.length; j++) {
                
                if(list[i][j].length()>enbk.length()){
                    enbk=list[i][j];
                }
            }
        }
        
        System.out.println("En Uzun String:"+enbk);
    }
}
