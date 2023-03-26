import java.util.*;
public class StatisticsMain
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        Statistics st = new Statistics();
        st.Input();
         int choice = 0;
        do{
            System.out.println("Choose from the following Options:\n1.Average\n2.MaxMin\n3.Histogram\n4.Progress Report\n5.Quit");
            choice = sc.nextInt();
            switch(choice){
                case 1:st.Average();
                break;
                case 2:st.MaxMin();
                break;
                case 3:st.Histogram();
                break;
                case 4:st.ProgressReport();
                break;
                case 5:System.out.println("\f\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t\tGoodbye");
                break;

                default:System.out.println("Invalid");  
            }
        }while(choice!=5);
    }
}