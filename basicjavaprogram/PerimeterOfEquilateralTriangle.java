package com.basicjavaprogram;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double side=in.nextDouble();
        double perimeterOfTriangle=3*side;
        System.out.println(perimeterOfTriangle);
    }
}
