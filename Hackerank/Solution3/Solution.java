import java.util.Scanner;
class Solution 
{
public static void main(String[] args){
    Scanner SC =new Scanner(System.in);
    int B= SC.nextInt() ;

    String str= Integer.toString(B);
    if (str.getClass().getName().equals("java.lang.String"))
    {	
    	System.out.println("Good job");
    }
    else
    {
    	System.out.println("Wrong answer" );
    }
}
}