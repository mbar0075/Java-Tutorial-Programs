import java.util.*;
public class Admin
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        String name[] = new String[4];
        String surname[] = new String[4];
        String id[] = new String[4];
        Student s[] = new Student[4];

        for( int i =0;i<4;i++){
            System.out.println("Input name "+(i+1));
            name[i] = sc.next();
            System.out.println("Input surname "+(i+1));
            surname[i] = sc.next();
            System.out.println("Input id "+(i+1));
            id[i] = sc.next();
            s[i]= new Student(id[i],name[i],surname[i]);
        }
        
        labClass l = new labClass("07/12/2020","05.40","Kratos","Valhalla");
        for( int i =0;i<4;i++){
            l.enrollStudents(s[i]);
        }
        System.out.println();
        l.printDetails();
        System.out.println();
        l.printList();
    }
}
