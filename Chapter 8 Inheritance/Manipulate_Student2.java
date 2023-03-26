
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*; 

public class Manipulate_Student2  {
public  void addStudent(ArrayList<Student2> studentList)    {
        String name, surname, id, parentName, phone;
        String classNo;
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.print("Enter Name ");
        name = sc.next();
        
        System.out.print("Enter SurName ");
        surname = sc.next();
        System.out.print("Enter ID number ");
         id  = sc.next();
         System.out.print("Enter Parent Name ");
        parentName = sc.next();
        System.out.print("Enter Mobile no ");
        phone = sc.next();
        System.out.print("Enter student class ");
        classNo = sc.next();
        studentList.add(new Student2(parentName,phone,classNo, id, name, surname));
    }
    
        public  void listAll(ArrayList<Student2>studentList )    {
        for(Student2 item : studentList)
        {   
            System.out.println(item);
        }
    }
  }
