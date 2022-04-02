package com.theglitchh.java1;

public class return_statement_learn {
    public static void main(String[] args) {
        System.out.println(MyMethod(2));
        boolean Bool= MyBool(false); // describing bool variable as MyBoot
        System.out.println(Bool); //calling Bool variable
    }
    public static int MyMethod(int numberToCube){
return (numberToCube * numberToCube * numberToCube);
    }
    public static Boolean MyBool(boolean HelloBool){
  return    true; // returning boolean value to MyBool
    }
}
