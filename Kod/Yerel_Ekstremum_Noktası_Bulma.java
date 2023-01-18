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
public class Yerel_Ekstremum_Noktası_Bulma {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        //f(x)=a
        
        double derece;
        double a, b, c, d;
        double delta;
        double x1;
        double x2;
        double temp;
        
        System.out.println("Fonksiyonun Derecesi Nedir?");
        derece=oku.nextInt();
        
        if(derece==3){
            System.out.println("ax3+bx2+cx+d");
            System.out.print("a=");
            a=oku.nextInt();
            System.out.print("b=");
            b=oku.nextInt();
            System.out.print("c=");
            c=oku.nextInt();
            System.out.print("d=");
            d=oku.nextInt();
            
            System.out.println("Fonksiyonun Türevi="+(3*a)+"x2+"+(2*b)+"x+"+(c)+"=0");
            
            delta=(2*b)*(2*b)-(4*(3*a)*c);
            
            if(delta>0){
                x1=(-1*(2*b)+Math.sqrt(delta))/(2*(3*a));
                System.out.println("Turevin Birinci Koku= "+x1);
                x2=(-1*(2*b)-Math.sqrt(delta))/(2*(3*a));
                System.out.println("Turevin Ikinci Koku= "+x2);
                
                if(x2<x1){
                    temp = x2;
                    x2=x1;
                    x1=temp;
                    
                    if(3*a>0){
                        System.out.println("Fonksiyonun x= "+x1+" Noktasında Yerel Maksimumu Vardir.");
                        System.out.println("Fonksiyonun x= "+x2+" Noktasında Yerel Minimumu Vardir");
                    }
                    
                    else if(3*a<0){
                        System.out.println("Fonksiyonun x="+x1+" Noktasında Yerel Minimumu Vardir.");
                        System.out.println("Fonksiyonun x="+x2+" Noktasında Yerel Maksimumu Vardir.");
                    }
                }
                
                else if(x1<x2){
                    
                    if(3*a>0){
                        System.out.println("Fonksiyonun x="+x1+"Noktasında Yerel Maksimumu Vardir.");
                        System.out.println("Fonksiyonun x="+x2+"Noktasında Yerel Minimumu Vardir");
                    }
                    
                    else if(3*a<0){
                        System.out.println("Fonksiyonun x="+x1+"Noktasında Yerel Minimumu Vardir.");
                        System.out.println("Fonksiyonun x="+x2+"Noktasında Yerel Maksimumu Vardir.");
                    }                    
                    
                }
                
                else{
                    System.out.println("Yerel Ekstremum Noktasi Yok");
                }
            }
            
            else if(delta==0){
                x1=(-1*(2*b))/(2*(3*a));
                System.out.println("Turevin Koku= "+x1);
                
                if(3*a>0){
                    System.out.println("Fonksiyonun x="+x1+" Noktasında Yerel Minimumu Vardir.");
                }
                
                else if(3*a<0){
                    System.out.println("Fonksiyonun x="+x1+" Noktasında Yerel Maksimumu Vardir.");
                }
            }
            
            else{
                System.out.println("Turevin Koku Yok");
            }
            
        }
        
        else if(derece==2){
            System.out.println("ax2+bx+c");
            System.out.print("a=");
            a=oku.nextInt();
            System.out.print("b=");
            b=oku.nextInt();
            System.out.print("c=");
            c=oku.nextInt();
            
            System.out.println("Fonksiyonun Turevi= "+(2*a)+"x"+(b)+"=0");
            
            x1=(-1*b)/(2*a);
            System.out.println("Turevin Koku= "+x1);
            
            if(2*a>0){
                System.out.println("Fonksiyonun x="+x1+" Noktasında Yerel Minimumu Vardir.");
            }
            
            else if(2*a<0){
                System.out.println("Fonksiyonun x="+x1+" Noktasında Yerel Maksimumu Vardir.");
            }
        }
        
        else if(derece==1){
            System.out.println("ax+b");
            System.out.print("a=");
            a=oku.nextInt();
            System.out.print("b=");
            b=oku.nextInt();
            
            System.out.println("Fonksiyonun Turevi= "+a);
            System.out.println("Turevinin Koku Yok");
            System.out.println("Yerel Ekstremum Noktasi Yok");
        }
        
        else{
            System.out.println("Fonksiyonun Derecesi 3, 2 veya 1 Olabilir.");
        }
    }
}
