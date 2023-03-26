import java.util.*;
public class UsingStudents2
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        
        Students2 s1 = new Students2();
        System.out.println("Input name ");
        String name1 = sc.next();
        s1.setName(name1);
        System.out.println("Input  mark1");
        int mark1 = sc.nextInt();
        System.out.println("Input mark 2");
        int mark2 = sc.nextInt();
        s1.setMarks(mark1,mark2);
        
        Students2 s2 = new Students2("Computing",0,0);
        System.out.println("Input name ");
        String name2 = sc.next();
        s2.setName(name2);
        System.out.println("Input  mark1");
        int mark3 = sc.nextInt();
        System.out.println("Input mark 2");
        int mark4 = sc.nextInt();
        s2.setMarks(mark3,mark4);
        
        System.out.println(s1);
        System.out.println(s2);
        }
}
