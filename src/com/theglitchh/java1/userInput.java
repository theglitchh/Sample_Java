package com.theglitchh.java1;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner KeyboardInput = new Scanner((System.in));
        System.out.println("enter your name");
        String UserName = KeyboardInput.nextLine();
        int UserAge  = KeyboardInput.nextInt();
        System.out.println("Hello "+ UserName + "\n" +"you are "+ UserAge +" old");
    }
}
