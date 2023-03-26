import java.util.*;
public class ShipClass
{
    private int input;
    private int temp;
    private int count=5;
    private int randomColumns[]=new int[5];
    private int randomRows[]=new int[5];
    private char array[][]=new char[5][5];
    private boolean found;

    public void Display(){
        System.out.println("   A ,B ,C ,D ,E");
        for(int i =0; i<array.length; i++){
            System.out.print((i+1)+"  ");
            for(int j =0; j<array.length; j++){
                System.out.print(array[i][j]+"  ");
            }
            System.out.println("  ");
        }
        System.out.println("Rule: O= Misses / X=Hit / *=Unexplored Area");
        System.out.println("There are "+count+" ships left");
    }

    public void Populate(){
        temp=array.length;
        for(int i =0; i<randomColumns.length; i++){
            randomColumns[i]=(int)(Math.random()*temp);
            randomRows[i]=(int)(Math.random()*temp);
            randomColumns[3]=randomColumns[1]+1;
            randomRows[3]=randomRows[1];
            randomColumns[4]=randomColumns[2];
            randomRows[4]=randomRows[2]+1;
        }
        for(int i =0; i<array.length; i++){
            for(int j =0; j<array.length; j++){
                array[i][j]='*';
            }
        }
        Display();
    }

    public void Search(int input1,int input2){
        found=false;
        array[input1][input2]='O';
        for(int k =0; k<randomColumns.length; k++){
            if((input2==randomColumns[k])&&(input1==randomRows[k])){
                array[input1][input2]='X';
                System.out.println("-------------------You sank a ship-------------------");
                count--;
                found=true;
            }
        }
        Display();
    }

    public boolean Check (){
        return found;
    }
}
