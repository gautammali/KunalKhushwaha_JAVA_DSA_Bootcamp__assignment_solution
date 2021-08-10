package com.intermidiatejavaProgram;

import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of product : ");
        float originalPrice=sc.nextFloat();
        System.out.print("enter the Commotion % :");
        float Commotion=sc.nextFloat();
        float TotalCommotion=(originalPrice*Commotion)/100;
        System.out.println("Your Total commotion :"+TotalCommotion+" RS");
    }
}
