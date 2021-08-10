package com.intermidiatejavaProgram;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the point one : ");
        float point1= in.nextFloat();
        System.out.print("enter the point second: ");
        float point2= in.nextFloat();
        float Distance=point2-point1;
        //here Math.abs() is the function that will help is the distance in the negative it convert in to positive
        System.out.println("you Total Distance from point 1 to point 2 is: "+Math.abs(Distance));

    }
}
