package com.theglitchh.java1;

import java.util.Scanner;

public class method_learn {
    public static void main(String[] args) {
        Scanner KeyboardCatch = new Scanner(System.in); // initialising user input
        String CharName = KeyboardCatch.nextLine(); // taking user input
        sayHi(); // method function
        sayHello(CharName);
        sayHello("theglitchh");
        sayInfo("Sourav", 21);
    }

    public static void sayHi(){
        System.out.println("hello sourav");


    }
    public static void sayHello(String CharName) {
        System.out.println("Hello "+CharName); // used the Scanner to get user input
    }

    public static void sayInfo(String name, int age){
        System.out.println("you name is "+ name + " you are "+ age +" years of age");
    }
}


