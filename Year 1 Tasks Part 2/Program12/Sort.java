import java.util.*;
public class Sort
{
    
    League l1;
    public Sort(League l){
        l1 = l;
    }
    
    public void Sort(int[][] teams){
        System.out.println("\nSorted\n");
        int temp[][]= new int[4][5];
        String tempname[]=new String [4];
        for(int r = 0; r<3;r++){
            for(int c = 1; c<(4-r);c++){
                if(teams[c-1][4]<teams[c][4]){
                    tempname[c]=l1.name[c-1];
                    l1.name[c-1]=l1.name[c];
                    l1.name[c]=tempname[c];
                    for(int i = 0; i<5;i++){
                        temp[c][i] = teams[c-1][i];
                        teams[c-1][i]=teams[c][i];
                        teams[c][i]=temp[c][i];
                    }
                }
            }
        }
    }
}
