package com.basicjavaprogram;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter base: ");
        double base=in.nextDouble();
        System.out.print("enter side: ");
        double side=in.nextDouble();
        double PerimeterOfRectangle=2*(side+base);
        System.out.println(PerimeterOfRectangle);
    }
}
