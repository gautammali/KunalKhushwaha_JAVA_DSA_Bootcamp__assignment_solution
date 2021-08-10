package com.javacode;

import javax.swing.plaf.ScrollBarUI;
import java.util.Scanner;

public class LCMAndHCF {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        //here due to the while loop original values are modified that's
        //why  created the copy of it;
        int n1=num1,n2=num2;
        while(n2 !=0){
            int temp=n1%n2;
            n1=n2;
            n2=temp;
        }
        System.out.println("HCF of num is " + n1);
        //FOR FIND lcm-LOWEST COMMAN MULTIPLE
        int maxOfBoth=Math.max(num1,num2);
        for (int i=maxOfBoth;i<=(num1*num2);i+=maxOfBoth){
            if(i%num1==0 && i%num2==0){
                System.out.println("LCM of num is "+i);
                break;
            }
        }
    }
}
