package com.basicjavaprogram;
import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double PI=Math.PI;//3.14;
        double radius=in.nextDouble();
        double perimeterOfCircle=2*PI*radius;
        System.out.println(perimeterOfCircle);
    }
}
