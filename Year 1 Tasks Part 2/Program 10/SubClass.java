import java.util.*;
public class SubClass
{
    Scanner sc = new Scanner(System.in);
    private String str;
    private String arrOfStr[];
    
    public void Delete(String Sentence)
    {        
        str = Sentence; 
        arrOfStr = str.split(" ");
        //Count is set to high, since if there is no duplicate located all of the words need to be displayed
        int count =arrOfStr.length+1;
        for(int i=0;i<(arrOfStr.length-1);i++){
            for(int j=1;j<arrOfStr.length;j++){
                if(i!=j){
                    if(arrOfStr[i].equals(arrOfStr[j])){
                        count=j;
                    }
                }
            }
        }

        for(int i=0;i<arrOfStr.length;i++){
            if(i!=count) 
                System.out.print(arrOfStr[i]+" ");
        } 
    }
}
