package com.basicjavaprogram;

import java.util.Scanner;

public class VolumeOfPrismWithTriangleBase {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the value of base length : ");
        double length=in.nextDouble();
        System.out.print("enter the value of the base Base: ");
        double base=in.nextDouble();
        System.out.print("enter the height of the prism :");
        double height=in.nextDouble();
        //first calculate base area of height
        double BaseAreaOfPrisTriangle=(base*length)/2;
        //calculate the volume of the prism;
        //formula =BaseAreaOfPrim*height;
        double VolumeOfPrism=BaseAreaOfPrisTriangle*height;
        System.out.println(VolumeOfPrism);
    }
}
