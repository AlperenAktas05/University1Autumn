/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kod;

/**
 *
 * @author Alperen
 */
public class İki_Diziyi_Toplayan_Rekürsif {
    public static void main(String[] args) {
        
        int list[]={1,2,3,4,5};
        int list2[]={6,7,8,9,10};
        int top[]=new int[5];
        int m;
        
        m=toplam(list,list2,top,0);
        System.out.println(m);
    }
    
    public static int toplam(int a[], int b[],int c[], int dur) {
        
        if(dur==a.length || dur==b.length){
            return 0;
        }
        
        else{
            c[dur]=a[dur]+b[dur];
            return c[dur]+toplam(a,b,c,dur+1);
        }
    }
}
