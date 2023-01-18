/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kod;

/**
 *
 * @author Alperen
 */
public class Diziyi_Tersten_Yazan_Rekürsif {
    public static void main(String[] args) {
        
        int list[]={1,2,3,4,5,6};
        int m[]=new int[6];
        
        m=ters(list,0,list.length-1,0);
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i]);
        }
    }
    
    public static int[] ters(int a[],int b,int c,int temp) {
        
        if(b>=c){
            return a;
        }
        
        else{
            temp=a[b];
            a[b]=a[c];
            a[c]=temp;
            return ters(a,b+1,c-1,temp);
        }
    }
}
