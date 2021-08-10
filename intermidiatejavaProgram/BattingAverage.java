package com.intermidiatejavaProgram;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the total number of runs :");
        float run=in.nextInt();
        System.out.print("enter number of time the bets man out  :");
        float out=in.nextInt();
        float averageOfBats=(run/out);
        System.out.println(averageOfBats);
    }
}
