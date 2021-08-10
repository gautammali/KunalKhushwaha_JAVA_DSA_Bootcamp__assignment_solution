package com.basicjavaprogram;

import java.util.Scanner;

public class SumOfADigitsOfNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int ans=sumOfDigit(n);
        System.out.println(ans);
    }

    private static int sumOfDigit(int n) {
        int sum=0;
        while(n>0){
            int lastDigit=n%10;
            sum+=lastDigit;
            n/=10;
        }
        return sum;
    }
}
