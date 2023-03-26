import java.util.*;
public class League
{
    private Scanner sc = new Scanner(System.in);
    public String name[]={"Manchester","Juventus","Barcelona","Real Madrid"};
    public int pts,matches,wins,draws,losses;

    public void Input (int[][] teams){
        for(int i=0;i<teams.length;i++){
            pts=-1;
            matches=-1;
            wins=1000;
            draws=1000;
            do{
                System.out.println("Input matches played by "+name[i]);
                try{
                    matches=sc.nextInt();
                }
                catch(Exception e){
                    System.out.println(e);  
                }
                sc.nextLine();
                if(matches<=0)
                    System.out.println("Re-enter");
            }while(matches<=0);
            do{
                System.out.println("Input wins earned by "+name[i]);
                try{
                    wins=sc.nextInt();
                }
                catch(Exception e){
                    System.out.println(e);  
                }
                sc.nextLine();
                if(wins>matches)
                    System.out.println("Re-enter");
            }while(wins>matches);
            do{
                System.out.println("Input draws earned by "+name[i]);
                try{
                    draws=sc.nextInt();
                }
                catch(Exception e){
                    System.out.println(e);  
                }
                sc.nextLine();
                if(draws>(matches-wins))
                    System.out.println("Re-enter");
            }while(draws>(matches-wins));
            losses = matches-wins-draws;
            pts=wins*4;
            teams[i][0]=matches;
            teams[i][1]=wins;
            teams[i][2]=draws;
            teams[i][3]=losses;
            teams[i][4]=pts;
        }
    }
}
