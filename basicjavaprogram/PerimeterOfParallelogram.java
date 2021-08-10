package com.basicjavaprogram;

import java.io.OutputStream;
import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter base: ");
        double base=in.nextDouble();
        System.out.print("enter side: ");
        double side=in.nextDouble();
        double PerimeterOfParallelogram=2*(side+base);
        System.out.println(PerimeterOfParallelogram);
    }
}
