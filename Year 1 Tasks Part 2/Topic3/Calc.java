import java.util.*;
public class Calc{
    Scanner sc = new Scanner(System.in);   
    int input;
    double num,sum,avg,ans,h,a,o,r;
    double max= Double.MIN_VALUE;
    double min= Double.MAX_VALUE;
    void Average(){
        System.out.println("Enter how many numbers you want the average of");
        input = sc.nextInt();
        for(int i = 1;i<=input;i++){
            System.out.println("Input number "+ i); 
            num=sc.nextDouble();
            sum+=num;
        }
        avg= sum/input;
        System.out.println("The average is"+ avg);
    }

    void Pythagoras(){

        System.out.println("Enter all 3 sides of the triangle (Enter a 0 for the side you wish to find)\nExample if you wish to find the hyphotenuse enter a 0 in the hyphontenuse");
        System.out.println("Input adjacent");
        a=sc.nextDouble();
        System.out.println("Input opposite");
        o=sc.nextDouble();
        System.out.println("Input hypothenuse");
        h=sc.nextDouble();

        if(h==0){
            ans =Math.sqrt(Math.pow(a,2)+Math.pow(o,2));
            System.out.println("The hypothenuse is " + ans+" cm");
        }
        else if(a==0){
            ans =Math.sqrt(Math.pow(h,2)-Math.pow(o,2));
            System.out.println("The adjacent is " + ans+" cm");
        }
        else if(o==0){
            ans =Math.sqrt(Math.pow(h,2)-Math.pow(a,2));
            System.out.println("The opposite is " + ans+" cm");
        }
        else
            System.out.println("Invalid");

    }

    void VolumeSphere(){
        while(r<=0){
            System.out.println("Enter The radius of the sphere");
            r = sc.nextDouble();
        }
        ans=4.0/3.0*Math.PI*Math.pow(r,3);
        System.out.println("The Volume of the sphere is is "+ ans+" cm cubed");
    }

    void MaxMin(){
        System.out.println("Enter how many numbers you want to enter");
        input = sc.nextInt();
        for(int i = 1;i<=input;i++){
            System.out.println("Input number "+ i); 
            num=sc.nextDouble();
            if(num>max)
                max=num;
            if(num<min)
                min=num;
        } 
        System.out.println("The larget number was " + max);
        System.out.println("The smallest number was " + min);
    }
}