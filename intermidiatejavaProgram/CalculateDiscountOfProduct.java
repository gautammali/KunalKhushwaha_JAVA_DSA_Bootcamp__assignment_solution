package com.intermidiatejavaProgram;

import java.util.Scanner;

public class CalculateDiscountOfProduct {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("please enter the price of the product :");
        float price= in.nextFloat();
        System.out.print("enter the discount on product in % :");
        float Discount= in.nextFloat();
        System.out.println("total Discount :"+(price*Discount)/100+" RS");
        float netPrice=price-((price*Discount)/100);
        System.out.println("Total Payble Amount : " + netPrice + " RS");
        System.out.println("thank you visit Again");
    }
}
