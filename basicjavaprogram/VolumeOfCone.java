package com.basicjavaprogram;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double PI=Math.PI;
        System.out.print("enter the radius of the cone :");
        double radius=sc.nextDouble();
        System.out.print("enter the perpendicular height of the cone: ");
        double height=sc.nextDouble();
        double VolumeOfCone=PI*radius*radius*(height/3);
        //formula for volume of cone =PI*r^2*h/3;
        System.out.println(VolumeOfCone);
    }
}
