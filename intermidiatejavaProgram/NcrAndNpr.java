package com.intermidiatejavaProgram;

import java.util.Scanner;

public class NcrAndNpr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the num N:");
        long N=sc.nextLong();
        System.out.print("enter r:");
        long R=sc.nextLong();
        double ncr=fact(N)/(fact((N-R))*fact(R));
        double npr=fact(N)/fact((N-R));
        System.out.println("ncr: "+ ncr);
        System.out.println("npr: " + npr);
    }
    static double fact(long val){
        double ans=1;
        for (int i = 1; i <=val; i++) {
            ans*=i;
        }
        return ans;
    }
}
