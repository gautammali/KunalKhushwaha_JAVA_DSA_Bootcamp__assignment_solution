package com.javacode;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int c=1;
        while(c<=10){
            System.out.println(num+" x "+c+"= "+num*c);
            c++;
        }
    }
}
