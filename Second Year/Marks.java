import java.util.*;
public class Marks{
    void inputMarks(double a[]){
        Scanner s = new Scanner (System.in);
        for (int i=0; i<a.length; i++){
            System.out.print("Please input mark #"+(i+1)+": ");
            a[i]=s.nextDouble();
        }
    }

    void showMarks(double a[]){
        for (int i=0; i<a.length; i++){
            System.out.println("Marks in array: "+(a[i]));
        }
    }

    double highMark(double a[]){
        double max = Double.MIN_VALUE; 
        for (int i=0; i<a.length; i++){
            if (a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
}