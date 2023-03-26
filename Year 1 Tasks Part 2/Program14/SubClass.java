import java.util.*;
public class SubClass
{
    private int count=7;
    private String input2;
    private int temp;
    private int temp2;
    private char array[];

    public void Decryption(String input){
        array=MakingOfArray(input);
        for(int i =0;i<array.length;i++){
            temp=(int)(array[i]);
            if(temp==32)
                array[i]=' ';
            else{
                if((temp>=58)&&(temp<65)){
                    temp2=64-temp;
                    temp=90-temp2;
                }
                else if((temp>=90)&&(temp<97)){
                    temp2=96-temp;
                    temp=122-temp2;
                }   
                array[i]=(char)(temp);
            }
        }
        Display(array);
    }

    public char[] MakingOfArray(String input){
        char[] array= new char[input.length()]; 
        for(int i =0;i<array.length;i++){
            array[i]=input.charAt(i);
        }
        return array;
    }

    public void Display(char[]array){
        for(int i =0;i<array.length;i++){
            System.out.print(array[i]);
        } 
        System.out.println();
    }

    public void Encryption(String input){
        array=MakingOfArray(input);
        for(int i =0;i<array.length;i++){
            temp=(int)(array[i]);
            if(temp==32)
                array[i]=' ';
            else{
                temp+=count;
                if((temp>90)&&(temp<97)){
                    temp2=temp-90;
                    temp=64+temp2;
                }
                else if(temp>122){
                    temp2=temp-122;
                    temp=96+temp2;
                }   
                array[i]=(char)(temp);
            }
        }
        Display(array);
    }
}
