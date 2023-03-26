import java.util.*;
public class Statistics
{
    Scanner sc = new Scanner(System.in);
    private String name;
    private int mark1=-1,mark2=-1,mark3=-1;
    private Student[] studentArray= new Student[20];
    private int sum1=0,sum2=0,sum3=0,sum=0;
    private double average1,average2,average3,average;
    private int max = -10000;
    private int min = 10000;
    private String maxName=null,minName=null;
    private int totalmax=0,totalmin=0;
    private int choice = 0;
    private int num = 0;
    private int num1,num2,num3;
    public void Input(){
        System.out.println("Welcome to Statistics \nInput the name , and 20 marks of 20 students");
        for(int i =0;i<20;i++){
            System.out.println("Input the name of student "+(i+1));
            name = sc.next();
            sc.nextLine();
            mark1=-1;
            while(mark1<0||mark1>100){
                System.out.println("Input mark1 "+(i+1));
                mark1=sc.nextInt();
                if(mark1<0||mark1>100)
                    System.out.println("Re enter mark1 "+(i+1));
            }
            mark2=-1;
            while(mark2<0||mark2>100){
                System.out.println("Input mark2 "+(i+1));
                mark2=sc.nextInt();
                if(mark2<0||mark2>100)
                    System.out.println("Re enter mark2 "+(i+1));
            }
            mark3=-1;
            while(mark3<0||mark3>100){
                System.out.println("Input mark3 "+(i+1));
                mark3=sc.nextInt();
                if(mark3<0||mark3>100)
                    System.out.println("Re enter mark3 "+(i+1));
            }
            Student st = new Student(name,mark1,mark2,mark3);
            studentArray[i]=st;
        }
    }

    public    void Average(){
        for(int i= 0 ; i<20; i++){
            sum1+=studentArray[i].mark1;  
        }
        average1 = sum1/(20);
        System.out.println("\nThe average of mark1 is "+average1);
        for(int i= 0 ; i<20; i++){
            sum2+=studentArray[i].mark2;  
        }
        average2 = sum2/(20);
        System.out.println("\nThe average of mark2 is "+average2);
        for(int i= 0 ; i<20; i++){
            sum3+=studentArray[i].mark3;  
        }
        average3 = sum3/(20);
        System.out.println("\nThe average of mark3 is "+average3);
        sum=sum1+sum2+sum3;   
        average = sum/(60);
        System.out.println("\nThe overall average is "+average);
    }

    public void MaxMin(){
        for ( int i= 0; i <20 ; i++){
            if(studentArray[i].mark1> max){
                max =studentArray[i].mark1;
                maxName = studentArray[i].name;      
            }
            if(studentArray[i].mark1< min){
                min =studentArray[i].mark1;
                minName = studentArray[i].name;   
            }
        }
        totalmax=max;
        totalmin=min;
        System.out.println(maxName + " got the highest mark1 of "+max);
        System.out.println(minName + " got the lowest mark1 of "+min);
        max = -10000;
        min = 10000;
        maxName=null;
        minName=null;
        for ( int i= 0; i <20 ; i++){
            if(studentArray[i].mark2> max){
                max =studentArray[i].mark2;
                maxName = studentArray[i].name;      
            }
            if(studentArray[i].mark2< min){
                min =studentArray[i].mark2;
                minName = studentArray[i].name;   
            }
        }
        if(totalmax<max)
            totalmax=max;
        if(totalmin>min)
            totalmin=min;    
        System.out.println(maxName + " got the highest mark2 of "+max);
        System.out.println(minName + " got the lowest mark2 of "+min);
        max = -10000;
        min = 10000;
        maxName=null;
        minName=null;
        for ( int i= 0; i <20 ; i++){
            if(studentArray[i].mark3> max){
                max =studentArray[i].mark3;
                maxName = studentArray[i].name;      
            }
            if(studentArray[i].mark3< min){
                min =studentArray[i].mark3;
                minName = studentArray[i].name;   
            }
        }
        if(totalmax<max)
            totalmax=max;
        if(totalmin>min)
            totalmin=min; 
        System.out.println(maxName + " got the highest mark20 of "+max);
        System.out.println(minName + " got the lowest mark20 of "+min);
        System.out.println(" \nThe overall max mark was "+totalmax);
        System.out.println(" \nThe overall min mark was "+totalmin);
    }

    public    void Histogram(){
        System.out.println("\f");
        do{
            System.out.println("Choose from the following Options\n1.Histogram Mark1\n2.Histogram Mark2\n3.Histogram Mark20\n20.Quit");  
            choice = sc.nextInt();
            switch (choice){ 
                case 1:System.out.println("key 1mark= * \n");
                for(int i= 0 ; i<20; i++){
                    System.out.print(studentArray[i].name+" "+studentArray[i].mark1+"\t");
                    num=studentArray[i].mark1;
                    while(num!=0){
                        System.out.print("* ");
                        num--;
                    }
                    System.out.print("\n");   
                }
                break;
                case 2:System.out.println("key 1mark= * \n");
                for(int i= 0 ; i<20; i++){
                    System.out.print(studentArray[i].name+" "+studentArray[i].mark2+"\t");
                    num=studentArray[i].mark2;
                    while(num!=0){
                        System.out.print("* ");
                        num--;
                    }
                    System.out.print("\n");   
                }
                break;
                case 3:System.out.println("key 1mark= * \n");
                for(int i= 0 ; i<20; i++){
                    System.out.print(studentArray[i].name+" "+studentArray[i].mark3+"\t");
                    num=studentArray[i].mark3;
                    while(num!=0){
                        System.out.print("* ");
                        num--;
                    }
                    System.out.print("\n");   
                }
                break;  
                case 20:System.out.println("Return back to Main Menu");
                break;
                default:System.out.println("Invalid");
            }
        } while(choice!=20);
    }

    public    void ProgressReport(){
        System.out.print("Input student name");
        name = sc.next();
        for(int i= 0 ; i<20; i++){     
            if(name.equalsIgnoreCase(studentArray[i].name)){
                num1= studentArray[i].mark1;
                num2= studentArray[i].mark2;
                num3= studentArray[i].mark3;
                System.out.println("\n"+name+" \ngot in "+num1+" in mark1\ngot in "+num2+" in mark2\ngot in "+num3+" in mark20");

                if((num1>=85)&&(num1<=100))
                    System.out.println("Keep it up in mark 1");
                else if((num1>=70)&&(num1<=820))
                    System.out.println("Focus on Detail in mark 1");
                else if((num1>=50)&&(num1<=69))
                    System.out.println("Thorough Study Required in mark 1");
                else 
                    System.out.println("Personal Appointment in mark 1");    
                if((num2>=85)&&(num2<=100))
                    System.out.println("Keep it up in mark 2");
                else if((num2>=70)&&(num2<=820))
                    System.out.println("Focus on Detail in mark 2");
                else if((num2>=50)&&(num2<=69))
                    System.out.println("Thorough Study Required in mark 2");
                else 
                    System.out.println("Personal Appointment in mark 2");    
                if((num3>=85)&&(num3<=100))
                    System.out.println("Keep it up in mark 3");
                else if((num3>=70)&&(num3<=820))
                    System.out.println("Focus on Detail in mark 3");
                else if((num3>=50)&&(num3<=69))
                    System.out.println("Thorough Study Required in mark 3");
                else 
                    System.out.println("Personal Appointment in mark 3");    
                break;
            }   
        }
        System.out.println("\n");
    }

}

