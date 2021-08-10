package com.intermidiatejavaProgram;

import java.util.Scanner;

public class numberIsPalindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
        boolean ans=CheckPalindrome(n);
        System.out.println(ans);
    }

    static boolean CheckPalindrome(long n) {
        long or_n=n;
        long ans=0;
        while(n>0){
            long rem=n%10;
            ans=ans*10+rem;
            n/=10;
        }
        return or_n==ans;
    }
}
