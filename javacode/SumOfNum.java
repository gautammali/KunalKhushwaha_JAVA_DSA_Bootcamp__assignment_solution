package com.javacode;

import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num;
        int sum=0;
        while(true){
            num=in.nextInt();
            if (num==0) break;
            else sum+=num;
        }
        System.out.println(sum);
    }
}
