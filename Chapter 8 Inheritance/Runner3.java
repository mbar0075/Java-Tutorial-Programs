
import java.util.ArrayList;
 import java.util.Scanner;
public class Runner3
{
   
     public static void main (String args[])
    {
        char choice;
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        ArrayList <Student2> studentList = new ArrayList<Student2>();
        Manipulate_Student2 ms = new Manipulate_Student2();
        ms.addStudent(studentList);
        ms.addStudent(studentList);
        ms.listAll(studentList);
        
    }
        
}
