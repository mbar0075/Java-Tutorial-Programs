import java.util.*;
public class Marks3
{
    private static Scanner sc = new Scanner(System.in);
    public static void main( String args[]){
        ArrayList <Double> marks = new ArrayList <Double>();
        ArrayList <String> names = new ArrayList <String>();

        int input,num;
        do{
            System.out.println("Choose from the folowing Menu:\n1.Input a mark\n2.Show marks\n3.Sort List\n4.Find highest mark\n5.Quit");

            input = sc.nextInt();
            switch(input){
                case 1:inputMarks(marks,names);
                break;
                case 2:displayAll(marks,names);
                break;
                case 3:Sort(marks,names);
                break;
                case 4:double max =0;
                for(int i =0; i<marks.size();i++){
                    if(max<marks.get(i))
                        max=marks.get(i);
                }
                System.out.println("The highest mark is "+max);
                break;
                case 5:System.out.println("Goodbye");
                break;
                default:System.out.println("Invalid Entry");   
            }
        }while (input!=5);
    }

    public static void inputMarks(ArrayList a, ArrayList b){
        System.out.println("Input name");
        String name = sc.next();
        System.out.println("Input mark");
        double mark = sc.nextDouble();
        a.add(mark);
        b.add(name);
    }

    public static void displayAll(ArrayList a, ArrayList b){
        for(int i =0; i<a.size();i++){
            System.out.println(a.get(i)+" \t "+b.get(i));
        }
    }

    public static void Sort(ArrayList a, ArrayList b){
        double temp[] = new double[a.size()];
        for(int i =0; i<a.size();i++){
            temp[i]=(double)(a.get(i));
        }
        Collections.sort(a);
        int count=0;
        for(int j =0; j<a.size();j++){
            for(int i =0; i<(a.size()-1);i++){
                if((temp[i]==(double)(a.get(j)))&&(count==0)){
                    String swap = (String)(b.get(i));
                    b.set(i,b.get(j));
                    b.set(j,swap);
                }
            }
        }
    }
}
