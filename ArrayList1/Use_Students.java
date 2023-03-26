
import java.util.*;    

public class Use_Students
{
    public static void main (String args[])
    {
    char choice;
        // create an empty list to hold Students
        ArrayList<Students> studentsList = new ArrayList<Students>();
        Scanner keyboard = new Scanner(System.in);
        
        addStudent(studentsList);
        addStudent(studentsList);
        addStudent(studentsList);
        listAll(studentsList);
        removeStudent(studentsList);
         listAll(studentsList);
        
    }   // main method
    
    
        // method for adding a new student to the list
    private static void addStudent(ArrayList<Students> studentListIn)
    {
        String tempName;
        String tempSurname;
        String tempPhone;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the student Name: ");
        tempName = keyboard.next();
        System.out.print("Please enter the student Surname: ");
        tempSurname = keyboard.next();
        System.out.print("Please enter the student Phone no: ");
        tempPhone = keyboard.next();
        studentListIn.add(new Students(tempName, tempSurname, tempPhone));
    }
    
    
    private static void removeStudent(ArrayList<Students> studentsListIn)
    {
        int pos;
         Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the position of the student to be removed: ");
        pos = keyboard.nextInt();
        studentsListIn.remove(pos - 1);
    }
    
    
     // method for listing details of all students in the list
    private static void listAll(ArrayList<Students> studentsListIn)
    {
        for(Students item : studentsListIn)
        {   
              System.out.println(item.getName()
                               + " "
                               + item.getSurname()
                               + " "
                               + item.getPhone());
        }
    }
    
}