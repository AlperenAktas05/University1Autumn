package Ders;
import java.util.Scanner;
public class Dizinin_Elemanlari_Ayni_Mi {
    //dizideki elemanlar birbirine eşit mi//
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        String list[]=new String[5];
        String a,b;
        
        for (int i = 0; i < list.length; i++) {
            System.out.println((i+1)+". Elemani Giriniz");
            list[i]=k.next();
        }
        
        for (int j = 0; j < list.length; j++) {
            for (int l = 0; l < list.length; l++) {
                if(list[j].equals(list[l]) && j!=l){
                    System.out.println((j+1)+". Eleman "+(l+1)+". Elemana Esittir.");
                }
            }
        }
    }
}
