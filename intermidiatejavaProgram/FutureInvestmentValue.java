package com.intermidiatejavaProgram;

import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the principle Amount : ");
        double principleAmount=in.nextDouble();
        System.out.print("enter the interest Rete: ");
        double InterestRate=in.nextDouble();
        System.out.print("enter the number of year : ");
        double year=in.nextDouble();
        double FV=principleAmount*(1+((InterestRate*year)/100));
        System.out.println("FV Amount: "+FV);
    }
}
