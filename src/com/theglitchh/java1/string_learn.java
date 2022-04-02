package com.theglitchh.java1;

public class string_learn {
    public static void main(String[] args) {

        String stringNum="giraffe \nAcademy ";
        String stringNum1="giraffe \"Academy\"";
        String stringNum2 = "giraffe academy";
        System.out.println(stringNum1);
        System.out.println(stringNum2.toUpperCase());
        System.out.println(stringNum2.toLowerCase());
        System.out.println(stringNum2.length());
        System.out.println(stringNum2.contains("academy"));
        System.out.println(stringNum2.charAt(0));
        System.out.println(stringNum2.indexOf('a'));
        System.out.println(stringNum2.lastIndexOf('a'));
        System.out.println(stringNum2.substring(8));
        System.out.println(stringNum2.substring(8,11));
        System.out.println(stringNum2.substring(0, stringNum2.indexOf(" ")));


    }
}
