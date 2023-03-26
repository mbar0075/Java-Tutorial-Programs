import java.util.*;
public class SubClass
{
    private Scanner sc = new Scanner(System.in);

    public void Input(char[]array){
        for(int i=0 ;i<array.length;i++){
            do{
                System.out.println("Input character:"+(i+1));
                array[i]=sc.next().charAt(0);;

                if((array[i]<'?')||(array[i]>'z')){
                    System.out.println("Invalid");
                }
            }while((array[i]<'?')||(array[i]>'z'));
            if((array[i]<'?')||(array[i]>'z'))
                i--;
        }
    }

    public void Search(char[]array){
        int temp =0;
        for(int i=0 ;i<(array.length-1);i++){
            for(int j=1 ;j<array.length;j++){
                if(array[i]!=array[j]){
                    System.out.println("The first non repeating character is "+array[j]);
                    temp=1;
                    break;
                }
            }
            if(temp==1)break;
        }
    }

}
