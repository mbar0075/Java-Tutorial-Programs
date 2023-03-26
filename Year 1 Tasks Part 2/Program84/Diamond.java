import java.util.*;
public class Diamond
{   
    //Declaring of variables
    private Scanner sc = new Scanner(System.in);
    private int num=-1;
    private int num2=0;
    private char enter;
    private int count;
    
    //Method for displaying a Diamond of numbers
    public void Option1()
    {
        //Checking Input
        do{
            System.out.println("Please enter end number");
            try{
                num = sc.nextInt();         
            }
            catch(Exception e){
                System.out.println(e);
            }
            sc.nextLine();
        }while(num<0);
        num2=num+1;   
        for(int i=1; i<=num;i++){
            //To display the space for each row
            for(int k =num2;k!=i;k--){
                System.out.print(" ");   
            }
            //To display the first top triangle
            if(i!=1){
                for(int j=i; j>2;j--){
                    j--;
                    System.out.print(j);
                    j++;
                }
            }
            //To display the second top triangle
            for(int l=1; l!=i;l++){
                System.out.print(l);
            }
            System.out.println("");
        }
        //To display the middle line 
        for(int i=num; i>1;i--){
            System.out.print(i);
        }
        for(int i=1; i<=num;i++){
            System.out.print(i);
        }
        System.out.println();
        for(int i=num; i>=1;i--){
            //To display the space for each row
            for(int k = num2;k!=i;k--){
                System.out.print(" ");   
            }
            //To display the first bottom triangle
            if(i!=1){
                for(int j=i; j>2;j--){
                    j--;
                    System.out.print(j);
                    j++;
                }
            }
            //To display the second bottom triangle
            for(int l=1; l!=i;l++){
                System.out.print(l);
            }
            System.out.println("");
        }  
    }

    //Method for displaying Diamond of letters
    public void Option2(){
        //Input validating
        do{
            System.out.println("Please enter end letter");
            enter = sc.next().charAt(0);
            num = (int)(enter);
            if((num<97)||(num>122))
                System.out.println("Invalid");
        }while((num<97)||(num>122));
        num2=(num+1)-97;   
        for(int i=97; i<=num;i++){
            count=i-97;
             //To display the space for each row
            for(int k =num2;k!=count;k--){
                System.out.print(" ");   
            }
            //To display the first upper triangle
            if(i!=1){
                for(int j=i; j>98;j--){
                    j--;
                    enter = (char)(j);
                    System.out.print(enter);
                    j++;
                }
            }
            //To display the second upper triangle
            for(int l=97; l!=i;l++){
                enter = (char)(l);
                System.out.print(enter);
            }
            System.out.println("");
        }
        //To display the middle line
        for(int i=num; i>97;i--){
            enter = (char)(i);
            System.out.print(enter);
        }
        for(int i=97; i<=num;i++){
            enter = (char)(i);
            System.out.print(enter);
        }
        System.out.println();
        for(int i=num; i>=97;i--){
            count=i-97;
            //To display the space for each row
            for(int k = num2;k!=count;k--){
                System.out.print(" ");   
            }
            //To display the first bottom triangle
            if(i!=1){
                for(int j=i; j>98;j--){
                    j--;
                    enter = (char)(j);
                    System.out.print(enter);
                    j++;
                }
            }
            //To display the second bottom triangle
            for(int l=97; l!=i;l++){
                enter = (char)(l);
                System.out.print(enter);
            }
            System.out.println("");
        }
    }
}
