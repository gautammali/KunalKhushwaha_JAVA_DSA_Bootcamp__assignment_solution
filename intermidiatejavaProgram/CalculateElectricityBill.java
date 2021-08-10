package com.intermidiatejavaProgram;

import java.util.Scanner;

public class CalculateElectricityBill {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the used unit for electricity : ");
        double unit=in.nextDouble();
        System.out.println("enter the price of a unit current price is: \"Rs. 7.30 per unit\":");
        double price=in.nextDouble();
        double TotalBill=unit*price;
        System.out.println("total bill = "+TotalBill);
    }
}
