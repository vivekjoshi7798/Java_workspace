package Searching;


import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number \n ");
        int number=sc.nextInt();
        int sum=0,inputNumber=number,rem=0;
        // 153 = (3*3*3)+(5*5*5)+(1*1*1)
        while (number>0){
            rem= number%10;
            sum=sum+(rem*rem*rem);
            number=number/10;
        }
        if(sum==inputNumber){
            System.out.println("the number is armstrong number");
        }
        else {
            System.out.println("the number is not armstrong number");
        }


    }
}

