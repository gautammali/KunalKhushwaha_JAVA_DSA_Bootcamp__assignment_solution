package com.intermidiatejavaProgram;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the principle amount you want to invest : ");
        float P=in.nextFloat();//principleAmount
        System.out.print("enter the expected interest Rate: ");
        float R=in.nextFloat();//interestRate
        System.out.print("enter the number of year: ");
        float N=in.nextFloat();//num of year
                /*formula for Compound Interest
                Amount=P*(1+(R/100))^N;
                compoundInterest=Amount-P;
                */
        double Amount=P*Math.pow((1+(R/100)),N);
        System.out.println("total Amount :"+Amount);
        float compoundInterest=(float)Amount-P;
        System.out.println("the Profit you get: "+compoundInterest);
    }
}
