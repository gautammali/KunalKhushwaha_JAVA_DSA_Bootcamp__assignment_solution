package com.javacode;
import java.util.Scanner;

public class TempratureConvertion {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        float tempC=sc.nextFloat();
        float res=(tempC * 9/5)+32;
        System.out.println(res);
    }
}
