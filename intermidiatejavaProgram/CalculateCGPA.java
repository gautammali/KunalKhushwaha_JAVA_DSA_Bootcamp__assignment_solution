package com.intermidiatejavaProgram;

import java.util.Scanner;

public class CalculateCGPA {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number of subject :");
        int numOfSub=in.nextInt();
        System.out.println("enter the total score in the exam :");
        float totalScore=in.nextInt();
        float percentage=(totalScore/(100*numOfSub))*100;
        float CGPA=(percentage/9.5f);
        System.out.println("CGPA : "+CGPA);
    }
}
