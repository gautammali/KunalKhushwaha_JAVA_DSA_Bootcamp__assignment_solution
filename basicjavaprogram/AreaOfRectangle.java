package com.basicjavaprogram;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter width of rectangle in meter");
        double Width=sc.nextDouble();
        System.out.println("enter length of rectangle in meter");
        double length=sc.nextDouble();
        double AreaOfRectangle=Width*length;
        System.out.println(AreaOfRectangle+" m^2");
    }
}
