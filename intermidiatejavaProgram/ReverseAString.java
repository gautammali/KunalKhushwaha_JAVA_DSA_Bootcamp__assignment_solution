package com.intermidiatejavaProgram;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String ans=reverse(s);
        System.out.println(ans);
    }
    static String reverse(String s){
        StringBuilder ans= new StringBuilder();
        for (int i = s.length()-1; i >=0 ; i--) {
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}
