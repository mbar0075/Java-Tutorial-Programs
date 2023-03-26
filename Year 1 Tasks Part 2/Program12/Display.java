import java.util.*;
public class Display
{
    League l1;
    public Display(League l){
        l1 = l;
    }
    
    public void Display(int[][] teams){
        System.out.println("Teams\t\tMatches\tWins\tDraws\tLosses\tPoints");
        for(int i=0;i<teams.length;i++){
            System.out.print(l1.name[i]+"\t");
            for(int j=0;j<5;j++){
                System.out.print(teams[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
