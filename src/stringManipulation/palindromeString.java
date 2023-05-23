package stringManipulation;

import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        String inputString;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        inputString = sc.nextLine();
        System.out.println("Entered string is :" +inputString);
        for (int startIndex = 0,endIndex=inputString.length()-1;startIndex < inputString.length()/2; startIndex++,endIndex--) {
            if(inputString.charAt(startIndex)!= inputString.charAt(endIndex)){
                System.out.println("String is not palindrome");
                break;
            }

        }
        System.out.println("String is Palindrome");
    }
}
