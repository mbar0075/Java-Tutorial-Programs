import java.util.*;
public class College
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);

        ArrayList <FullTimeStudent> f = new ArrayList <FullTimeStudent>();
        ArrayList <PartTimeStudent> p = new ArrayList <PartTimeStudent>();

        int input,num;
        do{
            System.out.println("Choose from the folowing Menu:\n1.Add a new Student\n2.Display Student details\n3.Quit");

            input = sc.nextInt();
            switch(input){
                case 1:
                System.out.println("Input name");
                String name = sc.next();
                System.out.println("Input date of birth");
                String dob = sc.next();
                int choice=-1;
                while (choice<0){
                    System.out.println("Input 1 for full time employee and 2 for part time employee");
                    choice = sc.nextInt();
                }
                if(choice==1){
                    System.out.println("Input address");
                    String address = sc.nextLine();
                    System.out.println("Input telephone");
                    int tel = sc.nextInt();
                    f.add(new FullTimeStudent(name,dob,true,address,tel));
                }
                else if(choice==2){
                    System.out.println("Input number of courses");
                    int courses = sc.nextInt();
                    p.add(new PartTimeStudent(name,dob,false,courses));
                }
                else
                    System.out.println("Invalid option");
                break;
                case 2:
                System.out.println(f);
                System.out.println(p);
                break;
                case 3:System.out.println("Goodbye");
                break;
                default:System.out.println("Invalid Entry");   
            }
        }while (input!=3);
    }
}
