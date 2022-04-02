package com.theglitchh.java1;

import java.util.Scanner;

public class if_statement_learn {
    public static void main(String[] args) {
        MyChar();
//        Scanner KeyboardInput = new Scanner(System.in);
//        boolean isMale = KeyboardInput.nextBoolean();
//      if (isMale) {
//           System.out.println("true");
//     }else{
//         System.out.println("not male");
//   }
    }
    public  static  void MyChar(){
        System.out.println("Are you male");
        Scanner KeyboardChar = new Scanner(System.in);
        boolean isMale = KeyboardChar.nextBoolean();
        System.out.println("are you tall");
        boolean isTall = KeyboardChar.nextBoolean();
        if (isMale && isTall){
            System.out.println("you are male and tall");

        }else if(isMale || isTall) {
            System.out.println("you are either  male or tall");
        }else {
            System.out.println("you are neither male nor tall");
        }
    }
}