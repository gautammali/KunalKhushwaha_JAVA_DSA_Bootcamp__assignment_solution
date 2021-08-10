package com.intermidiatejavaProgram;

import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class AverageOfNNumbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter n : ");
        int n=in.nextInt();
        float avg=0;
        int sum=0;
        for (int i = 1; i <=n; i++) {
            sum+=i;
        }
        avg=sum/n;
        System.out.println(avg);
    }
}
