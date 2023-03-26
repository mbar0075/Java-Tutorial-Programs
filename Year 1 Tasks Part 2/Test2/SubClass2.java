import java.util.*;
public class SubClass2
{
    private Scanner sc = new Scanner(System.in);
    private int temp=0;
    private boolean found;
    private int input;

    public void Input(int[]array){
        for(int i=0 ;i<array.length;i++){
            do{
                System.out.println("Input num "+(i+1));
                try{
                    array[i]=sc.nextInt();
                }
                catch(Exception e)
                {
                    System.out.println(e); 
                    temp=1;
                }
                sc.nextLine();
                if(temp==1){
                    System.out.println("Invalid");  
                    i--;
                }
                temp=0;
            }while(temp==1);
        }
    }

    public void Search(int[]array){
        int temp =0;
        System.out.println("\nInput number to Search for");
        try{
            input=sc.nextInt();
        }
        catch(Exception e)
        {
            System.out.println(e); 
        }
        for(int i=0 ;i<array.length;i++){
            if(input==array[i]){
                System.out.println("\nFound in location "+i);
                found=true;
                temp++;
            }
            else
                found=false;
        }
        if((found==false)&&(temp==0))
            System.out.println("\nNot found\n");
    }

    public void Prime(int[]array){
        boolean prime =false;
        for(int i=0 ;i<array.length;i++){
            for(int j=100 ;j>1;j--){
                if((array[i]!=j)||(array[i]!=1)){
                    if((array[i]%j)!=0)
                        prime=true;
                    else
                        prime=false;
                }
            }  
            if(prime==true)
                System.out.println(array[i]+" is Prime");
        }
    }
}
