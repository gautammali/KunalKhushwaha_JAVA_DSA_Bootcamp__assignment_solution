package com.javacode;
import java.lang.Math;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int i;
        int flag=1;
        if(num<=1){
            System.out.println("num is neither prime not composite");
            return;
        }
        for (i=2;i<=Math.pow(num,0.5);i++){
            if(num%i==0) {
                System.out.println("not a prime num");
                flag=0;
                break;
            }
        }
        if(flag==1) System.out.printf("num is prime");
    }
}
