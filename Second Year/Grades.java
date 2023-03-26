import java.util.*;
public class Grades
{
    private static Scanner sc = new Scanner(System.in);
    private static double mark;
    private static char grade;

    public static void main( String args[]){
        mark=inputMark();
        calcGrade(mark);
    }

    private static double inputMark(){
        mark=-1;
        while((mark<1)||(mark>100)){
            System.out.println("Input mark between 1 and 100");
            mark=sc.nextDouble();
        }
        return mark;
    }

    private static void calcGrade(double mark){
        if((mark>=0)&&(mark<=49))
            System.out.println("Grade F");
        else if((mark>=50)&&(mark<=64))
            System.out.println("Grade D");
        else if((mark>=65)&&(mark<=74))
            System.out.println("Grade C");
        else if((mark>=75)&&(mark<=84))
            System.out.println("Grade B");
        else if((mark>=85)&&(mark<=100))
            System.out.println("Grade A");   
    }
}
