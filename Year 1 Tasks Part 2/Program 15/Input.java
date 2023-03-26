import java.util.*;
public class Input
{
    private Scanner sc = new Scanner(System.in);
    private ArrayList input=new ArrayList();
    private String []query = {"dog","cat","mouse"};
    private int []result=new int[3];
    private int count=0;
    private boolean stop=false;
    private String temp;

    public void Input(){
        count=0;
        do{
            System.out.println("Input 'stop' to Quit");
            System.out.println("Input element ");
            temp=sc.next();
            input.add(temp);
            if(temp.equals("stop"))
                stop=true;
        }while(temp.equals("stop")==false);
    }

    public int[] CompareInstances()
    {
        for(int i =0;i<input.size();i++){
            for(int j =0;j<query.length;j++){
                if(input.get(i).equals(query[j])){
                    result[j]++;
                }
            } 
        }
        return result;
    }

    public boolean getStop(){
        return stop;
    }

}
