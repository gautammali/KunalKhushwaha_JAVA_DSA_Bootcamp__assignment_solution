package com.intermidiatejavaProgram;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number for check armstrong number: ");
        int num=sc.nextInt();
        int copy=num;
        int ans=0;
        while(copy>0){
            int rem=copy%10;
            ans+=Math.pow(rem,3);
            copy/=10;
        }
        if(num==ans) System.out.println("armstrong number");
        else System.out.println("not a armstrong number");
    }
}
