package com.intermidiatejavaProgram;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter n :");
        int n=in.nextInt();
        System.out.println("enter pow :");
        int pow= in.nextInt();
        int ans=1;
        for (int i = 0; i < pow; i++) {
            ans*=n;
        }
        System.out.println(ans);
    }
}
