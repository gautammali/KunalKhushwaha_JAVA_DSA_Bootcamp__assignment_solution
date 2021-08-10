package com.basicjavaprogram;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the side of the cube: ");
        double side=in.nextDouble();
        double CurvedSurfaceAreaOfCube=side*side*side;
        System.out.println(CurvedSurfaceAreaOfCube);
    }
}
