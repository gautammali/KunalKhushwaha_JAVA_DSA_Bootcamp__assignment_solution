package com.basicjavaprogram;

import java.util.Scanner;

public class TotalSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double PI=Math.PI;//3.14;
        System.out.print("enter the radius of the Cylinder :");
        double radius=in.nextDouble();
        System.out.print("enter the height of the Cylinder :");
        double height=in.nextDouble();
        double TotalSurfaceAreaOfCylinder=2*PI*radius*(height+radius);
        System.out.println(TotalSurfaceAreaOfCylinder);
    }
}
