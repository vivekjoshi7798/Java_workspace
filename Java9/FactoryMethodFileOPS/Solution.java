import java.util.*;
import java.io.*;

class Employee  implements Serializable
{
    int Emp_No;
    String Emp_name;

    Employee(int Emp_No, String Emp_name )
    {
            this.Emp_No= Emp_No;
            this.Emp_name = Emp_name;
    }

    public String toString()
    {
        return Emp_No+"__"+Emp_name;
    }
}

public class Solution
{
    public static void main(String Args[]) throws IOException,FileNotFoundException,ClassNotFoundException
    {

        Employee Em1= new Employee(1,"Raj");
        Employee Em2= new Employee(2,"ram");
        Employee Em3= new Employee(3,"sham");
        Employee Em4= new Employee(4,"Sita");
        List<Employee> L1= List.of(Em1,Em2,Em3,Em4);
        System.out.println(L1);

        System.out.println("----- Serialising Object ----- ");
        FileOutputStream FOS= new FileOutputStream("Abc.txt"); 
        ObjectOutputStream S1= new ObjectOutputStream(FOS);
        S1.writeObject(L1);
        System.out.println("----- deSerialising Object ----- ");
        FileInputStream FIS = new FileInputStream("Abc.txt");
        ObjectInputStream OIS = new ObjectInputStream(FIS);
        List<Employee> L2= (List<Employee>)OIS.readObject();
        System.out.println(L2);



    }
}
