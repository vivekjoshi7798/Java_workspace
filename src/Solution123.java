import java.util.Scanner;

public class Solution123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key;
        int[] inputNumber= new int[10];
        for (int i = 0; i < 10; i++) {
            inputNumber[i]=sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(inputNumber[i]);
        }
        System.out.println("Enter Key: ");
        key = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            if (key == inputNumber[i]){
                System.out.println("Element " +key+"found at index"+i);
                break;
            }

        }
    }
}
