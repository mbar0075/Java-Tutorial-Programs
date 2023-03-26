import java.util.*;
public class UsingStudents
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        
        Students s1 = new Students();
        System.out.println("Input name 1");
        String name1 = sc.next();
        s1.setName(name1);
        System.out.println("Input surname 1");
        String surname1 = sc.next();
        s1.setSurname(surname1);
        System.out.println("Input practical mark1");
        int pmark1 = sc.nextInt();
        s1.setPmark(pmark1);
        System.out.println("Input theoretical 1");
        int tmark1 = sc.nextInt();
        s1.setTmark(tmark1);
        
        Students s2 = new Students();
        System.out.println("Input name 2");
        String name2 = sc.next();
        s2.setName(name2);
        System.out.println("Input surname 2");
        String surname2 = sc.next();
        s2.setSurname(surname2);
        System.out.println("Input practical mark2");
        int pmark2 = sc.nextInt();
        s2.setPmark(pmark2);
        System.out.println("Input theoretical 2");
        int tmark2 = sc.nextInt();
        s2.setTmark(tmark2);
        
        System.out.println(s1);
        System.out.println(s2);
        }
}
