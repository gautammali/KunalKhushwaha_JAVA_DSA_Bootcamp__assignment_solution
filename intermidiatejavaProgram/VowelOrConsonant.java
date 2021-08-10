package com.intermidiatejavaProgram;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        System.out.println(checkVowelConstant(s.trim().charAt(0)));
    }

    private static boolean checkVowelConstant(char c) {
        return c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'U' || c == 'u';
    }
}
