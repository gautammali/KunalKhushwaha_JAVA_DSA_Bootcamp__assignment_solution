package com.basicjavaprogram;

import java.sql.SQLOutput;
import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the value of base length : ");
        double length=in.nextDouble();
        System.out.print("enter the value of the base width: ");
        double width=in.nextDouble();
        System.out.print("enter the height of the prism :");
        double height=in.nextDouble();
        //first calculate base area of height
        double BaseAreaOfPrism=length*width;
        //calculate the volume of the prism;
        //formula =BaseAreaOfPrim*height;
        double VolumeOfPrism=BaseAreaOfPrism*height;
        System.out.println(VolumeOfPrism);
    }
}
