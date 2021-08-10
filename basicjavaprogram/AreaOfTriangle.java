package com.basicjavaprogram;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the base");
        double Base=sc.nextDouble();
        System.out.println("enter perpendicular height");
        double Height=sc.nextDouble();
        double AreaOfTriangle=0.5*Base*Height;
        System.out.println(AreaOfTriangle);
    }
}
