

package com.mycompany.myonlineshop;

import java.util.Scanner;

public class MyOnlineShop {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        product b1[]=new book[2];
        b1[0]=new book(50.0,"java");
        b1[1]=new book(70.0,"python");
        product b2[]=new childrenbook[2];
        b2[0]=new childrenbook(25.0,"prophets' stories");
        b2[1]=new childrenbook(45.0,"Little Darlings",.10);
        
        System.out.println("how many book do you need");
        int x =in.nextInt();
        System.out.println("what is name of book or childrenbook do you need");      
        String name = in.next();
        if("java".equals(name)){
        System.out.println("the name of the book is : "+(b1[0].getName()));            
        System.out.println("the total price is : "+(b1[0].BPrice()*x));
            System.out.println(b1[0].toString());
        }
        else if("python".equals(name)){
        System.out.println("the name of the book is : "+(b1[1].getName()));            
        System.out.println("the total price is : "+(b1[1].BPrice()*x));
        System.out.println(b1[1].toString());
        
        }
        else if("prophets'stories".equals(name)){
        System.out.println("the name of the book is : "+(b2[0].getName()));            
        System.out.println("the total price is : "+(b2[0].BPrice()*x));
        System.out.println(b2[0].toString());
        }
         else if("LittleDarlings".equals(name)){
        System.out.println("the name of the book is : "+(b2[1].getName()));            
        System.out.println("the total price is : "+(b2[1].BPrice()*x));
        System.out.println(b2[1].toString());
        }
         
        else {
            System.out.println("It doesn't exist");
        }
        
       
    }
}
