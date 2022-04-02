package com.theglitchh.java1;

import java.security.Key;
import java.util.Scanner;

public class calculator_learn {
    public static void main(String[] args) {

        Scanner   KeyboardInput = new Scanner(System.in);
        System.out.println(" enter the first number");
        int FirstNum = KeyboardInput.nextInt();
        System.out.println("enter the 2nd number");
        int SecNum  = KeyboardInput.nextInt();
        System.out.println(FirstNum + SecNum);
    }
}
