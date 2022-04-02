package com.theglitchh.java1;

import java.util.Arrays;

public class array_learn {
    public static void main(String[] args) {
       String [] newArray1 = new String[3]; // 1 way of defining array
        int [] newArray = {1,2,3,4}; // regular way of defining array
        System.out.println(newArray[2]);
        System.out.println(newArray.length);
        newArray [2] = 4;
        newArray1 [0] = "sourav";
        newArray1 [1] = "is also called";
        newArray1 [2] = "TheGlitchh";
        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.toString(newArray1));
    }
}
