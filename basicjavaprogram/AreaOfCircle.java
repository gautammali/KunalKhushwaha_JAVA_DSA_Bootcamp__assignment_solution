package com.basicjavaprogram;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double PI=Math.PI;//3.14;
        System.out.print("enter the radius in meter: ");
        double radius=in.nextDouble();
        double AreaOfCircle=PI*radius*radius; //PI*r^2;
        System.out.println(AreaOfCircle);
    }
}
