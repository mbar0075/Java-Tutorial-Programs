import java.util.*;
public class League2
{
    private Scanner sc = new Scanner(System.in);
    private String name;
    private int pts;

    public League2()
    {  
    }

    public League2(String name,int pts){
        this.name =name;
        this.pts=pts;
    }

    public void inputServices (League2[] teams){
        for(int i=0;i<teams.length;i++){
            System.out.println("Input name "+(i+1));
            name=sc.next();
            System.out.println("Input points "+(i+1));
            pts=sc.nextInt();
            teams[i]=new League2(name,pts);
        }
    }

    public String getName(){
        return name;
    }

    public int getPts(){
        return pts;
    }

    public String toString(){        
        return name +"  "+pts; 
    }

    public void show(League2[] teams){
        for(int i=0;i<teams.length;i++){
            System.out.println(teams[i].toString());
        }
    }

    public void sort(League2[] teams){
        int n=teams.length;
        League2 temp;
        for(int i=0;i<(n-1);i++){
            for(int j=i+1;j<n;j++){
                    if (teams[j].getPts()>teams[i].getPts()){
                        temp=teams[i];
                        teams[i]=teams[j];
                        teams[j]=temp;
                    }
            }
        }
    }
}
