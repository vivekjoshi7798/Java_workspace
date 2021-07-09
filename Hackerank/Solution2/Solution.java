
import java.util.*;

public class Solution {

	static Scanner SC =new Scanner(System.in);
	static int B= SC.nextInt() ;
	static int H= SC.nextInt() ;
	static Boolean  flag = null;

static {
    try 
    {
	flag =  B> 0 && H > 0 ? true : false ;
    if(!flag)
        {
            throw new Exception("Breadth and height must be positive");
        }
    }
    catch (Exception e)
    {
        System.out.println(e);
    }

}

public static void main(String[] args){
		
    
        if(flag){
			int area=B*H;
			System.out.print(area);
		}
      
  

		
	}//end of main

}//end of class