import java.util.*;
public class Main 
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        boolean Stop=false;
        do{
            Input input = new Input();

            input.Input();
            int[]result=input.CompareInstances();

            Computation comp = new Computation();
            comp.ShowAverage(result);

            Stop = input.getStop();
        }while(Stop!=true);
    }    
}
