import java.util.*;
public class Use_Staff_Stud
{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);   
        ArrayList<Student> studentList = new ArrayList<Student>();
        ArrayList<Staff> staffList = new ArrayList<Staff>();
        Manipulate_Staff_Students M = new Manipulate_Staff_Students();
        int choice =0;
        do{
            System.out.println("1. Add a new Staff ");
            System.out.println("2. Add a new student");
            System.out.println("3. List all staff");
            System.out.println("4. List all students");
            System.out.println("5. List Staff in Room number ");
            System.out.println("6. Quit\n");
            choice= sc.nextInt();

            switch(choice){
                case 1:M.addPerson(staffList ,studentList,'T');
                break;
                case 2:M.addPerson(staffList ,studentList,'S');
                break;
                case 3:M.listAll(staffList ,studentList,'T');
                break;
                case 4:M.listAll(staffList ,studentList,'S');
                break;
                case 5:M.listbyRoomNo(staffList);
                break;
                case 6:System.out.println("Goodbye");
                break;

                default:System.out.println("Invalid");
            }
        } while(choice!=6);
    }
}
