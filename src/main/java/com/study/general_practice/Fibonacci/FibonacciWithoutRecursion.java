package com.study.general_practice.Fibonacci;

import java.util.Scanner;

public class FibonacciWithoutRecursion {
    public static void main(String[] args) {

//        1. Can you write a method to print all Fibonacci numbers under a given number?
//        2. Why will the loop never stop in your Fibonacci method?

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int prevSum=0;
        int sum=1;
        System.out.println(prevSum);
        for (int i = 0; i < number; i++) {
            System.out.println(sum);
            int temp=sum;
            sum=prevSum+sum;
            prevSum=temp;
        }


    }

}
