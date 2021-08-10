package com.basicjavaprogram;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n for print the series till n :");
        int n= sc.nextInt();
        int ist=0;
        int sed=1;
        System.out.print(ist+" "+ sed+" ");
        for (int i = 0; i < n; i++) {
            int ans=ist+sed;
            System.out.print(ans+" ");
            ist=sed;
            sed=ans;
        }
    }
}
