package com.basicjavaprogram;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the value of side :");
        double side=in.nextDouble();
        double AreaOfEquilateralTriangle=(Math.pow(3,0.5)/4)*side*side;
        System.out.println(AreaOfEquilateralTriangle);
    }
}
