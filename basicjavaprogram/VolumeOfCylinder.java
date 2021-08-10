package com.basicjavaprogram;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double PI=Math.PI;
        System.out.print("enter the radius of Cylinder : ");
        double Radius=in.nextDouble();
        System.out.print("enter the height of the Cylinder :");
        double height= in.nextDouble();
        double VolumeOfCylinder=PI* Radius*Radius*height;
        System.out.println(VolumeOfCylinder);
    }
}
