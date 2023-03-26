/*Total Duration 1 hour 
 * 
 * 
 * 
 */
import java.util.*;
public class GradesAverage
{ 
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        //Question 2 Part b.
        PassFail passfail= new PassFail();
        //Question 1
        //Part a.
        System.out.println("Enter number of students");
        int numStudents=keyboard.nextInt();
        //Part b. , c.
        int grades[]= new int[numStudents];
        if(numStudents>0){
            for(int i = 0; i<numStudents;i++){
                do{
                    System.out.println("Enter grade of student "+(i+1));
                    grades[i]=keyboard.nextInt();
                    if((grades[i]<0)||(grades[i]>100))
                        System.out.println("Error , Out of Range"); 
                }
                while((grades[i]<0)||(grades[i]>100));
                boolean above= passfail.passORfail(grades[i]);
                System.out.println(above);
            }
        }

        //Part d.
        int sum=0;
        double average=0;
        for(int i = 0; i<numStudents;i++){
            sum+=grades[i];
        }
        average=(double)(sum/numStudents);
        System.out.println("The average is "+average);

    }
}
