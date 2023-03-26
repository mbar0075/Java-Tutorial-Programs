import java.util.*;
public class Manipulate_Staff_Students
{
    private Scanner sc = new Scanner(System.in);
    public void addPerson(ArrayList<Staff> staffListIn, ArrayList<Student> studentListIn, char choice){
        choice = Character.toUpperCase(choice);
        String name,room,id;
        int year;
        if(choice=='T'){
            System.out.println("Input teacher name"); 
            name = sc.next();
            System.out.println("Input StaffRoom"); 
            room = sc.next();
            System.out.println("Input year of birth"); 
            year = sc.nextInt();
            staffListIn.add(new Staff(name,year,room));
        }
        else if(choice=='S'){
            System.out.println("Input student name"); 
            name = sc.next();
            System.out.println("Input student id"); 
            id = sc.next();
            System.out.println("Input year of birth"); 
            year = sc.nextInt();
            studentListIn.add(new Student(name,year,id));
        }
        else
            System.out.println("Invalid choice ");
    }

    public void listAll(ArrayList<Staff> staffListIn, ArrayList<Student> studentListIn, char type){
        if(type=='T'){
            for(int i =0;i<staffListIn.size();i++){
                System.out.println(staffListIn.get(i)); 
            }
        }
        else if(type=='S'){
            for(int i =0;i<studentListIn.size();i++){
                System.out.println(studentListIn.get(i)); 
            } 
        }
        else
            System.out.println("Invalid choice ");
    }

    public void listbyRoomNo (ArrayList<Staff> staffListIn){
        System.out.println("Input StaffRoom"); 
        String room = sc.next();
        int pos= staffListIn.indexOf(new Staff(null,0,room)); 
        if(pos==-1){
            System.out.println("Not found");
        } 
        else{
            System.out.println(staffListIn.get(pos));
        }
    }
}
