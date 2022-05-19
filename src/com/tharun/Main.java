package com.tharun;

import java.awt.*;
import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int age = 30;
//        int temperature = 20;
//        age = 35;
//        int myAge = 30;
//        int herAge = myAge;
        byte age1 = 30;
        long  viewsCount = 3_123_456_789L;
        float  price = 10.99F;
        char letter = 'A';
//        boolean isEligible = false;
//        byte x = 1;
//        byte y = x;
//        x = 2;
//        System.out.println(y);
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
//        int[] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 2;
//        int[] numbers = {2, 3, 5, 1, 4};
//        System.out.println(numbers.length);
//        System.out.println(numbers);
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
        int[][][] numbers = new int[2][3][5];
        numbers[0][0][0] = 1;

//        System.out.println(Arrays.deepToString(numbers));

//        String message = "Hello \"Tharun\"";
//        String message = "c:\\Windows\\... ";
//        String message = "c:\n\tWindows\\... ";

//        System.out.println(message);

//        String message = new String("Hello World");
//        String message = "Hello World" + "!!";

//        System.out.println(message.length());
//        System.out.println(message);
//        System.out.println(message.endsWith("!!"));
//        System.out.println("point2 value is " + point2);
//        System.out.println("Hello World");
//        System.out.println(age);
//        System.out.println(herAge);

//        Date now = new Date();
//        now.getTime();
//        System.out.println(now);

        final float PI = 3.14F;
//        double result = (double)10 / (double) 3;
//        System.out.println("result value is "+result);
//        int x = 1;
////         /*x++;*/++x;
////        int y = x++;
//        int y = ++x;
//        int x = 10 + 3 * 2;
//        System.out.println("value of x is "+x);
//        System.out.println("value of x is "+x++);
//        System.out.println(x);
//        System.out.println("value of y is "+y);
//        System.out.println("value of y is "+y);
        // Implicit casting
        // byte > short > int > long > float > double
//        short x = 1;
//        double x = 1.1;
//        int y = x + 2;
//        double y = x + 2;
        //Explicit casting
//        int y = (int)x + 2;
//        String x = "1";
//        int y = Integer.parseInt(x) + 2;  //Wrapper class for int
//        System.out.println("x = "+x);
//        System.out.println("y = "+y);
//        int result = Math.round(1.1F);
//        int result = (int)Math.ceil( 1.1F);
//        int result = (int)Math.floor(1.1F);
//        int result = Math./*max*/min(1, 2);
//        int result = (int)Math.round(Math.random() * 100);
//        int result = (int)(Math.random() * 100);
//        System.out.println("result = "+result);
//        NumberFormat currency = new NumberFormat(); //cannot create instance of an abstract class
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        NumberFormat percent = NumberFormat.getPercentInstance();
//        String result = currency.format(1234567.891);
//        String result = percent.format(.1);
//        System.out.println("result is "+result);
//        String result = NumberFormat.getPercentInstance().format(0.1);
//        System.out.println("result value -> "+result);

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Age: ");
//        byte age = scanner.nextByte();
//        System.out.println("You are " + age);
//        System.out.print("Please enter your name: ");
//        String name = scanner./*next*/nextLine().trim();
//        System.out.println("Your name is "+name);
//        int x = 1;
//        int y = 1;
//        System.out.println(x == y);
//        int temperature = 22;
//        boolean isWarm = temperature > 20 && temperature < 30;
//        System.out.println("isWarm value is "+isWarm);
//        boolean hasHighIncome = true;
//        boolean hasGoodCredit = true;
//        boolean hasCriminalRecord = false;
//        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
//        int temp = 32;
//        if (temp > 30) {
//            System.out.println("It's a hot day");
//            System.out.println("Drink plenty of water");
//        } else if (temp > 20) {
//            System.out.println("It's a beautiful day");
//        } else {
//            System.out.println("It's a cold day");
//        }
        int income = 120_000;
//        boolean hasHighIncome = false;
        boolean hasHighIncome = (income > 100_000);
//        if (income > 100_000) {
//            hasHighIncome = true;
//        } else {
//            hasHighIncome = false;
//        }
//        System.out.println("Value of hasHighIncome is " + hasHighIncome);
//        String className = "Economy";
        String className = income > 100_000 ? "First" : "Economy";
//        if (income > 100_000) {
//            className = "First";
//        } /*else {
//            className = "Economy";
//        }*/
//        String role = "admin";
//
//        switch (role) {
//            case "admin":
//                System.out.println("You're an admin");
//                break;
//
//            case "moderator":
//                System.out.println("You're a moderator");
//                break;
//
//            default:
//                System.out.println("You're a guest");
//        }
//
//        if (role == "admin") {
//            System.out.println("You're an admin");
//        } else if (role == "moderator") {
//            System.out.println("You're a moderator");
//        } else {
//            System.out.println("You're a guest");
//        }
        //FizzBuzz exercise
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt();
//
////        if (number % 5 == 0 && number % 3 == 0) {
////            System.out.println("FizzBuzz");
////        }
//        if (number % 5 == 0) {
//            if (number % 3 == 0) {
//                System.out.println("FizzBuzz");
//            } else {
//                System.out.println("Fizz");
//            }
//        }
////        else if (number % 5 == 0){
////            System.out.println("Fizz");
////        }
//        else if (number % 3 == 0) {
//            System.out.println("Buzz");
//        }  else {
//            System.out.println(number);
//        }

//        for (int i = 0; i <5; i++) {
//            System.out.println("Hello World " + i);
//        }
//
//        int i =5;
//        while (i > 0) {
//            System.out.println("Hello World " + i);
//            i--;
//        }
//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        while (/*!input.equals("quit")*/true){
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
////            if (!input.equals("quit"))
////                System.out.println("input is: " + input);
//            if (input.equals("pass"))
//                continue;
//            if (input.equals("quit"))
//                break;
//            System.out.println("input is: " + input);
//        }
//        do {
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println("input is: " + input);
//        } while (!input.equals("quit"));
        String[] fruits = { "Apple", "Mango", "Orange" };
//        for (int i = 0; i < fruits.length; i++)
        for (int i = fruits.length - 1; i >= 0; i--)
            System.out.println(fruits[i]);
        for (String fruit : fruits)
            System.out.println(fruit);
    }
}
