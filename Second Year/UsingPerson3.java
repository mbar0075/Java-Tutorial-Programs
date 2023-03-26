import java.time.LocalDate;
import java.util.*;
public class UsingPerson3
{
    public static void main( String args[]){
        Scanner sc= new Scanner(System.in);
        Person2 p1 = new Person2();
        Person2 p2 = new Person2();
        int input =0;
        int count=0;
        LocalDate currentdate =LocalDate.now();
        do{
            System.out.println("Choose from the folowing Menu:\n1.Input Details\n2.Calculate Age\n3.Show Details\n4.Quit");

            input = sc.nextInt();
            switch(input){
                case 1:System.out.println("Input name 1");
                String n1=sc.next();
                System.out.println("Input surname 1");
                String s1=sc.next();
                p1.setName(n1);
                p1.setSurname(s1);
                System.out.println("Input days 1");
                int d1 = sc.nextInt();
                System.out.println("Input months 1");
                int m1 = sc.nextInt();
                System.out.println("Input years 1");
                int y1 = sc.nextInt();
                p1.setDOB(d1,m1,y1);

                System.out.println("Input name 2");
                String n2=sc.next();
                System.out.println("Input surname 2");
                String s2=sc.next();
                p2.setName(n2);
                p2.setSurname(s2);
                System.out.println("Input days 2");
                int d2 = sc.nextInt();
                System.out.println("Input months 2");
                int m2 = sc.nextInt();
                System.out.println("Input years 2");
                int y2 = sc.nextInt();
                p2.setDOB(d2,m2,y2);

                count=1;
                break;
                case 2:
                int cd = currentdate.getDayOfMonth();
                int cm = currentdate.getMonthValue();
                int cy = currentdate.getYear();
                if(count==1){
                    System.out.println(p1.calcAge(cd,cm,cy));
                    System.out.println(p2.calcAge(cd,cm,cy)); 
                }
                count=2;
                break;
                case 3:
                if(count==2){
                    System.out.println(p1);
                    System.out.println(p2);
                }
                break;
                case 4:System.out.println("Goodbye");
                break;
                default:System.out.println("Invalid Entry");   
            }
        }while (input!=4);
    }
}
