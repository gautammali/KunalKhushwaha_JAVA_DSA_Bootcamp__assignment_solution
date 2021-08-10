package com.intermidiatejavaProgram;

import java.util.Scanner;

public class CalculateAverageMarks {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the num of subject");
        int numOfSub=in.nextInt();
        int sum=0;
        for (int i = 0; i < numOfSub; i++) {
            System.out.println("one subject enter the marks of sub");
            float marks=in.nextFloat();
            sum+=marks;
        }
        float avg=sum/numOfSub;
        System.out.println(avg);
    }
}
