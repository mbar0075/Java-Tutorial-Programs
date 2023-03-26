import java.util.*;
public class Names
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        String names[]= {"Sarah","Martina","Kaylie","Roberta","Francesco","Rebecca"};
        int length[] = new int[6];
        int max =0,count=0;
        
        System.out.println("In upper case");
        for ( int i =0; i<names.length;i++){
            System.out.print(names[i].toUpperCase()+"\t");
        }
        
        System.out.println("\n1s letter ");
        for ( int i =0; i<names.length;i++){
            System.out.print(names[i].charAt(0)+"\t");
        }
        
        System.out.println("\nlongest name ");
        for ( int i =0; i<names.length;i++){
            length[i] = names[i].length();
            if(length[i]>max)
                max=length[i];
        }
        for ( int i =0; i<names.length;i++){
            if(max==length[i])
               count=i;
        }
        System.out.println("\nThe longest name is "+names[count]);
        
        
    }
}
