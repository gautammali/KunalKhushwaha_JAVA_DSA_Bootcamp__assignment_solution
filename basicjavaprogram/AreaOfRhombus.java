package com.basicjavaprogram;

import java.awt.geom.Area;
import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double d1=in.nextDouble();
        double d2= in.nextDouble();
        double AreaOfRhombus=0.5*d1*d2;
        System.out.println(AreaOfRhombus);
    }
}
