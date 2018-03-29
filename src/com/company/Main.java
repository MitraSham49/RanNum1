package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Random r = new Random();

        int x = 1 + r.nextInt(10);

        System.out.println("My random number is " + x);

        System.out.println("Here are some numbers from 1 to 5!");
        System.out.print(1 + r.nextInt(5) + " ");
        System.out.print(1 + r.nextInt(5) + " ");
        System.out.print(1 + r.nextInt(5) + " ");
        System.out.print(1 + r.nextInt(5) + " ");
        System.out.print(1 + r.nextInt(5) + " ");
        System.out.print(1 + r.nextInt(5) + " ");
        System.out.println();

        System.out.println("Here are some numbers from 1 to 100!");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.println();
        int num1 = 1 + r.nextInt(10);
        int num2 = 1 + r.nextInt(10);

        if (num1 == num2) {
            System.out.println("The random numbers were the same! Weird.");
        }
        if (num1 != num2) {
            System.out.println("The random numbers were different! Not too surprising, actually.");
        }

/*
        // remove 1
        System.out.println(" Remove +1  and report random number :The random numbers were the same! Weird.");
        x = r.nextInt(10);

        System.out.println("My random number is " + x);
        System.out.println("Here are some numbers from 1 to 5!");
        System.out.print(r.nextInt(5) + " ");
        System.out.print(r.nextInt(5) + " ");
        System.out.print(r.nextInt(5) + " ");
        System.out.print(r.nextInt(5) + " ");
        System.out.print(r.nextInt(5) + " ");
        System.out.print(r.nextInt(5) + " ");
        System.out.println();

        System.out.println("Here are some numbers from 1 to 100!");
        System.out.print(r.nextInt(100) + "\t");
        System.out.print(r.nextInt(100) + "\t");
        System.out.print(r.nextInt(100) + "\t");
        System.out.print(r.nextInt(100) + "\t");
        System.out.print(r.nextInt(100) + "\t");
        System.out.print(r.nextInt(100) + "\t");
        System.out.println();
        int num3 = r.nextInt(10);
        int num4 = r.nextInt(10);

        if (num3 == num4) {
            System.out.println("The random numbers were the same! Weird.");
        }
        if (num3 != num4) {
            System.out.println("The random numbers were different! Not too surprising, actually.");
        }
        // add +3


        System.out.println(" Remove +3  and report random number :The random numbers were the same! Weird.");
        x = r.nextInt(10);

        System.out.println("My random number is " + x);
        System.out.println("Here are some numbers from 1 to 5!");
        System.out.print(3 + r.nextInt(5) + " ");
        System.out.print(3 + r.nextInt(5) + " ");
        System.out.print(3 + r.nextInt(5) + " ");
        System.out.print(3 + r.nextInt(5) + " ");
        System.out.print(3 + r.nextInt(5) + " ");
        System.out.print(3 + r.nextInt(5) + " ");
        System.out.println();

        System.out.println("Here are some numbers from 1 to 100!");
        System.out.print(3 + r.nextInt(100) + "\t");
        System.out.print(3 + r.nextInt(100) + "\t");
        System.out.print(3 + r.nextInt(100) + "\t");
        System.out.print(3 + r.nextInt(100) + "\t");
        System.out.print(3 + r.nextInt(100) + "\t");
        System.out.print(3 + r.nextInt(100) + "\t");
        System.out.println();

        int num5 = 3 + r.nextInt(10);
        int num6 = 3 + r.nextInt(10);

        if (num5 == num6) {
            System.out.println("The random numbers were the same! Weird.");
        }
        if (num5 != num6) {
            System.out.println("The random numbers were different! Not too surprising, actually.");
        }
*/
       r = new Random(12353);
        System.out.println(" Add seed 12353  and report random number :The random numbers were the same! Weird.");
        x = 1 + r.nextInt(10);

        System.out.println("My random number is " + x);

        System.out.println("Here are some numbers from 1 to 5!");
        System.out.print(1 + r.nextInt(5) + " ");
        System.out.print(1 + r.nextInt(5) + " ");
        System.out.print(1 + r.nextInt(5) + " ");
        System.out.print(1 + r.nextInt(5) + " ");
        System.out.print(1 + r.nextInt(5) + " ");
        System.out.print(1 + r.nextInt(5) + " ");
        System.out.println();

        System.out.println("Here are some numbers from 1 to 100!");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.println();
      /*  int num1 = 1 + r.nextInt(10);
        int num2 = 1 + r.nextInt(10);

        if (num1 == num2) {
            System.out.println("The random numbers were the same! Weird.");
        }
        if (num1 != num2) {
            System.out.println("The random numbers were different! Not too surprising, actually.");
        }*/
    }
}

