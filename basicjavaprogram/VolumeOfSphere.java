package com.basicjavaprogram;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double PI=Math.PI;
        System.out.print("enter the radius of Sphere : ");
        double Radius=in.nextDouble();
        double VolumeOfCylinder=(4*PI*Radius*Radius*Radius)/3;
        System.out.println(VolumeOfCylinder);
    }
}
