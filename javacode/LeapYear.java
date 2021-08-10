package com.javacode;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long year=in.nextLong();
        if (year %4==0 && year %100 !=0){
            System.out.println(year+" leap year");
        }
        else if(year %400==0){
            System.out.println(year +" leap year");
        }
        else {
            System.out.println(year+" not a leap year");
        }
    }
}
