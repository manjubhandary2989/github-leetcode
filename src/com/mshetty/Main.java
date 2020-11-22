package com.mshetty;

public class Main {

    public static void main(String[] args) {
	// write your code here

        char ch = '3';
        System.out.println("char value: " + ch);

        // Converting the Character to it's int value
        int a = Character.getNumericValue(ch);
        System.out.println("int value: " + a);

        // Converting ch to it's int value
        int b = ch- '0';
        System.out.println("int value: " + b);

        System.out.println("**********************************************");

        String sg1="Hello";
        String sg2="Hello";
        System.out.println("String comparison: " + (sg1==sg2));
        System.out.println("String comparison using equals: " + (sg1.equals(sg2)));


        System.out.println("**********************************************");


        StringBuilder s1 = new StringBuilder("Test");
        StringBuilder s2 = new StringBuilder("Test");


        System.out.println(s1);
        System.out.println(s2);
        System.out.println("Result 1: " + (s1==s2));
        System.out.println("Result 2: " + s1.equals(s2)); //Line 1
        System.out.println("Result 3: " + (s1.toString()==s2.toString())); //Line 2

        if(s1.toString()==s2.toString())
            System.out.println("True here 1"); //Line 3
        else
            System.out.println("False here 1");

        if(s1.toString().equals(s2.toString()))
            System.out.println("True here 2");
        else
            System.out.println("False here 2");
    }
}
